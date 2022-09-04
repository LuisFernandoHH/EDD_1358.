/*
 * Hernández Henández Luis Fernando
 * Grupo: 1358
 * Tarea 3: Empresa
 */
package ejercicio.arregloadt;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		NominaADT prueba = new NominaADT("C:\\espacio_de_trabajo\\ADTS\\src\\ejercicio\\arregloadt\\junio.dat");
		prueba.listarSueldos();
		System.out.println(prueba.mayorAntiguedad());
		System.out.println(prueba.menorAntiguedad());
	}
}
