package examen.strings;

import java.util.Scanner;

public class Ejercicio5_BuscarPalabraEnFrase {
	
	public static String leerTexto() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static int buscarPalabra(String frase, String palabra) {
		int veces = 0;
		while (frase.contains(palabra)) {
			veces++;
			frase = frase.replaceFirst(palabra, "");
		}
		return veces;
	}

	public static void main(String[] args) {
		/*Diseñar un programa que solicite al usuario una frase y una palabra.
		 * A continuación buscará cuantas veces aparece la palabra en la frase.
		 * */
		
		System.out.println("Introduce una frase:");
		String frase = leerTexto();
		
		System.out.println("Introducir palabra a buscar en el texto:");
		String palabra = leerTexto();
		
		System.out.println("Se han encontrado " + buscarPalabra(frase, palabra));

	}

}
