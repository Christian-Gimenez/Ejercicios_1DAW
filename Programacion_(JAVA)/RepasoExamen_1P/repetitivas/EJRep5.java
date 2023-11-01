package repetitivas;

import java.util.Scanner;
public class EJRep5 {

	public static void main(String[] args) {
		/*Desarrollar un programa que solicite la carga de 10 números
		 * e imprima la suma de los últimos 5 valores ingresados.*/
		Scanner teclado = new Scanner(System.in);
		int num, suma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if (i >= 5) {
				suma += num;
			}
		}
		
		System.out.println("La suma de los 5 últimos números introducidos da: " + suma);

	}

}
