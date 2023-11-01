package ejercicios.clase.arrays;

import java.lang.reflect.Array;

public class Ejercicio6 {
	
	public static int[][] copiar(int[][] a) {
		int[][] copia = new int[a.length][a.length];
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j < a.length; j++) {
				copia[i][j] = a[i][j];
			}
		}
		return copia;
	}
	
	public static int[][] invertirDiagonalSecundaria(int[][] matriz) {
		int[][] invertida = new int[matriz.length][matriz.length];
		
		for(int i = 0; i < invertida.length; i++) {
			for(int j = 0; j < invertida.length; j++) {
				if (i + j == matriz.length-1) {
					if (i <= (matriz.length-1)/2) {
						invertida[i][j] = matriz[matriz.length-1-i][matriz.length-1-i];
						invertida[matriz.length-1-i][matriz.length-1-j] = matriz[i][j];
					}
				} else {
					invertida[i][j] = matriz[i][j];
				}
			}
		}
		
		return invertida;
	}
	
	public static int[][] invertirDiagonalPrincipal(int[][] matriz) {
		int[][] invertida = new int[matriz.length][matriz.length];
		
		for(int i = 0; i < invertida.length; i++) {
			for(int j = 0; j < invertida.length; j++) {
				if (i == j) {
					if (i <= (matriz.length-1)/2) {
						invertida[i][j] = matriz[matriz.length-1-i][matriz.length-1-j];
						invertida[matriz.length-1-i][matriz.length-1-j] = matriz[i][j];
					}
				} else {
					invertida[i][j] = matriz[i][j];
				}
				
			}
		}
		
		return invertida;
	}
	
	public static void printMatriz(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 10) {
					System.out.print(matriz[i][j] + "  | ");
				} else {
					System.out.print(matriz[i][j] + " | ");
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//Dada una matriz cuadrada (por ej: 4x4) Invertir los de la diagonal principal.
		int[][] matriz = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{12, 13, 14, 15}
		};
		System.out.println("Antes:");
		printMatriz(matriz);
		System.out.println("Después:");
		int[][] invertida = invertirDiagonalSecundaria(matriz);
		printMatriz(invertida);
		
	}

}
