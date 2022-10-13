/*
 * Hernández Hernández Luis Fernando
 * Grupo 1358
 * Tarea 6, laberinto con BackTracking
 */
package laberinto.adt;

public class Casilla<T> extends Arreglo_DosD_ADT<T>{

	private boolean visitado;
	private boolean casillaFin;
	private boolean paso[]; //0 = arriba, 1 =derecha, 2= abajo, 3=izquierda
	private T valor;
	private int posX;
	private int posY;
	
	public Casilla(int Fila, int Colu, boolean paso[], boolean casillaFin, T valor) {
		super(Fila, Colu);
		this.posX = Fila;
		this.posY = Colu;
		this.casillaFin = casillaFin;
		this.valor = valor;
		this.paso = paso;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	public boolean isCasillaFin() {
		return casillaFin;
	}
	public void setCasillaFin(boolean casillaFin) {
		this.casillaFin = casillaFin;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	@Override
	public String toString() {
		return "["+valor+"]";
	}
	
	public void setPaso(boolean[] paso) {
		this.paso = paso;
	}
	
	public boolean[] getPaso() {
		return paso;
	}
	
	public boolean arribaDisponible() {
        return paso[0];
    }

    public boolean derechaDisponible() {
        return paso[1];
    }

    public boolean abajoDisponible() {
        return paso[2];
    }

    public boolean izquierdaDisponible() {
        return paso[3];
    }
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casilla<T> other = (Casilla<T>) obj;
		return casillaFin == other.casillaFin && valor == other.valor && visitado == other.visitado;
	}
	
	
	
}
