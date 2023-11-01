import java.util.Scanner;

public class Ejercicio4 {
	
	public static boolean esPrimo(int num) {
		boolean primo;
		int divisores = 0;
		if (num == 1) {
			primo = false;
		} else {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					divisores++;
				}
			}
			
			if (divisores == 2) {
				primo = true;
			} else {
				primo = false;
			}
		}
		
		return primo;
	}
	
	public static int cuentaPrimos(int num) {
		int primos = 0;
		
		if (num == 1) {
			primos = 0;
		}
		
		for(int i = 2; i <= num; i++) {
			if (esPrimo(i)) {
				primos++;
			}
		}
		
		return primos;
	}
	
	public static int pedirNum() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		//Pedir un numero n, decir cuantos primos hay entre 1 y n.
		int n;
		System.out.print("Introduce un número: ");
		n = pedirNum();
		
		System.out.println("Entre 1 y " + n + " hay " + cuentaPrimos(n) + " números primos.");
	}

}
