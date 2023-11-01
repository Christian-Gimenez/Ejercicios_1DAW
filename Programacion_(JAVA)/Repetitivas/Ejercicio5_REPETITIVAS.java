import java.util.Scanner;
public class Ejercicio5_REPETITIVAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Desarrollar un programa que solicite la carga de 10 números
		 * e imprima la suma de los últimos 5 valores ingresados.
		 * */
		
		Scanner teclado = new Scanner(System.in);
		int num, suma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if(i >= 5) {
				suma = suma + num;
			}
		}
		
		System.out.println("La suma de los últimos cinco valores ingresados es: " + suma);
	}

}
