package prueba_examen;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		/*Escribir un programa que pida por teclado cuántos números se van a introducir y a continuación pida esos números,
		 * mostrando por pantalla un mensaje cada vez que el número introducido no sea mayor que el primero.
		 * En el caso de que no se haya detectado ningún número que no sea mayor que el primero mostrar el mensaje "no hay números mayores que el primero".
		 */
		 
		Scanner teclado = new Scanner(System.in);
		int cantidadN, contador = 0, numIntroducido = 0, primero = 0;
		//boolean hayNumerosMayores = false;

		
		System.out.print("¿Cuántos números deseas introducir? ");
		cantidadN = teclado.nextInt();
		
		for(int i = 0; i < cantidadN; i++) {
			if (i == 0) {
				System.out.print("Introduce un número: ");
				primero = teclado.nextInt();
			} else {
				System.out.print("Introduce un número: ");
				numIntroducido = teclado.nextInt();
				
				if (numIntroducido <= primero) {
					System.out.println(numIntroducido + " no es mayor que " + primero);
				} else {
					//hayNumerosMayores = true;
					contador++;
				}
			}
		}
		//if(!hayNumerosMayores)
		if (contador == 0) {
			System.out.println("No hay números mayores que el primero.");
		}
		
		
	}

}
