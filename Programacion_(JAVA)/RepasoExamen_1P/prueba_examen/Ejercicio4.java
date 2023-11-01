package prueba_examen;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		/*Escribir un programa que solicite por el teclado un mes (1 a 12)
		 * y un año de nuestro siglo (entre 2000 y 2099 ambos incluidos)
		 * y muestre por pantalla el número de días de ese mes.
		 * Debe tenerse presente los años bisiestos.
		 * Son bisiestos todos los años que son múltiplos de 4 excepto aquellos que además son múltiplos de 100 y no lo son de 400.
		 * */
		
		Scanner teclado = new Scanner(System.in);
		int month, year, days = 0;
		boolean error = false;
		
		do {
			System.out.print("Introduce un mes (1-12): ");
			month = teclado.nextInt();
			
			System.out.print("Introduce un año de nuestro siglo (2000-2099): ");
			year = teclado.nextInt();
			
			if ((month < 1 || month > 12) || (year < 2000 || year > 2099)) {
				System.out.println("\nERROR. Por favor introduce los datos de nuevo.\n");
			}
			
		} while ((month < 1 || month > 12) || (year < 2000 || year > 2099));

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			days = 31;
			break;
			
		case 4, 6, 9, 11:
			days = 30;
			break;
		
		case 2:
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		default:
			error = true;
		}
		
		if (error == false) {
			System.out.println("El mes " + month + "/" + year + " tiene " + days + " días");
		} else {
			System.err.println("ERROR");
		}
		
	}

}
