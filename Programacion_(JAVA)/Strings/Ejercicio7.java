import java.util.Scanner;
public class Ejercicio7 {
	
	public static String quitarEspacios(String frase) {
		String sinEspacios = "";
		for(int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				sinEspacios += frase.charAt(i);
			}
		}
		return sinEspacios;
	}
	
	public static String quitarTildes(String frase) {
		String fraseSinTildes = "";
		for(int i = 0; i < frase.length(); i++) {
			switch (frase.charAt(i)) {
			case 'á', 'Á':
				fraseSinTildes += 'a';
				break;
			case 'é', 'É':
				fraseSinTildes += 'e';
				break;
			case 'í', 'Í':
				fraseSinTildes += 'i';
				break;
			case 'ó', 'Ó':
				fraseSinTildes += 'o';
				break;
			case 'ú', 'Ú':
				fraseSinTildes += 'u';
				break;
			default:
				fraseSinTildes += frase.charAt(i);
			}
		}
		return fraseSinTildes;
		
	}

	public static boolean esPalindromo(String frase) {
		boolean palindromo = false;
		frase = quitarTildes(frase).toLowerCase();
		frase = quitarEspacios(frase);
		
		int longFrase = frase.length()-1;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == frase.charAt(longFrase-i)) {
				palindromo = true;
			} else {
				palindromo = false;
			}
		}
		return palindromo;
	}
	
	public static void main(String[] args) {
		/*Leer un texto y si es palindromo indicarlo*/
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		if (esPalindromo(frase)) {
			System.out.println("Tu frase es palíndromo");
		} else {
			System.out.println("Tu frase NO es palíndromo");
		}
	}
	
}
