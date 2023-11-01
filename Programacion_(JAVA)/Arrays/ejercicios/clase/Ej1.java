package ejercicios.clase;

public class Ej1 {
	
	public static boolean esPar(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void invertir(int[] array) {
		int aux;
		int mitad = array.length/2;
		
		for(int i = array.length-1; i >= mitad; i--) {
			//[0][1][2][3]  ->  [3][2][1][0]
			aux = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = aux;
		}
	}
	
	public static void imprimir(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}

	public static void main(String[] args) {
		// Dado el array T de tamaño n. Si el tamaño es par invertir los elementos del array
		int[] enteros = {7, 12, 9, 1, 5, 4};
		if (esPar(enteros.length)) {
			System.out.println("Como la longitud del array es par (" + enteros.length + ") Lo invertimos:");
			invertir(enteros);
		} else {
			System.out.println("Como el array es impar, lo dejamos como está:");
		}
		
		imprimir(enteros);
		}

}
