package ejercicios.clase.arrays;

public class Ejercicio25BubbleSort {
	
	public static void print(int[] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
		}
	}
	
	public static void ordenar(int[] array) {
		int aux;
		boolean cambios = true;
		for(int i = 0; i < array.length && cambios; i++) {
		//for(int i = 0; i < array.length && cambios; i++) {
			cambios = false;
			//for(int j = 0; j < array.length-1-i; j++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					cambios = true;
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 3, 1, 6, 7, 2, 4, 8 };
		print(array);
		System.out.println();
		ordenar(array);
		System.out.println();
		print(array);
	}

}
