/*
 * Hernández Hernández Luis Fernando
 * Grupo: 1358
 * Tarea: Colas y Colas de prioridad acotadas 
 */
package queue.adt;

public class Main {
	public static void main(String[] args) {
		QueueNodeADT<Integer> queueNodo = new QueueNodeADT<>();
		System.out.println("------------------------Prueba QueueNodeADT---------------------------");
		System.out.println(queueNodo.isEmpty());
		queueNodo.enqueue(1);
		queueNodo.enqueue(2);
		queueNodo.enqueue(3);
		queueNodo.enqueue(4);
		queueNodo.enqueue(5);
		System.out.println(queueNodo.isEmpty());
		System.out.println(queueNodo.length());
		System.out.println(queueNodo.toString());
		System.out.println("Valor eliminado de la cola " + queueNodo.dequeue());
		System.out.println("Valor eliminado de la cola " + queueNodo.dequeue());
		System.out.println("Valor eliminado de la cola " + queueNodo.dequeue());
		System.out.println(queueNodo.isEmpty());
		System.out.println(queueNodo.length());
		System.out.println(queueNodo.toString());
		System.out.println("------------------------Prueba QueueLinkedListADT---------------------------");
		QueueLinkedListADT<Integer> queueLinkedList = new QueueLinkedListADT<>();
		System.out.println(queueLinkedList.isEmpty());
		System.out.println(queueLinkedList.lenght());
		queueLinkedList.enqueue(1);
		queueLinkedList.enqueue(2);
		queueLinkedList.enqueue(3);
		queueLinkedList.enqueue(4);
		queueLinkedList.enqueue(5);
		System.out.println(queueLinkedList.toString());
		System.out.println("Valor eliminado de la cola " + queueLinkedList.dequeue());
		System.out.println("Valor eliminado de la cola " + queueLinkedList.dequeue());
		System.out.println("Valor eliminado de la cola " + queueLinkedList.dequeue());
		System.out.println(queueLinkedList.isEmpty());
		System.out.println(queueLinkedList.lenght());
		System.out.println(queueLinkedList.toString());
	}
}
