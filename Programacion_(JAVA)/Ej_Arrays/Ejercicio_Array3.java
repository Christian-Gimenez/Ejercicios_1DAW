import java.lang.reflect.Array;
import java.util.*;
public class Ejercicio_Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crea un array de números de un tamaño pasado por teclado,
		 * el array contendrá números aleatorios primos entre los números deseados,
		 * por último nos indica cual es el mayor de todos.
		 * Haz un método para comprobar que el número aleatorio es primo,
		 * puedes hacer todos lo métodos que necesites.
		 * */
		Scanner teclado = new Scanner(System.in);
		int tamArray1, tamArray2, numPrimo;
		boolean esPrimo = false;
		
		System.out.print("Indica el tamaño de la primera dimensión del array: ");
		tamArray1 = teclado.nextInt();
		System.out.print("Indica el tamaño de la segunda dimensión del array: ");
		tamArray2 = teclado.nextInt();
		
		int array[][] = new int [tamArray1][tamArray2];
		
		for(int i = 0; i < array.length; i++) {
			for(int x = 0; i < array[0].length; i++) {
				
				do {
					numPrimo = (int)(Math.random()*100);
					
					if (numPrimo == 0 || numPrimo == 1 || numPrimo == 4) {
						esPrimo = false;
						} else {
							for (int z = 2; z < numPrimo / 2; z++) {
								if (numPrimo % z == 0) {
									esPrimo = false;
								} else if (numPrimo != 0) {
									esPrimo = true;
								}
						}
					}
				} while (esPrimo == false);
				
				array[i][x] = numPrimo;
			}
		}
		
		for (int h = 0; h < array.length; h++) {
			System.out.println("Col: " + h);
			for (int y = 0; y < array[h].length; y++) {
				System.out.print(array[h][y] + " ");
			}
			System.out.println();
		}
		
		/*
		for(int [] mostrar:array) {
			System.out.println(mostrar);
		}*/
		
		
		
	}

}
