package hashtable.adt;

public class Nodo<T> {
	private T elemento;
	private Nodo<T> siguiente;

	public Nodo() {
	}

	public Nodo(T valor) {
		this.elemento = valor;
	}

	public Nodo(T dato, Nodo<T> siguiente) {
		this.elemento = dato;
		this.siguiente = siguiente;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {

		return "|" + elemento + "| -->";
	}

	public String printAll() {
		return "[Dato = " + elemento + "] -> [Siguiente : " + this.getSiguiente() + "]";
	}

}
