package ejercicios.clase.arrays;

public class Ejercicio4 {
	
	public static int[] mezclarRamon(int[] a, int[] b) {
		int[] union = new int[a.length + b.length];

		for(int i = 0; i < union.length; i=i+6) {
			for(int j = 0; j < 3; j++) {
				union[i + j] = a[(i / 6)* 3 + j];
				union[i+j+3] = b[(i / 6) * 3 + j];
			}
		}
		
		return union;
	}
	
	public static int[] mezclar(int[] array1, int[] array2) {
		int[] arrayMezcla = new int[array1.length + array2.length];
		int contador = 0, iArray1=0, iArray2=0;
		for(int i = 0; i < arrayMezcla.length; i++) {
			if (contador <= 3) {
				arrayMezcla[i] = array1[iArray1++];
			} else if (contador <= 6) {
				arrayMezcla[i] = array2[iArray2++];
			} else {
				contador = 0;
			}
			contador++;
		}
		return arrayMezcla;
	}

	public static void main(String[] args) {
		/*Leer los datos correspondientes a dos tablas de
		 * 12 elementos numéricos y mezclarlos en una tercera
		 * de la forma:
		 * 3 de la tabla A, 3 de la B,
		 * otros 3 de la A, otros 3 de la B, etc...
		 * */
		int[] tabla1 = new int[12];
		int[] tabla2 = new int[12];
		int[] metaTabla = new int[tabla1.length + tabla2.length];
		
		for(int i = 0; i < tabla1.length && i < tabla2.length; i++) {
			tabla1[i] = i + 1;
			tabla2[i] = i + 10;
		}
		
		System.out.print("Tabla 1: ");
		for(int i = 0; i < tabla1.length; i++) {
			System.out.print("[" + tabla1[i] + "]");
		}
		
		System.out.print("\nTabla 2: ");
		for(int num:tabla2) {
			System.out.print("[" + num + "]");
		}
		
		metaTabla = mezclar(tabla1, tabla2);
		
		System.out.println("\nTabla mezclando las anteriores de 3 en 3: ");
		for(int n:metaTabla) {
			System.out.print("[" + n + "]");
		}
		
	}

}
