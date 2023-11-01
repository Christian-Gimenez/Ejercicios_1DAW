import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Diseñar una aplicación que pida al usuario
		 * que introduzca una frase por teclado
		 * e indique cuántos espacios en blanco tiene.*/
		
		System.out.println("Tu frase tiene \"" + cuantosEspacios(pedirPorTeclado()) + "\" espacios en blanco");
	}
	
	public static int cuantosEspacios(String frase) {
		int espacios = 0, siguientePosicion = 0;
		
		while (frase.indexOf(' ', siguientePosicion) != -1) {
			if (frase.indexOf(' ') != -1) {
				siguientePosicion = frase.indexOf(' ', siguientePosicion) + 1;
				espacios++;
			}
		}
		
		return espacios;
	}
	
	public static String pedirPorTeclado() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		return teclado.nextLine();
	}

}
