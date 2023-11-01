import org.madrid.educa.io.Teclado;

public class EjercicioII_7 {
	
	public static int fibonacci(int termino) {
		int num1=1, num2=1, numero=1;
		for(int i=2; i<termino;i++) {
			numero = num1 + num2;
			num1 = num2;
			num2 = numero;
		}
		return numero;
		/*
		if (num == 1) {
			return 1;
		} else {
			return fibonacci(num-1) + fibonacci(num-2);
		}*/
	}
	
	public static int mcd(int a, int b) {
		int dividendo = (a > b) ? a : b;
		int divisor = (a < b) ? a : b;
		int resto = a % b;
		
		while (resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
		return divisor;
	}
	
	public static int corresponde(int num1, int num2) {
		int mcd = mcd(num1, num2);
		return mcd;
	}
	
	public static int terminoSerieFibonacci(int numero) {
		int termino = 1;
		while(fibonacci(termino) < numero) {
			termino++;
		}
		if (fibonacci(termino) == numero) {
			return termino;	
		} else {
			return -1;
		}	
	}
	
	public static int mcdTerminosFibonacci(int a, int b) {
		int termino;
		int numero = mcd(fibonacci(a), fibonacci(b));
		termino = terminoSerieFibonacci(numero);
		return termino;
	}

	public static void main(String[] args) {
		/*Dado que el MCD de dos términos de la serie de Fibonacci es otro termino de la serie,
		 * se pide realizar una función que reciba por parametro dos terminos de la serie y devuelve
		 * el termino de la serie que corresponda con el MCD.
		 * 
		 * P.Ej:
		 * 12, 9 debería devolver 3
		 * */
		System.out.print("Dame un número: ");
		int num1 = Teclado.leerEntero();
		
		System.out.print("Dame otro número: ");
		int num2 = Teclado.leerEntero();
		
		int mcd = mcd(num1, num2);
		if (terminoSerieFibonacci(mcd) != -1) {
			System.out.println("El término de la serie Fibonacci que corresponde");
			System.out.println("con el M.C.D de " + num1 + " y " + num2 + " es: " + terminoSerieFibonacci(mcd));
		} else {
			System.out.println("El M.C.D. de " + num1 + " y " + num2 + " NO tiene término Fibonacci");
		}
	}

}
