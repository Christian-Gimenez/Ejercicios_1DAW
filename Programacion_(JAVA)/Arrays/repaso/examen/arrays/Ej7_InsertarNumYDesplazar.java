
package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej7_InsertarNumYDesplazar {
	
	public static void desplazarArray(int[] array, int hasta) {
		for(int i = array.length-1; i >= hasta; i--) {
			array[i] = array[i-1];
		}
	}
	
	public static void insertarNumero(int[] array, int numero, int posicion) {
		desplazarArray(array, posicion);
		array[posicion] = numero;
	}
	
	public static void rellenarArray(int[] array) {
		for(int i = 0; i < 8; i++) {
			array[i] = Teclado.leerInt((i+1) + "-Introduce número: ");
		}
	}
	
	public static void printArray(int[] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int posicion, numero;
		rellenarArray(array);
		printArray(array);
		do {
			posicion = Teclado.leerInt("¿En qué posición vas a introducir el número(0-9)? ");
			if (posicion < 0 || posicion >= 10) {
				System.out.println("ERROR. Posición inválida.");
			}
		} while (posicion < 0 || posicion >= 10);
		
		numero = Teclado.leerInt("Introduce el número que quieras insertar: ");
		insertarNumero(array, numero, posicion);
		printArray(array);
	}

}
