package examen.extras;

import java.util.Scanner;

public class Ejercicio3_Rotulo {
	
	public static void borrarPantalla() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public static void retardo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void mostrarTexto(String texto) {
		borrarPantalla();
		for(int i = 0; i < texto.length(); i++) {
			if (i + 10 <= texto.length()) {
				System.out.println(texto.substring(i, i+10));
			} else {
				System.out.println(texto.substring(i, texto.length()));
			}
			retardo();
			borrarPantalla();
			
			/*
			if(i == texto.length() - 1) {
				i = -1;
			}*/
		}
	}

	public static void main(String[] args) {
		/*una cadena de caracteres,
		 * la cual salga por pantalla una cantidad de la cadena,
		 * empezando por el 0 y vaya avanzando en la cadena
		 * pero siempre mostrando la misma cantidad de caracteres.
		 * El programa acaba cuando no quedan más caracteres
		 */
		String texto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		texto = teclado.nextLine();
		mostrarTexto(texto);
		
	}

}
