package repetitivas;
import java.util.Scanner;
public class EjRep1 {

	public static void main(String[] args) {
		/*Escribe un programa que pida el limite inferior y superior de un intervalo.
		 * Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
		 * A continuación se van introduciendo números hasta que introduzcamos el 0.
		 * Cuando termine el programa dará las siguientes informaciones:
			• La suma de los números que están dentro del intervalo (intervalo abierto).
			• Cuantos números están fuera del intervalo.
			• E informa si hemos introducido algún número igual a los límites del intervalo.*/
		Scanner teclado = new Scanner(System.in);
		int inferior, superior, num, suma=0, fuera=0, iguales=0;
		
		do {
			System.out.print("Introduce el límite inferior: ");
			inferior = teclado.nextInt();
			
			System.out.print("Introduce el límite superior: ");
			superior = teclado.nextInt();
			
			if (inferior > superior) {
				System.err.println("El límite inferior no puede ser mayor al superior.");
			}
		} while (inferior > superior);
		
		do {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if (num >= inferior && num <= superior) {
				suma = suma + num;
			}
			
			if (num == superior || num == inferior) {
				iguales++;
			} else if (num < inferior || num > superior) {
				fuera++;
			}
			
		} while (num != 0);
		
		System.out.println("La suma de todos los números dentro del intervalo = " + suma);
		System.out.println("Se han introducido " + iguales + " numeros iguales a los límites");
		System.out.println("Se han introducido " + fuera + " numeros fuera del rango");
	}

}
