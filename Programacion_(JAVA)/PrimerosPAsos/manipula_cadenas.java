import java.util.Scanner;
public class manipula_cadenas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre y 1er apellido?");
		
		String nombre = teclado.nextLine();
		
		int longNombre = nombre.length();
		
		System.out.println("Tu nombre y 1er apellido es " + nombre + " y tiene una longitud de " + longNombre + " caracteres");
		
		char primerCaracter = nombre.charAt(0);
		
		System.out.println("El primer caracter de tu nombre es " + primerCaracter);
		
		char ultimoCaracter = nombre.charAt(nombre.length() - 1);
		
		System.out.println("El último caracter de tu apellido es " + ultimoCaracter);
		
		
	}
}
