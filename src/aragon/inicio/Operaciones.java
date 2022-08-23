package aragon.inicio;

import java.util.ArrayList;

public class Operaciones {

	public String diferenciaFollowersTwitter(int indice, ArrayList<Objeto> arreglo) {
		String cadenaApoyoTwitterEneroFoll;
		String cadenaApoyoTwitterJunioFoll;
		int twitterFollEnero;
		int twitterFollJunio;
		int diferenciaFollTwitter;

		cadenaApoyoTwitterEneroFoll = arreglo.get(indice).getEnero();
		cadenaApoyoTwitterEneroFoll = cadenaApoyoTwitterEneroFoll.replaceAll("\"", "");
		cadenaApoyoTwitterEneroFoll = cadenaApoyoTwitterEneroFoll.replaceAll(",", "");
		twitterFollEnero = Integer.parseInt(cadenaApoyoTwitterEneroFoll);
		cadenaApoyoTwitterJunioFoll = arreglo.get(indice).getJunio();
		cadenaApoyoTwitterJunioFoll = cadenaApoyoTwitterJunioFoll.replaceAll("\"", "");
		cadenaApoyoTwitterJunioFoll = cadenaApoyoTwitterJunioFoll.replaceAll(",", "");
		twitterFollJunio = Integer.parseInt(cadenaApoyoTwitterJunioFoll);
		diferenciaFollTwitter = twitterFollJunio - twitterFollEnero;
		return "La diferencia de followers entre el mes de " + "enero y junio en twitter es de: "
				+ diferenciaFollTwitter + " seguidores";
	}

	public String promedioCrecimientoTwitter(int indice, ArrayList<Objeto> arreglo) {
		String cadenaApoyoEne, cadenaApoyoFeb, cadenaApoyoMar, cadenaApoyoAbr, cadenaApoyoMay, cadenaApoyoJun;
		double enero, febrero, marzo, abril, mayo, junio, promedioTwitter;

		cadenaApoyoEne = arreglo.get(indice).getEnero();
		cadenaApoyoEne = cadenaApoyoEne.replaceAll("\"", "");
		cadenaApoyoEne = cadenaApoyoEne.replaceAll(",", "");
		enero = Double.parseDouble(cadenaApoyoEne);
		cadenaApoyoFeb = arreglo.get(indice).getFebrero();
		cadenaApoyoFeb = cadenaApoyoFeb.replaceAll("\"", "");
		cadenaApoyoFeb = cadenaApoyoFeb.replaceAll(",", "");
		febrero = Double.parseDouble(cadenaApoyoFeb);
		cadenaApoyoMar = arreglo.get(indice).getMarzo();
		cadenaApoyoMar = cadenaApoyoMar.replaceAll("\"", "");
		cadenaApoyoMar = cadenaApoyoMar.replaceAll(",", "");
		marzo = Double.parseDouble(cadenaApoyoMar);
		cadenaApoyoAbr = arreglo.get(indice).getAbril();
		cadenaApoyoAbr = cadenaApoyoAbr.replaceAll("\"", "");
		cadenaApoyoAbr = cadenaApoyoAbr.replaceAll(",", "");
		abril = Double.parseDouble(cadenaApoyoAbr);
		cadenaApoyoMay = arreglo.get(indice).getMayo();
		cadenaApoyoMay = cadenaApoyoMay.replaceAll("\"", "");
		cadenaApoyoMay = cadenaApoyoMay.replaceAll(",", "");
		mayo = Double.parseDouble(cadenaApoyoMay);
		cadenaApoyoJun = arreglo.get(indice).getJunio();
		cadenaApoyoJun = cadenaApoyoJun.replaceAll("\"", "");
		cadenaApoyoJun = cadenaApoyoJun.replaceAll(",", "");
		junio = Double.parseDouble(cadenaApoyoJun);
		promedioTwitter = 0;
		double A[] = { enero, febrero, marzo, abril, mayo, junio };
		int n = A.length;
		for (int i = 0; i < n; i++) {
			promedioTwitter = (int) (promedioTwitter + A[i]);
		}
		return "El promedio de crecimiento de usuarios en twitter " + "entre el mes de enero y junio es de: "
				+ (int) (promedioTwitter / n) + " personas";
	}

