package proyecto.aragon;

import java.util.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		//Iniciaremos creando la instancia de nuestra LimkedList, esta clase solamemte cuenta con
		//2 constructores a la hora de crearse. Para el ejemplo, utilizaremos el constructor sin
		//argumentos
		
		LinkedList<Profesor> linkedListEjemlo = new LinkedList<>();
		
		/*
		 * Antes de continuar con el ejemplo, es importante aclarar que la manera en la que 
		 * operan los metodos del LinledList es muy similar a como operan los metodos del
		 * ArrayList, ya que a simple vista muchos metodos en ambos ADTS hacen exactamente lo mismo
		 * Una de las diferencias mas grandes que tiene la LinkedList es que tiene métodos
		 * que operan sobre el elemento inicial y final de sus enlaces, ademas de que contiene
		 * métodos que perteneces a otros ADTS, como los métodos pop, push y peek que perteneces a 
		 * las pilas.
		 * 
		 * Debido a lo anterior comentado, volveremos a tomar el ejemplo de el arrayList, pero
		 * ahora implementaremos diversos metodos para que se pueda apreciar la diferencia entre
		 * cada uno
		 */
		
		
		//Creacion de objetos profesor
		
		Profesor profesorUno = new Profesor("Angel Hernández","AngHer@aragon.unam.mx","1236847930735",
				"5588232071", "34", "POO", false);
		Profesor profesorDos = new Profesor("Luis Martinez","LuisMtz@aragon.unam.mx","123564979005",
				"5595375832", "40", "Matemáticas Aplicadas", true);
		Profesor profesorTres = new Profesor("Maria Contreras","MariCon@aragon.unam.mx","4720462046230",
				"5595265306", "20", "Ecuaciones Diferenciales", true);
		Profesor profesorCuatro = new Profesor("Alfonso Peña","AlfonsoP@aragon.unam.mx","8402640265301",
				"5509450329", "50", "Electricidad y Magnetismo", false);
		Profesor profesorCinco = new Profesor("Andrea Hernandez","AndreaH@aragon.unam.mx","93750173950327",
				"5594027509", "60", "Emprendimineto", true);
		Profesor profesorSeis = new Profesor("Jorge Estopier","JorgeEtr@aragon.unam.mx","8402730856112",
				"5503750048", "25", "Geometría Analítica", false);
		Profesor profesorTemporallUno = new Profesor("Camila Guitierez","CamiGut@aragon.unam.mx"
				,"0848269572084", "5594028578", "35", "POO", false);
		Profesor profesorTemporalDos = new Profesor("Andres Chavez","AndresCH@aragon.unam.mx"
				,"9583740094638", "5503885930", "15", "Matemáticas Aplicadas", true);
		
		System.out.println("Bienvenido a la Universidad de Ciudad de México");
		
		//Igualmente empezaremos con el método size, que nos regresa el número de elementos 
		//que hay en la LinkedList
		
		System.out.println("Inauguramos nuestra universidad, se abren puestos vacantes "
				+ "para nuevos profesores,\nactualmente contamos con "
				+ linkedListEjemlo.size() + " Porofesores");
		
		//Ahora mostraremos las distintas manera que tenemos para añadir elementos
		//a nuestra LinkedList
		
		//Añade en la posicion 0
		linkedListEjemlo.addFirst(profesorUno);
		//Añade un objeto en un indice establecido
		linkedListEjemlo.add(1, profesorDos);
		//añade un objeto al final de la lista enlazada
		linkedListEjemlo.add(profesorTres);
		linkedListEjemlo.add(profesorCuatro);
		linkedListEjemlo.add(profesorCinco);
		//añade un objeto en la ultima posicion
		linkedListEjemlo.addLast(profesorSeis);
		
		System.out.println("");
		System.out.println("----------------Dos semanas despues-----------------");
		System.out.println("");
		
		//A continuación usaremos los métodos get para obtener nuestros objetos, y al igual
		//que el metodo add, get cuenta con distiontos tipos de parametros que nos permiten 
		//devolver ciertos objetos en la primera y en la ultima posición
		
		System.out.println("La universiadad actualmente cuenta con " + linkedListEjemlo.size()
		+ " Profesores, los cuales son: \n");
		
		//Devuelve el primer elemento 
		System.out.println(linkedListEjemlo.getFirst().getNombre() + " que imparte la materia de "
				+ linkedListEjemlo.getFirst().getMateria());
		//Devuelve el elemento del indice solicitado
		System.out.println(linkedListEjemlo.get(1).getNombre() + " que imparte la materia de "
				+ linkedListEjemlo.get(1).getMateria());
		System.out.println(linkedListEjemlo.get(2).getNombre() + " que imparte la materia de "
				+ linkedListEjemlo.get(2).getMateria());
		System.out.println(linkedListEjemlo.get(3).getNombre() + " que imparte la materia de "
				+ linkedListEjemlo.get(3).getMateria());
		System.out.println(linkedListEjemlo.get(4).getNombre() + " que imparte la materia de "
				+ linkedListEjemlo.get(4).getMateria());
		//Devuelve el ultimo elemento
		System.out.println(linkedListEjemlo.getLast().getNombre() + " que imparte la materia de "
				+ linkedListEjemlo.getLast().getMateria());
		
		//Me gustaria añadir que existen un conjunto de metodos que llevan por nombre peek,
		//y su funcion consiste en sacar el elemento ya sea del inicio o del final de la lista
		//ligada, pero no los eliminan, simplemenete los devuelve
		
		System.out.println("");
		System.out.println("------------A mitad de semestre-------------");
		System.out.println("");
		System.out.println("Nuestra Universidad informa que lastimosamente dos"
				+ " profesores se lesionaron\ndentro de nuestra institucion "
				+ "por lo cual nos vemos en la necesidad de contratar profesores suplentes");
		
		//LinkedList tambien cuenta con un metodo set que remplaza un elemento por otro
		
		linkedListEjemlo.set(0, profesorTemporallUno);
		linkedListEjemlo.set(1, profesorTemporalDos);
		
		System.out.println("Ahora la lista de profesores quedó de la siguiente manera\n\n");
		
		for (int i = 0; i < linkedListEjemlo.size(); i++) {
			System.out.println(linkedListEjemlo.get(i).getNombre() + " que imparte la materia de "
					+ linkedListEjemlo.get(i).getMateria());
		}	
		
		System.out.println("");
		System.out.println("----------2 años despues-----------");
		System.out.println();
		
		System.out.println("Debido a problemas de presupuesto, la escuela tomó la dura \n"
				+ "decision de despedir a varios maestros, por lo cual la lista\n"
				+ "de profesores queda de la siguiente manera: \n\n");
		
		//En los metodos de eliminar, tenemos el conjunto de remove, estos metodos tienen el
		//mismo comportamientos que los metodos add y get, ya que pueden encargarse de 
		//los nodos iniciales y finales 
		
		
		//remueve el primer elemento
		linkedListEjemlo.removeFirst();
		//remueve el primer elemento que se encuentre
		linkedListEjemlo.remove();
		//remueve un elemento en un indice especifico
		linkedListEjemlo.remove(2);
		//remueve un elemento en especifico
		linkedListEjemlo.remove(profesorCuatro);
		//remueve el ulrimo elemento
		linkedListEjemlo.removeLast();
		
		
		for (int i = 0; i < linkedListEjemlo.size(); i++) {
			System.out.println(linkedListEjemlo.get(i).getNombre() + " que imparte la materia de "
					+ linkedListEjemlo.get(i).getMateria());
		}	
		
		System.out.println("");
		System.out.println("-----------Unos días despues--------");
		System.out.println();
		
		System.out.println("Debido a falta de presupuesto y materias, la escuela calló\n"
				+ "en bacarrota y se vio obligada a cerrar, "
				+ "ya no quedan profesores en la lista");
		
		//Por ultimo, mencionaremos el metodo clear y el metodo isEmpty
		//Clear lo que hace es eliminar todos los elementos que contega una
		//LinkedLis, por otro lado, isEmpty nos devolvera un 
		//true si esta vacia la lista ligada o en caso de no ser así, 
		//devolvera un false
		
		linkedListEjemlo.clear();
		
		System.out.println("¿Esta vacia la lista? ");
		System.out.println(linkedListEjemlo.isEmpty());
		
		/*
		 * Como se pudo observar, una LinkedList es muy parecido a un ArrayList,
		 * sin embargo, la lista ligada tiene un mayor control sobre sus elementos 
		 * al pode tener distintas funciones que permitan manipular de manera mas eficiente
		 * a los objetos dentro de la lista ligada
		 */
	}
}
