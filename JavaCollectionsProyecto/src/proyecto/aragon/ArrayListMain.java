/*
 * Hern�ndez Hern�ndez Luis Fernando
 * Grupo 1358
 * Proyecto Java Collections
 * Programa sencillo de ejemplificaci�n
 */

package proyecto.aragon;

import java.util.ArrayList;

public class ArrayListMain {
	public static void main(String[] args) {
		//En esta parte creamos un constructor para pode inicializar el objeto de tipo
		//ArrayList. Cabe se�alar que hay tres tipos de constructores posibles, sin embargo,
		//para este tipo de prueba uaremos un constructor sin argumentos
		ArrayList<Profesor> arrayejemplo = new ArrayList<>();
		
		//Creacion de objetos profesor
		Profesor profesorUno = new Profesor("Angel Hern�ndez","AngHer@aragon.unam.mx","1236847930735",
				"5588232071", "34", "POO", false);
		Profesor profesorDos = new Profesor("Luis Martinez","LuisMtz@aragon.unam.mx","123564979005",
				"5595375832", "40", "Matem�ticas Aplicadas", true);
		Profesor profesorTres = new Profesor("Maria Contreras","MariCon@aragon.unam.mx","4720462046230",
				"5595265306", "20", "Ecuaciones Diferenciales", true);
		Profesor profesorCuatro = new Profesor("Alfonso Pe�a","AlfonsoP@aragon.unam.mx","8402640265301",
				"5509450329", "50", "Electricidad y Magnetismo", false);
		Profesor profesorCinco = new Profesor("Andrea Hernandez","AndreaH@aragon.unam.mx","93750173950327",
				"5594027509", "60", "Emprendimineto", true);
		Profesor profesorSeis = new Profesor("Jorge Estopier","JorgeEtr@aragon.unam.mx","8402730856112",
				"5503750048", "25", "Geometr�a Anal�tica", false);
		Profesor profesorTemporallUno = new Profesor("Camila Guitierez","CamiGut@aragon.unam.mx"
				,"0848269572084", "5594028578", "35", "POO", false);
		Profesor profesorTemporalDos = new Profesor("Andres Chavez","AndresCH@aragon.unam.mx"
				,"9583740094638", "5503885930", "15", "Matem�ticas Aplicadas", true);
		
		System.out.println("Bienvenido a la Universidad de Ciudad de M�xico");
		
		/*
		 * El arrayList cuenta con diveros m�rtodos y funciones que nos permiten 
		 * a�adir, busacar, eliminar y organizar a nustros objetos profesor.
		 * A continuacion utilizaremos los metodos que personalmente considero que son
		 * los m�s importantes
		 */
		
		//Empezaremos con un metodo simple llamado size, el cual nos devuelve el 
		//n�mero de elementos en el ArrayList
		System.out.println("Inauguramos nuestra universidad, se abren puestos vacantes "
				+ "para nuevos profesores,\nactualmente contamos con "
				+ arrayejemplo.size() + " Porofesores");
		
		//Ahora a�adiremos a nuestro ArrayList algunos profesores mediante el metodo
		//add, el cual a�ade un elemento al final de la lista
		
		arrayejemplo.add(profesorUno);
		arrayejemplo.add(profesorDos);
		arrayejemplo.add(profesorTres);
		arrayejemplo.add(profesorCuatro);
		
		System.out.println("");
		System.out.println("----------------Dos semanas despues-----------------");
		System.out.println("");
		
		//En esta ocasi�n usaremos el m�todo get para que el ArrayList nos devuelva el
		//elemento requqerido en el indice indicado
		System.out.println("La universiadad actualmente cuenta con " + arrayejemplo.size()
		+ " Profesores, los cuales son: \n");
		for (int i = 0; i < arrayejemplo.size(); i++) {
			System.out.println(arrayejemplo.get(i).getNombre() + " que imparte la materia de "
					+ arrayejemplo.get(i).getMateria());
		}
		
		//El ArrayList no solo puede insertar objetos al final de la fila,
		//tambien contamos con un metodo que puede insertar un objeto en un
		//indice en especifico usando el metodo add y como parametro el indice
		
		arrayejemplo.add(3, profesorCinco);
		arrayejemplo.add(4, profesorSeis);
		
		//Existe un m�todo llamado set que remplaza un objeto por otro dentro
		//del arrayList
		
		System.out.println("");
		System.out.println("------------A mitad de semestre-------------");
		System.out.println("");
		System.out.println("Nuestra Universidad informa que lastimosamente dos"
				+ " profesores se lesionaron\ndentro de nuestra institucion "
				+ "por lo cual nos vemos en la necesidad de contratar profesores suplentes");
		
		arrayejemplo.set(0, profesorTemporallUno);
		arrayejemplo.set(1, profesorTemporalDos);
		
		System.out.println("Ahora la lista de profesores qued� de la siguiente manera\n\n");
		
		for (int i = 0; i < arrayejemplo.size(); i++) {
			System.out.println(arrayejemplo.get(i).getNombre() + " que imparte la materia de "
					+ arrayejemplo.get(i).getMateria());
		}
		
		//Tambi�n contamos con dos m�todos para eliminar objetos del ArrayList
		//llevan por nombre remove, la diferencia esta en que uno pide como argumento
		//un indice dentro el array y el otro pide un objeto, y si se encuentra en la lista
		//este ser� removido
		
		System.out.println("");
		System.out.println("----------2 a�os despues-----------");
		System.out.println();
		
		System.out.println("Debido a problemas de presupuesto, la escuela tom� la dura \n"
				+ "decision de despedir a los maestros temporales, por lo cual la lista\n"
				+ "de profesores queda de la siguiente manera: \n\n");
		
		arrayejemplo.remove(0);
		arrayejemplo.remove(profesorTemporalDos);
		
		for (int i = 0; i < arrayejemplo.size(); i++) {
			System.out.println(arrayejemplo.get(i).getNombre() + " que imparte la materia de "
					+ arrayejemplo.get(i).getMateria());
		}
		
		System.out.println("");
		System.out.println("-----------Un A�o despues--------");
		System.out.println();
		
		//Si deseamos borrar todo el contenido de la lista, el metodo clear nos 
		//ayuda es ese aspecto, tambien existe un m�todo para preguntar si el
		//ArrayList esta vacio, y se llama isEmpty, este m�todo nos devolvera un 
		//true si esta vacio el array o en caso de no ser as�, devolvera un false
		
		System.out.println("Debido a falta de presupuesto y materias, la escuela call�\n"
				+ "en bacarrota y se vio obligada a cerrar, "
				+ "ya no quedan profesores en la lista");
		
		arrayejemplo.clear();
		System.out.println("�Esta vacia la lista? ");
		System.out.println(arrayejemplo.isEmpty());
		
		
		/*
		 * Easte fue un peque�o ejemplo donde se usaron unos de los metodos mas usados del
		 * ADT ArrayList, cabe recalcar que hay muchos m�todos m�s, sin embargo muchos de ellos
		 * son variaciones en cuanto a sus argumentos o met�dos que son de uso muy especifico.
		 * En esta simulacionde la lista de profesores de una escuela pxudimos observar como es que 
		 * el ArrayList interactua con los objetos mediante sus m�todos
		 */
	}
}
