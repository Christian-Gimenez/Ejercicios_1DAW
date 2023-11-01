import java.util.Scanner;
public class Ejercicio_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el indice y el valor al que corresponde.
		 * Haz dos métodos, uno para rellenar valores y otro para mostrar.
		 * */		
		Scanner teclado = new Scanner(System.in);
		int [] array = new int [10];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Introduce un número: ");
			array[i] = teclado.nextInt();
		}
		
		for (int z = 0; z < 10; z++) {
			System.out.println("Indice \"" + z + "\" valor: " + array[z]);
		}
		
		/*
		System.out.println("Y en formato tabla:");
		for(int x:array) {
			System.out.print(array[x] + " ");
		} */
		
	}

}
