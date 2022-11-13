/*
 * Hernández Hernández Luis Fernando
 * Grupo: 1358
 * Tarea: Colas y Colas de prioridad acotadas 
 */
package queue.priority.adt;

public class MainTitanic {
	public static void main(String[] args) {
		BoundedPriorityQueueADT<String> colaDePrioridad = new BoundedPriorityQueueADT<>(7);
		colaDePrioridad.enqueue(1, "Niñas");
		colaDePrioridad.enqueue(2, "Niños");
		colaDePrioridad.enqueue(2, "Personas de la tercera edad");
		colaDePrioridad.enqueue(3, "Mujeres");
		colaDePrioridad.enqueue(3, "Hombres");
		colaDePrioridad.enqueue(4, "Maestre");
		colaDePrioridad.enqueue(4, "Mecánico");
		colaDePrioridad.enqueue(4, "Vigia");
		colaDePrioridad.enqueue(4, "Timonel");
		colaDePrioridad.enqueue(5, "Cápitan");
//		System.out.println(colaDePrioridad.toString());
//		System.out.println(colaDePrioridad.lenght());
		System.out.println("El titanic se esta hundiendo, orden de salida:");
		//Sacamos uno a uno los elementos en prioridad
		for (int i = 1; i < 12; i++) {
			System.out.println(colaDePrioridad.dequeue());
		}
		
	}
	
}
