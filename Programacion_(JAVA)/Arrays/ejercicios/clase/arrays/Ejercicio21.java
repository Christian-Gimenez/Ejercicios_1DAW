package ejercicios.clase.arrays;

public class Ejercicio21 {
	
	public static boolean esPrimo(int numero) {
		int divisores = 0;
		for(int i = 1; i <= numero; i ++) {
			if (numero % i == 0) {
				divisores++;
			}
		}
		if (divisores == 2) {
			return true;
		}
		
		return false;
	}
	
	public static int posicionPrimoMayor(int[] numeros) {
		int posicion = 0;
		int primoMayor = Integer.MIN_VALUE;
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] > primoMayor && esPrimo(numeros[i])) {
				posicion = i;
				primoMayor = numeros[i];
			}
		}
		return posicion;
	}

	public static void main(String[] args) {
		int[] numeros = { 2, 1230, 13, 7777, 5, 26, 8888, 90, 11, 88997 };
		int posicion = posicionPrimoMayor(numeros);
		System.out.println("El primo mayor es el '" + numeros[posicion] + "' situado en la posición [" + posicion + "].");

	}

}
