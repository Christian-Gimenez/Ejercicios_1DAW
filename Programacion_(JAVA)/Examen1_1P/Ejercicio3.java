import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char letra;
		int num;
		boolean esPar = false;
		
		System.out.print("Introduce una letra ('i' para Impar, 'p' para Par): ");
		letra = teclado.nextLine().charAt(0);
		
		do {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if (num % 2 == 0) {
				esPar = true;

			} else {
				esPar = false;

			}
			
			if (letra == 'p' || letra == 'P') {
				if (esPar) {
					System.out.println(num + " es un número PAR");
				}
			}
			
			if (letra == 'i' || letra == 'I') {
				if (!esPar && num != 999) {
					System.out.println(num + " es un número IMPAR");
				}
			}
		} while (num != 999);
		
		System.out.println("FIN DEL PROGRAMA");
	}

}
