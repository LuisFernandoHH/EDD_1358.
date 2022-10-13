/*
 * Hernández Hernández Luis Fernando
 * Grupo 1358
 * Tarea 6, laberinto con BackTracking
 */
package laberinto.adt;

import java.io.IOException;
import java.util.ArrayList;

public class MainLaberinto {
	public static void main(String[] args) throws IOException {
		LaberintoADT<Casilla<Boolean>> lab = new LaberintoADT<Casilla<Boolean>>("C:\\espacio_de_trabajo\\LaberintoBackTracking\\src\\laberinto\\adt\\TareaLaberinto.csv",9,1,5,9);
		ArrayList<Casilla<Boolean>> camino = new ArrayList<>();
		camino.add(lab.getDatos().getItem(9, 1));
		lab.rellenarCaminos(lab, (Casilla<Boolean>) lab.getDatos().getItem(9, 1), camino);
		System.out.println("Camino mostrado con Array");
		lab.mostrarCaminos();
		System.out.println("Camino mostrado con PilaADT");
		lab.getCamino().transversal();
		
	}
}
