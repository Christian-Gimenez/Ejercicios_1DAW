package secuenciales;
import java.util.Scanner;
public class Ej13 {

	public static void main(String[] args) {
		/*Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
		 *¿Cómo se puede calcular sin usar Math.sqrt()?
		 * */
		Scanner teclado = new Scanner(System.in);
		double num, raizCuadrada, raizCubica;
		
		System.out.print("Introduce un número: ");
		num = teclado.nextDouble();
		
		raizCuadrada = Math.sqrt(num);
		raizCubica = Math.cbrt(num);
		
		System.out.println("La raíz cuadrada de √" + num + " es = " + raizCuadrada);
		System.out.println("La raíz cúbica de ∛" + num + " es = " + raizCubica);
	}

}
