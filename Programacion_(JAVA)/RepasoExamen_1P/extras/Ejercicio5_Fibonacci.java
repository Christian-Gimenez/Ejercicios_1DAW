package examen.extras;

public class Ejercicio5_Fibonacci {
	
	public static boolean esFib(int num) {
		int fib = 0;
		int ter1 = 1;
		int ter2 = 1;
		boolean fibonacci=false;
		
		for(int i = 2; i <= num; i++) {
			fib = ter1 + ter2;
			ter1 = ter2;
			ter2 = fib;
			if (fib == num) {
				fibonacci = true;
			}
		}
		return fibonacci;
		
	}
	
	public static int posicionSerieFib(int num) {
		int posicion = 1;
		
		if (num == 1) {
			return 1;
		}
		
		if (num == 2) {
			return 1;
		}
		
		if (!esFib(num)) {
			return -1;
		}
		
		for (int i = 0; i <= num*2; i++) {
			if (esFib(i)) {
				System.out.println("fib:" + i);
				posicion++;
			}
		}
		return posicion;
	}
	
	
	public static int termFib(int num) {
		int fibonacci = 0;
		int ter1=1, ter2=1;
		
		for(int i = 2; i <= num; i++) {
			fibonacci = ter1 + ter2;
			ter1 = ter2;
			ter2 = fibonacci;
		}
		return fibonacci;
	}

	public static void main(String[] args) {
		/*fib(n) = fib(n-1) + fib(n-2)
		 * fib(0) = 1
		 * fib(1) = 1*/
		
		//Recibe un término,calcula su equivalente en la serie Fibonacci
		System.out.println(posicionSerieFib(12));
	}

}
