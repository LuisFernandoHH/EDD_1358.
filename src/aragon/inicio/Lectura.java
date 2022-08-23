package aragon.inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lectura extends Operaciones {

	private ArrayList<Objeto> arreglo = new ArrayList<>();

	public void leerCSV() {
		File f = new File(System.getProperty("user.dir") + "/datos/presenciaredes.csv");
		FileReader linea;
		Objeto ob;
		try {
			linea = new FileReader(f);
			BufferedReader buf = new BufferedReader(linea);
			String cadena;
			while ((cadena = buf.readLine()) != null) {

				String datos[] = cadena.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				ob = new Objeto(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7],
						datos[8]);
				arreglo.add(ob);
				// System.out.println(cadena);
			}
			buf.close();
			linea.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Objeto> getArreglo() {
		return arreglo;
	}

}