package org.villablanca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String linea;
		int numero;
		boolean numeroLeido = true;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Dame un numero: ");
			linea = teclado.nextLine();
			try {
				numeroLeido = true;
				numero = Integer.parseInt(linea);
			} catch(NumberFormatException ex) {
				System.out.println("Error al leer el número.");
				numeroLeido = false;
			}
		} while (!numeroLeido);
		System.out.println("Programa finalizado");
		
		
	}
}