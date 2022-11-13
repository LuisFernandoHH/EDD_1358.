/*
 * Hernández Hernández Luis Fernando
 * Grupo: 1358
 * Tarea: Colas y Colas de prioridad acotadas 
 */
package queue.adt;

public class QueueNodeADT<T> {
	
	private Nodo<T> head;
	private Nodo<T> tail;
	private int contador = 0;
	
	public QueueNodeADT() {
		
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public int length() {
		return this.contador;
	}
	
	public void enqueue(T value) {
		Nodo<T> nuevoNodo = new Nodo<>();
		nuevoNodo.setElemento(value);
		if(this.isEmpty()) {
			head = tail = nuevoNodo;
			contador ++;
		} else {
			this.tail.setSiguiente(nuevoNodo);
			this.tail = nuevoNodo;
			contador ++;
		}
	}
	
	public T dequeue() {
		if(!this.isEmpty()) {
			T aux = head.getElemento();
			head = head.getSiguiente();
			if(head == null) {
				tail = null;
			}
			contador --;
			return aux;
		}
		return null;
	}
	
	public String toString() {
		String cad = "";
		Nodo<T> aux = head;
		while(aux != null) {
			cad += aux.getElemento() + " ";
			aux = aux.getSiguiente();
		}
		if(cad == "") {
			cad = null;
		}
		return cad;
	}
}
