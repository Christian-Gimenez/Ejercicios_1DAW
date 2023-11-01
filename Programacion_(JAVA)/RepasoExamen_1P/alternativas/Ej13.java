package alternativas;
import java.util.Scanner;
public class Ej13 {

	public static void main(String[] args) {
		//Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta.
		Scanner teclado = new Scanner(System.in);
		
		int day, month, year;
		
		System.out.println("Introduce una fecha en formato DD/MM/AAAA");
		System.out.print("-Introduce el día: ");
		day = teclado.nextInt();
		
		System.out.print("-Introduce el mes: ");
		month = teclado.nextInt();
		
		System.out.print("-Introduce el año: ");
		year = teclado.nextInt();
		
		if (day > 0 &&  day <= 30) {
			if (month > 0 && month <= 12) {
				if (year > 0) {
					System.out.println("La fecha introducida es correcta :) " + day + "/" + month + "/" + year);
				} else {
					System.out.println("Error: FECHA INCORRECTA. El año introducido no es válido.");
				}
			} else {
				System.out.println("Error: FECHA INCORRECTA. El mes introducido no es válido.");
			}
		} else {
			System.out.println("Error: FECHA INCORRECTA. El día introducido no es válido.");
		}
	}

}
