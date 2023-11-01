package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio11 {
	
	public static int columnaIgualAlVector (int[][] matriz, int[] vector) {
		int resultado = -1;
		int columna = 0;
		for(int i = 0; i < matriz.length; i++) {
				if(matriz[i].length == vector.length) {
					resultado = columna;
				}
				columna++;
		}
		
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n;
		System.out.print("Introduce el valor de 'm': ");
		m = Teclado.leerInt();
		
		System.out.print("Introduce el valor de 'n': ");
		n = Teclado.leerInt();
		
		int[][] matriz = new int[m][n];
		int[] vector = new int[n];
		
		System.out.println("La columna de la matriz que es igual al vector es la " + 
		columnaIgualAlVector(matriz, vector));
		
	}

}
