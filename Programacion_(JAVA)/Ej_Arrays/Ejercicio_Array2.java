import java.util.Scanner;
public class Ejercicio_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2) Crea un array de números donde le indicamos por teclado el tamaño del array,
		 * rellenaremos el array con números aleatorios entre 0 y 9,
		 * al final muestra por pantalla el valor de cada posición
		 * y la suma de todos los valores.
		 * */
		
		Scanner teclado = new Scanner(System.in);
		int tamArray, indice = 0, suma = 0;
		System.out.print("Indica cuál será el tamaño del array: ");
		tamArray = teclado.nextInt();
		
		int [] array = new int [tamArray];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10);
		}
		
		System.out.println("Array generado aleatoriamente:");
		
		for(int muestra:array) {
			System.out.println("Posición [" + indice + "] valor -> " + muestra);
			indice++;
		}
		
		for(int sumar:array) {
			suma += sumar;
		}
		System.out.println("La suma de todos esos valores da = " + suma);
	}

}
