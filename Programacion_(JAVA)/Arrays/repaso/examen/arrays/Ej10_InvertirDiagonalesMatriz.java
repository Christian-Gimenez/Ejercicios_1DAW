package repaso.examen.arrays;

public class Ej10_InvertirDiagonalesMatriz {
	
	public static void invertirDiagonalPrincipal (int[][] matriz) {
		int aux;
		for(int i = 0; i < matriz.length/2; i++) {
			aux = matriz[i][i];
			matriz[i][i] = matriz[matriz.length-1-i][matriz.length-1-i];
			matriz[matriz.length-1-i][matriz.length-1-i] = aux;
		}
	}
	
	public static void invertirDiagonalSecundaria(int[][] matriz) {
		int aux;
		for(int i = 0; i < matriz.length/2; i++) {
			aux = matriz[i][matriz.length-1-i];
			matriz[i][matriz.length-1-i] = matriz[matriz.length-1-i][i];
			matriz[matriz.length-1-i][i] = aux;
		}
	}
	
	public static void printTable(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < 10) {
					System.out.print(matriz[i][j] + " | ");
				} else {
					System.out.print(matriz[i][j] + "| ");
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz  = { { 1, 2, 3, 4}, 
									{5, 6, 7, 8},
									{9, 10, 11, 12},
									{13, 14, 15, 16}
									};
		System.out.println("Normal:");
		printTable(matriz);
		System.out.println("Diagonal principal invertida:");
		invertirDiagonalPrincipal(matriz);
		printTable(matriz);
		System.out.println("Diagonal secundaria invertida:");
		invertirDiagonalSecundaria(matriz);
		printTable(matriz);
		
		

	}
}
