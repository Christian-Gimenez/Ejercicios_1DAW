package repetitivas;
import java.util.Scanner;
public class Ej5 {

	public static void main(String[] args) {
		/*Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.*/
		Scanner teclado = new Scanner(System.in);
		int n;
		double sueldo, sueldoMaximo = 0.0;
		
		System.out.print("¿Cuántos sueldos vas a evaluar? ");
		n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(+ i + "º sueldo: ");
			sueldo = teclado.nextDouble();
			
			if (sueldo > sueldoMaximo) {
				sueldoMaximo = sueldo;
			}
		}
		
		System.out.println("El sueldo máximo es: " + sueldoMaximo + " €");
	}

}
