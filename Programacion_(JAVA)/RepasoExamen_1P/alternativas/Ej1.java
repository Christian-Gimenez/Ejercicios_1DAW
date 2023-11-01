package alternativas;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		/*Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
		*/
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Introduce un número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " es MAYOR que " + num2);
		} else {
			if (num1 < num2) {
				System.out.println(num1 + " es menor que " + num2);
			} else {
				System.out.println(num1 + " es igual que " + num2);
			}
		}
	}

}
