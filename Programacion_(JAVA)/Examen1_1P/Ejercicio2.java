import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int operando1, operando2, resultado;
		double division, resultadoDouble, operandoDouble1, operandoDouble2;
		String signoAritmetico = "";
		boolean signoCorrecto = false;
		
		
		System.out.print("Introduce el 1er operando: ");
		operando1 = teclado.nextInt();
		
		System.out.print("Introduce el 2º operando: ");
		operando2 = teclado.nextInt();
		teclado.nextLine();
		
		do {
			System.out.println("Selecciona cúal de las siguientes operaciones aritméticas deseas realizar: ");
			System.out.println("(+) Suma");
			System.out.println("(-) Resta");
			System.out.println("(*) Multiplicación");
			System.out.println("(/) Division");
			System.out.println("(E) Potencia");
			System.out.println("(%) Modulo, resto de la división");
			System.out.print("Opción elegida: ");

			signoAritmetico = teclado.nextLine();
			
			signoCorrecto = true;
			
			operandoDouble1 = operando1;
			operandoDouble2 = operando2;
			
			switch(signoAritmetico) {
			case "+":
				resultado = operando1 + operando2;
				System.out.println("\nEl resultado de sumar " + operando1 + " + " + operando2 + " = " + resultado);
				break;
				
			case "-":
				resultado = operando1 - operando2;
				System.out.println("\nEl resultado de restar " + operando1 + " - " + operando2 + " = " + resultado);
				break;
				
			case "*":
				resultado = operando1 * operando2;
				System.out.println("\nEl resultado de multiplicar " + operando1 + " x " + operando2 + " = " + resultado);
				break;
				
			case "/":
				resultadoDouble = operandoDouble1 / operandoDouble2;
				System.out.println("\nEl resultado de dividir " + operando1 + " / " + operando2 + " = " + resultadoDouble);
				break;
				
			case "E":
			case "e":
				resultadoDouble = Math.pow(operandoDouble1, operandoDouble2);
				System.out.println("\nEl resultado de elevar " + operando1 + "^" + operando2 + " = " + resultadoDouble);
				break;
				
			case "%":
				resultado = operando1 % operando2;
				System.out.println("\nEl resto de dividir " + operando1 + " / " + operando2 + " = " + resultado);
				break;
				
			default:
				signoCorrecto = false;
				System.out.println("\nERROR: Signo aritmético incorrecto.\n");
				
			}
		} while (!signoCorrecto);

	}

}
