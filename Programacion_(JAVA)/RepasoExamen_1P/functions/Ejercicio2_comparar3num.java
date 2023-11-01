package examen.functions;

public class Ejercicio2_comparar3num {
	
	public static int compararNums(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else {
			if (b >= a && b >= c) {
				return b;
			} else {
				return c;
			}
		}
	}

	public static void main(String[] args) {
		//Ídem una versión que calcule el máximo de 3 números.
		System.out.println(compararNums(5,5,5));
	}

}
