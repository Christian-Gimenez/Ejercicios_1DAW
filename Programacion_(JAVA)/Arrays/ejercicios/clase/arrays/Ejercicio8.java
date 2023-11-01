package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio8 {
	
	public static void deMayorAMenor(int[] vector) {
		int aux;
		boolean cambios = true;
		for(int i = 0; i < vector.length && cambios; i++) {
			cambios = false;
			for(int j = 1; j < vector.length; j++) {
				if(vector[j] >= vector[j-1]) {
					cambios = true;
					aux = vector[j];
					vector[j] = vector[j-1];
					vector[j-1] = aux;
				}
			}
		}
	}
	
	public static void deMenorAMayor(int[] vector) {
		int aux;
		boolean cambios = true;
		for(int i = 0; i < vector.length && cambios; i++) {
			cambios = false;
			for(int j = 1; j < vector.length; j++) {
				if (vector[j] <= vector[j-1]) {
					cambios = true;
					aux = vector[j];
					vector[j] = vector[j-1];
					vector[j-1] = aux;
				}
			}
		}
		
	}
	
	public static void printVector(int[] vector) {
		for(int i = 0; i < vector.length; i++) {
			System.out.println("[" + vector[i] + "]");
		}
	}
	
	public static void rellenarVector(int[] vector) {
		for(int i = 0; i < vector.length; i++) {
			System.out.print((i+1) + "º Valor: ");
			vector[i] = Teclado.leerInt();
		}
	}

	public static void main(String[] args) {
		//Ordenar un vector de dimensión n.
		//Pedir por el teclado la dimensión y los valores del vector.
		System.out.print("Introduce la dimensión del vector: ");
		int[] vector = new int[Teclado.leerInt()];
		rellenarVector(vector);
		
		System.out.println("Antes de ordenarlo: ");
		printVector(vector);

		deMenorAMayor(vector);
		
		System.out.println("Después de ordenarlo de menor a Mayor: ");
		printVector(vector);
		
		deMayorAMenor(vector);
		
		System.out.println("Después de ordenarlo de Mayor a menor: ");
		printVector(vector);
		
		

	}

}
