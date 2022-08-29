/*
 * Clase base que nos servira para poner a prueba los métodos creados en la clase ArregloADT
 */


package aragon.adts;

public class Alumno {
	private String nivelDeEstudios;
	private String plantel;
	private String nombre;
	private double calificacionGeneral;

	// Constructor vacio
	public Alumno() {

	}

	// Constructor que inicializa atributos
	public Alumno(String nivelDeEstudios, String plantel, String nombre, double calificacionGeneral) {
		this.nivelDeEstudios = nivelDeEstudios;
		this.plantel = plantel;
		this.nombre = nombre;
		this.calificacionGeneral = calificacionGeneral;
	}

	// Constructor copia
	public Alumno(Alumno alumno) {
		this.nivelDeEstudios = alumno.getNivelDeEstudios();
		this.plantel = alumno.getPlantel();
		this.nombre = alumno.getNombre();
		this.calificacionGeneral = alumno.getCalificacionGeneral();
	}

	public void setNivelDeEstudios(String nivelDeEstudios) {
		this.nivelDeEstudios = nivelDeEstudios;
	}

	public String getNivelDeEstudios() {
		return this.nivelDeEstudios;
	}

	public void setPlantel(String plantel) {
		this.plantel = plantel;
	}

	public String getPlantel() {
		return this.plantel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCalificacionGeneral(double calificacionGeneral) {
		this.calificacionGeneral = calificacionGeneral;
	}

	public double getCalificacionGeneral() {
		return this.calificacionGeneral;
	}

	

}
