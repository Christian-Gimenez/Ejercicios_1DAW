import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		/*Escribir un programa que pida el nombre completo
		 * al usuario  y lo muestre sin vocales
		 * (mayúsculas, minúsculas y acentuadas).
		 * Por ejemplo, "Alvaro Perez" mostrará "lvr Prz".
		 * */
		String nombreCompleto = pedirNombre();
		System.out.println("Tu nombre sin vocales sería: " + sinVocal(nombreCompleto));
	}
	
	public static String sinVocal(String cadena) {
		String cadenaSin = "";
		char letra;
		for (int i = 0; i < cadena.length(); i++) {
			letra = cadena.charAt(i);
			switch(letra) {
			case 'a', 'e', 'i' ,'o' ,'u',
				 'A', 'E', 'I', 'O', 'U',
				 'á', 'é', 'í', 'ó', 'ú',
				 'Á', 'É', 'Í', 'Ó', 'Ú':
				break;
			default:
				cadenaSin += letra;
				break;
			}
		}
		
		return cadenaSin;
	}
	
	public static String pedirNombre() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre completo por favor:");
		return teclado.nextLine();
	}

}
