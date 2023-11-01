package repetitivas;
import java.util.Scanner;
public class EjAmp1 {

	public static void main(String[] args) {
		/*Realizar un programa que nos pida un número n,
		 * y nos diga cuantos números hay entre 1 y n que son primos.*/
		Scanner teclado = new Scanner(System.in);
		int n, divisores = 0, primo;
		
		System.out.print("Introduce un número: ");
		n = teclado.nextInt();
		System.out.println("Los números primos que hay entre 1 y " + n + " son:");
		
		for (int i = 2; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					divisores++;
				}
			}
			if (divisores <= 2) {
				primo = i;
				System.out.print(i + " ");
			}
			divisores = 0;	
		}
		
		
		
	}

}
