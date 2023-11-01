package examen.functions;

import java.util.Scanner;

public class Ejercicio15_Fracciones {
	
	public static int resNum = 0;
	public static int resDen = 0;
	
	public static int leerOpcion() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static int leerFraccion(String opcion) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("introduce su " + opcion + ": ");
		return teclado.nextInt();
	}

	public static String escribirFraccion(int numerador, int denominador) {
		return "" + numerador + "/" + denominador;
	}
	
	public static int calcularMCD(int num1, int num2) {
		int dividendo = (num1 > num2)? num1 : num2;
		int divisor = (num1 < num2)? num1 : num2;
		int resto = dividendo % divisor;
		
		while (resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
		return divisor;
	}
	
	public static int simplificarFraccion(int a, int b) {
		int resultado = a / calcularMCD(a, b);
		return resultado;
	}
	
	public static void sumarFracciones(int n1, int d1, int n2, int d2) {
		resNum = n1 + n2;
		resDen = d1 + d2;
	}

	public static int minimoComunMultiplo(int num1, int num2) {
		return (num1 / calcularMCD(num1, num2)) * num2;
	}
	
	public static void restarFracciones(int n1, int d1, int n2, int d2) {
		int mcm;
		do {
			if (d1 == d2) {
				resNum = n1 - n2;
				resDen = d1;
			} else {
				mcm = minimoComunMultiplo(d1, d2);
				d1 = mcm;
				d2 = mcm;
				n1 = (mcm/d1)*n1;
				n2 = (mcm/d2)*n2;
			}	
		} while (d1 != d2);
		
	}
	
	public static void multiplicarFracciones(int n1, int d1, int n2, int d2) {
		resNum = n1 * n2;
		resDen = d1 * d2;
	}
	
	public static void dividirFracciones(int n1, int d1, int n2, int d2) {
		resNum = n1 * d2;
		resDen = n2 * d1;
	}
		
	public static boolean opcion(int op) {
		int n1=0, d1=0, n2=0, d2=0;
		boolean errorNumDen = true;
		
		
		do {
			if (op >= 1 && op < 5) {
				System.out.print("1ª Fraccion -> ");
				n1 = leerFraccion("numerador");
				
				if (n1 > 0) {
					System.out.print("1ª Fraccion -> ");
					d1 = leerFraccion("denominador");
					
					if (d1 > 0) {
						System.out.print("2ª Fraccion -> ");
						n2 = leerFraccion("numerador");
						
						if (n2 > 0) {
							System.out.print("2ª Fraccion -> ");
							d2 = leerFraccion("denominador");
							errorNumDen = false;
						} 
					} 
				} 
			} else {
				errorNumDen = false;
			}
		} while (errorNumDen);
		
		
		boolean error=false;
			switch(op) {
			case 1:
				sumarFracciones(n1, d1, n2, d2);
				System.out.println("El resultado de sumar " + escribirFraccion(n1 ,d1) + " + " + escribirFraccion(n2, d2) + " = " + escribirFraccion(resNum, resDen));
				break;
			case 2:
				restarFracciones(n1, d1, n2, d2);
				System.out.println("El resultado de restar " + escribirFraccion(n1 ,d1) + " - " + escribirFraccion(n2, d2) + " = " + escribirFraccion(resNum, resDen));
				break;
			case 3:
				multiplicarFracciones(n1, d1, n2, d2);
				System.out.println("El resultado de multiplicar " + escribirFraccion(n1 ,d1) + " * " + escribirFraccion(n2, d2) + " = " + escribirFraccion(resNum, resDen));
				break;
			case 4:
				dividirFracciones(n1, d1, n2, d2);
				System.out.println("El resultado de dividir " + escribirFraccion(n1 ,d1) + " / " + escribirFraccion(n2, d2) + " = " + escribirFraccion(resNum, resDen));
				break;
			case 5:
				System.out.println("Programa finaizado.");
				break;
			default:
				System.err.println("Opción incorrecta, por favor, vuelva a introducir la opción");
				error = true;
				break;
			}
		return error;
		
	}
	
	public static void operarConFracciones() {
		int opcion;
		boolean error;
		do {
			System.out.println("1. Sumar dos fracciones");
			System.out.println("2. Restar dos fracciones");
			System.out.println("3. Multiplicar dos fracciones");
			System.out.println("4. Dividir dos fracciones");
			System.out.println("5. Salir.");
			System.out.print("Selecciona una de las opciones: ");
			opcion = leerOpcion();
			error = opcion(opcion);
		} while (error);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operarConFracciones();
	}

}
