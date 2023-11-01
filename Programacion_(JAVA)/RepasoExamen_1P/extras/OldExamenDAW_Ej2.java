package examen.extras;

import java.util.Scanner;

public class OldExamenDAW_Ej2 {
	
	public static void menuCalc() {
		System.out.println("""
		------MENU CALCULADORA------
		+: Suma los dos operandos.
		-: Resta los operandos.
		*: Nultiplica los operandos.
		/: Divide los operandos, este debe dar un resultado con decimales (double)
		E: 1º operando como base y 2º como exponente.
		%: Módulo, resto de la división entre operando1 y operando2
				""");
	}
	
	public static int pedirOperando(int i) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el " + i + "º operando: ");
		return teclado.nextInt();
	}
	
	public static char pedirSigno() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("-> ");
		return teclado.nextLine().charAt(0);
	}
	
	public static int sumar(int sumando1, int sumando2) {
		return sumando1 + sumando2;
	}
	
	public static int restar(int minuendo, int sustraendo) {
		return minuendo - sustraendo;
	}
	
	public static int multiplicar(int multiplicando, int multiplicador) {
		return multiplicando * multiplicador;
	}
	
	public static double dividirCociente(double dividendo, double divisor) {
		return dividendo / divisor;
	}
	
	public static int potencia(int base, int exponente) {
		int resultado = base;
		
		if (exponente == 1) {
			return base;
		}
		
		if (exponente == 0) {
			return 1;
		}
		
		for (int i = 2; i <= exponente; i++) {
			resultado *= base;
		}
		
		return resultado;
	}
	
	public static int dividirResto(int dividendo, int divisor) {
		return dividendo % divisor;
	}

	public static void calculadora() {
		int op1, op2, resultadoInt=0;
		double op1D, op2D, resultadoDouble=0.0;
		char signo = ' ';
		boolean opcionCorrecta, numReal=false;
		System.out.println("Bienvenido a la calculadora de JAVA");
		op1 = pedirOperando(1);
		op2 = pedirOperando(2);
		
		do {
			opcionCorrecta = true;
			menuCalc();
			signo = pedirSigno();
			switch(signo) {
			case '+':
				resultadoInt = sumar(op1, op2);
				break;
			case '-':
				resultadoInt = restar(op1, op2);
				break;
			case '*':
				resultadoInt = multiplicar(op1, op2);
				break;
			case '/':
				op1D = op1;
				op2D = op2;
				resultadoDouble = dividirCociente(op1D, op2D);
				numReal = true;
				break;
			case 'E', 'e':
				resultadoInt = potencia(op1, op2);
				break;
			case '%':
				resultadoInt = dividirResto(op1, op2);
				break;
			default:
				opcionCorrecta = false;
				System.err.println("Error de signo: por favor, introduzca el signo correctamente.");
				break;
			}
			
		} while (!opcionCorrecta);
		
		if (numReal || signo == 'e' || signo == 'E') {
			if (signo == '/') {
				System.out.println("RESULTADO: " + op1 + " " + signo + " " + op2 + " = " + resultadoDouble);
			} else {
				System.out.println("RESULTADO: " + op1 + "^" + op2 + " = " + resultadoInt);
			}
		} else {
			System.out.println("RESULTADO: " + op1 + " " + signo + " " + op2 + " = " + resultadoInt);
		}
		

	}
	
	public static void main(String[] args) {
		/*Crea una aplicación llamada Ejercicio2,
		 * nos pedirá 2 operandos (int) y un signo aritmético (String),
		 * según este último se realizara la operación correspondiente.
		 * Al final mostrará el resultado en un cuadro de diálogo.
	       Los signos aritméticos disponibles son:
	         +: suma los dos operandos.
	         -: resta los operandos.
	         *: multiplica los operandos.
	         /: divide los operandos, este debe dar un resultado con decimales (double)
	         E: 1º operando como base y 2º como exponente.
	         %: módulo, resto de la división entre operando1 y operando2
		   Si no se introduce un signo correcto,
		   se informará al usuario y se volverá a pedir.
   		*/
		calculadora();

	}

}
