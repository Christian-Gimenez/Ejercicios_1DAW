package alternativas;
import java.util.Scanner;
public class Ej12 {

	public static void main(String[] args) {
		/*Escribir un programa que lea un año indicar si es bisiesto.
		 * Nota: un año es bisiesto si es un número divisible por 4,
		 * pero no si es divisible por 100,
		 * excepto que también sea divisible por 400.
		*/
		Scanner teclado = new Scanner(System.in);
		
		int year;
		
		System.out.print("Introduce un año: ");
		year = teclado.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " es un año BISIESTO.");
		} else {
			System.out.println(year + " NO es un año bisiesto.");
		}
		
	}

}
