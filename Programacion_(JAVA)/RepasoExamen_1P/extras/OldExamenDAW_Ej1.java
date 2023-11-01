package examen.extras;

import java.util.Scanner;

public class OldExamenDAW_Ej1 {
	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		return sc.nextInt();
	}

	public static void mostrarResultado(int mayor, int menor, int sumaTodos, int sumaPositivos, int sumaNegativos, double media) {
		System.out.println("El Mayor > nº introducido: " + mayor);
		System.out.println("El menor < nº introducido: " + menor);
		System.out.println("La suma de Todos los números = " + sumaTodos);
		System.out.println("La suma de los números (+)Positivos = " + sumaPositivos);
		System.out.println("La suma de los números (-)Negativos = " + sumaNegativos);
		System.out.println("La media aritmética de todos los nº introducidos es = " + media);
	}
	
	public static boolean salir(int n) {
		if (n == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esPositivo(int n) {
		if (n >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esElMayor(int num, int anterior) {
		if (num > anterior) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean eselmenor(int num, int otro) {
		if(num < otro) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double calcularMedia(int sumaTodos, int cantidadNumeros) {
		return (double) sumaTodos / cantidadNumeros;
	}
	
	public static void ejercicio1() {
		int num = 0, sumaPositivos=0, sumaNegativos=0, mayor=0, menor=99999999, sumaTodos=0, cantidadN=0;
		double mediaAritm=0.0;
		System.out.println("Introduce los números a evaluar (-1 para salir del programa).\n");
		
		do {
			num = pedirNumero();
			
			if (!salir(num)) {
				if (esPositivo(num)) {
					sumaPositivos += num;
				} else {
					sumaNegativos += num;
				}
				
				if (esElMayor(num, mayor)) {
					mayor = num;
				}
				
				if(eselmenor(num, menor)) {
					menor = num;
				}
				
				sumaTodos += num;
				cantidadN++;
			}
			
		} while (!salir(num));
		
		mediaAritm = calcularMedia(sumaTodos, cantidadN);
		
		mostrarResultado(mayor, menor, sumaTodos, sumaPositivos, sumaNegativos, mediaAritm);
	}
	
	public static void main(String[] args) {
		/*Crea una aplicación llamada Ejercicio1,
		 * que pedirá números al usuario y cuando
		 * el usuario meta un -1 se terminará el programa.
		 * Al terminar, mostrará lo siguiente:
        	mayor numero introducido
        	menor numero introducido
        	suma de todos los números
        	suma de los números positivos
        	suma de los números negativos
        	media de la suma (de todos los números)
       	  El número -1 no contara como número.
		 * */
		ejercicio1();
	}

}
