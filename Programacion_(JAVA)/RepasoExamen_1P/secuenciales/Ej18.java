package secuenciales;
import java.util.Scanner;
public class Ej18 {

	public static void main(String[] args) {
		//Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
		Scanner teclado = new Scanner(System.in);
		
		//Declarar variables
		String nombre, apellido1, apellido2;
		
		//Pedir datos al user
		System.out.print("Dime tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.print("Dime tu primer apellido: ");
		apellido1 = teclado.nextLine();
		
		System.out.print("Dime tu segundo apellido: ");
		apellido2 = teclado.nextLine();
		//teclado.nextLine();
		
		System.out.println("Tus iniciales son: " + nombre.substring(0, 1) + "." + apellido1.substring(0, 1) + "." + apellido2.substring(0, 1) + ".");
	}

}
