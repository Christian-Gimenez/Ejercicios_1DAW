package examen.strings;

public class Ejercicio2_CuantosEspacios {
	
	public static int cuantosEspacios(String frase) {
		int espacios = 0, posicion = 0;
		
		/*
		while(frase.indexOf(' ', posicion) != -1) {
			if (frase.indexOf(' ', posicion) != 1) {
				posicion = frase.indexOf(' ', posicion) + 1;
				espacios++;
			}
		}*/
		
		
		for(int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == ' ') {
				espacios++;
			}
		}
		
		return espacios;
	}

	public static void main(String[] args) {
		/*Diseñar una aplicación que pida al usuario que
		 * introduzca una frase por teclado e
		 * indique cuántos espacios en blanco tiene.
		 * */
		System.out.println(cuantosEspacios("Mifrasedemierda"));
	}

}
