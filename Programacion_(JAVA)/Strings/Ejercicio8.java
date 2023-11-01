import java.util.Scanner;
public class Ejercicio8 {
	
	public static String iniciales(String nombre) {
		String inicial = "" + nombre.substring(0,1) + ".";
		int indice = 1;
	
		while (nombre.indexOf(" ", indice) != -1){
			
				indice = nombre.indexOf(" ", indice);
				if (indice < nombre.length()) {
					if (nombre.charAt(indice + 1) != ' ') {
						inicial += nombre.charAt(indice +1) + ".";
					}
				}
				indice++;
			/*
			if (i == 0) {
				inicial += nombre.charAt(0) + ".";
			} else {
				if (nombre.charAt(i) == ' ' && i+1 < nombre.length()) {
					inicial += nombre.charAt(i+1) + ".";
				}
			}*/
		}
		inicial = inicial.toUpperCase();
		return inicial;
	}
	
	public static String convierteMayusMinus(String frase) {
		String resultado = "";
		char letra;
		
		for(int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			if (Character.isUpperCase(letra)) {
				resultado += Character.toLowerCase(letra);
				
			} else {
				if (Character.isLetter(letra)) {
					resultado += Character.toUpperCase(letra);
				} else {
					resultado += letra;
				}
				
			}
		}
		return resultado;
	}
	
	public static String pedirNombre() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu nombre completo: ");
		return teclado.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombreCompleto = pedirNombre();
		System.out.println("Tus iniciales son: " + iniciales(nombreCompleto));
		
		System.out.println("Ahora introduce otra frase, se convertirán las mayúsculas en minúsculas y viceversa:");
		System.out.print("-> ");
		String frase = teclado.nextLine();
		System.out.println("Transformado: " + convierteMayusMinus(frase));
	}

}
