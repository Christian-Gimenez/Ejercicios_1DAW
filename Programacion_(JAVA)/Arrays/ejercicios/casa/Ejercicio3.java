package ejercicios.casa;

import java.util.*;

public class Ejercicio3 {
	
	public static int pedirInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static int random(int desde, int hasta) {
		Random random = new Random();
		return random.nextInt(desde, hasta);
	}
	
	public static int generarPrimoRandom(int desde, int hasta) {
		int aleatorio = 0;
		while(!esPrimo(aleatorio)) {
			aleatorio = random(desde, hasta);
		}
		return aleatorio;
	}
	
	public static void rellenarArrayConPrimosRandom(int[] array, int desde, int hasta) {
		int inicio = (desde < hasta)? desde : hasta;
		int fin = (desde > hasta)? desde : hasta;
		for(int i = 0; i < array.length; i++) {
				array[i] = generarPrimoRandom(inicio, fin);
		}
	}
	
	public static boolean esPrimo(int num) {
		boolean primo = false;
		int divisores = 0;
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		
		if(divisores == 2) {
			primo = true;
		}
		
		return primo;
	}
	
	public static int mayor(int[] array) {
		int elMayor = array[0];
		for(int num:array) {
			if (num > elMayor) {
				elMayor = num;
			}
		}
		return elMayor;
	}
	
	public static void printArray(int[] array) {
		for(int numero:array) {
			System.out.print("[" + numero + "]");
		}
	}

	public static void main(String[] args) {
		/* Crea un array de números de un tamaño pasado por teclado,
		 * el array contendrá números aleatorios primos entre los números deseados,
		 * por último nos indica cual es el mayor de todos.

			Haz un método para comprobar que el número aleatorio es primo,
			puedes hacer todos lo métodos que necesites.
		 * */
		int desde = 0, hasta = 0, mayor=0;
		System.out.print("Introduce la longitud del array: ");
		int longArray = pedirInt();
		int[] arrayNumerico = new int[longArray];
		System.out.println("Ahora rellenaremos de números aleatorios primos el array.");
		System.out.print("Por favor, indica desde qué número: ");
		desde = pedirInt();
		System.out.print("Y ahora, hasta qué número: ");
		hasta = pedirInt();
		rellenarArrayConPrimosRandom(arrayNumerico, desde, hasta);
		System.out.println("Tu array de primos aleatorios es: ");
		printArray(arrayNumerico);
		mayor = mayor(arrayNumerico);
		System.out.println("\nEl mayor de todos los números es: " + mayor);
		
	}

}
