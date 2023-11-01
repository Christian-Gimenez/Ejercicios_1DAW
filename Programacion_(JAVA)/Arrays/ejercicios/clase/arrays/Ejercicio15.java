package ejercicios.clase.arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matriz = new double[4][4];
		for(int i = 0; i < matriz.length/2; i++) {
			matriz[i][i] = 1.0;
			matriz[matriz.length-1-i][matriz.length-1-i] = 1.0;
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
