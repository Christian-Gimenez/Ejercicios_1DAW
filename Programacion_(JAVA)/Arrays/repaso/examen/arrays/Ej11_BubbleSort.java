package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej11_BubbleSort {

	
	public static void rellenarArrayAleat(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]  = (int) (Math.random()*1000);
		}
	}
	
	public static void imprimirArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if (i == array.length-1) {
				System.out.print(array[i] + "\n");
			} else {
				System.out.print(array[i] + " | ");
			}
		}
	}
	
	public static void menuPrincipal(int[] array) {
		int opcion = 0;
		do {
			System.out.println("Ordenar Array de manera:");
			System.out.println("1) Ascendente.");
			System.out.println("2) Descendente.");
			System.out.println("3) Salir.");
			opcion = Teclado.leerInt(": ");
			
			if (opcion <= 0 || opcion > 3) {
				System.out.println("Opción incorrecta!!!");
			} else {
				selectorMenu(opcion, array);
			}
		} while (opcion != 3);
	}
	
	public static void selectorMenu(int opcion, int[] array) {
		switch (opcion) {
		case 1:
			ordenAscendente(array);
			System.out.println("Tu array ordenado de manera ASCENDENTE: ");
			imprimirArray(array);
			break;
		case 2:
			ordenDescendente(array);
			System.out.println("Tu array ordenado de manera DESCENDENTE: ");
			imprimirArray(array);
			break;
		default:
			System.out.println("Programa finalizado.");
			break;
		}
	}
	
	public static void intercambiar(int[] array, int anterior, int siguiente) {
		int aux = array[anterior];
		array[anterior] = array[siguiente];
		array[siguiente] = aux;
	}
	
	public static void ordenAscendente(int[] array) {
		boolean cambios = true;
		for(int i = 0; i < array.length && cambios; i++) {
			cambios = false;
			for(int j = 1; j < array.length; j++) {
				if(array[j-1] >array[j]) {
					cambios = true;
					intercambiar(array, j-1, j);
				}
			}
		}
	}
	
	public static void ordenDescendente(int[] array) {
		boolean cambios = true;
		for(int i = 0; i < array.length && cambios; i++) {
			cambios = false;
			for(int j = 1; j < array.length; j++) {
				if(array[j-1] < array[j]) {
					cambios = true;
					intercambiar(array, j-1, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		rellenarArrayAleat(array);
		imprimirArray(array);
		menuPrincipal(array);
		
	}

}
