package secuenciales;
import java.util.Scanner;
public class Ej14 {

	public static void main(String[] args) {
		/*Dado un número de dos cifras,
		 * diseñe un algoritmo que permita obtener el número invertido.
		 * Ejemplo, si se introduce 23 que muestre 32.
		 * */
		Scanner teclado = new Scanner(System.in);
		int num, cifra1, cifra2, numInvertido;
		double cifra2double;
		
		System.out.print("Introduce un número de 2 cifras: ");
		num = teclado.nextInt();
		
		cifra1 = num / 10;
		cifra2double = num / 10.0;
		cifra2double = cifra2double - cifra1;
		cifra2double = cifra2double * 10.0;
		cifra2double = Math.round(cifra2double);
		cifra2 = (int)cifra2double;
		
		numInvertido = (cifra2 * 10) + cifra1;
		System.out.println("El número invertido sería: " + numInvertido);

	}

}
