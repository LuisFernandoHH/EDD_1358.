/*
 * Hernández Hernandez Luis Fernando
 * ListaDoblementeLigadaADT
 * Grupo 1358
 */

package listadoble.adt;

public class ListaDoblementeLigadaADT<T> {
	private NodoDoble<T> head;
	private int tamanio;

	public ListaDoblementeLigadaADT() {
		this.head = null;
		this.tamanio = 0;
	}

	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamanio() {
		return this.tamanio;
	}

	public void agregarAlFinal(T valor) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			NodoDoble<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			nuevo.setAnterior(aux);
			aux.setSiguiente(nuevo);
			aux = null;
			nuevo = null;
		}
		this.tamanio++;

	}

	public void agregarAlInicio(T valor) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			nuevo.setSiguiente(head);
			head.setAnterior(nuevo);
			this.head = nuevo;
			nuevo = null;
		}
		this.tamanio++;
	}

	public void agregarDespuesDe(T valor, int posicion) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		NodoDoble<T> aux = this.head;
		for (int contador = 1; contador <= posicion - 1; contador++) {
			aux = aux.getSiguiente();
		}
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
		nuevo.setAnterior(aux);
		this.tamanio++;
		nuevo = null;
		aux = null;
	}

	public void eliminar(int posicion) {
		if (!estaVacia() && posicion == 1) {
			this.eliminarElPrimero();
		}else if (!estaVacia() && posicion <= tamanio) {
			posicion--;
			int contador = 1;
			NodoDoble<T> aux = head;
			while (aux.getSiguiente() != null && contador != posicion) {
				aux = aux.getSiguiente();
				contador++;
			}
			aux.setSiguiente(aux.getSiguiente().getSiguiente());
			aux.setAnterior(aux.getAnterior());
			aux = aux.getSiguiente();
			aux = null;
			this.tamanio--;
		}
	}
	
	public void eliminarDespuesDe(int posicion) {

		NodoDoble<T> aux = this.head;
		for (int contador = 1; contador <= posicion - 1; contador++) {
			aux = aux.getSiguiente();
		}
		aux.setSiguiente(aux.getSiguiente().getSiguiente());
		aux.setAnterior(aux.getAnterior().getAnterior());
		this.tamanio--;
	}

	public void eliminarElPrimero() {
		if (!estaVacia()) {
			this.head = head.getSiguiente();
			this.tamanio--;
		}

	}

	public void eliminarElUltimo() {
		NodoDoble<T> aux = this.head;
		int contador = 0;
		if (!estaVacia()) {
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
				contador++;
			}
			this.eliminar(contador + 1);
		}
	}

	public int buscar(T elemento) {
		int contador = 0;
		if (!this.estaVacia()) {
			NodoDoble<T> aux = head;
			if (elemento == aux.getElemento()) {
				return contador + 1;
			} else {
				while (aux.getSiguiente() != null) {
					aux = aux.getSiguiente();
					contador++;
					if (elemento == aux.getElemento()) {
						return contador + 1;
					}
				}
			}
		}
		return 0;
	}

	public void actualizarPorValor(T valorAntiguo, T valorNuevo) {
		if (!estaVacia()) {
			NodoDoble<T> aux = head;
			while (aux.getElemento() != valorAntiguo) {
				aux = aux.getSiguiente();
			}
			aux.setElemento(valorNuevo);
		} else {
			System.out.println("El valor indicado no existe");
		}
	}

	public void actualizarPorposicion(int posicion, T valorNuevo) {
		if (!estaVacia()) {
			NodoDoble<T> aux = head;
			for (int contador = 1; contador <= posicion - 1; contador++) {
				aux = aux.getSiguiente();
			}
			aux.setElemento(valorNuevo);
		} else {
			System.out.println("La posicion indicada no existe");
		}
	}

	public T getElemento(int posicion) {
		if (!estaVacia() && posicion <= tamanio) {
			NodoDoble<T> aux = this.head;
			for (int i = 1; i < posicion; i++) {
				aux = aux.getSiguiente();
			}
			return aux.getElemento();
		}
		return null;
	}

	public T getElementoAnterior(int posicion) {
		if (!estaVacia() && posicion <= tamanio && posicion > 1) {
			NodoDoble<T> aux = this.head;
			for (int i = 1; i < posicion; i++) {
				aux = aux.getSiguiente();
			}
			return aux.getAnterior().getElemento();
		}
		return null;
	}

	public T getElementoSiguiente(int posicion) {
		if (!estaVacia() && posicion <= tamanio && posicion != this.tamanio) {
			NodoDoble<T> aux = this.head;
			for (int i = 1; i < posicion; i++) {
				aux = aux.getSiguiente();
			}
			return aux.getSiguiente().getElemento();
		}
		return null;
	}

	public void transversal() {
		NodoDoble<T> curr_node = this.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
