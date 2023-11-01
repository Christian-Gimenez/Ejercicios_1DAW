import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		/*Diseñar un programa que solicite al usuario
		 * una frase y una palabra.
		 * A continuación buscará cuantas veces
		 * aparece la palabra en la frase.
		 * */
		String frase, palabra;
		System.out.print("Introduce una palabra: ");
		palabra = porTeclado();
		
		System.out.print("Introduce una frase: ");
		frase = porTeclado();
		
		System.out.println("Hay " + cuantasVeces(frase, palabra) + " " + palabra + " en tu frase.");
	}
	
	public static String porTeclado() {
	Scanner teclado = new Scanner(System.in);
	return teclado.nextLine();
	}
	
	public static int cuantasVeces(String frase, String palabra) {
		int veces = 0;
		
		int pos = 0;
		while(pos != -1) {
			pos = frase.indexOf(palabra, pos);
			if(pos != -1) {
				pos ++;
				veces++;
			}
		}
		/*
		while(frase.contains(palabra)) {
			if (frase.contains(palabra)) {
				veces++;
				frase = frase.replace(palabra, "");
			}
		}*/
		return veces;
	}

}
