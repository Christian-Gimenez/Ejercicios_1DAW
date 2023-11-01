import java.util.Scanner;
public class Ejercicio1 {
	
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
		int intentos = 1;
		for (int i = 0; i <= 100; i++) {
			System.out.println();
		}
		System.out.println("Intenta adivinar la contraseña del 1º Jugador.");

		while (!secretPass.equals(password)) {
			password = introducePass(2);
			if (secretPass.compareTo(password) > 0) {
				System.out.println(secretPass.compareTo(password));
				System.out.println("Tu contraseña es < Menor alfabéticamente que la del 1º Jugador");
			} else if (secretPass.compareTo(password) < 0) {
				System.out.println(secretPass.compareTo(password));
				System.out.println("Tu contraseña es > Mayor alfabeticamente que la del 1º Jugador");
			} else {
				System.out.println("¡HAS ACERTADO! La contraseña secreta del 1º Jugador era \"" + secretPass + "\"");
			}
			intentos++;
		};
		
		System.out.println("Lo acertaste en " + intentos + " intentos!");

	}

}
