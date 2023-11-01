import java.util.*;
public class Primo {

	public static void main(String[] args) {
		/*Funcion que devuelva un booleano, que reciba un entero y evalue si es primo*/
		Scanner teclado = new Scanner(System.in);
		int num;
		for(int i = 1; i <= 100; i ++) {
			if (esPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		
		/*
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		if (esPrimo(num)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}*/
		
	}
	
	public static boolean esPrimo(int num) {
		int divisores = 0;
		
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		
		return divisores <= 2;
	}

}
