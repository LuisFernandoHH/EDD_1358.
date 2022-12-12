package proyecto.aragon;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		
		//Comenzaremos este ejemplo de pila instanciando el objeto Stack el cual
		//cuenta solamente con un constructor vacio
		
		Stack<Profesor> stackEjemplo = new Stack<>();
		
		//Creacion de onjetos profesor
		
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
		
		//Esta clase en particular solamente cuenta con 5 métodos propios, los cuales
		//se explicaran a continuación
		
		System.out.println("La universidad de la Ciudad de México al momento de contratar\n"
				+ "a sus profesores, tomo cada curriculum y los fue apliando de manera en la\n"
				+ "que fueron entregados");
		
		System.out.println("");
		System.out.println("--------------------Unas horas despues-------------");
		System.out.println("");
		
		//Stack solamente cuenta con un metodo propio (sin heredar) para introducir 
		//elementos en su interior y se conoce como push. Lo que hace esta funcion es que
		//va apilando sus elementos de tal manera que el primer elemento intoducido
		//es el ultimo elemento en salir de la estructura
		
		stackEjemplo.push(profesorUno);
		stackEjemplo.push(profesorDos);
		stackEjemplo.push(profesorTres);
		stackEjemplo.push(profesorCuatro);
		stackEjemplo.push(profesorCinco);
		stackEjemplo.push(profesorSeis);
		
		System.out.println("Una vez con las solicitudes completas, el director de la escuela\n"
				+ "se dispone a revisar los curriculums apilados y se pregunta si habrá\n"
				+ "personas interesadas en el trabajo");
		
		//Para comprobar si la pila esta vacia, se tiene el metodo empty, el cual regresa
		// un verdadero si la pila esta vacia, y un falso si no lo esta
		
		System.out.println("");
		System.out.println("¿Estará vacia la mesa?");
		System.out.println(stackEjemplo.empty());
		
		System.out.println("El director se pregunta cúal curriculum será el primero");
		
		//Stack nos ofrece el metodo peek, el cual devuelve el ultimo elemento ingresado
		//pero no lo elimina
		
		System.out.println("El primer curriculum sobre la pila es el de "
				+ stackEjemplo.peek().getNombre());
		
		System.out.println("");
		
		System.out.println("Una vez revisado el curriculum, se dispone a quitarlo del\n"
				+ "apilamiento y ver el siguiente, y así sucesivamente");
		
		//El metodo propio de Stack para eliminar un elemento se llama pop, y a diferencia
		//peek, este metodo si devuelve el elemento y lo elimina de la pila
		
		System.out.println("Curriculum revisado de "+ stackEjemplo.pop().getNombre());
		System.out.println("Curriculum revisado de "+ stackEjemplo.pop().getNombre());
		System.out.println("Curriculum revisado de "+ stackEjemplo.pop().getNombre());
		
		System.out.println("");
		System.out.println("Mientras estaba revisando las solicitudes de trabajo,\n"
				+ "el director se acordó de que su sobrino Angel había metido una\n"
				+ "solicitud de trabajo, por lo que se apresuro a buscarlo");
		
		//Ya por último analizaremos el metodo search. Como su nombre lo indica, nos permite buscar
		//un objeto en la pila y nos devuelve el indice -1 de la posicion en la que se encuentra
		// el objeto solicitado
		
		System.out.println("El curriculum de angel estaba en la posicion " 
		+ stackEjemplo.search(profesorUno));
		
		/*
		 * Como se pudo observar, esta clase contiene pocos metodos propios, sin embargo
		 * hay que recordar la jerarquia de collections ya que este ADT así como muchos otros
		 * heredan metodos de sus clases padre, por lo cual al momento de codificar
		 * es muy probable que nos encontremos metodos de otras clases tales como
		 * add, get, remove, clear, isEmpty entre otros
		 */
		
	}
}
