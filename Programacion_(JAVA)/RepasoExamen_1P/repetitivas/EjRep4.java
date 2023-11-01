package repetitivas;
import java.util.*;
public class EjRep4 {

	public static void main(String[] args) {
		/*Pedir por teclado un número (n)
		 y dibujar por pantalla un triangulo rectángulo de n elementos de lado,
		 utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
		 ****
		 ***
		 **
		 */
		 
		Scanner in = new Scanner(System.in);
		int n, num, veces = 0;
		
		System.out.print("Introduce un número: ");
		n = in.nextInt();
		veces = n;
		num = n;
		
		do {
			for(int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
			n--;
			veces--;
		} while (veces >= 0);
		
		veces = num;
		System.out.println("Y al reves sería:");
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
			
		
			
		
		
	}

}
