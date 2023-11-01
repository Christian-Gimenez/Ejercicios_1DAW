import java.util.Scanner;

public class Ejercicio5 {
	
	public static int mcdRecursiva(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		if (a == 0) {
			return b;
		}
		
		if (a >= b) {
			return mcdRecursiva(a-b, b);
		} else {
			return mcdRecursiva(a, b-a);
		}
	}
	
	public static int mcdIterativa(int num1, int num2) {
		int divisor = (num1 < num2)? num1 : num2;
		int dividendo = (num1 > num2)? num1 : num2;
		int resto = dividendo % divisor;
		
		while (resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
			
		return divisor;
	}
	
	public static int pedirNum() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		System.out.print("Introduzca el 1º número: ");
		num1 = pedirNum();
		
		System.out.print("Introduzca el 2º número: ");
		num2 = pedirNum();
		
		System.out.println("El Máximo Común Divisor de " + num1 + " y " + num2 + " calculado de manera iterativa es: " + mcdIterativa(num1, num2));
		System.out.println("Y el Máximo Común Divisor de " + num1 + " y " + num2 + " calculado de manera recursiva es: " + mcdRecursiva(num1, num2));
	}

}
