package secuenciales;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		/* Dadas dos variables numéricas A y B, que el usuario debe teclear,
		se pide realizar un algoritmo que intercambie los valores de ambas variables
		y muestre cuanto valen al final las dos variables.
		*/
		Scanner teclado = new Scanner(System.in);
		int a, b, intercambio;
		
		System.out.print("Introduce el valor de A: ");
		a = teclado.nextInt();
		
		System.out.print("Introduce el valor de B: ");
		b = teclado.nextInt();
		
		intercambio = a;
		a = b;
		b = intercambio;
		
		System.out.println("El valor de A: " + a);
		System.out.println("El valor de B: " + b);
		
	}

}
