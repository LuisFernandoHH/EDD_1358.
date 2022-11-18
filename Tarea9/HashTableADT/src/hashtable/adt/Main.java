package hashtable.adt;

public class Main {
	public static void main(String[] args) {
		HashTableADT<Integer, String> tabla = new HashTableADT<Integer, String>(7);
		System.out.println("(LLAVE)Insertar Numero de cuenta y Nombre(VALOR)");
		System.out.println("Insertarme a mi mismo");
		tabla.insert(319028005, "Luis Fernando Hernandez");
		System.out.println(tabla.getSize());
		System.out.println("Insertar a Armando");
		tabla.insert(673897227, "Armando Hernández");
		System.out.println("Insertar a Emmanuel");
		tabla.insert(836397494, "Emmanuel Hernández");
		System.out.println("Insertar a Alejandra");
		tabla.insert(836382048, "Alejandra Hernández");
		System.out.println(tabla.getSize());
		
		System.out.println("Eliminar a Luis");
		tabla.remove(319028005);
		System.out.println(tabla.getSize());
		
		System.out.println("Insertar a Lala Hernandes");
		tabla.insert(183782998, "Lala Hernández");
		System.out.println(tabla.hasKey(183782998));
		
		ListaLigadaADT<Integer> llaves = tabla.keys();
		 for (Integer key: llaves) {
	            System.out.println(key);
	        }
		 
		 tabla.clear();
		 
		 System.out.println(tabla.isEmpty());
		 
	}
}
