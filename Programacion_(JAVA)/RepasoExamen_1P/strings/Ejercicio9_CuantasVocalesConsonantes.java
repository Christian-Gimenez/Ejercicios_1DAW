package examen.strings;

import java.util.Scanner;

public class Ejercicio9_CuantasVocalesConsonantes {
	
	public static boolean esVocal(char caracter) {
		boolean resultado=false;
		if (Character.isLetter(caracter)) {
			switch (caracter) {
			case 'a', 'e', 'i', 'o', 'u',
				  'A', 'E', 'I', 'O', 'U',
				  'á', 'é', 'í', 'ó', 'ú',
				  'Á', 'É', 'Í', 'Ó', 'Ú':
				resultado = true;
				break;
			
			default:
				resultado = false;
				break;
			}
		}
		return resultado;
	}
	
	public static String cuentaLetras(String text) {
		int consonantes=0, vocales=0;
		char caracter = ' ';
		for(int i = 0; i < text.length(); i++) {
			caracter = text.charAt(i);
			if(esVocal(caracter)) {
				vocales++;
			} else if (Character.isLetter(caracter) && !esVocal(caracter)) {
				consonantes++;
			}
		}
		return "Hay " + vocales + " vocales y " + consonantes + " consonantes.";
	}
	
	public static String pedirTexto() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void main(String[] args) {
		/*Solicita que se introduzca un texto por teclado
		 * y a continuación muestra cuantas vocales
		 * y cuantas consonantes tiene dicho texto.*/
		System.out.println("Introduce un texto:");
		String text = pedirTexto();
		
		System.out.println(cuentaLetras(text));
	}

}
