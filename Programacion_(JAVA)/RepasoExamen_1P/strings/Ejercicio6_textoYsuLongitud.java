package examen.strings;

import java.util.Scanner;

public class Ejercicio6_textoYsuLongitud {
	
	public static String pedirText() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static int longitud(String texto) {
		int length = 0;
		String sinEspacios = "";
		for (int i = 0; i < texto.length(); i++) {
			if (!Character.isSpaceChar(texto.charAt(i))) {
				sinEspacios += texto.charAt(i);
			}
		}
		length = sinEspacios.length();
		
		return length;
	}

	public static void main(String[] args) {
		/*Solicita que se introduzca un texto por teclado y a continuación muestra el texto introducido y su longitud. 
        ◦ Ejemplo de funcionamiento:
        ◦ Dame un texto: "Texto introducido por el usuario"
        ◦ El texto "Texto introducido por el usuario" tiene una longitud de: 28 caracteres.
		 * */
		
		System.out.print("Dame un texto: ");
		String texto = pedirText();
		
		System.out.println("El texto \"" + texto + "\" tiene una longitud de : " + longitud(texto) + " caracteres.");

	}

}
