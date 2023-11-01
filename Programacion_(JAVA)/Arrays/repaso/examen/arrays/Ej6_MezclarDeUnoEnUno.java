package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej6_MezclarDeUnoEnUno {
	
	public static void leerArrays(int[] array, int num) {
		System.out.println("Introduce los valores del " + num + "º Array:");
		for(int i = 0; i < array.length; i++) {
			array[i] = Teclado.leerInt(i +"-: ");
		}
	}
	
	public static boolean mayor(int[] a, int[] b) {
		return a.length > b.length && a.length != b.length;
	}
	
	public static int[] mezclarArrays(int[] a, int[] b) {
		int[] mega = new int[a.length + b.length];
		for(int i = 0; i < b.length; i++) {
			if (i < a.length) {
				mega[i*2] = a[i];
				mega[i*2+1] = b[i];
			} else {
				mega[i*2] = b[i];
				mega[i*2+1] = b[i+1];
			}
		}
		return mega;
		
	}
	
	public static int pedirLong(int num) {
		System.out.print("Introduce la longitud del " + num + "º array: ");
		return Teclado.leerInt();
	}
	
	public static void imprimirArray(int[] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = new int[pedirLong(1)];
		int[] arr2 = new int[pedirLong(2)];
		leerArrays(arr1, 1);
		leerArrays(arr2, 2);
		System.out.println("Tu 1º Array es:");
		imprimirArray(arr1);
		System.out.println("\nY tu 2º Array es:");
		imprimirArray(arr2);
		System.out.println("\nY la mezcla de ambos quedaría:");
		if (!mayor(arr1, arr2)) {
			int[] mega = mezclarArrays(arr1, arr2);
			imprimirArray(mega);
		} else {
			int[] mega = mezclarArrays(arr2, arr1);
			imprimirArray(mega);
		}
		
		

	}

}
