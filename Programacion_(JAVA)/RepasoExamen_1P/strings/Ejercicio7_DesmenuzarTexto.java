package examen.strings;

import java.util.Scanner;

public class Ejercicio7_DesmenuzarTexto {
	
	public static void desmenuzar(String texto) {
		char bit = ' ';
		for(int i = 0; i < texto.length(); i++) {
			bit = texto.charAt(i);
			if (Character.isLetter(bit)) {
				if (Character.isLowerCase(bit)) {
					System.out.println(bit + " es una letra minúscula.");
				} else {
					System.out.println(bit + " es una letra Mayúscula.");
				}
			} else if(Character.isDigit(bit)) {
				System.out.println(bit + " es un dígito numérico.");
			} else if(Character.isSpaceChar(bit)) {
				System.out.println("\" \""+ bit + " es un espacio en Blanco");
			} else {
				System.out.println(bit + " es un signo de puntuación.");
			}
		}
	}

	public static void main(String[] args) {
		/*Solicita que se introduzca un texto por teclado
		 * y a continuación muestra desmenuza el texto introducido
		 * indicando si es una letra en mayúscula o en minúscula,
		 * un dígito, un espacio en blanco o cualquier otro tipo de caracter.
        ◦ Ejemplo de funcionamiento:
        ◦ 
        ◦ Dame un texto: Hola mundo 1!
        ◦ H es una letra mayúscula.
        ◦ o es una letra minúscula.
        ◦ l es una letra minúscula.
        ◦ a es una letra minúscula.
        ◦ es un espacio en blanco.
        ◦ m es una letra minúscula.
        ◦ u es una letra minúscula.
        ◦ n es una letra minúscula.
        ◦ d es una letra minúscula.
        ◦ o es una letra minúscula.
        ◦ es un espacio en blanco.
        ◦ 1 es un digito.
        ◦ ! es un signo de puntuación o un símbolo.
		 * */
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un texto: ");
		String texto = teclado.nextLine();
		desmenuzar(texto);
	}

}
