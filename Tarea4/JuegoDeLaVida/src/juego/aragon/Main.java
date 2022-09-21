package juego.aragon;

public class Main {
	public static void main(String[] args) {
		Mundo mundo = new Mundo(10, 10);
		mundo.setCelula(4, 3);
		mundo.setCelula(4, 4);
		mundo.setCelula(4, 5);
		mundo.setCelula(3, 4);
		mundo.setCelula(3, 6);
		mundo.setCelula(4, 5);
		mundo.setCelula(2, 3);
		mundo.pintar();
		for (int i = 0; i < 10; i++) {
			Arreglo_DosD_ADT<Boolean> nextGen = mundo.cambiosGeneracion();
			mundo.cambiarGeneracion(nextGen);
			mundo.pintar();
			System.out.println("---------CAMBIO DE GENERACIÓN---------");
		}
	}

}
