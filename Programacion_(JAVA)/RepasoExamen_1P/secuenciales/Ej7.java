package secuenciales;
import java.util.Scanner;
public class Ej7 {

	public static void main(String[] args) {
		/*Realiza un programa que reciba una cantidad de minutos
		 *y muestre por pantalla a cuantas horas y minutos corresponde.
		 *Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
		 * */
		Scanner teclado = new Scanner(System.in);
		
		int minutosIntroducidos, horas, minutos;
		
		System.out.print("Introduce la cantidad de minutos: ");
		minutosIntroducidos = teclado.nextInt();
		
		horas = minutosIntroducidos / 60;
		minutos = minutosIntroducidos % 60;
		
		System.out.println(minutosIntroducidos + " minutos son: " + horas + " horas y " + minutos + " minutos.");

	}

}
