package examen.strings;

import java.util.Scanner;

public class Ejercicio8_EliminarEspacios {
	
	public static String eliminarEspacios(String texto) {
		String resultado = "";
		for(int i = 0; i < texto.length(); i++) {
			if(!Character.isSpaceChar(texto.charAt(i))) {
				if (i < texto.length()) {
					resultado += texto.substring(i, i+1);
				} else {
					resultado += texto.substring(i-1, i);
				}
				
			}
			/*
			if(texto.charAt(i) != ' ') {
				resultado += texto.charAt(i);
			}*/
		}
		return resultado;
	}
	
	public static String pedirTexto() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}

	public static void main(String[] args) {
		/*Solicita que se introduzca un texto por teclado
		 * y a continuación muestra el texto original
		 * eliminando los espacios del texto.
		 * */
		System.out.println("Introduce un texto: ");
		String text = pedirTexto();
		
		System.out.println("Tu texto sin teclado sería:");
		System.out.println(eliminarEspacios(text));

	}

}
