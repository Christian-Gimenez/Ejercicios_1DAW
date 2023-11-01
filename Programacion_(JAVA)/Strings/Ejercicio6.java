import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		/*Introducir por teclado una frase palabra a palabra,
		 * y mostrar la frase completa separando las palabras
		 * introducidas con espacios en blanco.
		 * 
		 * Terminar de leer la frase cuando alguna de las palabras
		 * introducidas sea la cadena "fin" escrita con cualquier
		 * combinación de mayúsculas y minúsculas.
		 * La cadena "fin" no aparecerá en la frase final.
		 * */
		int veces = 0;
		String fraseCompleta = "";
		Scanner teclado = new Scanner(System.in);
		
		fraseCompleta = preguntar();
		
		System.out.println("Tu frase completa es: ");
		System.out.println(fraseCompleta);
	}
	
	public static String preguntar() {
		Scanner teclado = new Scanner(System.in);
		String palabra = "";
		String fraseCompleta = "";
		System.out.println("A continuación, ve introduciendo tu frase palabra por palabra por favor.");
		while (!fraseCompleta.toLowerCase().contains("fin")) {
			System.out.print("-> ");
			palabra = leer();
			
			if (palabra.contains(" ")) {
				System.err.println("ERROR. Tu palabra NO puede contener un espacio.");
			} else {
				fraseCompleta += palabra;
				
				if (!fraseCompleta.toLowerCase().contains("fin")) {
					fraseCompleta += " ";
				}
			}
		}
		fraseCompleta = eliminarFin(fraseCompleta);
		return fraseCompleta;
	}
	
	public static String leer() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static String eliminarFin(String frase) {
		if(frase.contains("fin")) {
			frase = frase.replaceAll("fin", "");
		} else if (frase.contains("Fin")) {
			frase = frase.replaceAll("Fin", "");
		} else if (frase.contains("FIn")) {
			frase = frase.replaceAll("FIn", "");
		} else if (frase.contains("FIN")) {
			frase = frase.replaceAll("FIN", "");
		} else if (frase.contains("fiN")) {
			frase = frase.replaceAll("fiN", "");
		} else if (frase.contains("fIN")) {
			frase = frase.replaceAll("fIN", "");
		} else if (frase.contains("FiN")) {
			frase = frase.replaceAll("FiN", "");
		} else if (frase.contains("fIn")) {
			frase = frase.replaceAll("fIn", "");
		}
				
		return frase;
	}
	
	

}
