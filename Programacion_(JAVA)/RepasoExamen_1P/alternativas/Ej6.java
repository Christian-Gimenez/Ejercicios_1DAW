package alternativas;
import java.util.Scanner;
public class Ej6 {

	public static void main(String[] args) {
		//Escribe un programa que pida un número entero entre uno y doce
		//e imprima el número de días que tiene el mes correspondiente.
		Scanner teclado = new Scanner(System.in);
		
		int mes, dias = 0;
		String esBisiesto = "";
		
		System.out.print("Introduce el número de mes: ");
		mes = teclado.nextInt();
		
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias = 31;
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				dias = 30;
				break;
			
			case 2:
				System.out.print("¿Es un año bisiesto? ");
				teclado.nextLine();
				esBisiesto = teclado.nextLine();
				
				
				if (esBisiesto.equalsIgnoreCase("Sí") || esBisiesto.equalsIgnoreCase("Si")) {
					dias = 29;
				} else {
					dias = 28;
				}
				
			break;
			
			default:
				dias = 30;
				break;
		}
		
		System.out.println("Nº días: " + dias);
		
	}

}
