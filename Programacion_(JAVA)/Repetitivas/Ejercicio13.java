import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		/*
		do {
		System.out.print("Dame un numero (entre el [1,10]): ");
		numero = teclado.nextInt();
		} while (numero < 1 || numero > 10);
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
		*/
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i + ":");
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		//Solucion profe
		while (numero <= 10) {
			System.out.println("Tabla del " + numero + ":");
			for (int i = 0; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + numero*i);
			}
			System.out.println();
			numero++;
		}
	}

}
