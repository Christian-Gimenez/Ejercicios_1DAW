package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio9 {
	
	public static void cambiarColumnas(String[][] tabla) {
		String aux;
		for(int i = 0; i < tabla.length; i++) {
			aux = tabla[i][0];
			tabla[i][0] = tabla[i][tabla.length-1];
			tabla[i][tabla.length-1] = aux;
		}
	}
	
	public static void introducirDatos(String[][] tabla) {
		for(int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce el encabezado " + (i+1) + ": ");
			tabla[0][i] = Teclado.leerString();
		}
		
		for(int i = 1; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print("Introduce " + tabla[0][j] + ": ");
				tabla[i][j] = Teclado.leerString();
			}
			System.out.println();
		}
	}
	
	public static void printTabla(String[][] tabla) {
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String[][] coches = new String[3][3];
		introducirDatos(coches);
		printTabla(coches);
		
		System.out.println("\nDespues de intercambiar la primera y la ultima columna:\n");
		cambiarColumnas(coches);
		printTabla(coches);
	}

}
