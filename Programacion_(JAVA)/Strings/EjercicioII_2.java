import java.util.*;
public class EjercicioII_2 {
	
	public static String pedirTexto() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un texto: ");
		return teclado.nextLine();
	}
	
	public static String desmenuzar(char caracter) {
		if (Character.isUpperCase(caracter)) {
			return "\"" +  caracter + "\" es una letra mayúscula.";
			
		} else if (Character.isLowerCase(caracter)) {
			return "\"" +  caracter + "\" es una letra minúscula.";
			
		} else if (Character.isSpaceChar(caracter)) {
			return "\"" + caracter + "\" es un espacio en blanco.";
			
		} else if (Character.isDigit(caracter)) {
			return "\"" +  caracter + "\" es un digito.";
			
		} else {
			return "\"" +  caracter + "\" es un signo de puntuación o un símbolo.";
		}
	}

	public static void main(String[] args) {
		/*Solicita que se introduzca un texto por teclado
		 * y a continuación muestra desmenuza el texto introducido
		 * indicando si es una letra en mayúscula o en minúscula,
		 * un dígito, un espacio en blanco o cualquier otro tipo de caracter.
		
		Ejemplo de funcionamiento:
		
		Dame un texto: Hola mundo 1!
		H es una letra mayúscula.
		o es una letra minúscula.
		l es una letra minúscula.
		a es una letra minúscula.
		es un espacio en blanco.
		m es una letra minúscula.
		u es una letra minúscula.
		n es una letra minúscula.
		d es una letra minúscula.
		o es una letra minúscula.
		es un espacio en blanco.
		1 es un digito.
		! es un signo de puntuación o un símbolo.
		 * */
		String texto = pedirTexto();
		for(int i = 0; i < texto.length(); i++) {
			System.out.println(desmenuzar(texto.charAt(i)));
		}
	}

}
