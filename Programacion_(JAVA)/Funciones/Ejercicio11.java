import java.util.*;
public class Ejercicio11 {
	
	public static int denResult = 0;
	public static int numResult = 0;

	public static void main(String[] args) {
		int num1, den1, num2, den2;
		System.out.println("-----Primera fracción-----");
		num1 = leerFraccion("numerador");
		den1 = leerFraccion("denominador");
		
		System.out.println("-----Segunda fracción-----");
		num2 = leerFraccion("numerador");
		den2 = leerFraccion("denominador");
		
		num1 = simplificarFraccion(num1, den1);
		den1 = simplificarFraccion(den1, num1);
		num2 = simplificarFraccion(num2, den2);
		den2 = simplificarFraccion(den2, num2);
		
		System.out.println("Simplificadas serían: " + escribirFraccion(num1, den1) + " y " + escribirFraccion(num2, den2) + " respectivamente.");
		
		for (int i = 0; i < 4; i++) {
			System.out.println();
			opcionAritm(num1, den1, num2, den2);
			
		}
		
		System.out.println("FIN del programa");

	}
	
	public static void opcionAritm(int num1, int den1, int num2, int den2) {
		boolean correcta;
		String operacion = "";
		String simbolo = "";
		Scanner teclado = new Scanner(System.in);
		do {
			correcta = true;
			System.out.println("¿Qué operación aritmética deseas realizar?");
			System.out.println("-Sumar: +");
			System.out.println("-Restar: -");
			System.out.println("-Multiplicar: *");
			System.out.println("-Dividir: /");
			System.out.print("");
			char opcion = teclado.nextLine().charAt(0);
			
			switch(opcion) {
			case '+':
				operacion = "suma";
				simbolo = "+";
				sumarFracciones(num1, den1, num2, den2);
				break;
			case '-':
				operacion = "resta";
				simbolo = "-";
				restarFracciones(num1, den1, num2, den2);
				break;
			case '*':
				operacion = "multiplicación";
				simbolo = "*";
				multiplicarFracciones(num1, den1, num2, den2);
				break;
			case '/':
				operacion = "dividir";
				simbolo = "/";
				dividirFracciones(num1, den1, num2, den2);
				break;
			default:
				System.out.println("Opción inválida!");
				correcta = false;
				break;
			}
		} while (!correcta);
		
		System.out.println("La " + operacion + " de " + escribirFraccion(num1, den1) + " " + simbolo + " " + escribirFraccion(num2, den2) + " = " + escribirFraccion(numResult, denResult));		
	}
	
	
	public static int leerFraccion(String den_o_num) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el " + den_o_num + ": ");
		return teclado.nextInt();
	}
	
	public static String escribirFraccion(int num, int den) {
		if (den == 1) {
			return "" + den;
		} else {
			return + num + "/" + den;
		}
	}
	
	public static int calcularMCD(int a, int b) {
		int resto, dividendo, divisor;
		dividendo = a > b ? a : b;
		divisor = a < b ? a : b;
		resto = dividendo % divisor;
		
		while (resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
		
		return divisor;
	}
	
	public static int calcular_mcm(int num1, int num2) {
		int a = num1 > num2 ? num1 : num2;
		int b = num1 < num2 ? num1 : num2;
		
		int resultado = (a / calcularMCD(num1, num2)) * b;
		return resultado;
	}
	
	public static int simplificarFraccion(int a, int b) {
		int mcd = calcularMCD(a, b);
		return a / mcd;
	}
	
	public static void sumarFracciones(int n1, int d1, int n2, int d2) {
		
		if (d1 == d2) {
			numResult = n1 + n2;
			denResult = d1;
		} else {
			numResult = (n1 * d2) + (d1 * n2);
			denResult = d1 * d2;
		}
	}
	
	public static void restarFracciones(int n1, int d1, int n2, int d2) {
		int mcm;
		boolean mismoDenominador = false;
		while (!mismoDenominador) {
			if (d1 == d2) {
				numResult = n1 - n2;
				denResult = d1;
				mismoDenominador = true;
			} else {
				mcm = calcular_mcm(d1, d2);
				n1 = (mcm/d1) * n1;
				n2 = (mcm/d2) * n2;
				d1 = mcm;
				d2 = mcm;
			}
		}
		
	}
	
	
	public static void multiplicarFracciones(int n1, int d1, int n2, int d2) {
		numResult = n1 * n2;
		denResult = d1 * d2;
	}
	
	public static void dividirFracciones(int n1, int d1, int n2, int d2) {
		numResult = n1 * d2;
		numResult = n2 * d1;
	}

}
