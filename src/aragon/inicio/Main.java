package aragon.inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner mes = new Scanner(System.in);
		int mesUno, mesDos;
		boolean verificar;
		Lectura archivo = new Lectura();
		archivo.leerCSV();
		System.out.println(archivo.diferenciaFollowersTwitter(8, archivo.getArreglo()));
		System.out.println(archivo.promedioCrecimientoTwitter(9, archivo.getArreglo()));
		System.out.println(archivo.promedioCrecimientoFacebook(2, archivo.getArreglo()));
		archivo.menu();
		do {
			try {
				verificar = false;
				mesUno = mes.nextInt();
				System.out.println("Dijite su segundo mes a evaluar");
				mesDos = mes.nextInt();
				System.out.println(archivo.youtubeDifVisualizaciones(mesUno, mesDos, 16, archivo.getArreglo()));
			} catch (InputMismatchException ex) {
				System.out.println("Debe ingresar un numero entero del 1 al 6 para continuar");
				mes.next();
				verificar = true;
			}
		} while (verificar);
	}
}
