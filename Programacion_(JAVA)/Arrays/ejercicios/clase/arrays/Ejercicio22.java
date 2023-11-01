package ejercicios.clase.arrays;

public class Ejercicio22 {
	
	public static boolean esPrimo(int numero) {
		int divisores = 0;
		for(int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores++;
			}
		}
		
		return divisores == 2;
	}
	
	public static int[] generarPrimosDesde(int minimo, int numero) {
		int[] resultado = new int [numero];
		int i = 0;
		int posiblePrimo = minimo;
		
		while(i < numero) {
			if (esPrimo(posiblePrimo)) {
				resultado[i] = posiblePrimo;
				i++;
			}
			posiblePrimo++;
		}
			
			
		/*
		for(int i = minimo; i <= numero && indice < primos.length; i++) {
			//numero sea la cantidad de primos que busco
			if (esPrimo(i)) {
				if (indice < primos.length) {
					primos[indice++] = i;
				}		
			}
		}*/
		return resultado;
	}
	
	public static void print(int [] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primos = generarPrimosDesde
				(100, 300);
		print(primos);
 
	}

}
