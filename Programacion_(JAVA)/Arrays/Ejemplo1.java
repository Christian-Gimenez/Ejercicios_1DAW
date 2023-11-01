import java.lang.reflect.Array;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades[] = new int [5];
		//int [] edades = new int [5];
		
		edades[0] = 26;
		edades[1] = 13;
		edades[2] = 9;
		edades[3] = 17;
		edades[4] = 35;
		
		//System.out.println(edades[2]);
		for(int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
	}

}
