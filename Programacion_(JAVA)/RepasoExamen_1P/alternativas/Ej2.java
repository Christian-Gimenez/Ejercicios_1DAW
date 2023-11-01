package alternativas;
import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		//Algoritmo que pida un número y diga si es positivo, negativo o 0.
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		if (num < 0) {
			System.out.println(num + " es negativo.");
		} else {
			if (num > 0) {
				System.out.println(num + " es positivo.");
			} else {
				System.out.println(num + " es cero.");
			}
		}
	}

}
