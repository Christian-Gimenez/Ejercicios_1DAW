import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, sumaDivisores1 = 0, sumaDivisores2 = 0;
		
		do {
			System.out.print("Introduce el primer número entero positivo: ");
			num1 = teclado.nextInt();
			
			System.out.print("Introduce el segundo número entero positivo: ");
			num2 = teclado.nextInt();
			
			if (num1 < 1 || num2 < 1) {
				System.out.println("\nERROR: Ambos números deben ser enteros y positivos.\n");
			} else {
				
			}
			
		} while (num1 < 1 || num2 < 1);
		
		System.out.print("\nLos divisores de " + num1 + " son: ");
		
		for(int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sumaDivisores1 += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nCuya suma de todos ellos da = " + sumaDivisores1 + "\n");
		
		System.out.print("Y los divisores de " + num2 + " son: ");
		for(int j = 1; j < num2; j++) {
			if (num2 % j == 0) {
				sumaDivisores2 += j;
				System.out.print(j + " ");
			}
		}
		System.out.println("\nCuya suma de todos ellos da = " + sumaDivisores2 + "\n");
		
		if (sumaDivisores1 == num2 && sumaDivisores2 == num1) {
			System.out.println("Por lo que concluimos que " + num1 + " y " + num2 + " son AMIGOS :)\nYa que la suma de sus propios divisores es igual al otro número y viceversa.");
		} else {
			System.out.println("Por lo que concluimos que " + num1 + " y " + num2 + " NO son amigos... :(\nYa que la suma de sus propios divisores NO es igual al otro número ni viceversa.");
		}

	}
}
