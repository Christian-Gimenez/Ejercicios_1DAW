package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej15_GenNumPrimos {
	
	public static void print(int[] array) {
		for(int i = 0; i < array.length && array[i] != 0; i++) {
			System.out.print(" " + array[i] + " |");
		}
		System.out.println();
	}
	
	public static boolean comprobarSi(int desdeEsMenor, int queHasta) {
		return desdeEsMenor < queHasta;
	}
	
	public static void primosDesde(int[] array, int desde, int hasta) {
		int i = 0;
		int hastaAqui = (comprobarSi(desde, hasta))? hasta : desde;
		int posiblePrimo = (comprobarSi(desde, hasta))? desde : hasta;
		while (posiblePrimo <= hastaAqui && i < array.length) {
			if (esPrimo(posiblePrimo)) {
				array[i++] = posiblePrimo;
			}
			posiblePrimo++;
		}
	}
	
	public static boolean esPrimo(int num) {
		int divisores = 0;
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		return divisores == 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Longitud del array: ");
		int[] primos = new int[Teclado.leerInt()];
		
		System.out.print("Número de inicio: ");
		int desde = Teclado.leerInt();
		
		System.out.print("Número de fin: ");
		int hasta = Teclado.leerInt();
		
		primosDesde(primos, desde, hasta);
		if (primos[0] != 0) {
			print(primos);
		} else {
			System.out.println("No hay números primos entre " + desde + " y " + hasta);
		}
	}

}
