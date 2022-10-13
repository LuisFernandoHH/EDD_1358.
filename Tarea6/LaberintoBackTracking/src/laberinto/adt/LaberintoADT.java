/*
 * Hernández Hernández Luis Fernando
 * Grupo 1358
 * Tarea 6, laberinto con BackTracking
 */
package laberinto.adt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LaberintoADT<T> {
	private String ruta;
	private Arreglo_DosD_ADT<Casilla<Boolean>> datos;
	private PilaArrayADT<ArregloADT<Integer>> camino;
	private ArrayList<ArrayList<Casilla<Boolean>>> caminos;

	public LaberintoADT(String ruta,int filaInicial, int columnaInicial, int filaFinal, int columnaFinal) throws IOException {
		super();
		this.ruta = ruta;
		int contador = 0;
		String cadena;
		String contenido = "";
		BufferedReader bLectura = new BufferedReader(new FileReader(this.ruta));
		while ((cadena = bLectura.readLine()) != null) {
			// System.out.println(cadena);
			contenido += cadena + "\n";
			contador++;
		}
		bLectura.close();
		String[] arregloTemporal = contenido.split("\n");
		datos = new Arreglo_DosD_ADT<>(contador, contador);
		for (int i = 0; i < arregloTemporal.length; i++) {
			for (int j = 0; j < arregloTemporal.length; j++) {
				String[] arregloPorComas = arregloTemporal[i].split(",");
				boolean valor;
				if (Integer.parseInt(arregloPorComas[j]) == 0) {
					valor = false;
				} else {
					valor = true;
				}
				//Creamos objeto casilla en todas las posiciones del Array2D
				datos.setItem(i, j, new Casilla<>(i, j, null, false, valor));
			}
		}
		datos.getItem(filaFinal, columnaFinal).setCasillaFin(true);
		//Asignamos la posicion inicial y final, asi como el paso de cada casilla
		this.casillaPaso();
		camino = new PilaArrayADT<>();
		camino.push(this.getElementoPosicion(datos.getItem(filaInicial, columnaInicial)));
		caminos = new ArrayList<>();
	}

	public void casillaPaso() { //Asigna el paso de cada casilla (arriba, derecha, abajo, izquierda)
		for (int i = 0; i < datos.getFilas(); i++) {
			for (int j = 0; j < datos.getColumnas(); j++) {
				Casilla<Boolean> aux = datos.getItem(i, j);

				try {
					//Esquina superior izquierda
					if(i == 0 && j == 0) {
						boolean[] pasoaux = { false,
								(boolean) datos.getItem(i, j + 1).getValor(),
								(boolean) datos.getItem(i + 1, j).getValor(),
								false };
						aux.setPaso(pasoaux);
						//esquina superior derecha
					}else if(i == 0 && j == datos.getColumnas()-1) {
						boolean[] pasoaux = { false,
								false,
								(boolean) datos.getItem(i + 1, j).getValor(),
								(boolean) datos.getItem(i, j - 1).getValor() };
						aux.setPaso(pasoaux);
						//esquina inferior izquierda
					}else if(i == datos.getFilas()-1 && j == 0) {
						boolean[] pasoaux = { (boolean) datos.getItem(i - 1, j).getValor(),
								(boolean) datos.getItem(i, j + 1).getValor(),
								false,
								false};
						aux.setPaso(pasoaux);
						//esquina inferior derecha
					}else if(i == datos.getFilas()-1 && j == datos.getColumnas()-1) {
						boolean[] pasoaux = { (boolean) datos.getItem(i - 1, j).getValor(),
								false,
								false,
								(boolean) datos.getItem(i, j - 1).getValor() };
						aux.setPaso(pasoaux);
						//Fila 0 
					}else if (i == 0) {
						boolean[] pasoaux = { false, (boolean) datos.getItem(i, j + 1).getValor(),
								(boolean) datos.getItem(i + 1, j).getValor(),
								(boolean) datos.getItem(i, j - 1).getValor() };
						aux.setPaso(pasoaux);
						
						//Coumuna 0
					} else if (j == 0) {
						boolean[] pasoaux = { (boolean) datos.getItem(i - 1, j).getValor(),
								(boolean) datos.getItem(i, j + 1).getValor(),
								(boolean) datos.getItem(i + 1, j).getValor(), false };
						aux.setPaso(pasoaux);
						//Fila 9
					} else if (i == datos.getFilas() - 1) {
						boolean[] pasoaux = { (boolean) datos.getItem(i - 1, j).getValor(),
								(boolean) datos.getItem(i, j + 1).getValor(), false,
								(boolean) datos.getItem(i, j - 1).getValor() };
						aux.setPaso(pasoaux);
						// Columna 9
					} else if (j == datos.getColumnas() - 1) {
						boolean[] pasoaux = { (boolean) datos.getItem(i - 1, j).getValor(), false,
								(boolean) datos.getItem(i + 1, j).getValor(),
								(boolean) datos.getItem(i, j - 1).getValor() };
						aux.setPaso(pasoaux);
						//Todas las demas casillas
					} else {
						boolean[] pasoaux = { (boolean) datos.getItem(i - 1, j).getValor(),
								(boolean) datos.getItem(i, j + 1).getValor(),
								(boolean) datos.getItem(i + 1, j).getValor(),
								(boolean) datos.getItem(i, j - 1).getValor() };
						aux.setPaso(pasoaux);
					}
					
				} catch (java.lang.NullPointerException e) {
					System.out.println("error con los indices");
				}
			}
		}
	}
	
	public ArregloADT<Integer> getElementoPosicion(Casilla<Boolean> casilla){
		ArregloADT<Integer> posicion = new ArregloADT<>(2);
		for (int i = 0; i < datos.getFilas(); i++) {
			for (int j = 0; j < datos.getColumnas(); j++) {
				if(casilla.equals(datos.getItem(i, j))) {
					posicion.setElemento(0, i);
					posicion.setElemento(1, j);
					return posicion;
				}
			}
		}
		return null;
	}
			
	public Arreglo_DosD_ADT<Casilla<Boolean>> getDatos() {
		return datos;
	}

	public PilaArrayADT<ArregloADT<Integer>> getCamino() {
		return camino;
	}

	public boolean dentroDelLimite(int fila, int columna) {
		return (fila >= 0 && fila <= datos.getFilas()) && (columna >= 0 && columna <= datos.getColumnas());
	}

	public boolean arribaDisponible(Casilla<Boolean> casillaActual, Casilla<Boolean> casillaDestino) {

		if (casillaDestino != null && !casillaDestino.isVisitado()) {
			return casillaActual.arribaDisponible();
		}
		return false;
	}

	public boolean derechaDisponible(Casilla<Boolean> casillaActual, Casilla<Boolean> casillaDestino) {

		if (casillaDestino != null && !casillaDestino.isVisitado()) {
			return casillaActual.derechaDisponible();
		}
		return false;
	}

	public boolean abajoDisponible(Casilla<Boolean> casillaActual, Casilla<Boolean> casillaDestino) {

		if (casillaDestino != null && !casillaDestino.isVisitado()) {
			return casillaActual.abajoDisponible();
		}
		return false;
	}

	public boolean izquierdaDisponible(Casilla<Boolean> casillaActual, Casilla<Boolean> casillaDestino) {

		if (casillaDestino != null && !casillaDestino.isVisitado()) {
			return casillaActual.izquierdaDisponible();
		}
		return false;
	}

	public Casilla<Boolean> getCasillaAt(int x, int y) {
		if (dentroDelLimite(x, y)) {
			return datos.getItem(x, y);
		}
		return null;
	}
	
	//Funcion recursiva que llama a los metodos "Disponible"para saber por donde se puede avanzar
	// Capaz de generar mas de 1 camino
	@SuppressWarnings("unchecked")
	public void rellenarCaminos(LaberintoADT<Casilla<Boolean>> laberinto, Casilla<Boolean> casillaActual, ArrayList<Casilla<Boolean>> caminoArr) {

		if (casillaActual.isCasillaFin()) {
			camino.push(this.getElementoPosicion(casillaActual));
			laberinto.añadirCamino((ArrayList<Casilla<Boolean>>) caminoArr.clone());

		} else {

			// Movimientos dentro del Array2D
			int[][] movimientos = { { -1, 0 }, // arriba
					{ 0, 1 }, // derecha
					{ 1, 0 }, // abajo
					{ 0, -1 } // izquierda
			};

			int posFilaNueva, posColumnaNueva;
			Casilla<Boolean> aux;

			// Se recorren los posibles caminos 
			for (int i = 0; i < movimientos.length; i++) {

				posFilaNueva = casillaActual.getPosX() + movimientos[i][0];
				posColumnaNueva = casillaActual.getPosY() + movimientos[i][1];
				aux = laberinto.getCasillaAt(posFilaNueva, posColumnaNueva);

				switch (i) {
				case 0: // arriba
					if (laberinto.arribaDisponible(casillaActual, aux)) {
						camino.push(this.getElementoPosicion(aux));
						caminoArr.add(aux);
						casillaActual.setVisitado(true);
						rellenarCaminos(laberinto, aux, caminoArr);
						casillaActual.setVisitado(false);
						if (camino.Peek().equals(getElementoPosicion(aux))) {
							camino.pop();
						}
						caminoArr.remove(aux);
					}
					break;
				case 1: // derecha
					if (laberinto.derechaDisponible(casillaActual, aux)) {
						camino.push(this.getElementoPosicion(aux));
						caminoArr.add(aux);
						casillaActual.setVisitado(true);
						rellenarCaminos(laberinto, aux, caminoArr);
						casillaActual.setVisitado(false);
						if (camino.Peek().equals(getElementoPosicion(aux))) {
							camino.pop();
						}
						caminoArr.remove(aux);
					}
					break;
				case 2:// abajo
					if (laberinto.abajoDisponible(casillaActual, aux)) {
						camino.push(this.getElementoPosicion(aux));
						caminoArr.add(aux);
						casillaActual.setVisitado(true);
						rellenarCaminos(laberinto, aux, caminoArr);
						casillaActual.setVisitado(false);
						if (camino.Peek().equals(getElementoPosicion(aux))) {
							camino.pop();
						}
						caminoArr.remove(aux);
					}
					break;
				case 3: // izquierda
					if (laberinto.izquierdaDisponible(casillaActual, aux)) {
						camino.push(this.getElementoPosicion(aux));
						caminoArr.add(aux);
						casillaActual.setVisitado(true);
						rellenarCaminos(laberinto, aux, caminoArr);
						casillaActual.setVisitado(false);
						if (camino.Peek().equals(getElementoPosicion(aux))) {
							camino.pop();
						}
						caminoArr.remove(aux);
					}
					break;
				}

			}

		}

	}
	 public void añadirCamino(ArrayList<Casilla<Boolean>> camino) {
	        if (camino != null && !camino.isEmpty()) {
	            caminos.add(camino);
	        }
	    }

	    public void mostrarCaminos() {

	        int contador = 1;
	        for (ArrayList<Casilla<Boolean>> camino : caminos) {
	            System.out.println("Camino: " + contador);
	            for (Casilla<Boolean> casilla : camino) {
	                System.out.println(this.getElementoPosicion(casilla));
	            }
	            contador++;
	        }

	    }
}
