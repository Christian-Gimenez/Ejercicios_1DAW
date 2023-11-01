package examen.functions;

public class Ejercicio7_Factorial {
	
	public static long factorialIter(long n) {
		long resultado=1;
		for(int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}
	
	public static long factorialRecu(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorialRecu(n-1);
		}
	}
	
	public static long numCombinaciones(long m, long n) {
		long resultado = factorialIter(m) / (factorialIter(n) * factorialIter(m-n));
		return resultado;
	}

	public static void main(String[] args) {
		/*El número de combinaciones de m elementos tomados de n en n es:
        ◦ m sobre n = (m!) / (m! * (m-n)!)
        ◦ donde m! = m* (m-1)*…* 1
        ◦ Hacerlo tanto ITERATIVO como RECURSIVO
      Es decir, multiplicar toda la sucesión de números
      que hay entre 1 y m, si m fuera 5 seria 1*2*3*4*5 = 5!
		 * */
		System.out.println(numCombinaciones(10, 4));

	}

}
