package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the carrera database table.
 * 
 */
@Entity
@NamedQuery(name="Carrera.findAll", query="SELECT c FROM Carrera c")
public class Carrera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codcarrera;

	private int edad;

	private String nombre;

	public Carrera() {
	}

	public int getCodcarrera() {
		return this.codcarrera;
	}

	public void setCodcarrera(int codcarrera) {
		this.codcarrera = codcarrera;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}