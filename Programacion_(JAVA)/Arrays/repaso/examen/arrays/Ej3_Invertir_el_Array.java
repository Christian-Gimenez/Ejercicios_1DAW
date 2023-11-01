package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej3_Invertir_el_Array {
	
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static void invertirArray(int[] array) {
		int aux;
		for(int i = 0; i < array.length/2; i++) {
			aux = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = aux;
		}
	}
	
	public static void printArray(int[] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
		}
	}
	
	public static void rellenarArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "-Introduce el valor: ");
			array[i] = Teclado.leerInt();
		}
	}

	public static void main(String[] args) {
		System.out.print("Introduce el tamaño del Array: ");
		int[] array = new int[Teclado.leerInt()];
		
		rellenarArray(array);
		
		System.out.println("Tu array es: ");
		printArray(array);
		
		if(esPar(array.length)) {
			System.out.println("\nY como su longitud " + array.length + " es Par, lo invertimos, quedando así:");
			invertirArray(array);
			printArray(array);
		}
		

	}

}
