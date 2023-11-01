package examen.strings;

public class Ejercicio3_fraseAlReves {
	
	public static String alReves(String frase) {
		String resultado = "";
		for (int i = (frase.length()-1); i >= 0; i--) {
			resultado += frase.charAt(i);
		}
		return resultado;
	}

	public static void main(String[] args) {
		/*Diseñar una función en la que se pase
		 * una cadena de caracteres y la devuelva invertida.
		 * Por ejemplo, si se introduce:
		 * "Hola mundo!" devolverá:  "!odnum aloH"
		 * */
		System.out.println(alReves("La caca huele mal. DEIFIED"));
	}

}
