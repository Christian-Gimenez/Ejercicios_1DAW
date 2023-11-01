import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer si un nº es positivo o negativo
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int numero = teclado.nextInt();
		
		if (numero < 0) {
			System.out.println("El número '" + numero + "' es negativo");
		} else {
			if (numero == 0) {
				System.out.println("El número '" + numero + "' es neutro");
				
			} else {
				System.out.println("El número '" + numero + "' es positivo");
			}
			
		}
		
	}

}
