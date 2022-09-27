package listadoble.adt;

public class NodoDoble<T> {
	private T elemento;
	private NodoDoble<T> siguiente;
	private NodoDoble<T> anterior;
	
	public NodoDoble() {
		
	}

	public NodoDoble(T data) {
		this.elemento = data;
	}

	public NodoDoble(T elemennto, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
		super();
		this.elemento = elemennto;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T data) {
		this.elemento = data;
	}

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}
	
	public String toString() {

		return "<-- |" + elemento + "| -->";
	}
	
}
