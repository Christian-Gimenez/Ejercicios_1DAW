package ejercicios.clase;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static int contarApariciones(int[] enteros, int numero) {
		int resultado = 0;
		for(int num:enteros) {
			if(num == numero) {
				resultado++;
			}
		}
		return resultado;
	}
	
	public static double mediaPositivos(int[] enteros) {
		int suma = 0;
		int positivos = 0;
		for(int i = 0; i < enteros.length; i++) {
			if (enteros[i] >= 0) {
				suma += enteros[i];
				positivos++;
			}
		}
		return suma / positivos;
	}
	
	public static double mediaNegativos(int[] enteros) {
		int suma = 0;
		int negativos = 0;
		for(int i = 0; i < enteros.length; i++) {
			if(enteros[i] < 0) {
				suma += enteros[i];
				negativos++;
			}
		}
		return suma / negativos;
	}
	
	public static int leerNum() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		/*Leer 5 numeros por teclado. Realizar la media de los numeros positivos
		 * la media de los negativos y contar el numero de ceros.
		 * */
		int[] numeros = new int[5];
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el " + (i+1) + "º número: ");
			numeros[i] = leerNum();
		}
		System.out.println("La media de los números positivos es: " + mediaPositivos(numeros));
		System.out.println("La media de los números negativos es: " + mediaNegativos(numeros));
		System.out.println("El número 0 ha aparecido: " + contarApariciones(numeros, 0) + " veces.");
		
	}

}
