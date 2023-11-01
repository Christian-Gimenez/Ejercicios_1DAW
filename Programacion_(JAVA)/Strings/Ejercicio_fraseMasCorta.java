import java.util.*;
public class Ejercicio_fraseMasCorta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 2 frases e imprimimos cual ha sido mas corta
		Scanner teclado = new Scanner(System.in);
		String frase1 = "", frase2 = "";
		
		System.out.print("Introduce una frase: ");
		frase1 = teclado.nextLine();
		System.out.print("Introduce otra frase: ");
		frase2 = teclado.nextLine();
		
		System.out.println("La frase más corta es: " + '\"' + printMasCorta(frase1, frase2) + '\"');
		
	}
	
	public static String printMasCorta(String frase1, String frase2) {
		int longFrase1, longFrase2;
		String iguales = "Ninguna, ambas son iguales";
		longFrase1 = frase1.length();
		longFrase2 = frase2.length();
		
		if (longFrase1 < longFrase2) {
			return frase1;
		} else if (longFrase1 > longFrase2){
			return frase2;
		} else {
			return iguales;
		}
	}

}
