import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num, mayorN=-1, menorN=-1, sumaTodos=0, sumaPositivos=0, sumaNegativos=0, contador=0;
		double media=0.0;
		
		do {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			if (num != -1) {
				if (contador == 0) {
					mayorN = num;
					menorN = num;
				}
				
				if (num > mayorN) {
					mayorN = num;
				}
				
				if (num < menorN) {
					menorN = num;
				}
				
				if (num < 0) {
					sumaNegativos += num;
				}
				
				if (num > 0) {
					sumaPositivos += num;
				}
				
				sumaTodos += num;
				contador++;
			}
		} while (num != -1);
		
		media = sumaTodos / contador;
		
		System.out.println("El mayor número introducido es: " + mayorN);
		System.out.println("El menor número introducido es: " + menorN);
		System.out.println("La suma de todos los números da: " + sumaTodos);
		System.out.println("La suma de los números positivos da: " + sumaPositivos);
		System.out.println("La suma de los números negativos da: " + sumaNegativos);
		System.out.println("La media de la suma de todos los números es: " + media);
	}

}
