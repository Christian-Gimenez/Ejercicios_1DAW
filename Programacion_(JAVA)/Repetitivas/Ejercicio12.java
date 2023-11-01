import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 10 numeros y mostrar la media
		Scanner teclado = new Scanner(System.in);
		
		double n = 0.0, suma = 0.0, media = 0.0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Introduce un número: ");
			n = teclado.nextInt();
			suma += n;
			if (i == 10) {
				media = suma / i;
			}
		}
		
		System.out.println("La media de los números introducidos es: " + media);
	}

}
