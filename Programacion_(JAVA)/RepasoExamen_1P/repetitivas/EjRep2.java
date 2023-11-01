package repetitivas;
import java.util.*;
public class EjRep2 {

	public static void main(String[] args) {
		/*Solicitar un número por teclado y mostrar por pantalla si el número es primo o no.*/
		Scanner teclado = new Scanner(System.in);
		int num, divisores = 0;
		
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		
		if (divisores <= 2) {
			System.out.println(num + " es PRIMO");
		} else {
			System.out.println(num + " NO es primo.");
		}
	}

}
