package alternativas;
import java.util.Scanner;
public class Ej18 {

	public static void main(String[] args) {
		/*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
		 * Si introducimos otro número nos da un error.*/
		Scanner teclado = new Scanner(System.in);
		int dia, diaSiguiente = 0;
		
		System.out.print("Introduce un día de la semana: ");
		dia = teclado.nextInt();
		
		if (dia < 1 || dia > 7) {
			System.err.println("ERROR: Introduce un día de la semana válido (1-7)");
		} else {
			diaSiguiente = dia;
			if (dia == 7) {
				diaSiguiente = 1;
			} else {
				diaSiguiente++;
			}
		}
		
		System.out.println("El día siguiente será el día " + diaSiguiente + " de la semana.");
	}

}
