/*
 * Hernández Hernández Luis Fernando
 * Grupo: 1358
 * Tarea: Colas y Colas de prioridad acotadas 
 */
package queue.adt;

public class QueueLinkedListADT<T> {
	private ListaLigadaADT<T> listaCola = new ListaLigadaADT<>();
	
	public QueueLinkedListADT() {
		
	}
	
	public boolean isEmpty() {
		return listaCola.estaVacia();
	}
	
	public int lenght() {
		return listaCola.getTamanio();
	}
	
	public void enqueue(T value) {
		listaCola.agregarAlFinal(value);
	}
	
	public T dequeue() {
		T value = listaCola.getElemento(0);
		listaCola.eliminarElPrimero();
		return value;
	}
	
	public String toString() {
		String cad = "";
		for (int i = 1; i <= listaCola.getTamanio(); i++) {
			cad += listaCola.getElemento(i) + " ";
		}
		return cad;
	}
}
