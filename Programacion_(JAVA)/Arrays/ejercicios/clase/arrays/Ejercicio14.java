package ejercicios.clase.arrays;

public class Ejercicio14 {
	
	public static void printMatriz(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int valor:matriz[i]) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matriz = new int [3][5];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				switch (i) {
				case 0:
					matriz[i][j] = 10 + j + 1;
					break;
				case 1:
					matriz[i][j] = 20 + j + 1;
					break;
				default:
					matriz[i][j] = 30 + j + 1;
					break;
				}
			}
		}
		
		printMatriz(matriz);

	}

}
