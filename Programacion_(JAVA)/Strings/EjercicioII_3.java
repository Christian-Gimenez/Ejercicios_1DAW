import java.util.*;
public class EjercicioII_3 {
	
	public static String pedirTexto() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un texto: ");
		return teclado.nextLine();
	}
	
	public static String sinEspacios(String texto) {
		String textoSin = "";
		//Recorremos con for each
		for(char caracter:texto.toCharArray()) {
			if (caracter != ' ') {
				textoSin += caracter;
			}
		}
		/*for(int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
		}*/
		
		return textoSin;
	}

	public static void main(String[] args) {
		/*Ejercicio 3:
		Solicita que se introduzca un texto por teclado
		y a continuación muestra el texto original eliminando los espacios del texto.
		 * */
		String texto = pedirTexto();
		System.out.println("Tu texto sin espacios es: " + sinEspacios(texto));
	}

}
