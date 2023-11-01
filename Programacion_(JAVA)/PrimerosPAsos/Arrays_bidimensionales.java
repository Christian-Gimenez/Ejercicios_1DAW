
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new int[4][5];
		
		matrix[0][0] = 15;
		matrix[0][1] = 21;
		matrix[0][2] = 18;
		matrix[0][3] = 9;
		matrix[0][4] = 5;
		
		matrix[1][0] = 75;
		matrix[1][1] = 89;
		matrix[1][2] = 32;
		matrix[1][3] = 94;
		matrix[1][4] = 2;
		
		matrix[2][0] = 65;
		matrix[2][1] = 34;
		matrix[2][2] = 12;
		matrix[2][3] = 17;
		matrix[2][4] = 45;
		
		matrix[3][0] = 63;
		matrix[3][1] = 99;
		matrix[3][2] = 1;
		matrix[3][3] = 58;
		matrix[3][4] = 74;
		
		//System.out.println("Valor almacenado en la posicion 2, 3 : " + matrix[2][3]);
		for (int i = 0; i < 4; i++) {
			
			for (int x = 0; x < 5; x++) {
			System.out.print(matrix[i][x] + " ");	
			}
			System.out.println("");
		}
	}

}
