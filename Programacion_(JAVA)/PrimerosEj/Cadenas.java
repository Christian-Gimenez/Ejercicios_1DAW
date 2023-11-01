
public class Cadenas {

	public static void main(String[] args) {
		//String cadena = "Hola mundo!";
		//char caracter = 'F';
		
		String cadena = "Pedro"; //Creamos una variable de cadena de caracteres
		System.out.println("Hola " + cadena);
		int numeroCaracteres = cadena.length();
		System.out.println(cadena + " tiene " + numeroCaracteres + " caracteres.");
		System.out.println(cadena.charAt(0)); //Preguntamos cual es el caracter que se encuentra en la posicion 0 de Pedro
		int ultimaPosicion = cadena.length() - 1; //Para acceder a la última posicion de la cadena, restamos -1 a la longitud total de la cadena
		System.out.println(cadena.charAt(ultimaPosicion));
		
		//EJERCICIO REPASO CASA		
		String miCadena = "Hola mundo";
		System.out.println("La cadena de caracteres " + miCadena + " tiene un total de " + miCadena.length() + " caracteres.");
		int lastPosition = miCadena.length() - 1;
		System.out.println("Y su último caracter es: " + miCadena.charAt(lastPosition));
		
		//Sacar sub-cadenas de una cadena con .substring(desdeLaQueQuiero, hastaLaQueYaNoQuiero);
		String otraCadena = "Vamos a aprender java";
		ultimaPosicion = cadena.length();
		String subCadena = otraCadena.substring(8,16);
		System.out.println(subCadena);
		
		String alumno1, alumno2;
		alumno1 = "javier";
		alumno2 = "Javier";
		System.out.println(alumno1.equals(alumno2)); //False porque JAVA es keysensitive
		System.out.println(alumno2.equalsIgnoreCase(alumno2)); //True porque forzar que JAVA ignore el keysensitive con IgnoreCase
		
	}

}
