import java.util.Scanner;

public class Ejercicio_MaximoComunDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n1, n2, mcd;
		System.out.println("****Programa calculador del Máximo Común Divisor de 2 numeros****");
		System.out.print("Introduce un número: ");
		n1 = teclado.nextInt();
		
		System.out.print("Introduce otro número: ");
		n2 = teclado.nextInt();
		
		mcd = maximoComunDivisor(n1, n2);
		System.out.println("El M.C.D. calculado de manera iterativa es: " + mcd);
		
		mcd = mcd(n1, n2);
		System.out.println("Y el M.C.D. calculado de manera recursiva es: " + mcd);
	}
	
	public static int maximoComunDivisor(int num1, int num2) {
		int resto, dividendo, divisor;
		dividendo = (num1 > num2) ? num1 : num2; //Operador ternario
		divisor = (num1 < num2) ? num1 : num2; //Operador ternario
		resto = dividendo % divisor;
		
		while (resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
		return divisor;
	}
	
	public static int mcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		if (a == b) {
			return b;
		}
		if (a >= b) {
			return mcd(a-b, b);
		} else {
			return mcd(a, b-a);
		}
	}

}
