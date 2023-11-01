import java.util.Scanner;

public class EjercicioNElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long m, n;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame m: ");
		m = teclado.nextLong();
		
		System.out.print("Dame n: ");
		n = teclado.nextLong();
		
		long resultado = combinaciones(m, n);
		
		System.out.println("Las combinaciones de " + m + " elementos tomados de " + n + " en " + n + " son: " + resultado);
	}
	/*Calcular
	 * (M sobre N) = M! / N! * (M-N)!
	 * (49 sobre 6) = 49! / 6! *(49-6)!
	 */
	
	public static long factorial(long num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
	}
	
	public static long combinaciones(long m, long n) {		
		return factorial(m) / (factorial(n)*factorial(m-n));
	}

}
