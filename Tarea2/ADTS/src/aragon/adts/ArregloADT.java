package aragon.adts;


import java.util.ArrayList;

public class ArregloADT<T> extends Alumno{
	//Atrinutos de nuestra clase que consiste en un arraylist y una variable tipo entero
	private int longitud;
	private ArrayList<T> datos;
	
	/*
	 * El constructor nos ayudara a inicializar el arraylist y tambien nos ayudara a establecer
	 * un tamaño o indice para nuestro arreglo
	 */
	@SuppressWarnings("unchecked")
	public ArregloADT(int tamanio) {
		this.longitud = tamanio;
		datos = new ArrayList<>();
		for (int i = 0; i < tamanio; i++) {
			datos.add((T) new Object());
		}
	}
	
	/*
	 * Metodo que nos trae el objeto del arreglo
	 */
	public Object getElemento(int indice) {
		if(indice >= 0 && indice < this.longitud) {
			return datos.get(indice);
		}
		return null;
	}
	
	/*
	 * Metodo que establece un objeto en el indice que se solicite
	 */
	
	public void setElemento(T elemento, int indice) {
		if(indice >= 0 && indice < this.longitud) {
			datos.set(indice, elemento);
		}
	}
	
	/*
	 * Metodo que regresa la longitud del arreglo
	 */
	
	public int getLongitud() {
		return this.longitud;
	}
	
	/*
	 * Metodo que establece todos los valores del arreglo en null
	 */
	
	public void limpiarTodo() {
		for (int i = 0; i < longitud; i++) {
			datos.set(i, null);
		}
	}
	
	/*
	 * Metodo que solicita el toString del objeto solicitado, ayudado de la herencia de la clase 
	 * original que se este trabajando
	 */
	
	public String toString(Alumno alumno) {
		return "Alumno [nivelDeEstudios=" + alumno.getNivelDeEstudios() + ", plantel=" + alumno.getPlantel() + ", nombre=" + alumno.getNombre()
		+ ", calificacionGeneral=" + alumno.getCalificacionGeneral() + "]";
	}
	
	
	
	
	
}
