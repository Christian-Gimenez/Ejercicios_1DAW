package examen.extras;
import java.util.*;
public class ExamenDAM_Ej1 {
	
	/*Implementar una funcion generarPrimoAleatorio
	 * que genera un número primo aleatorio comprendido
	 * entre un valor mínimo y un valor máximo
	 * pasados a la función (ambos positivos).
	 * 
	 * Además la función deberá devolver si existen
	 * o no números primos entre el mínimo y el máximo,
	 * para ello, si no existiesen números primos
	 * entre los valores introducidos, se devolverá un
	 * valor de -1 para el número primo.
	 * 
	 * En el caso
	 * que el valor mínimo sea superior al máximo,
	 * se deberán intercambiar.
	 * Realizar un programa que pruebe la función,
	 * para ello solicitará al usuario los valores
	 * máximo y mínimo y mostrará el resultado.
	 * Realiza las funciones que creas necesarias.*/
	
	public static boolean esPrimo(int num) {
		int divisores=0;
		boolean primo = false;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				divisores++;
			}
		}
		if (divisores <= 2) {
			primo = true;
		}
		return primo;
	}
	
	public static int aleatorio(int num) {
		Random aleatorio = new Random();
		return aleatorio.nextInt(num)+1;
	}
		

	
	public static int cantidadPrimos(int minimo, int maximo) {
		int primos = 0;
		for (int i = minimo; i <= maximo; i++) {
			if (esPrimo(i)) {
				primos++;
			}
		}
		return primos;
	}
	
	public static int generarPrimoAleatorio(int minimo, int maximo) {
		int min = (minimo < maximo)? minimo : maximo;
		int max = (minimo > maximo)? minimo : maximo;
		int aleatorio, primos=0, primoAleatorio=0;
				
		
		if (cantidadPrimos(min, max) != 0) {
			aleatorio = aleatorio(cantidadPrimos(min, max));
			for(int i = min; i <= max; i++) {
				if (esPrimo(i)) {
					primos++;
					if (aleatorio == primos) {
						primoAleatorio = i;
					}
				}
				
			}
			
		} else {
			return -1;
		}
		return primoAleatorio;
		
	}
	
	public static int pedirNum() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int minimo, maximo, primoRandom;
		System.out.print("Introduce el valor mínimo: ");
		minimo = pedirNum();
		
		System.out.print("Introduce el valor máximo: ");
		maximo = pedirNum();
		
		primoRandom = generarPrimoAleatorio(minimo, maximo);
		
		if (primoRandom == -1) {
			System.err.println(primoRandom);
			System.out.println("No hay primos aleatorios en el rango especificado");
		} else {
			System.out.println("El número primo aleatorio generado es: " + primoRandom);
		}
		
	}

}
