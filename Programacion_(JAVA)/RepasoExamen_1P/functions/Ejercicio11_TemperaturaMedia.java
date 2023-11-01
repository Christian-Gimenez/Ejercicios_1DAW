package examen.functions;

import java.util.Scanner;

public class Ejercicio11_TemperaturaMedia {
	
	public static double temperaturaMedia(double tempMin, double tempMax) {
		double minima = (tempMin < tempMax)? tempMin : tempMax;
		double maxima = (tempMax > tempMin)? tempMax : tempMin;
		double media = 0.0;
		
		media = (minima + maxima)/2;
		
		return media;
	}
	
	public static double pedirTemp() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextDouble();
	}
	
	public static int pedirDias() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		/*Crear un función que calcule la temperatura media
		 * de un día a partir de la temperatura máxima y mínima.
		 * Crear un programa principal,
		 * que utilizando la función anterior,
		 * vaya pidiendo la temperatura máxima y mínima de cada día
		 * y vaya mostrando la media.
		 * El programa pedirá el número de días que se van introducir.
        ◦ NOTA: Si se te ocurre alguna otra función puedes utilizarla.
		 * */
		double min=0.0, max=0.0, media=0.0;
		int dias=0;
		System.out.print("Introduce el nº días a evaluar su Temperatura media: ");
		dias = pedirDias();
		
		for (int i = 1; i <= dias; i++) {
			System.out.println("Introduce la temperatura del " + i + "º día:");
			System.out.print("Máxima ºC: ");
			max = pedirTemp();
			System.out.print("Mínima ºC: ");
			min = pedirTemp();
			media = temperaturaMedia(min, max);
			System.out.println("La temperatura media del " + i + "º día es: " + media + "ºC.\n");
		}
	}

}
