package proyecto.aragon;

import java.io.Serializable;

public class Profesor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String correo;
	private String rfc;
	private String telefono;
	private String numeroAlumnos;
	private String materia;
	private boolean experiencia;
	
	
	public Profesor() {
		// TODO Auto-generated constructor stub
	}
	
	public Profesor(String nombre, String correo, String rfc, String telefono, 
			String numeroAlumnos, String materia, boolean experiencia) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.rfc = rfc;
		this.telefono = telefono;
		this.numeroAlumnos = numeroAlumnos;
		this.materia = materia;
		this.experiencia = experiencia;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(String numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

	public boolean isExperiencia() {
		return experiencia;	
	}

	public void setExperiencia(boolean experiencia) {
		this.experiencia = experiencia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", correo=" + correo + ", rfc=" + rfc + ", telefono=" + telefono
				+ ", numeroAlumnos=" + numeroAlumnos + ", materia=" + materia + ", experiencia=" + experiencia + "]";
	}
	
	
	
	
	

}
