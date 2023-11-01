import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Diseñar una función en la que se pase
		 * una cadena de caracteres y la devuelva invertida.
		 * Por ejemplo, si se introduce:
		 * "Hola mundo!" devolverá:  "!odnum aloH"*/
		String frase = pedirTeclado();
		String fraseInvertida = alReves(frase);
		System.out.println(fraseInvertida);
		
	}
	
	public static String alReves(String cadena) {
		String invertida = "";
		for(int i = cadena.length()-1; i >= 0; i--) {
			invertida += "" + cadena.charAt(i);
		}
		return invertida;
	}
	
	public static String pedirTeclado() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una palabra o frase: ");
		return teclado.nextLine();
	}

}
