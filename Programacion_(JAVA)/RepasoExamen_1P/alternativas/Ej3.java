package alternativas;
import java.util.Scanner;
public class Ej3 {

	public static void main(String[] args) {
		//Escribe un programa que lea un número e indique si es par o impar.
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " es PAR.");
		} else {
			System.out.println(num + " es IMPAR.");
		}

	}

}
