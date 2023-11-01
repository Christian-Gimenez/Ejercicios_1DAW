package examen.strings;

import java.util.Scanner;

public class Ejercicio12_CifradoCesar {
	
	public static char cifrarChar(char caracter) {
		char cifrado = ' ';
		
		switch(caracter) {
		case 'x':
			cifrado = 'a';
			break;
		case 'y':
			cifrado = 'b';
			break;
		case 'z':
			cifrado = 'c';
			break;
		case 'X':
			cifrado = 'A';
			break;
		case 'Y':
			cifrado = 'B';
			break;
		case 'Z':
			cifrado = 'C';
			break;
		default:
			cifrado = (char) (caracter + 3);
			break;
		}
		
		return cifrado;
	}
	
	public static String cifradoCesar(String text) {
		String cifrado = "";
		char caracter;
		
		for(int i = 0; i < text.length(); i++) {
			caracter = text.charAt(i);
			if (Character.isLetter(caracter)) {
				cifrado += cifrarChar(caracter);
			} else {
				cifrado += caracter;
			}
		}
		
		return cifrado;
	}
	
	public static char descifrarChar(char cifrado) {
		char descifrado = ' ';
		
		switch(cifrado) {
		case 'a':
			descifrado = 'x';
			break;
		case 'b':
			descifrado = 'y';
			break;
		case 'c':
			descifrado = 'z';
			break;
		case 'A':
			descifrado = 'X';
			break;
		case 'B':
			descifrado = 'Y';
			break;
		case 'C':
			descifrado = 'Z';
			break;
		default:
			descifrado = (char)(cifrado - 3);
			
		}
		
		return descifrado;
	}
	
	public static String descifrarCesar(String cifrado) {
		String descifrado = "";
		char caracter;
		
		for(int i = 0; i < cifrado.length(); i++) {
			caracter = cifrado.charAt(i);
			if (Character.isLetter(caracter)) {
				descifrado += descifrarChar(caracter);
			} else {
				descifrado += caracter;
			}
		}
		return descifrado;
	}

	public static String pedirTexto() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void main(String[] args) {
		/*Hacer el Cifrado Cesar,
		 * donde la A vale D,
		 * es decir, cada letra valdrá
		 * la 3ª letra siguiente del abcdario,
		 * siendo los casos especiales la X que volverá a valer A,
		 * la Y que valdrá B y la Z que valdrá C
		 * (ya que se habrá dado la vuelta al abcdario).
		 * Hacer también el descifrado.
		 * */
		String textoOriginal, textoCifrado, textoDesCifrado;
		System.out.println("Introduce un texto:");
		textoOriginal = pedirTexto();
		
		System.out.println("\nTu texto Cifrado en Cesar es:");
		textoCifrado = cifradoCesar(textoOriginal);
		System.out.println(textoCifrado);

		System.out.println("\nTu texto Des-Cifrado en Cesar es:");
		textoDesCifrado = descifrarCesar(textoCifrado);
		System.out.println(textoDesCifrado);
	}

}
