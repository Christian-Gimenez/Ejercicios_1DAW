package ejercicios.clase.arrays;

import java.util.Random;

public class Ejercicio12 {
	
	public static int contarDigitos(int num) {
		int digitos = 0;
		do {
			num = num/10;
			digitos++;
		} while (num != 0);
		
		return digitos;
	}

	public static void main(String[] args) {
		//| 100  | 2    | 3000 |
		int[][] vector = new int[10][4];
		int digitos = 0;
		for(int i = 0; i < vector.length; i++) {
			for(int j = 0; j < vector[i].length; j++) {
				vector[i][j] = (int) (Math.random()*1000);
				digitos = contarDigitos(vector[i][j]);
				if (digitos < 2) {
					System.out.print(" " + vector[i][j] + "   |");
				} else if (digitos < 3) {
					System.out.print(" " + vector[i][j] + "  |");
				} else {
					System.out.print(" " + vector[i][j] + " |");
				}
			}
			System.out.println();	
		}
	}

}
