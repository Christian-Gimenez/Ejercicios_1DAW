import java.util.Scanner;

public class Ejercicio1_v2 {
	
	/*
	public static void clearConsole() {
		String os = System.getProperty("os.name");
		if(os.contains("Windows")) {
			Runtime.getRuntime().exec("cls");
		} else {
			Runtime.getRuntime().exec("clear");
			
		}
	}*/

	public static String introducePass(int jugador) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(jugador + "º Jugador, introduce la contraseña: ");
		return teclado.nextLine();
	}

	public static void main(String[] args) {
		/*Diseñar el juego "Acierta la contraseña".
		 * La mecánica del juego es la siguiente:
		 * el primer jugador introduce la contraseña;
		 * a continuación, el segundo jugador debe teclear palabras hasta que acierte.
		 * Realizar dos versiones, en la primera se facilita si la palabra
		 * introducida es mayor o menor alfabeticamente que la contraseña.
		 * 
		 * v2: Palabra original pero tapando con ***** si acierta una palabra, mostramos **S**...
		 * */
		Scanner teclado = new Scanner(System.in);
		String secretPass = introducePass(1);
		String password = "";
		String pista = "";
		int intentos = 1;
		char caracterSecret;
		for (int i = 0; i <= 100; i++) {
			System.out.println();
		}
		System.out.println("Intenta adivinar la contraseña del 1º Jugador.");

		while (!secretPass.equals(password)) {
			password = introducePass(2);
			
			for(int i = 0; i < secretPass.length(); i++) {
				
				caracterSecret = secretPass.charAt(i);
				if (i < password.length()) {
					//try {
						if (secretPass.charAt(i) == password.charAt(i)) {
							pista += caracterSecret;
						} else {
							pista += '*';
						}
					//} catch (IndexOutOfBoundsException ex){
						//pista += '*';
					//}
				} else {
					pista += '*';
				}
			}
			
			if (secretPass.equals(password)) {
				System.out.println("¡HAS ACERTADO! La contraseña secreta del 1º Jugador era \"" + secretPass + "\"");
			} else {
				System.out.println("Pista: " + pista);
			}
			intentos++;
			pista = "";
		}
		
		System.out.println("Lo acertaste en " + intentos + " intentos!");

	}

}
