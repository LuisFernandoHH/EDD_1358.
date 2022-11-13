/*
 * Hernández Hernández Luis Fernando
 * Grupo: 1358
 * Tarea: Colas y Colas de prioridad acotadas 
 */
package queue.adt;

public class ListaLigadaADT<T> {
	Nodo<T> head;
	int tamanio;

	public ListaLigadaADT() {
		this.head = null;
		this.tamanio = 0;
	}

	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void agregarAlFinal(T valor) {
		Nodo<T> nuevo = new Nodo<T>(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			Nodo<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
		this.tamanio++;
	}

	public void agregarAlInicio(T valor) {
		Nodo<T> nuevo = new Nodo<T>(valor);
		if (this.estaVacia()) {
			this.head = nuevo;

		} else {
			nuevo.setSiguiente(this.head);
			this.head = nuevo;

		}
		this.tamanio++;
	}

	public void agregarDespuesDe(T valor, int posicion) {
		Nodo<T> nuevo = new Nodo<T>(valor);
		Nodo<T> aux = this.head;
		for (int contador = 1; contador <= posicion - 1; contador++) {
			aux = aux.getSiguiente();
		}
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
		this.tamanio++;
	}

	public void eliminarDespuesDe(int posicion) {

		Nodo<T> aux = this.head;
		for (int contador = 1; contador <= posicion-1; contador++) {
			aux = aux.getSiguiente();
		}

		aux.setSiguiente(aux.getSiguiente().getSiguiente());
		this.tamanio--;
	}
	
	public void eliminar(int posicion) {
		if (!estaVacia() && posicion <= tamanio) {
			posicion --;
			int contador = 1;
			Nodo<T> aux = head;
			while (aux.getSiguiente() != null && contador != posicion) {
				aux = aux.getSiguiente();
				contador++;
			}
			aux.setSiguiente(aux.getSiguiente().getSiguiente());
			this.tamanio--;
		} 
	}

	public void eliminarElPrimero() {
		if (!estaVacia()) {
			this.head = head.getSiguiente();
			this.tamanio--;
		}

	}

	public void eliminarElUltimo() {
		Nodo<T> aux = this.head;
		int contador = 0;
		if (!estaVacia()) {
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
				contador++;
			}
			this.eliminarDespuesDe(contador);
		}
	}

	public int buscar(T elemento) {
		int contador = 0;
		if (!this.estaVacia()) {
			Nodo<T> aux = head;
			if (elemento == aux.getElemento()) {
				return contador + 1;
			} else {
				while (aux != null) {
					aux = aux.getSiguiente();
					contador++;
					if (elemento.equals(aux.getElemento())) {
						return contador + 1;
					}
				}
			}
		}
		return 0;
	}

	public void actualizar(int posicion, T valorNuevo) {
		if (!estaVacia() && posicion <= tamanio) {
			int contador = 1;
			Nodo<T> aux = head;
			while (aux.getSiguiente() != null && contador != posicion) {
				aux = aux.getSiguiente();
				contador++;
			}
			aux.setElemento(valorNuevo);
		} else {
			System.out.println("La posicion indicada no existe");
		}
	}
	
	public T getElemento(int posicion) {
		if (!estaVacia() && posicion <= tamanio) {
			Nodo<T> aux = this.head;
			for (int i = 1; i < posicion; i++) {
				aux = aux.getSiguiente();
			}
			return aux.getElemento();
		}
		return null;
	}

	public void transversal() {
		Nodo<T> curr_node = this.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
