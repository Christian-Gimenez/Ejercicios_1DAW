import java.util.Scanner;

public class Ejercicio2 {
	
	public static int pedirNum() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static String introducirPalabras() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static boolean esVocal(char letra) {
		boolean resultado;
		switch (letra) {
		case 'a', 'e', 'i', 'o', 'u':
			resultado = true;
		break;
		default:
			resultado = false;
			break;
		}
		
		return resultado;
	}
	
	public static int contarVocales(String palabra) {
		int cantidad = 0;
		char caracter;
		for (int i = 0; i < palabra.length(); i++) {
			caracter = palabra.charAt(i);
			if (Character.isLetter(caracter)) {
				if (esVocal(Character.toLowerCase(caracter))) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}
	
	public static void analizarPalabras(int cantidad) {
		String palabraMasLarga = "";
		String palabraMasCorta="", palabraIntroducida="", palabraMasVocales="";
		if (cantidad > 0) {
			System.out.print("Palabra 1: ");
			palabraIntroducida = introducirPalabras();
			//System.out.print(palabraIntroducida);
			palabraMasCorta = palabraIntroducida;
			palabraMasLarga = palabraIntroducida;
			
			for(int i = 2; i <= cantidad; i++) {
				System.out.print("Palabra " + i + ": ");
				palabraIntroducida = introducirPalabras();
				//System.out.print("\n");
				
				
				if (palabraIntroducida.length() < palabraMasCorta.length()) {
					palabraMasCorta = palabraIntroducida;
				}
				
				if (palabraIntroducida.length() > palabraMasLarga.length()) {
					palabraMasLarga = palabraIntroducida;
				}
				
				if(contarVocales(palabraIntroducida) > contarVocales(palabraMasVocales)) {
					palabraMasVocales = palabraIntroducida;
				}
				
				
			}
			System.out.println("La palabra mas larga es " + palabraMasLarga + " con " + palabraMasLarga.length() + " caracteres.");
			System.out.println("La palabra mas corta es " + palabraMasCorta + " con " + palabraMasCorta.length() + " caracteres.");
			System.out.println("La palabra con mas vocales es " + palabraMasVocales + " con " + contarVocales(palabraMasVocales) + " caracteres.");
		}
		
		
		
	}

	public static void main(String[] args) {
		//1º el usuario ingresa un numero entero n (indica cuantas palabras introducirá)
		//Despues ingresa n palabras.
		//Mostrar palabra más larga, la más corta, la que contiene +vocales.
		int cantidadPalabras = 0;
		String palabraIntroducida;
		System.out.print("Cantidad de palabras: ");
		cantidadPalabras = pedirNum();
		analizarPalabras(cantidadPalabras);
		
	}

}
