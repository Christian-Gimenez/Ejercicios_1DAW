package secuenciales;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		//Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre?");
		String name = teclado.nextLine();
		
		System.out.println("Hola " + name + " :)");
		
	}

}
