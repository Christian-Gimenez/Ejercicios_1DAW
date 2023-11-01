//import java.util.Scanner;
import javax.swing.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducir usuario y contraseña, el user es root y la contraseña toor
		//Si introduce bien las credenciales le damos la bienvenida, si no "usuario incorrecto"
		
		//Scanner keyboard = new Scanner(System.in);
		
		String user = "root";
		String password = "toor";
		
		String userName, userPass;
		
		boolean credenciales = false;
		boolean exit = false;
		int exitConfirm;
		
		while (credenciales == false && exit == false) {
			//System.out.println("Introduzca su nombre de usuario: ");
			//userName = keyboard.nextLine();
			userName = JOptionPane.showInputDialog("Introduzca su nombre de usuario");
			
			if (userName == null) {
				exitConfirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer salir del programa?");
				//No = 1, Si = 0, Cancel = 2
				
				switch(exitConfirm) {
					case 0:
						exit = true;
						break;
					case 1:
					case 2:
						exit = false;
						break;
				}
			}
			
			if (user.equals(userName)) { //Si el usuario es correcto
				//Pregunta por la contraseña
				//System.out.println("Introduzca su contraseña: ");
				//userPass = keyboard.nextLine();
				userPass = JOptionPane.showInputDialog("Introduzca su contraseña");
				
				if (userPass == null) {
					exitConfirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer salir del programa?");
					//No = 1, Si = 0, Cancel = 2
					
					switch(exitConfirm) {
						case 0:
							exit = true;
							break;
						case 1:
						case 2:
							exit = false;
							break;
					}	
				}
				
				if (password.equals(userPass)) { //Si la contraseña es correcta
					//Da la bienvenida
					System.out.println("Bienvenido :)");
					JOptionPane.showMessageDialog(null, "Bienvenido " + user + " :)");
					credenciales = true;
					exit = true;
					
				} else if(userPass != null && exit == false) { //Si la contraseña es incorrecta
					//Muestra el error y la pide de nuevo
					System.out.println("¡Contraseña incorrecta!\nPor favor inténtelo de nuevo.");
					JOptionPane.showMessageDialog(null, "¡Contraseña incorrecta! Por favor inténtelo de nuevo.");
				}
				
			} else if (userName != null && exit == false) { //Si el nombre de usuario es incorrecto
				//Muestra el error y lo pide de nuevo
				System.out.println("¡Nombre de usuario incorrecto!\nPor favor inténtelo de nuevo.");
				JOptionPane.showMessageDialog(null, "¡Nombre de usuario incorrecto! Por favor inténtelo de nuevo.");
				
			} 		
		}
		
		
		
		
		
	}

}
