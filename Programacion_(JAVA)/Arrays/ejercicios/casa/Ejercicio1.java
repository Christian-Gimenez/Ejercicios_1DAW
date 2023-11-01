package ejercicios.casa;

import java.util.*;

public class Ejercicio1 {
	
	public static int pedirInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static int[] rellenarArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print("Introduce el valor del índice [" + (i+1) + "]: ");
			array[i] = pedirInt();
		}
		return array;
	}
	
	public static void imprimirArray(int[] array) {
		int i = 0;
		for(int numero:array) {
			System.out.println("El valor de la posición [" + (i+1) + "] es: " + numero);
			i++;
		}
	}

	public static void main(String[] args) {
		/*1) Crea un array de 10 posiciones de números
		con valores pedidos por teclado.
		Muestra por consola el indice y el valor al que corresponde.
		Haz dos métodos, uno para rellenar valores y otro para mostrar.
		*/
		int[] matriculas = new int[10];
		matriculas = rellenarArray(matriculas);
		imprimirArray(matriculas);
	}

}
