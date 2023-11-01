import java.util.Scanner;
public class Ejercicio3 {
	
	public static long factorial(long num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
	}
	
	public static long combinaciones(long m, long n) {
		m = m > n ? m : n;
		n = n < m ? n : m;
		return factorial(m) / (factorial(n) * factorial(m-n));
	}

	public static void main(String[] args) {
		/*El número de combinaciones de m elementos de n en n es:
		 * m sobre n = (m!)/(m! (m-n)!)
		 * donde m!= m* (m-1)* ...* 1
		 * Realiza un programa que lea desde el teclado los valores
		 * de m y n. Compruebe que m es mayor que n
		 * y calcule el nº de combinaciones.*/
		Scanner teclado = new Scanner(System.in);
		long m, n;
		
		System.out.print("Dime el número máximo: ");
		m = teclado.nextLong();
		
		System.out.print("Dime de cuanto en cuanto quieres repartir " + m + ": ");
		n = teclado.nextLong();
		
		System.out.println("El número de combinaciones posibles de " + n + " en " + n + " de " + m + " da: ");
		System.out.println(combinaciones(m, n) + " combinaciones.");
	}

}
