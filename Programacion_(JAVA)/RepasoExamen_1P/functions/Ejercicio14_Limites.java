package examen.functions;

import java.util.Scanner;

public class Ejercicio14_Limites {
	
	public static int leerNum() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static int intercambiarVariables(int a, int b) {
		int c = a;
		a = b;
		b = c;
		return a;
	}

	public static boolean numeroFueraDelIntervalo(int minimo, int maximo, int numero) {
		if (numero >= minimo && numero <= maximo) {
			return false;
		} else {
			return true;
		}
	}
	
	public static int leerLimitesDelIntervalo() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static boolean comprobarLimites(int minimo, int maximo, int numero) {
		if (numero == minimo || numero == maximo) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		/*Crear un programa que pida el límite inferior
		 * y el límite superior de un intervalo.
		 * Si el límite inferior es mayor que el superior,
		 * intercambiar las variables.
		 * A continuación se irán pidiendo números enteros positivos
		 * hasta que se introduzca un número negativo.
		 * Al terminar se mostrará la siguiente información:
		 * 
        ◦ Cantidad de números dentro del intervalo abierto.
        ◦ ¿Se ha introducido algún número igual a alguno de los límites del intervalo?
        ◦ Algunas funciones que puedes utilizar son las siguientes:
            ▪ leerLimitesDelIntervalo (Lee los dos límites)
            ▪ intercambiarVariables(Intercambia el valor de las dos variables)
            ▪ numeroFueraDelIntervalo (Indica si el número está fuera del intervalo.
            ▪ comprobarLimites (Te dice si el n.º introducido es igual a alguno de los límites).
          Si piensas en alguna otra función no dudes en utilizarla.
		 * */
		int inferior, superior, dentro=0, fuera=0, igualALimites=0, num;
		boolean fallo, igual=false;
		
		do {
			fallo = false;
			System.out.println("Introduce el límite inferior:");
			inferior = leerLimitesDelIntervalo();
			
			System.out.println("Introduce el límite superior:");
			superior = leerLimitesDelIntervalo();
			
			if (inferior > superior) {
				int aux = inferior;
				inferior = intercambiarVariables(inferior, superior);
				superior = intercambiarVariables(superior, aux);
			} else if (inferior == superior) {
				System.out.println("ERROR. Los límites no pueden ser iguales.");
				fallo = true;
			}
		} while (fallo);
		
		System.out.println("Introdzca los números a evaluar (para salir del programa introduzca un nº Negativo)");
		
		do {
			System.out.println("Introduce un número: ");
			num = leerNum();
			if (num > 0) {
				if (numeroFueraDelIntervalo(inferior, superior, num)) {
					fuera++;
				} else {
					dentro++;
				}
				
				if (comprobarLimites(inferior, superior, num)) {
					igual = true;
					igualALimites++;
				}
			}
			
		} while (num > 0);
		
		System.out.println("Se han introducido " + dentro + " números entre " + inferior + " y " + superior);
		
		if (igual) {
			System.out.println("Se han introducido " + igualALimites + " números igual a alguno de los límites");
		} else {
			System.out.println("No se introdujeron números igual a alguno de los límites");
		}
		
		System.out.println("Y se han introducido " + fuera + " números fuera del intervalo");

	}

}
