package ejercicios.casa;

public class Ejercicio4 {
	
	public static void array1al100(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (i+1);
		}
	}
	
	public static int sumaArray(int[] array) {
		int resultado = 0;
		for(int i = 0; i < array.length; i++) {
			resultado += array[i];
		}
		return resultado;
	}

	public static void main(String[] args) {
		/*Crea un array de números de 100 posiciones,
		 * que contendrá los números del 1 al 100.
		 * Obtén la suma de todos ellos y la media.
		*/
		int[] unoAlCien = new int[100];
		int suma=0;
		double media = 0.0;
		array1al100(unoAlCien);
		suma = sumaArray(unoAlCien);
		media = suma / unoAlCien.length;
		System.out.println("La suma del array:");
		for(int i = 0; i < unoAlCien.length; i++) {
			if (i == (unoAlCien.length - 1)) {
				System.out.print(unoAlCien[i] + " = ");
			} else {
				System.out.print(unoAlCien[i] + " + ");
			}
		}
		System.out.print(suma + "\n");
		System.out.println("Y la media es: " + media);
	}

}
