package prueba_examen;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que pida un número entero mayor que cero y que muestre por pantalla la suma de sus divisores sin incluir el 1 y el propio número.
		Nota: Un número es divisor de otro b si al dividir b entre a el resto de la división es cero.
		Por ejemplo, 2 es divisor de 4 porque al dividir 4 entre 2 el resto de la división es cero.
		 * */
		
		Scanner teclado = new Scanner(System.in);
		int num, suma = 0;
		
		do {
		System.out.print("Introduce un número entero mayor que 0: ");
		num = teclado.nextInt();
		} while (num <= 0);
		
		System.out.print("Los números divisores de " + num + " son: ");
		
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				suma += i;
					System.out.print(i + " ");	
			}
		}
		
		System.out.println("\nLa suma de todos ellos = " + suma);
	}

}
