package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej13_ContarDigitos {
	
	public static boolean esPrimo(int num) {
		int divisores = 0;
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores ++;
			}
		}
		return divisores == 2;
	}
	
	public static int contarDigitos(int num) {
		int contador = 0;
		while (num != 0) {
			num = num / 10;
			contador ++;
		}
		return contador;
	}
	
	public static void printArray(int[] numeros) {
		for(int valor: numeros) {
			System.out.print(" " + valor + " |");
		}
		System.out.println();
	}
	
	public static int genRandom(int maximo) {
		return (int)(Math.random() * maximo);
	}
	
	public static void rellenarArrayConPrimosRandom(int[] array, int maximo) {
		int i = 0;
		int numero;
		while(i < array.length) {
			numero = genRandom(maximo);
			if (esPrimo(numero)) {
				array[i++] = numero;
			}
		}
	}
	
	public static int[] contarDigitosArray(int[] array) {
		int[] digitos = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			digitos[i] = contarDigitos(array[i]);
		}
		return digitos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayNums[] = new int[10];
		System.out.println("Cual es el número máximo: ");
		int maximo = Teclado.leerInt();
		rellenarArrayConPrimosRandom(arrayNums, maximo);
		int digitos[] = contarDigitosArray(arrayNums);
		System.out.println("El Array tiene los siguientes dígitos: ");
		for(int i = 0; i < digitos.length; i++) {
			System.out.println(arrayNums[i] + " tiene " + digitos[i] + " digitos.");
		}
		

	}

}
