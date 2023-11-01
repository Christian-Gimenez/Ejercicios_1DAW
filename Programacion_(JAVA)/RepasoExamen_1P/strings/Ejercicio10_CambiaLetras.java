package examen.strings;

import java.util.Scanner;

public class Ejercicio10_CambiaLetras {
	
	public static String solicitarTexto() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static char solicitarChar() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().charAt(0);
	}
	
	public static String cambiarLetra(String texto, char original, char cambiarPor) {
		String resultado = "";
		for(int i = 0; i < texto.length(); i++) {
			if (Character.toUpperCase(texto.charAt(i)) == original || Character.toLowerCase(texto.charAt(i)) == original) {
				
				if (texto.charAt(i) != Character.toUpperCase(original)) { //Si el char de i NO es el original en Mayus
					resultado += Character.toLowerCase(cambiarPor); //Sustituimos en minus
				} else {
					resultado += Character.toUpperCase(cambiarPor);//Y si no, sustituimos en MAYUS
				}
				
			} else {
				resultado += texto.charAt(i);
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		/*Realiza un programa que solicite un texto
		 * y después solicita dos letras.
		 * A continuación muestra el texto original
		 * pero reemplazando la primera letra
		 * que ha leído por la segunda letra.
		 * */
		String texto = "";
		char letraOriginal, letraCambiada;
		
		System.out.println("Introduce un texto:");
		texto = solicitarTexto();
		
		System.out.print("¿Qué letra quieres sustituir del texto? -> ");
		letraOriginal = solicitarChar();
		
		System.out.print("¿Por qué letra deseas sustituir \"" + letraOriginal + "\"? -> ");
		letraCambiada = solicitarChar();
		
		System.out.println("Tu texto cambiando la \"" + letraOriginal + "\" por \"" + letraCambiada + "\" quedaría:");
		System.out.println(cambiarLetra(texto, letraOriginal, letraCambiada));

	}

}
