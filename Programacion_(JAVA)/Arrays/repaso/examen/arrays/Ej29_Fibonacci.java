package repaso.examen.arrays;

public class Ej29_Fibonacci {
	
	public static int fibonacci(int termino) {
		if (termino == 0) {
			return 0;
		} else if (termino == 1) {
			return 1;
		}
		int siguiente = 1;
		int anterior = 0;
		int resultado = 0;
		for(int i = 1; i < termino; i++) {
			resultado = anterior + siguiente; //0+1=1, 1+1=2, 1+2=3, 2+3=5...
			anterior = siguiente; //1, 1, 2, 3...
			siguiente = resultado; //1, 2, 3, 5...
		}
		return resultado;
	}
	
	public static int fibRecursivo(int termino) {
		if(termino == 1) {
			return 1;
		} else if (termino == 0) {
			return 0;
		}
		return fibRecursivo(termino-1) + fibRecursivo(termino-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(8));
		System.out.println(fibRecursivo(8));
	}

}
