package ejercicios.clase.arrays;

public class Ejercicio7 {
	
	public static int[][] copiar(int[][] a) {
		int[][] copia = new int[a.length][a.length];
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j < a.length; j++) {
				copia[i][j] = a[i][j];
			}
		}
		return copia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
