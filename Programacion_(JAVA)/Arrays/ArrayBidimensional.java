
public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayBidimensional = new int[3][3];
		for (int i = 0; i < arrayBidimensional.length; i++){
			for(int j = 0; j < arrayBidimensional[i].length; j++) {
				//arrayBidimensional[i][j] = Leer por Teclado
				System.out.println(arrayBidimensional[i][j]);
			}
		}
		System.out.println();
	}

}
