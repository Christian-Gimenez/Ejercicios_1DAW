package secuenciales;
import java.util.Scanner;
public class Ej12 {

	public static void main(String[] args) {
		/*Pide al usuario dos pares de números x1,y2 y x2,y2,
		 * que representen dos puntos en el plano.
		 * Calcula y muestra la distancia entre ellos.
		 * */
		Scanner teclado = new Scanner(System.in);
		int x1, x2, y2, distancia;
		
		System.out.print("Introduce el valor de X1: ");
		x1 = teclado.nextInt();
		
		System.out.print("Introduce el valor de X2: ");
		x2 = teclado.nextInt();
		
		System.out.print("Introduce el valor de Y2: ");
		y2 = teclado.nextInt();
		
		distancia = x1 - y2;
		System.out.println("La distancia entre " + x1 + "(X1) y " + y2 + "(Y2) es de: " + Math.abs(distancia));		
		
		distancia = x2 - y2;
		System.out.println("La distancia entre " + x1 + "(X2) y " + y2 + "(Y2) es de: " + Math.abs(distancia));	
		
	}

}
