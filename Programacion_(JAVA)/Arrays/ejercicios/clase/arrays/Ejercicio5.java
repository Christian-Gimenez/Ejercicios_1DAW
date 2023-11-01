package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio5 {
	
	public static void printArray(int[] array) {
		for(int nums:array) {
			System.out.print("[" + nums + "]");
		}
	}
	
	public static void rotarDerecha(int[] array) {
		//	| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|
		//	| 10| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
		//Primero guardamos el último elemento en aux1
		int ultimo = array[array.length-1];	
		
		for(int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1];
		}
		
		array[0] = ultimo;
		
		/*
		for(int i = 0; i < array.length; i++) {
			//Metemos en aux2 el valor de la posicion actual
			aux2 = array[i];
			//Lo que valía aux1 lo metemos en la pos. actual
			array[i] = aux1;
			//Guardamos en aux1 el valor que contiene aux2
			aux1 = aux2;
		}
		*/
	}
	
	public static void rotarIzquierda(int[] array) {
		int primero = array[0];
		
		for(int i = 0; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		
		array[array.length-1] = primero;
	
		/*
		for(int i = 0; i < array.length; i++) {
			//Si i+1 no excede la longitud (no es .length)
			if (i+1 != array.length) {
				//Guardamos en aux el siguiente valor
				aux = array[i+1];
				//En el siguiente valor, ponemos el valor actual
				array[i+1] = array[i];
				//Y en el valor actual, ponemos el valor de aux (el siguiente)
				array[i] = aux;
			}
			
		}*/
		
	}
	
	public static boolean menu(int[] array, int opcion) {
		boolean salir = false;
		switch(opcion) {
		case 1:
			System.out.println("Array después de rotarlo a la IZQUIERDA: ");
			rotarIzquierda(array);
			printArray(array);
			break;
		case 2:
			System.out.println("Array después de rotarlo a la DERECHA: ");
			rotarDerecha(array);
			printArray(array);
			break;
		case 3:
			salir = true;
			break;
		}
		return salir;
	}

	public static void main(String[] args) {
		/*Crear un programa que lea por teclado
		 * una tabla de 10 números enteros y
		 * las desplace una posición hacia abajo:
		 * el primero pasa a ser el segundo,
		 * el segundo pasa a ser el tercero y así sucesivamente.
		 * El último pasa a ser el primero.
		 * */
		int[] numeros = new int[10];
		boolean salir = false;
		int opcion = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print((i+1) + "º Número: ");
			numeros[i] = Teclado.leerInt();
		}
		
		System.out.println("\n\nArray antes de rotarlo: ");
		printArray(numeros);
		
		
		do {
			System.out.println("\n\n¿Qué deseas hacer con el array?");
			System.out.println("1) Rotarlo a la izquierda.");
			System.out.println("2) Rotarlo a la derecha.");
			System.out.println("3) Nada. Salir del programa.");
			System.out.print("-> ");
			opcion = Teclado.leerInt();

			if (opcion > 3 || opcion < 1) {
				System.err.println("¡Opción incorrecta!\n");
			} else {
				salir = menu(numeros, opcion);
			}
			
		} while(!salir);
		
		System.out.println("Programa finalizado.");
		
		
	}

}
