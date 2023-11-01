package alternativas;
import java.util.Scanner;
public class Ej7 {

	public static void main(String[] args) {
		/* Realiza un algoritmo que calcule la potencia,
		 * para ello pide por teclado la base y el exponente.
		 * Pueden ocurrir tres cosas:
			-El exponente sea positivo, sólo tienes que imprimir la potencia.
			-El exponente sea 0, el resultado es 1.
			-El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
		 */
		
		Scanner teclado = new Scanner(System.in);
		double base, exponente, resultado = 0.0;
		
		System.out.print("Introduce la base: ");
		base = teclado.nextInt();
		
		System.out.print("Introduce el exponente: ");
		exponente = teclado.nextInt();
		
		if (exponente > 0) {
			resultado = Math.pow(base, exponente);
		} else {
			if (exponente == 0) {
				resultado = 1.0;
			} else {
				resultado = 1 / Math.pow(base, exponente * -1);
			}
		}
		
		System.out.println("El resultado de " + Math.round(base) + "^" + Math.round(exponente) + " = " + resultado);
		
	}

}
