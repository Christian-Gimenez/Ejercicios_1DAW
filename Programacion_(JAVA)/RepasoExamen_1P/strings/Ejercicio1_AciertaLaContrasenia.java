package examen.strings;

import java.util.Scanner;

public class Ejercicio1_AciertaLaContrasenia {
	
	public static String introducirPassword() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static boolean compararPassword(String passSecreta, String passIntroducida) {
		if (passSecreta.equals(passIntroducida)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String mayorOmenor(String palabraSecreta, String palabraIntroducida) {
		if (palabraSecreta.compareTo(palabraIntroducida) < 0) {
			return "La contraseña del 1ºJugador es 'menor' a al tuya";
		} else if (palabraSecreta.compareTo(palabraIntroducida) > 0) {
			return "La contraseña del 1º Jugador es 'MAYOR' a la tuya";
		} else {
			return "¡HAS ACERTADO!";
		}
	}
	
	public static String resultadoAsteriscos(String secretPass, String userPass) {
		String resultado = "";
		for(int i = 0; i < secretPass.length(); i++) {
			if (i < userPass.length()) {
				if (secretPass.charAt(i) == userPass.charAt(i)) {
					resultado += secretPass.charAt(i);
				} else {
					resultado += '*';
				}
			} else {
				resultado += '*';
			}
		}
		return resultado;
	}
	
	public static void juegoAdivinaPassword(String secretPassword) {
		String password2Player = "";
		while (!compararPassword(secretPassword, password2Player)) {
			System.out.print("2º Jugador, introduce una contraseña: ");
			password2Player = introducirPassword();
			
			if(!compararPassword(secretPassword, password2Player)) {
				System.out.println("Pistas:");
				System.out.println("- " + mayorOmenor(secretPassword, password2Player));
				System.out.println("- " + resultadoAsteriscos(secretPassword, password2Player));
			} else {
				System.out.println(mayorOmenor(secretPassword, password2Player) + " :) La contraseña del 1º jugador era: " + secretPassword);
			}
		}
		
	}
	

	public static void main(String[] args) {
		/*Diseñar el juego "Acierta la contraseña".
		 * La mecánica del juego es la siguiente:
		 * el primer jugador introduce la contraseña;
		 * a continuación, el segundo jugador debe teclear palabras hasta que acierte
		 *  Realizar dos versiones,
		 *  en la primera se facilita si la palabra introducida es mayor o menor
		 *  alfabeticamente que la contraseña.
		 *  En la segunda se ponen **** por cada letra no acertada y se muestra la letra acertada*/
		System.out.println("1º Jugador, introduce la contraseña: ");
		String secretPass = introducirPassword();
		
		juegoAdivinaPassword(secretPass);
		
	}

}
