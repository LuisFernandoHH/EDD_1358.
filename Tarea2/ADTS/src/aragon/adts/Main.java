package aragon.adts;

public class Main {
	public static void main(String[] args) {
		ArregloADT<Alumno> arreglo = new ArregloADT<Alumno>(5);
		Alumno alumnoUno= new Alumno();
		alumnoUno.setNombre("Luis Fernando Hernandez Hernandez");
		alumnoUno.setPlantel("Fes Aragon");
		alumnoUno.setNivelDeEstudios("Tercer semestre");
		alumnoUno.setCalificacionGeneral(10);
		arreglo.setElemento(alumnoUno, 0);
		Alumno alumnoDos= new Alumno();
		alumnoDos.setNombre("Emmanuel Hernadez Hernandez");
		alumnoDos.setPlantel("CCH Vallejo");
		alumnoDos.setNivelDeEstudios("Septimo semestre");
		alumnoDos.setCalificacionGeneral(8);
		arreglo.setElemento(alumnoDos, 1);
		Alumno alumnoTres= new Alumno();
		alumnoTres.setNombre("Alejandra Hernandez Hernandez");
		alumnoTres.setPlantel("Fes Aragon");
		alumnoTres.setNivelDeEstudios("Sexto semestre");
		alumnoTres.setCalificacionGeneral(9);
		arreglo.setElemento(alumnoTres, 2);
		Alumno alumnoCuatro= new Alumno();
		alumnoCuatro.setNombre("Armando Hernande Hernandez");
		alumnoCuatro.setPlantel("Prepa 4");
		alumnoCuatro.setNivelDeEstudios("Primer semestre");
		alumnoCuatro.setCalificacionGeneral(7);
		arreglo.setElemento(alumnoCuatro, 3);
		System.out.println(arreglo.toString((Alumno) arreglo.getElemento(0)));
		System.out.println(arreglo.toString((Alumno) arreglo.getElemento(1)));
		System.out.println(arreglo.toString((Alumno) arreglo.getElemento(2)));
		System.out.println(arreglo.toString((Alumno) arreglo.getElemento(3)));
		System.out.println("El indice del arreglo es: " + arreglo.getLongitud());
		arreglo.limpiarTodo();
		System.out.println(arreglo.getElemento(0));
		arreglo.setElemento(alumnoUno, 3);
		System.out.println(arreglo.getElemento(3));
		System.out.println(arreglo.toString((Alumno) arreglo.getElemento(3)));
		System.out.println(arreglo.getElemento(1));
		
	}
}
