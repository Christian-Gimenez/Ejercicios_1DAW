package secuenciales;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
		Scanner teclado = new Scanner(System.in);
		
		double cateto1, cateto2, hipotenusa;
		
		System.out.print("Introduce el primer cateto: ");
		cateto1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo cateto: ");
		cateto2 = teclado.nextInt();
		
		hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		hipotenusa = Math.sqrt(hipotenusa);
		
		System.out.println("La hipotenusa es: " + hipotenusa);
		
	}

}
