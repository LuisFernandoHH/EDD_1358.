package listadoble.adt;

public class MainListaDoblementeLigada {
	public static void main(String[] args) {
		ListaDoblementeLigadaADT<Integer> lista = new ListaDoblementeLigadaADT<>();
		lista.agregarAlFinal(30);
		lista.transversal();
		System.out.println(lista.getTamanio());
		System.out.println("------------------------------");
		lista.agregarAlInicio(20);
		lista.transversal();
		System.out.println("------------------------------");
		lista.agregarDespuesDe(25, 1);
		lista.transversal();
		System.out.println(lista.getTamanio());
		System.out.println("------------------------------");
		lista.agregarAlFinal(34);
		lista.agregarAlFinal(46);
		lista.agregarAlInicio(65);
		lista.transversal();
		System.out.println(lista.getTamanio());
		System.out.println(lista.getElementoAnterior(4));
		System.out.println(lista.getElementoSiguiente(4));
		System.out.println("------------------------------");
		lista.agregarDespuesDe(10, 1);
		lista.agregarDespuesDe(12, 6);
		lista.transversal();
		System.out.println(lista.getElemento(8));
		System.out.println(lista.getElementoSiguiente(8));
		System.out.println(lista.getElementoAnterior(8));
		System.out.println("falta hacer pruebas");
		System.out.println("------------------------------");
		lista.eliminar(3);
		lista.transversal();
		System.out.println(lista.getElementoSiguiente(3));
		System.out.println(lista.getElementoAnterior(3));
		System.out.println(lista.getElemento(3));
		System.out.println(lista.getTamanio());
		System.out.println("------------------------------");
		lista.eliminarElPrimero();
		lista.transversal();
		System.out.println(lista.getTamanio());
		System.out.println("------------------------------");
		System.out.println("Eliminar el ultimo");
		lista.transversal();
		lista.eliminarElUltimo();
		lista.transversal();
		System.out.println(lista.getElementoSiguiente(2));
		System.out.println(lista.getElementoAnterior(2));
		System.out.println(lista.getElemento(2));
		System.out.println("------------------------------");
		lista.transversal();
		System.out.println(lista.buscar(120));
		System.out.println("------------------------------");
		lista.actualizarPorValor(10, 60);
		lista.transversal();
		lista.actualizarPorValor(60, 10);
		lista.transversal();
		System.out.println("------------------------------");
		lista.actualizarPorposicion(1, 26);
		lista.transversal();
		lista.actualizarPorposicion(1, 10);
		lista.transversal();
		System.out.println("------------------------------");
		lista.agregarDespuesDe(90,2);
		lista.eliminar(3);
		int contador = lista.getTamanio();
		for (int i = 1; i <= contador; i++) {
			lista.transversal();
			System.out.println("Nodo "+ i);
			System.out.println(lista.getElemento(i));
			System.out.println(lista.getElementoAnterior(i));
			System.out.println(lista.getElementoSiguiente(i));
			
		}
		lista.eliminar(4);
		//lista.eliminarElUltimo();
		lista.transversal();
		System.out.println(lista.getElemento(4));
		System.out.println(lista.getElementoAnterior(4));
		System.out.println(lista.getElementoSiguiente(4));
		System.out.println(lista.getTamanio());
	}
}
