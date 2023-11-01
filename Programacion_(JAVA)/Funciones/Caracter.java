import java.util.Scanner;
import java.io.IOException;
public class Caracter {

	public static void main(String[] args) throws IOException {
		/*Funcion que recibe un caracter por parametro y devuelva verdadero o falso*/
		Scanner teclado = new Scanner(System.in);
		char letra;
		
		System.out.print("Introduce una letra: ");
		//letra = teclado.nextLine().charAt(0);
		letra = (char)System.in.read();
		//limpia el buffer eliminando \n\r
		System.in.skip(2);
		
		if (esVocal(letra)) {
			System.out.println("'" + letra + "' es una Vocal");
		} else {
			System.out.println("'" + letra + "' es una Consonante");
		}
	}
	
	public static boolean esVocal(char caracter) {
		boolean vocal;
		switch (caracter) {
		case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
			vocal = true;
			break;
		default:
			vocal = false;
			
		}
		return vocal;
	}

}
