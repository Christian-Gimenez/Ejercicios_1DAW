import javax.swing.*; //Actualmente no es necesario
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Christian";
		
		String pass = "";
		
		//Mientras la 'clave' no sea igual a 'pass', repite la pregunta
		while (clave.equals(pass) == false) { //(Si el string 'clave' No es igual al string 'pass
			pass = JOptionPane.showInputDialog("Introduzca su contraseña de usuario:");
			
			if (clave.equals(pass) == false) { //Si la pass sigue siendo distinta a clave
				System.out.println("Contraseña incorrecta"); //Mostrar que es incorrecto
			}
			
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
		
	}

}
