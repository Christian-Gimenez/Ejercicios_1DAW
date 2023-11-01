package examen.strings;

import java.util.Scanner;

public class Ejercicio13_LaFraseMasCorta {
	
	public static int contarFrase(String frase) {
		int resultado=0;
		
		for(int i = 0; i < frase.length(); i++) {
			resultado++;
		}
		
		return resultado;
	}
	
	public static String masCorta(String frase1, String frase2) {
		if (contarFrase(frase1) > contarFrase(frase2)) {
			return frase1;
		} else if (contarFrase(frase1) < contarFrase(frase2)) {
			return frase2;
		} else {
			return "Ambas frases son igual de largas";
		}
	}
	
	public static String pedirFrase() {
		String frase;
		Scanner teclado = new Scanner(System.in);
		frase = teclado.nextLine();
		return frase;
	}

	public static void main(String[] args) {
		/*Pedir 2 frases e imprimir cual ha sido la más corta.*/
		String frase1, frase2, corta;
		System.out.println("Introduce una frase: ");
		frase1 = pedirFrase();
		
		System.out.println("\nIntroduce otra frase: ");
		frase2 = pedirFrase();
		
		corta = masCorta(frase1, frase2);
		System.out.println("\nLa frase Más corta es:");
		System.out.println(corta);
	}

}
