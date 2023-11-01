package secuenciales;
import java.util.Scanner;
public class Ej20 {

	public static void main(String[] args) {
		/*Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
		 * después de pedirnos cuantas monedas tenemos
		 * (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).
		*/
		Scanner teclado = new Scanner(System.in);
		
		//Declarar variables necesarias
		int dosEur, unEur, cincuentaCent, veinteCent, diezCent, eurosTotales, centimosTotales;
		
		
		//Pedir monedas al usuario
		System.out.print("Introduce las monedas de 2 €: ");
		dosEur = teclado.nextInt();
		
		System.out.print("Introduce las monedas de 1 €: ");
		unEur = teclado.nextInt();
		
		System.out.print("Introduce las monedas de 50 centimos: ");
		cincuentaCent = teclado.nextInt();
		
		System.out.print("Introduce las monedas de 20 centimos: ");
		veinteCent = teclado.nextInt();
		
		System.out.print("Introduce las monedas de 10 centimos: ");
		diezCent = teclado.nextInt();
		
		
		centimosTotales = (cincuentaCent * 50) + (veinteCent * 20) + (diezCent * 10);
		
		eurosTotales = dosEur + unEur + (centimosTotales / 100);
		centimosTotales = centimosTotales % 100;
		
		System.out.println("Tienes un total de: " + eurosTotales + " € con " + centimosTotales + " centimos.");
	}

}
