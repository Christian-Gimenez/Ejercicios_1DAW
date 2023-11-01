package ejercicios.casa;

import java.util.Random;

public class Ejercicio2 {
	
	
	public static int[] construirArray(int tamanio) {
		int[] array = new int[tamanio];
		return array;
	}
	
	public static int random(int desde, int hasta) {
		Random aleatorio = new Random();
		return aleatorio.nextInt(desde, hasta);
	}
	
	public static int[] rellenarArrayRandom(int[] array, int desde, int hasta) {
		for(int i = 0; i < array.length; i++) {
			array[i] = random(desde, hasta);
		}
		return array;
	}
	
	public static int sumarNumsArray(int[] array) {
		int suma = 0;
		for(int numero:array) {
			suma += numero;
		}
		return suma;
	}
	
	public static void imprimirArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}

	public static void main(String[] args) {
		/* Crea un array de números donde
		 * le indicamos por teclado el tamaño del array,
		 * rellenaremos el array con números aleatorios entre 0 y 9,
		 * al final muestra por pantalla el valor de cada posición
		 * y la suma de todos los valores.
		 * Haz un método para rellenar el array
		 * (que tenga como parámetros los números
		 * entre los que tenga que generar),
		 * para mostrar el contenido y la suma del array
		 * y un método privado para generar número aleatorio
		 * (lo puedes usar para otros ejercicios).
		 * */
		int[] coleccionAleatoria = construirArray(5);
		coleccionAleatoria = rellenarArrayRandom(coleccionAleatoria, 0, 9);
		System.out.println("El array generado aleatoriamente es: ");
		imprimirArray(coleccionAleatoria);
		System.out.println("\nLa suma de todos los números del array es: " + sumarNumsArray(coleccionAleatoria));

	}

}
