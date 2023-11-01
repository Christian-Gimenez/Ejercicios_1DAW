import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa que calcule la potencia de 2 numeros (pedir base y exponente)
		 * Pueden ocurrir 3 casos:
		 * Si el exponente es positivo, imprimir la potencia
		 * Si el exponente es 0, imprimir directamente un 1
		 * Si el exponente es negativo, 1 / base ^exponente
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		double base, exponente, potencia;
		
		System.out.println("Introduce la base: ");
		base = teclado.nextInt();
		
		System.out.println("Introduce el exponente: ");
		exponente = teclado.nextInt();
		
		if (exponente > 0) {
			potencia = Math.pow(base, exponente);
			System.out.println("El resultado de elevar " + base + " a " + exponente + " es: " + potencia);
			
		} else if (exponente < 0) {
			exponente = Math.abs(exponente); //exponente = exponente * -1;
			potencia = 1 / Math.pow(base, exponente);
			System.out.println("El resultado de elevar " + base + " a " + exponente + " es: " + potencia);
			
		} else if (exponente == 0) {
			System.out.println("El resultado de elevar " + base + " a " + exponente + " es: " + 1);
			
		} else {
			System.out.println("Alguno de los datos introducidos son erróneos!!");
		}
	}
}
