package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio16 {
	
	public static int[] buscarNumero(int numeroABuscar ,int[][] matriz) {
		int [] posicionXY = new int [2];
		posicionXY[0] = -1; 
		posicionXY[1] = -1;
		boolean encontrado = false;
		for(int i = 0; i < matriz.length && !encontrado; i++) {
			for(int j = 0; j < matriz[i].length && !encontrado; j++) {
				if (matriz[i][j] == numeroABuscar) {
					posicionXY[0] = i;
					posicionXY[1] = j;
					encontrado = true;
				}
			}
		}
		
		return posicionXY;
	}
	
	public static void rellenarMatriz(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("\nIntroduce el número en la posición [" + i + ", " + j + "]: ");
				matriz[i][j] = Teclado.leerInt();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros = new int[5][4];
		int num;
		
		rellenarMatriz(numeros);
		System.out.print("Introduce el número a buscar en la matriz: ");
		num = Teclado.leerInt();
		int[] posicionXY = buscarNumero(num, numeros);
		
		if (posicionXY[0] != -1) {
			System.out.println("El número " + num + " se encuentra en la posición [" + posicionXY[0] + ", " + posicionXY[1] + "]");
		} else {
			System.out.println("No hemos encontrado el número " + num + " :(");
		}
		
		
	}

}
