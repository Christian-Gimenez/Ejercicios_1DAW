
public class Arrays_bidimensionales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {
				{10, 15, 18, 19, 21},
				{5, 25, 37, 41, 15},
				{7, 19, 32, 14, 90},
				{85, 2, 7, 40, 27}
		};
		
		/*
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + " ");
			}
		}*/
		
		for(int[] fila:array) {
			System.out.println();
			for(int columna:fila) {
				System.out.print(columna + " ");
			}
		}
	}

}
