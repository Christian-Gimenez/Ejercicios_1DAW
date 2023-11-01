package repaso.examen.arrays;

public class Ej23_NumCombinacionesDeMElementosDeNenN {
	
	public static int factorialR(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorialR(num-1);
	}
	
	public static long factorial(int numero) {
		int resultado = numero;
		for(int i = numero - 1; i > 0; i--) {
			resultado *= i;
		}
		return resultado;
	}

	public static long mSobreN(int m, int n) {
		return factorial(m) / (factorial(n) * factorial(m-n));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mSobreN(10,5));
	}

}
