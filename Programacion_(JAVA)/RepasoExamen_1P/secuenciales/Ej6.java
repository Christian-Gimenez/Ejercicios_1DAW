package secuenciales;
import java.util.*;
public class Ej6 {

	public static void main(String[] args) {
		//Calcular la media de tres números pedidos por teclado.
		Scanner teclado = new Scanner(System.in);
		double num, media = 0;
		for(int i = 1; i <= 3; i++) {
			System.out.print("Introduce el " + i + "º número: ");
			num = teclado.nextDouble();
			media += num;
		}
		media = media / 3;
		System.out.println("La media de los números introducidos es: " + media);
	}

}
