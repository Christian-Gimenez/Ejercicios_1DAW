package secuenciales;
import java.util.Scanner;
public class Ej11 {

	public static void main(String[] args) {
		/*Pide al usuario dos números y muestra la "distancia" entre ellos
		 * (el valor absoluto de su diferencia,
		 * de modo que el resultado sea siempre positivo).
		*/
		Scanner teclado = new Scanner(System.in);
		int num1, num2, distancia;
		
		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = teclado.nextInt();
		
		distancia = num1 - num2;
		distancia = Math.abs(distancia);
		
		System.out.println("La distancia (en valor absoluto) entre " + num1 + " y " + num2 + " es: " + distancia);
		
	}

}
