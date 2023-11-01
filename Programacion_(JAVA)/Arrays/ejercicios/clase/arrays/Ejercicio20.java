package ejercicios.clase.arrays;

public class Ejercicio20 {
	
	public static boolean esMayor(int este, int queEste) {
		if (este > queEste) {
			return true;
		}
		return false;
	}
	
	public static int posicionDelMayor(int[] array) {
		int posicionDelMayor = 0;
		int elMayor = array[0];
		for(int i = 1; i < array.length; i++) {
			if (esMayor(array[i], elMayor)) {
				elMayor = array[i];
				posicionDelMayor = i;
			}
		}
		
		return posicionDelMayor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 12, 1434, 5, 12, 5523, 21, 66, 99, 12, 4544, 11231, 12, 533, 1231, 909409, 12, 5435, 1, 58 };
		System.out.println("El mayor se encuentra en la posición [" + posicionDelMayor(numeros) + "] y es el número '" + numeros[posicionDelMayor(numeros)] + "'");
	}

}
