package repetitivas;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
		 * Suponiendo todos los meses de 30 días.*/
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anyo;
		boolean fechaCorrecta = false;
		
		do {
			System.out.println("Introduce una fecha en formato DD/MM/AAAA");
			System.out.print("-Dia: ");
			dia = teclado.nextInt();
			
			if(dia >= 1 && dia <= 30) {
				System.out.print("-Mes: ");
				mes = teclado.nextInt();
				
				if (mes >= 1 && mes <= 12) {
					System.out.print("-Año: ");
					anyo = teclado.nextInt();
					
					if (anyo < 0) {
						System.out.println("La fecha introducida es correcta :) " + dia + "/" + mes + "/" + Math.abs(anyo) + " A.C.");
						fechaCorrecta = true;
					} else if (anyo > 0) {
						System.out.println("La fecha introducida es correcta :) " + dia + "/" + mes + "/" + anyo);
						fechaCorrecta = true;
					} else {
						System.out.println("\nError: El año introducido no es válido.\n");
					}
				} else {
					System.out.println("\nError: El mes introducido no es válido.\n");
				}
				
			} else {
				System.out.println("\nError: El día introducido no es válido.\n");
			}
		} while (fechaCorrecta == false);
		
	}

}
