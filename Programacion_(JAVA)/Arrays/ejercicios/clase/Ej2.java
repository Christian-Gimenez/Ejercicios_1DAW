package ejercicios.clase;

public class Ej2 {
	
	public static int minimo(int[] array) {
		//int resultado = Integer.MAX_VALUE;
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int maximo(int[] array) {
		//int resultado = Integer.MIN_VALUE;
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static void intercambiar(int[] a, int[] b) {
		int menor = minimo(a);
		int mayor = maximo(b);
		reemplazar(a, menor, mayor);
		reemplazar(b, mayor, menor);
	}
	
	public static void print(int[] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
		}
	}
	
	public static void reemplazar(int[] array, int este, int porEste) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == este) {
				array[i] = porEste;
			}
		}
	}

	public static void main(String[] args) {
		// Dadas dos matrices A y B intercambiar los mínimos de A con los máximos de B
		
		int[] a = {1, 224, 128, 1};
		int[] b = {5, 78, 2, 2, 78};
		intercambiar(a, b);
		System.out.println("Valor de A:");
		print(a);
		System.out.println("\nValor de B:");
		print(b);
	}

}
