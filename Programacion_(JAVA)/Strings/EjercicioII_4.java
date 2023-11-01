import java.util.Scanner;

import org.madrid.educa.io.Teclado;

public class EjercicioII_4 {

	public static void main(String[] args) {
		/*Solicita que se introduzca un texto por teclado
		 * y a continuación muestra cuantas vocales
		 * y cuantas consonantes tiene dicho texto.*/
		System.out.println("Introduzca un texto:");
		String texto = Teclado.leerLinea();
		int vocales=0, consonantes=0;
		char caracter = ' ';
		
		for(int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			if (Character.isLetter(caracter)) {
				if (esVocal(caracter)) {
					vocales++;
				} else {
					consonantes++;
				}
			}
		}
		System.out.println("Tu texto tiene:");
		System.out.println(vocales + " vocales y " + consonantes + " consonantes.");
		
	}
	
	public static boolean esVocal(char caracter) {
		boolean vocal;
			switch (caracter) {
			case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
				vocal = true;
				break;
			default:
				vocal = false;
			}
		return vocal;		
	}
	

}
