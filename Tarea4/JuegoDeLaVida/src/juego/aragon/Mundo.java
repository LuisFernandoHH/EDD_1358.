package juego.aragon;

public class Mundo {

	private Arreglo_DosD_ADT<Boolean> mundo;

	public Mundo(int filas, int columnas) {
		mundo = new Arreglo_DosD_ADT<>(filas, columnas);
		mundo.clear(false);
	}

	public void pintar() {
		for (int Fik = 0; Fik < mundo.getFilas(); Fik++) {
			for (int Cok = 0; Cok < mundo.getColumnas(); Cok++) {
				if (mundo.getItem(Fik, Cok) == true) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.print("\n");
		}
	}

	public void setCelula(int fil, int col) {
		mundo.setItem(fil, col, true);
	}

	public Arreglo_DosD_ADT<Boolean> cambiosGeneracion() {
		Arreglo_DosD_ADT<Boolean> arregloApoyo = new Arreglo_DosD_ADT<>(mundo.getFilas(), mundo.getColumnas());
		for (int i = 0; i < mundo.getFilas(); i++)
			for (int j = 0; j < mundo.getColumnas(); j++) {
				int numVec = this.calculaNumVecinos(i, j);
				if (mundo.getItem(i, j)) {
					arregloApoyo.setItem(i, j, numVec == 0 || numVec == 1 || numVec >= 4);
				} else {
					arregloApoyo.setItem(i, j, numVec == 3);
				}
			}
		return arregloApoyo;
	}

	private int calculaNumVecinos(int i, int j) {
		int num = 0;
		for (int l = -1; l < 2; l++) {
			for (int k = -1; k < 2; k++) {
				if (this.CeldaValida(i + l, j + k) && !(l == 0 && k == 0)) {
					if (mundo.getItem(i + l, j + k)) {
						num++;
					}
				}
			}
		}
		return num;
	}

	private boolean CeldaValida(int i, int j) {
		return (0 <= i && i < mundo.getFilas() && 0 <= j && j < mundo.getColumnas());
	}

	public void cambiarGeneracion(Arreglo_DosD_ADT<Boolean> nextGen) {
		for (int i = 0; i < mundo.getFilas(); i++) {
			for (int j = 0; j < mundo.getColumnas(); j++) {
				mundo.setItem(i, j, nextGen.getItem(i, j));
			}
		}
	}
}
