import javax.swing.JOptionPane;

//ACtualmente no hace falta, pero se importaria:
//import javax.swing.JOptionPane; 

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor:");
		
		String edadUsuario = JOptionPane.showInputDialog("Introduce tu edad, por favor:");
		//Usamos el método estático .parseInt, perteneciente a la clase Integer
		int intEdadUsuario = Integer.parseInt(edadUsuario); //Para convertir a entero la edad del user
		intEdadUsuario++;
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene tendrás " + intEdadUsuario + " años.");
	}

}
