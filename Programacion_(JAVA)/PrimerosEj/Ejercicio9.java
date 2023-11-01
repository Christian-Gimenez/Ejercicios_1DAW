import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] args) {
		/*
		 * Cuenta de ahorros que ofrece 4% de interes anual
		 * Escribir un programa que lea la cantidad de dinero depositada en la cuenta
		 * Calcular y mostrar por pantalla la cantidad de ahorros tras el Primer
		 * Segundo y Tercer año. Redondea a dos decimales.
		 */
		
		Scanner teclado = new Scanner(System.in);
		final double INTERES_ANUAL = 4.0 / 100.0; //Siempre que usemos double deberiamos poner decimales, aunque sea un .0
		
		System.out.println("Escribe cuánto dinero tienes depositado en tu cuenta de ahorros:");
		double dineroActual = teclado.nextDouble();
		
		double primerAnio = dineroActual * INTERES_ANUAL;
		dineroActual = dineroActual + primerAnio;
		System.out.println("La cantidad de dinero en el Primer año será de: \n" + Math.round(dineroActual * 100)/100 + " €");
		
		double segundoAnio = dineroActual * INTERES_ANUAL;
		dineroActual = dineroActual + segundoAnio;
		System.out.println("En el Segundo año será de: \n" + Math.round(dineroActual * 100)/100.0 + " €");
		
		double tercerAnio = dineroActual * INTERES_ANUAL;
		dineroActual = dineroActual + tercerAnio;
		System.out.println("Y en el Tercer año será de: \n" + Math.round(dineroActual * 100)/100.0 + " €");
		
	}

}
