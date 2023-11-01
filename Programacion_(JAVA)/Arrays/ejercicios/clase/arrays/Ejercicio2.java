package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio2 {
	
	public static void rellenarArray(int[] array, int num) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(num + "º Array. Introduce el " + (i+1) + "º valor: ");
			array[i] = Teclado.leerInt();
		}
	}
	
	/*Leer por teclado 2 arrays de 10 números enteros
	 * y mezclarlas en una tercera de la forma:
	 * el 1º de la A, el 1º de la B, el 2º de la A, el 2º de la B, etc..
	 * */
	public static void main(String[] args) {
		int[] array1, array2;
		int longArray1, longArray2;
		System.out.print("Introduce la longitud del 1º Array: ");
		longArray1 = Teclado.leerInt();
		System.out.print("Introduce la longitud del 2º Array: ");
		longArray2 = Teclado.leerInt();
		array1 = new int[longArray1];
		array2 = new int[longArray2];
		
		int[] metaArray;
		
		rellenarArray(array1, 1);
		System.out.println();
		rellenarArray(array2, 2);
		metaArray = (array1.length == array2.length)? mezclarArrays(array1, array2) : mezclarArraysDistintaLong(array1, array2);
		System.out.println("El array resultante tras mezclar ambos es: ");
		printArray(metaArray);
	}
	
	public static int[] mezclarArrays(int[] array1, int[] array2) {
		int[] metaArray = new int [array1.length + array2.length];
		int iArr1=0, iArr2=0;
		
		for(int i = 0; i < metaArray.length; i++) {
			metaArray[i] = (i % 2 == 0)? array1[iArr1++] : array2[iArr2++];
		}
		return metaArray;
	}
	
	public static int[] mezclarArraysDistintaLong(int[] array1, int[] array2) {
		
		int[] metaArray = new int [array1.length + array2.length];
		int i1=0, i2=0;
		boolean noHayMas = false;
		
		for(int i = 0; i < metaArray.length && !noHayMas; i++) {
			if (i1 < array1.length && i2 < array2.length) {
				metaArray[i] = (esPar(i))? array1[i1++] : array2[i2++];
				
			} else {
				if (i1 < array1.length) {
					metaArray[i] = array1[i1++];
				} else if (i2 < array2.length) {
					metaArray[i] = array2[i2++];
				} else {
					noHayMas = true;
				}
			}
			
		}
		return metaArray;
	}
	
	public static boolean esPar(int num) {
		return num % 2 == 0;
	}
	
	public static void printArray(int[] array) {
		for(int num:array) {
			System.out.print("[" + num + "]");
		}
	}
}
