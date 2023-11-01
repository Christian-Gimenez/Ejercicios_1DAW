package repetitivas;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		/*Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente
		 *  Suponer que todos los meses tienen 30 días.*/
		Scanner teclado = new Scanner(System.in);
		int dia = 0, mes = 0, anyo = 0;
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
						fechaCorrecta = true;
					} else if (anyo > 0) {
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
		
		if (fechaCorrecta) {
			dia++;
			if (dia == 31) {
				dia = 1;
				mes++;
				if(mes == 13) {
					mes = 1;
					anyo++;
					if (anyo == 0) {
						anyo = 1;
					}
				}
			}
			if (anyo < 0) {
				System.out.println("La fecha introducida es correcta :) el día siguiente sería: " + dia + "/" + mes + "/" + Math.abs(anyo) + " A.C.");
				fechaCorrecta = true;
			} else if (anyo > 0) {
				System.out.println("La fecha introducida es correcta :) el día siguiente sería: " + dia + "/" + mes + "/" + anyo);
				fechaCorrecta = true;
			}
		}
		
		

	}

}
