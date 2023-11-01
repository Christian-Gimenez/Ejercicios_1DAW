
public class EjercicioIII_1 {

	public static int maximo(int a, int b) {
		int mayor;
		if (a > b) {
			mayor = a;
		} else {
			mayor = b;
		}
		return mayor;
	}
	
	public static int maximoDeTres(int a, int b, int c) {
		return (a >= b && a >= c)? a : (b >= a && b >= c)? b : c;
		/*if (a >= b && a >= c) {
		 * return a;
		 * } else {
		 * 		if (b >= a && b >= c) {
		 * 		return b;
		 * 		} else {
		 * 			return c;
		 * 		}
		 * }
		 * */
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maximoDeTres(58,12,128));

	}

}
