/*
 * Hernández Hernández Luis Fernando
 * Grupo: 1358
 * Tarea: Colas y Colas de prioridad acotadas 
 */
package queue.priority.adt;

public class BoundedPriorityQueueADT<T> {
	private ListaLigadaADT<QueueNodeADT<T>> listaDeColas = new ListaLigadaADT<QueueNodeADT<T>>();
	private int tamanioTotal = 0;
	private int contadorDequeue = 0;
	private int levels;

	public BoundedPriorityQueueADT(int levels) {
		this.levels = levels;
		for (int i = 0; i < levels; i++) {
			QueueNodeADT<T> colaNivel = new QueueNodeADT<>();
			listaDeColas.agregarAlFinal(colaNivel);
		}
	}

	public boolean isEmpty() {
		return listaDeColas.estaVacia();
	}

	public int lenght() {
		return tamanioTotal;
	}

	public void enqueue(int levelPriority, T value) {
		listaDeColas.getElemento(levelPriority).enqueue(value);
		this.tamanioTotal ++;
	}

	//Funcion recursiva para sacar solamente un elemento en prioridad
	public T dequeue() {
		
		if (!listaDeColas.estaVacia() && contadorDequeue <= this.levels) {
			if(!listaDeColas.getElemento(this.contadorDequeue).isEmpty()) {
				int contaux = contadorDequeue;
				contadorDequeue = 0;
				this.tamanioTotal --;
				return listaDeColas.getElemento(contaux).dequeue();
			}
			contadorDequeue ++;
			return this.dequeue();
		}
		contadorDequeue = 0;
		return null;
	}
	
	public String toString() {
		String cad = "";
		for (int i = 1; i <= listaDeColas.getTamanio(); i++) {
			cad += listaDeColas.getElemento(i) + " \n";
		}
		return cad;
	}
}
