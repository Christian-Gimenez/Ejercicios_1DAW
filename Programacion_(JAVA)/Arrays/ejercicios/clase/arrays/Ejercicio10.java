package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio10 {
	
	public static int contarDigitos(int numero) {
		int digitos = 0;
		int resto = 0;
		do {
			numero = numero / 10;
			digitos++;
		} while (numero != 0);
		
		return digitos;
	}
	
	public static void rellenar(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce el número de la fila " + (i+1) + ", columna " + (j+1) + ": ");
				matriz[i][j] = Teclado.leerInt();
			}
		}
	}
	
	public static void printNums(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printString(String[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}
	
	public static String[][] digitosArray(int[][] numeros) {
		String[][] digitos = new String[numeros.length][numeros.length];
		for(int i = 0; i < digitos.length; i++) {
			for(int j = 0; j < digitos[i].length; j++) {
				digitos[i][j] = "El elemento [" + i + ", " + j + "] que es " + numeros[i][j] + " tiene " + contarDigitos(numeros[i][j]) + " digitos";
			}
		}
		
		return digitos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int [3][3];
		rellenar(matriz);
		
		String[][] digitos = digitosArray(matriz);
		printString(digitos);
	}

}
