import java.util.Scanner;
public class Ejercicio9 {
	
	public static int inferior = 0;
	public static int superior = 0;
	
	public static int leerLimitesIntervalo(int opcion) {
		String limite = "";
		switch (opcion) {
		case 1:
			limite = "inferior";
			break;
		case 2:
			limite = "superior";
			break;
		}
		System.out.print("Introduce el límite " + limite + ": ");
		return leerNumero();
	}
	
	public static void intercambiarVariables() {
		int auxiliar;
		if (inferior > superior) {
			auxiliar = inferior;
			inferior = superior;
			superior = auxiliar;
		}
	}
	
	public static boolean numeroFueraDelIntervalo(int num, int inferior, int superior) {
		if (num > superior || num < inferior) {
			return true;
		}
		return false;
	}
	
	public static boolean comprobarLimites (int num, int inferior, int superior) {
		if (num == inferior || num == superior) {
			return true;
		}
		return false;
	}
	
	public static int leerNumero() {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		boolean datoCorrecto;
		do {
			datoCorrecto = true;
			try {
				num = teclado.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Error. Dato introducido erróneo");
				datoCorrecto = false;
			}
		} while (!datoCorrecto);
		
		return num;
	}

	public static void main(String[] args) {
		/*Pedir limite Inferior y Superior de un intervalo
		 * Si inferior > superior = intercambiar valores
		 * Pedir nºEnteros positivos hasta introducir uno negativo
		 * Dar la información:
		 * -Nº números dentro del intervalo abierto
		 * -¿Se introdujo algún número igual a alguno de los limtes?
		 * */
		int numero, dentroIntervalo=0, igualLimites=0;
		inferior = leerLimitesIntervalo(1);
		superior = leerLimitesIntervalo(2);
		
		intercambiarVariables();
		
		do {
			System.out.print("Introduce un número: ");
			numero = leerNumero();
			if (!numeroFueraDelIntervalo(numero, inferior, superior)) {
				dentroIntervalo++;
			}
			
			if (comprobarLimites(numero, inferior, superior)) {
				igualLimites++;
			}
			
		} while (numero >= 0);
		
		System.out.println("Se introdujeron " + dentroIntervalo + " números entre " + inferior + " y " + superior);
		
		if (igualLimites > 0) {
			System.out.println("SÍ, se introdujeron " + igualLimites + " números igual a alguno de los límites");
		} else {
			System.out.println("NO, no se introdujeron números iguales a los límites.");
		}
		

	}

}