	public String promedioCrecimientoFacebook(int indice, ArrayList<Objeto> arreglo) {
		String cadenaApoyoEne, cadenaApoyoFeb, cadenaApoyoMar, cadenaApoyoAbr, cadenaApoyoMay, cadenaApoyoJun;
		double enero, febrero, marzo, abril, mayo, junio, promedioFacebbok;

		cadenaApoyoEne = arreglo.get(indice).getEnero();
		cadenaApoyoEne = cadenaApoyoEne.replaceAll("\"", "");
		cadenaApoyoEne = cadenaApoyoEne.replaceAll(",", "");
		enero = Double.parseDouble(cadenaApoyoEne);
		cadenaApoyoFeb = arreglo.get(indice).getFebrero();
		cadenaApoyoFeb = cadenaApoyoFeb.replaceAll("\"", "");
		cadenaApoyoFeb = cadenaApoyoFeb.replaceAll(",", "");
		febrero = Double.parseDouble(cadenaApoyoFeb);
		cadenaApoyoMar = arreglo.get(indice).getMarzo();
		cadenaApoyoMar = cadenaApoyoMar.replaceAll("\"", "");
		cadenaApoyoMar = cadenaApoyoMar.replaceAll(",", "");
		marzo = Double.parseDouble(cadenaApoyoMar);
		cadenaApoyoAbr = arreglo.get(indice).getAbril();
		cadenaApoyoAbr = cadenaApoyoAbr.replaceAll("\"", "");
		cadenaApoyoAbr = cadenaApoyoAbr.replaceAll(",", "");
		abril = Double.parseDouble(cadenaApoyoAbr);
		cadenaApoyoMay = arreglo.get(indice).getMayo();
		cadenaApoyoMay = cadenaApoyoMay.replaceAll("\"", "");
		cadenaApoyoMay = cadenaApoyoMay.replaceAll(",", "");
		mayo = Double.parseDouble(cadenaApoyoMay);
		cadenaApoyoJun = arreglo.get(indice).getJunio();
		cadenaApoyoJun = cadenaApoyoJun.replaceAll("\"", "");
		cadenaApoyoJun = cadenaApoyoJun.replaceAll(",", "");
		junio = Double.parseDouble(cadenaApoyoJun);
		promedioFacebbok = 0;
		double A[] = { enero, febrero, marzo, abril, mayo, junio };
		int n = A.length;
		for (int i = 0; i < n; i++) {
			promedioFacebbok = (int) (promedioFacebbok + A[i]);
		}
		return "El promedio de crecimiento de usuarios en facebook " + "entre el mes de enero y junio es de: "
				+ (int) (promedioFacebbok / n) + " personas";
	}

	public String youtubeDifVisualizaciones(int mesUno, int mesDos, int indice, ArrayList<Objeto> arreglo) {

		String cadenaApoyoEne, cadenaApoyoFeb, cadenaApoyoMar, cadenaApoyoAbr, cadenaApoyoMay, cadenaApoyoJun;
		int enero, febrero, marzo, abril, mayo, junio, primerMes = 0, segundoMes = 0, difereTotal;

		cadenaApoyoEne = arreglo.get(indice).getEnero();
		cadenaApoyoEne = cadenaApoyoEne.replaceAll("\"", "");
		cadenaApoyoEne = cadenaApoyoEne.replaceAll(",", "");
		enero = Integer.parseInt(cadenaApoyoEne);
		cadenaApoyoFeb = arreglo.get(indice).getFebrero();
		cadenaApoyoFeb = cadenaApoyoFeb.replaceAll("\"", "");
		cadenaApoyoFeb = cadenaApoyoFeb.replaceAll(",", "");
		febrero = Integer.parseInt(cadenaApoyoFeb);
		cadenaApoyoMar = arreglo.get(indice).getMarzo();
		cadenaApoyoMar = cadenaApoyoMar.replaceAll("\"", "");
		cadenaApoyoMar = cadenaApoyoMar.replaceAll(",", "");
		marzo = Integer.parseInt(cadenaApoyoMar);
		cadenaApoyoAbr = arreglo.get(indice).getAbril();
		cadenaApoyoAbr = cadenaApoyoAbr.replaceAll("\"", "");
		cadenaApoyoAbr = cadenaApoyoAbr.replaceAll(",", "");
		abril = Integer.parseInt(cadenaApoyoAbr);
		cadenaApoyoMay = arreglo.get(indice).getMayo();
		cadenaApoyoMay = cadenaApoyoMay.replaceAll("\"", "");
		cadenaApoyoMay = cadenaApoyoMay.replaceAll(",", "");
		mayo = Integer.parseInt(cadenaApoyoMay);
		cadenaApoyoJun = arreglo.get(indice).getJunio();
		cadenaApoyoJun = cadenaApoyoJun.replaceAll("\"", "");
		cadenaApoyoJun = cadenaApoyoJun.replaceAll(",", "");
		junio = Integer.parseInt(cadenaApoyoJun);

		switch (mesUno) {
		case 1:
			primerMes = enero;
			break;
		case 2:
			primerMes = febrero;
			break;
		case 3:
			primerMes = marzo;
			break;
		case 4:
			primerMes = abril;
			break;
		case 5:
			primerMes = mayo;
			break;
		case 6:
			primerMes = junio;
			break;
		default:

			break;
		}

		switch (mesDos) {
		case 1:
			segundoMes = enero;
			break;
		case 2:
			segundoMes = febrero;
			break;
		case 3:
			segundoMes = marzo;
			break;
		case 4:
			segundoMes = abril;
			break;
		case 5:
			segundoMes = mayo;
			break;
		case 6:
			segundoMes = junio;
			break;
		default:

			break;
		}

		difereTotal = primerMes - segundoMes;
		return "La diferencia entre los meses seleccionados es de " + difereTotal + " visualizaciones";

	}

	public void menu() {
		System.out.println("Por favor dijite un numero del 1 al 6 para calcular"
				+ " la diferencia de visualizaciones de youtube\n" + "entre los meses de enero y junio\n"
				+ "1 = enero\n" + "2 = febrero\n" + "3 = marzo\n" + "4 = abril\n" + "5 = mayo\n" + "6 = junio\n");
	}

}
