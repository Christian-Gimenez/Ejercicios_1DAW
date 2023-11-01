package examen.strings;

public class Ejercicio4_SinVocales {
	
	public static boolean filtrarVocales(char letra) {
		boolean esVocal;
		switch (letra) {
		case 'a', 'e', 'i', 'o', 'u',
			'A', 'E', 'I', 'O', 'U',
			'á', 'é', 'í', 'ó', 'ú',
			'Á', 'É', 'Í', 'Ó', 'Ú':
			esVocal = true;
			break;
			
		default:
			esVocal = false;
			break;
		}
		return esVocal;		
	}
	
	public static String quitarLetras(String texto, int opcion) {
		//opcion = 1 -> Quita Vocales.
		//opcion = 0 -> Quita Consonantes.
		String resultado = "";
		char letra;
		if (opcion == 1) {
			for(int i = 0; i < texto.length(); i++) {
				letra = texto.charAt(i);
				if (Character.isLetter(letra)) {
					if (filtrarVocales(letra)) {
						resultado += letra;
					}
				} else {
					resultado += letra;
				}
				
			}
		} else if (opcion == 0) {
			for(int i = 0; i < texto.length(); i++) {
				letra = texto.charAt(i);
				if (Character.isLetter(letra)) {
					if (!filtrarVocales(letra)) {
						resultado += letra;
					}
				} else {
					resultado += letra;
				}
			}
		}

		return resultado;
		
	}

	public static void main(String[] args) {
		/*Escribir un programa que pida el nombre completo al usuario
		 * y lo muestre sin vocales (mayúsculas, minúsculas y acentuadas).
		 * */
		String nombreCompleto = "Christian Miguel Giménez Puerma";
		System.out.println("Mi nombre completo si consonantes es: " + quitarLetras(nombreCompleto, 1));
		System.out.println("Y sin vocales: " + quitarLetras(nombreCompleto, 0));
	}

}
