package repaso.examen.arrays;

public class Ej9_DesplazarALaDerecha {
	
	public static void desplazarIzquierda(int[] array) {
		int aux = array[0];
		for(int i = 1; i < array.length; i++) {
			array[i-1] = array[i];
		}
		array[array.length-1] = aux;
	}
	
	public static void desplazarDerecha(int[] array) {
		int aux = array[array.length-1];
		for(int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = aux;
	}
	
	public static void print(int[] array) {
		for(int valor:array) {
			System.out.print("[" + valor + "]");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 12, 6, 3, 7, 9, 13, 58, 9, 10 };
		print(array);
		desplazarIzquierda(array);
		print(array);
		desplazarDerecha(array);
		print(array);

	}

}
