import java.util.Scanner;
public class CifradoCesar {
	
	public static char cifrarChar(char letra) {
		char cifrada = ' ';
		
		if (Character.isLetter(letra)) {
			if (Character.isUpperCase(letra)) {
				cifrada = (char)('A' + ((letra - 'A' + 3)%27));
				
			} else if (Character.isLowerCase(letra)) {
				cifrada = (char)('a' + ((letra - 'a' + 3)%27));
			}
		} else {
			cifrada = letra;
		}
			
			/*
			if (Character.isUpperCase(letra) && letra >= 'X') {
				switch(letra) {
				case 'X':
					cifrada = 'A';
					break;
				case 'Y':
					cifrada = 'B';
					break;
				case'Z':
					cifrada = 'C';
					break;
				}
				
			} else {
					if(Character.isLowerCase(letra) && letra >= 'x') {
						switch(letra) {
						case 'x':
							cifrada = 'a';
							break;
						case 'y':
							cifrada = 'b';
							break;
						case 'z':
							cifrada = 'c';
							break;
						}
					} else {
						
					}
				}
			
		} else {
			cifrada = letra;
		}
		*/
		return cifrada;
	 }
	
	public static String cifradoCesar(String texto) {
		String textoCifrado = "";
		char letra;
		for(int i = 0; i < texto.length(); i++) {
			letra = texto.charAt(i);
			textoCifrado += cifrarChar(letra);
		}
		return textoCifrado;
	}

	public static char descifrarChar(char letra) {
		char descifrada = ' ';
		
		if (Character.isLetter(letra)) {
			descifrada = (char)(letra - 3);
			if(Character.isUpperCase(letra) && letra >= 'A') {
				switch(letra) {
				case 'A':
					descifrada = 'X';
					break;
				case 'B':
					descifrada = 'Y';
					break;
				case 'C':
					descifrada = 'Z';
					break;
				}
			} else if(Character.isLowerCase(letra) && letra >= 'a') {
				switch(letra) {
				case 'a':
					descifrada = 'x';
					break;
				case 'b':
					descifrada = 'y';
					break;
				case 'c':
					descifrada = 'z';
					break;
				}
			} else {
				
			}
			
		} else {
			descifrada = letra;
		}
		
		return descifrada;
	}
	
	public static String descifradoCesar(String texto) {

		String descifrado = "";
		for(int i = 0; i < texto.length(); i++) {
			descifrado += descifrarChar(texto.charAt(i));
		}
		
		return descifrado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String textoOriginal, textoCifrado, textoDescifrado;
		boolean salirPrograma = false;
		char opcion = ' ';
		
		System.out.println("Introduce un texto:");
		System.out.print("-> ");
		textoOriginal = teclado.nextLine();
		
		textoCifrado = cifradoCesar(textoOriginal);
		System.out.println("Tu texto cifrado es: \n" + textoCifrado);
		
		do {
			System.out.println("¿Deseas descifrarlo?");
			System.out.println("A) Sí");
			System.out.println("B) No");
			System.out.print("-> ");
			opcion = teclado.nextLine().charAt(0);
			
			if (opcion == 'a' || opcion == 'A') {
				textoDescifrado = descifradoCesar(textoCifrado);
				System.out.println("Tu texto descifrado es:");
				System.out.println(textoDescifrado);
				salirPrograma = true;
				
			} else if (opcion == 'b' || opcion == 'B') {
				System.out.println("Programa finalizado.");
				salirPrograma = true;
			} else {
				System.out.println("\nERROR. Por favor introduzca una opción válida.\n");
			}
		} while (!salirPrograma);
		
		
	}
	
}
