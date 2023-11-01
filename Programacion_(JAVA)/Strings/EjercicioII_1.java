import java.util.Scanner;

public class EjercicioII_1 {
	
	public static String pedirTexto() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un texto: ");
		return teclado.nextLine();
	}
	
	public static String mostrarTexto(String texto) {
		String resultado = "El texto \"" + texto + "\", sin contar los espacios, tiene una longitud de: " + contarCaracteres(texto) + " caracteres.";
		return resultado;
	}
	
	public static int contarCaracteres(String texto) {
		int longitud = 0;
		
		for(char caracter:texto.toCharArray()) {
			if (!Character.isSpaceChar(caracter)) {
				longitud++;
			}
		}
		
		/*
		for(int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) != ' ') {
				longitud++;
			}
		}*/
		return longitud;
	}

	public static void main(String[] args) {
		/*Solicita que se introduzca un texto por teclado y a continuación muestra el texto introducido y su longitud.
			Ejemplo de funcionamiento:
			Dame un texto: "Texto introducido por el usuario"
			El texto "Texto introducido por el usuario" tiene una longitud de: 32 caracteres.
		 * */
		String texto = pedirTexto();
		System.out.println(mostrarTexto(texto));
	}

}
