package examen.extras;

import java.util.Scanner;

public class OldExamenDAW_Ej3 {
	
	public static char opcion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige qué numeros mostrar de los introducidos");
		System.out.println("\"P\" - Pares");
		System.out.println("\"I\" - Impares");
		System.out.print("\nOpcion -> ");
		return sc.nextLine().charAt(0);
	}
	
	public static int pedirNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("-> ");
		return sc.nextInt();
	}
	
	public static boolean esPar(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void evaluarNumeros() {
		int numero=0;
		String pares="", nones="";
		char opcion = ' ';
		System.out.println("Para parar el programa introducir -> 999");
		while (numero != 999) {
			
			numero = pedirNum();
			if (numero != 999) {
				if (esPar(numero)) {
					pares += numero + " ";
				} else {
					nones += numero + " ";
				}
			}
			
		}
		
		opcion = opcion();
		switch (opcion) {
		case 'i', 'I':
			if (nones != "") {
				System.out.println("Los números IMPARES introducidos fueron:");
				System.out.println(nones);
			} else {
				System.out.println("No había ningún numero IMPAR entre los introducidos.");
			}
			
			break;
		case 'p', 'P':
			if (pares != "") {
				System.out.println("Los números PARES introducidos fueron:");
				System.out.println(pares);
			} else {
				System.out.println("No había ningún numero PAR entre los introducidos.");
			}
			
			break;
		default:
			System.out.println("Ninguna opcion seleccionada, no se imprimirá nada más por pantalla.");
			break;
		}
		System.out.println("Fin del programa.");
		
	}
	
	public static void main(String[] args) {
		/*Realizar un programa que pida al usuario una letra: “i” o “p”.
		 * El programa pedirá números y presentará los números pares
		 * (si se pulsó la “p”) o impares (si se pulsó la “i”).
		 * Si se pulsa alguna tecla distinta a “i” o “p”,
		 * el programa no imprime ningún numero.
		 * El programa dejará de pedir números
		 * en cuanto se introduzca el número 999.
		 * */
		evaluarNumeros();

	}

}
