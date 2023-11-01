
public class FactorialRecursivo {
	
	public static long factorial(long numero) {
		if(numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero -1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
