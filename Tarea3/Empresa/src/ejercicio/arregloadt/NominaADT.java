package ejercicio.arregloadt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NominaADT {
	private String ruta;
	private ArregloADT<Trabajador> datos;
	
	public NominaADT(String ruta) throws IOException {
		super();
		this.ruta = ruta;
		int contador = 0;
		String cadena, contenido = "" ;
		BufferedReader bLectura = new BufferedReader(new FileReader(this.ruta));
		bLectura.readLine();
		while((cadena = bLectura.readLine())!= null) {
			//System.out.println(cadena);
			contenido += cadena + "\n";
			contador ++;
		}
		bLectura.close();
		
		String[] arregloTemporal = contenido.split("\n");
		
		datos = new ArregloADT<>(contador);
		
		for (int i = 0; i < arregloTemporal.length; i++) {
			String[] arregloPorComas = arregloTemporal[i].split(",");
			Trabajador tr = new Trabajador(arregloPorComas[0],
					arregloPorComas[1],
					arregloPorComas[2],
					arregloPorComas[3],
					Double.parseDouble(arregloPorComas[4]),
					Double.parseDouble(arregloPorComas[5]),
					Integer.parseInt(arregloPorComas[6]));
			datos.setElemento(i, tr);
		}
		
	}
	
	public void listarSueldos() {
		for (int i = 0; i < datos.getLongitud(); i++) {
			System.out.println("Nombre del trabajador: "+ datos.getElemento(i).getNombres()+" "
		+datos.getElemento(i).getApellidoPaterno()+ " "+ datos.getElemento(i).getApellidoMaterno());
			System.out.println("Numero de trabajador: "+ datos.getElemento(i).getNumeroTrabajor());
			System.out.println("Sueldo total: "+ datos.getElemento(i).calcularSueldo());
			System.out.println("------------------------------------------");
		}
	}
	
	public  String mayorAntiguedad() {
		int mayor = 2022;
		int inx = 0;
		for (int i = 0; i < datos.getLongitud(); i++) {
			Trabajador emp = datos.getElemento(i);
			if (emp.getAñoDeIngreso() < mayor) {
				inx = i;
				mayor = emp.getAñoDeIngreso();
			}
		}
		return "El empleado con mayor antiguedad es: " + datos.getElemento(inx).getNombres() + 
				" "+ datos.getElemento(inx).getApellidoPaterno()+ " "+ datos.getElemento(inx).getApellidoMaterno()
				+" con el numero de trabajador : " + datos.getElemento(inx).getNumeroTrabajor();
	}
	
	public  String menorAntiguedad() {
		int menor = 1800;
		int inx = 0;
		for (int i = 0; i < datos.getLongitud(); i++) {
			Trabajador emp = datos.getElemento(i);
			if (emp.getAñoDeIngreso() >= menor) {
				inx = i;
				menor = emp.getAñoDeIngreso();
			}
		}
		return "El empleado con menor antiguedad es: " + datos.getElemento(inx).getNombres() + 
				" "+ datos.getElemento(inx).getApellidoPaterno()+ " "+ datos.getElemento(inx).getApellidoMaterno()
				+" con el numero de trabajador : " + datos.getElemento(inx).getNumeroTrabajor();
	}

	
}
