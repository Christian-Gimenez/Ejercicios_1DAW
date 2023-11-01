package ejercicios.clase.arrays;

import java.lang.reflect.Array;

import daw.com.Teclado;

public class Ejercicio1 {
	
	public static int[] introducirNumsEnArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print("Introduce el " + (i+1) + "º Número: ");
			array[i] = Teclado.leerInt();
		}
		return array;
	}
	/*Como lo hizo ramon
	public static boolean ordenCreciente(int[] array) {
		boolean resultado = true;
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[i-1]) {
				resultado = false;
			}
		}
		return resultado;
	}
	
	public static boolean ordenDecreciente(int[] array) {
		boolean resultado = true;
		for(int i = 1; i < array.length; i++) {
			if(array[i] > array[i-1]) {
				resultado = false;
			}
		}
		return resultado;
	}*/

	
	public static void ordenDelArray(int[] array) {
		boolean creciente = false, decreciente = false, desordenado = false;
		for(int i = 1; i < array.length; i++) {
			//Si el anterior es mayor/igual al actual, y no es creciente ni desordenado
			if (array[i-1] >= array[i] && !creciente && !desordenado) {
				decreciente = true;
				
			} else if (array[i-1] <= array[i] && !decreciente && !desordenado) {
				creciente = true;
				
			} else {
				desordenado = true;
				creciente = false;
				decreciente = false;
			}
		}
		
		if (decreciente && !desordenado) {
			System.out.println("Los números del array están ordenados de manera DECRECIENTE:");
			//System.out.println(stringifyArray(array, '>'));
			System.out.println(stringifyArray(array));
		} else if (creciente && !desordenado) {
			System.out.println("Los numeros del array están ordenados de manera CRECIENTE:");
			//System.out.println(stringifyArray(array, '<'));
			System.out.println(stringifyArray(array));
		} else {
			System.out.println("Los numeros del array están DESORDENADOS:");
			System.out.println(stringifyArray(array));
		}
	}
	
	public static String stringifyArray(int[] array) {
		String desorden = "";
		for(int i = 0; i < array.length; i++) {
			if (i == 0) {
				desorden += " " + array[i] + " ";
			} else { 
				if (array[i-1] > + array[i]) {
					desorden += ">";
				} else if (array[i-1] < array[i]) {
					desorden += "<";
				} else {
					desorden += "==";
				}
				desorden += " " + array[i] + " ";
			}
		}
		
		return desorden;
	}
	
	/*
	public static String stringifyArray(int[] array, char orden) {
		String stringify = "";
		for(int i = 0; i < array.length; i++) {
			if (i != (array.length - 1)) {
				stringify += " " + array[i] + " " + orden;
			} else {
				stringify += " " + array[i] + " ";
			}
		}	
		return stringify;
	}
	*/
	
	

	public static void main(String[] args) {
		/*LEER POR TECLADO 10 NÚMEROS ENTEROS.
		 * LA APLICACIÓN DEBE INDICARNOS SI LOS NÚMEROS
		 * ESTÁN ORDENADOS DE FORMA CRECIENTE, DECRECIENTE O DESORDENADOS.
		 * */
		int[] numeros = new int[10];
		numeros = introducirNumsEnArray(numeros);
		ordenDelArray(numeros);
	}

}
