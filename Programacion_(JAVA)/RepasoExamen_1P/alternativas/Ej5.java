package alternativas;
import java.util.Scanner;
public class Ej5 {

	public static void main(String[] args) {
		//Escribe un programa que pida un nombre de usuario
		//y una contraseña y si se ha introducido "root" y "toor"
		//se indica "Has entrado al sistema", sino se da un error.
		Scanner teclado = new Scanner(System.in);
		
		final String USER = "root";
		final String PASSWORD = "toor";
		String userIn = "", passIn = "";
		
		System.out.print("Introduce el nombre de usuario: ");
		userIn = teclado.nextLine();
		System.out.print("Introduce la contraseña: ");
		passIn = teclado.nextLine();
		
		if(userIn.equals(USER) && passIn.equals(PASSWORD)) {
			System.out.println("Has entrado al sistema :)");
		} else {
			if (userIn.equals(USER)) {
				System.out.println("ERROR. Contraseña incorrecta.");
			} else {
				System.out.println("ERROR. Usuario introducido no válido.");
			}
			
		}

	}

}
