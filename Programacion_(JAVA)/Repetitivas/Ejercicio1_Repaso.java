import java.util.Scanner;

public class Ejercicio1_Repaso {

	public static void main(String[] args) {
		/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
		 * Suponiendo todos los meses de 30 días.*/
		Scanner teclado = new Scanner(System.in);
		boolean trueDay, trueMonth, trueYear;
		
		do {
			System.out.print("Dime el día: ");
			int day = teclado.nextInt();
			
			System.out.print("Dime el mes: ");
			int month = teclado.nextInt();
			
			System.out.print("Dime el año: ");
			int year = teclado.nextInt();
			
			if(day > 0 && day <= 30) {
				trueDay = true;
			} else {
				trueDay = false;
				System.out.println("El día introducido es incorrecto");
			}
			
			if(month > 0 && month <= 12) {
				trueMonth = true;
			} else {
				trueMonth = false;
				System.out.println("El mes introducido es incorrecto");
			}
			
			if(year != 0) {
				trueYear = true;
			} else {
				trueYear = false;
				System.out.println("El año introducido es incorrecto");
			}
			
			if(trueDay == true && trueMonth == true && trueYear == true) {
				System.out.println("La fecha introducida es CORRECTA :)");
				
				if(day == 30) {
					day = 1;
					month++;
					
					if(month == 13) {
						month = 1;
						year++;
					}
				} else {
					day++;
				}
				
				if(year < 0) {
					System.out.println("El día siguiente a esa fecha es: " + day + "/" + month + "/" + (year*-1) + " A.C.");
				} else {
					if(year == 0) {
						year = 1;
					}
					System.out.println("El día siguiente a esa fecha es: " + day + "/" + month + "/" + year + " D.C.");

				}
			}
			
		} while (trueDay == false || trueMonth == false || trueYear == false);
		
		
		
	}

}
