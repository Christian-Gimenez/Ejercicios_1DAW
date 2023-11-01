package examen.strings;

import java.util.Scanner;

public class Ejercicio11_NombreDelMasViejo {
	
	public static String masViejo(String nombre, int edad, String nombre2, int edad2) {
		if (edad > edad2) {
			return nombre + " es el más viejo.";
		} else if (edad < edad2) {
			return nombre2 + " es el más viejo.";
		} else {
			return nombre + " y " + nombre2 + " tienen la misma edad.";
		}
	}
	
	public static int edad() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static String nombre() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void main(String[] args) {
		/*Solicitar el ingreso del nombre y edad
		 * de dos personas. Mostrar el nombre
		 * de la persona con mayor edad.
		 * */
		
		String tu, amigo;
		int tuEdad, edadAmigo;
		
		System.out.print("Introduce tu nombre: ");
		tu = nombre();
		
		System.out.print("Tu edad: ");
		tuEdad = edad();
		
		System.out.print("\nIntroduce el nombre de tu amigo: ");
		amigo = nombre();
		
		System.out.println("Su edad: ");
		edadAmigo = edad();
		
		System.out.println(masViejo(tu, tuEdad, amigo, edadAmigo));
	
	}

}
