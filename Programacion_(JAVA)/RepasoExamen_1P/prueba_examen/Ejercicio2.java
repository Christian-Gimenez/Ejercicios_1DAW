package prueba_examen;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		/*Escribir un programa que pida por teclado dos números enteros positivo de tal manera que le segundo sea mayor que el primero.
		 * A continuación el programa debe mostrar por pantalla si cada número comprendido desde el primer número hasta el segundo acaba en 4 o en 7,
		 * para ello mostrará en pantalla el número y su terminación.
		 * Por ejemplo, dados los número 14 y 18 como entrada al programa, se mostrará en pantalla:
			14 termina en 4
	    1	17 termina en 7
			ya que entre 14 y 18 solo hay 2 números que acaban en 4 o en 7.*/
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		do {
			System.out.print("Introduce un número entero positivo: ");
			num1 = teclado.nextInt();
			
			System.out.print("Introduce otro número entero positivo (Mayor que el anterior): ");
			num2 = teclado.nextInt();
			
			if (num1 < 0 || num2 < 0 || num1 > num2) {
				System.out.println("ERROR. por favor vuelve a introducir los datos.\n");
			}
		} while (num1 < 0 || num2 < 0 || num1 > num2);
		
		for (int i = num1; i <= num2; i++) {
			if (i % 10 == 4 || i == 4) {
				System.out.println(i + " termina en " + 4);
			} else if (i % 10 == 7 || i == 7) {
				System.out.println(i + " termina en " + 7);
			}
		}
		
		
		
	}

}
