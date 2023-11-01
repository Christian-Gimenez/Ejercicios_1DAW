package examen.extras;

import java.util.Scanner;

public class Ejercicio1_Ahorcado {
	
	public static void juegoAhorcado() {
		String secretWord ="", revealedWord="", auxWord="", respuesta="";
		char userTry = ' ';
		int intentos=0;
		System.out.println("---¡BIENVENIDX AL JUEGO DEL A-H-O-R-C-A-D-O!---");
		System.out.println("----Jugador 1, introduce la palabra secreta----");
		System.out.print("-> ");
		secretWord = espaciarString(pedirPalabra()).toUpperCase();
		revealedWord = desvelarLetras(secretWord, '!');
		auxWord = revealedWord;
		limpiarPantalla();
		
		while(!comprobarPalabras(secretWord, revealedWord) && intentos <= 5) {
			System.out.println("Palabra a resolver: " + auxWord + " (tiene " + (secretWord.length()/2) +" letras)");
			System.out.print("Jugador2, introduce una letra: ");
			userTry = Character.toUpperCase(pedirLetra());
			
			revealedWord = desvelarLetras(secretWord, userTry, auxWord);
			
			if(!comprobarPalabras(secretWord, revealedWord)) {
				if(!comprobarPalabras(auxWord, revealedWord) && tieneEsaLetra(revealedWord, userTry)) {
					System.out.println("¡Bien! Tu letra \"" + userTry + "\" se encuentra dentro :)");
					auxWord = revealedWord;
				} else {
					System.out.println("Ups... Tu letra \"" + userTry + "\" no corresponde a ninguna :(");
				}
				
			}
			
			
			intentos++;
			System.out.print("\n");
		}
		if (intentos <= 5) {
			System.out.println("¡ENHORABUENA!\nLo has conseguido en " + intentos + " intentos, la palabra era: " + secretWord);

		} else {
			System.out.println("Se acabaron los intentos...\n¿Cual es tu respuesta para resolver?: " + revealedWord);
			System.out.print("-> ");
			respuesta = espaciarString(pedirPalabra()).toUpperCase();
			if (comprobarPalabras(respuesta, secretWord)) {
				System.out.println("¡ENHORABUENA!\nLo has conseguido en " + (intentos-1) + " intentos, la palabra era: " + secretWord);
			} else {
				System.out.println("GAME OVER... :(\nHas perdido, la respuesta era " + secretWord);
			}
			
		}
		
	}
		
	public static boolean comprobarPalabras(String secretWord, String revealedWord) {
		if (secretWord.equalsIgnoreCase(revealedWord)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean tieneEsaLetra(String word, char letra) {
		for(int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letra) {
				return true;
			}
		}
		return false;
	}
	
	public static void limpiarPantalla() {
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
		
	public static String espaciarString(String palabra) {
		String resultado = "";
		int longitud = palabra.length()*2;
		
		for(int i = 0; i < longitud; i++) {
			if (i == 0) {
				resultado += palabra.charAt(i);
			} else {
				if (i % 2 != 0) {
					resultado += " ";
				} else {
					resultado += palabra.charAt(i/2);
				}
			}
		}
		
		return resultado;
	}
	
	public static String desvelarLetras(String secretWord, char userLetter, String revealedWord) {
		userLetter = Character.toUpperCase(userLetter);
		secretWord = secretWord.toUpperCase();
		String resultado = "";
		
		for(int i = 0; i < secretWord.length(); i++) {
			if(secretWord.charAt(i) != ' ' && secretWord.charAt(i) != revealedWord.charAt(i)) {
				if (secretWord.charAt(i) == userLetter) {
					resultado += userLetter;
				} else {
					resultado += "_";
				}
			} else {
				if (secretWord.charAt(i) == ' ') {
					resultado += " ";
				} else {
					resultado += revealedWord.charAt(i);
				}
				
			}
			
		}
		return resultado;
	}
	
	public static String desvelarLetras(String secretWord, char userLetter) {
		userLetter = Character.toUpperCase(userLetter);
		secretWord = secretWord.toUpperCase();
		String resultado = "";
		
		for(int i = 0; i < secretWord.length(); i++) {
			if(secretWord.charAt(i) != ' ') {
				if (secretWord.charAt(i) == userLetter) {
					resultado += userLetter;
				} else {
					resultado += "_";
				}
			} else {
			
				resultado += " ";
			}
		}
		return resultado;
	}
	
	public static String pedirPalabra() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static char pedirLetra() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().charAt(0);
	}

	public static void main(String[] args) {
		/*Hacer un ahorcado, pedir una palabra
		 * y que vayan diciendo letras,
		 * si la adivinan se le pone en la posición,
		 * si no, se le suma un fallo(max 5)
         * por ejemplo:
         * si te dicen la palabra casa muestra
         * " * * * * " y ve pidiendo letras,
         * si dicen la A,
         * mostrar " * a * a "
         * y así hasta que adivinen o fallen.
         */
		juegoAhorcado();
	}

}
