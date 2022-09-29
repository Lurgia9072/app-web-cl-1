package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Alumno;
import model.Carrera;

import java.awt.GridBagLayout;
import java.awt.TextArea;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import javax.swing.JTextArea;
public class FrmAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtdni;
	private JTextField txtedad;
	private JTextField txtciclo;
	private JComboBox cbocarrera;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAlumno frame = new FrmAlumno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtnombre = new JTextField();
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		
		txtdni = new JTextField();
		txtdni.setColumns(10);
		
		txtedad = new JTextField();
		txtedad.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		
		txtciclo = new JTextField();
		txtciclo.setColumns(10);
		
		JLabel ciclo = new JLabel("ciclo");
		
		JComboBox cbocarrera = new JComboBox();
		cbocarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JLabel Carrera = new JLabel("New label");
		
		JButton btnregistrar = new JButton("Registrar");
		btnregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				registrar();
			}
		});
		
		JTextArea textArea = new JTextArea();
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtapellido, Alignment.LEADING)
						.addComponent(txtnombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtdni, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtedad, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtciclo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ciclo, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbocarrera, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addComponent(Carrera, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(85))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(43, Short.MAX_VALUE)
					.addComponent(btnListar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnregistrar, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
					.addGap(132))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(44, Short.MAX_VALUE)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(ciclo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtnombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtciclo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(lblNewLabel_1)
					.addGap(1)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtapellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Carrera))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(cbocarrera, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtdni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtedad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnregistrar, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
						.addComponent(btnListar))
					.addGap(26)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
		);
		contentPane.setLayout(gl_contentPane);
		
		cargarCombo();
	}
	
	
	void cargarCombo() {
		// obtener la conexion 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("EC1_Apellido");
		EntityManager em = fabrica.createEntityManager();
		
		List<Carrera> listaAlumnos = em.createQuery("select u from u", Carrera.class).getResultList();
		for(Carrera al : listaAlumnos) {
			cbocarrera.addItem(al.getCodcarrera()+ "-" + al.getNombre());
		}
		em.close();
	}
	
	
	void listar() {
		// obtener la conexion 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("EC1_Apellido");
		EntityManager em = fabrica.createEntityManager();
		
		List<Alumno> listaAlumnos = em.createQuery("select u from u", Alumno.class).getResultList();
		for(Alumno al : listaAlumnos) {
			imprimir("cod Alumno: " + al.getCodigo() + "\n"  );
			imprimir("Nombre Alumno: " + al.getNombre() + "\n"  );
			imprimir("Apellido Alumno: " + al.getApellido() + "\n"  );
			imprimir("Dni Alumno: " + al.getDni() + "\n"  );
			imprimir("edad Alumno: " + al.getEdad() + "\n"  );
			imprimir("Carrera Alumno: " + al.getCodcarrera());
		}
		em.close();
		
	}
	void imprimir(String s) {
		textArea.append(s +"\n");
		
	}
	
	void registrar() {
		
		 String apellido = txtapellido.getText();
		 int ciclo = Integer.parseInt(txtciclo.getText());
		 int edad = Integer.parseInt(txtedad.getText());
		 String dni = txtdni.getText();		
		 String nombre = txtnombre.getText();
		 int codcarrera = cbocarrera.getSelectedIndex();
		 
		 // validaciones
		
		 
		Alumno a = new Alumno();
		a.setApellido(apellido);
		a.setNombre(nombre);
		a.setCiclo(ciclo);
		a.setDni(dni);
		a.setDni(dni);
		a.setCodcarrera(codcarrera);
		
		// obtener la conexion 
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("EC1_Apellido");
				EntityManager em = fabrica.createEntityManager();
				
				em.getTransaction().begin();
				em.close();
				
		// mensaje
		 JOptionPane.showConfirmDialog(this, "insert succeful");
	}
}
