package ejercicios.casa;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static char[] abcdario() {
		char[] abc = new char[26];
		for(int i = 1; i < abc.length; i++) {
			abc[i] = (char)('A' + 1);
		}
		return abc;
	}

	public static void main(String[] args) {
		/*Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’
		 * (solo las mayúsculas). Después, ve pidiendo posiciones
		 * del array por teclado y si la posicion es correcta,
		 * se añadira a una cadena que se mostrara al final,
		 * se dejará de insertar cuando se introduzca un -1.
			Por ejemplo, si escribo los siguientes numeros
			0 //Añadira la ‘A’
			5 //Añadira la ‘F’
			25 //Añadira la ‘Z’
			50 //Error, inserte otro numero
			-1 //fin
		 * */
		Scanner teclado = new Scanner(System.in);
		char[] alfabeto = new char[26];
		String miCadena = "";
		int posicion = 0;
		
		while(posicion != -1) {
			System.out.print("Dime una posición del array abcdario: ");
			posicion = teclado.nextInt();
			if (posicion >= 0 && posicion <= 25) {
				miCadena += alfabeto[posicion];
				System.out.println("Añadirá la '" + alfabeto[posicion] + "'");
			} else if (posicion == -1) {
				System.out.println("Programa finalizado.");
			} else {
				System.err.println("Error, inserte otro numero.");
			}
		}
		
		System.out.println("Tu frase es: ");
		System.out.print(miCadena);
		

	}

}
