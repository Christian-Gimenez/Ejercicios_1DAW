package ejercicios.clase.arrays;

public class Ejercicio17 {
	
	public static boolean esMasGrande(int a, int b) {
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String buscarNumeroMasGrande(int[] array) {
		int masGrande = array[0];
		int posicion = 0;
		
		for(int i = 1; i < array.length; i++) {
			if(esMasGrande(array[i], masGrande)) {
				masGrande = array[i];
				posicion = i;
			}
		}
		
		return "El número más grande es el '" + masGrande + "' ubicado en la posición [" + posicion + "]";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 324, 56, 1230, 544, 56, -1, 3435, 12, 123 };
		System.out.println(buscarNumeroMasGrande(array));
	}

}
