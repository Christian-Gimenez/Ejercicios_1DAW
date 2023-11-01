import java.util.Scanner;
public class Ejercicio2 {
	
	public static double salario(double tarifaOrdinaria, int hExtras) {
		double libreImp= 0, imp25 = 0, imp45 = 0, sNeto = 0;
		double sBruto = 38 * tarifaOrdinaria;
		sBruto += hExtras * (tarifaOrdinaria * 1.5);
		if (sBruto >= 50000) {
			libreImp = 50000;
			sBruto = sBruto - libreImp;
			
			if (sBruto >= 40000) {
				imp25 = 40000 - (40000 * 0.25);
				sBruto = sBruto - imp25;
				
				imp45 = sBruto - (sBruto * 0.45);
				
				sNeto = libreImp + imp25 + imp45;
			}
		} else {
			sNeto = sBruto;
		}

		return (Math.round(sNeto * 100.0)/100.0);
	}

	public static void main(String[] args) {
		/*Diseñar un programa que obtenga el salario neto de
		 * n trabajadores de acuerdo a las siguientes premisas:
		 * -Las 38 primeras horas semanales se cobran a la tarifas
		 * ordinarias.
		 * -Cualquier hora extra realizada se cobra a 1.5 veces
		 * la tarifa ordinaria.
		 * Las primeras 50000 pesetas están libres de impuestos.
		 * Las siguientes 40000 están sometidas a unas
		 * retenciones del 25% y las restantes al 45%.
		 * 
		 *Pedir por teclado el número de trabajadores y
		 *la tarifa ordinaria*/
		Scanner teclado = new Scanner(System.in);
		double tarifa;
		int nTrabajadores, hExtras;
		
		System.out.print("Introduce el número de trabajadores: ");
		nTrabajadores = teclado.nextInt();
		
		System.out.print("Introduce la tarifa ordinaria: ");
		tarifa = teclado.nextDouble();
		
		for(int i = 1; i <= nTrabajadores; i++) {
			System.out.print("Nº Horas extras del " + i + "º trabajador: ");
			hExtras = teclado.nextInt();
			System.out.println("El salario del " + i + "º trabajador es: " + salario(tarifa, hExtras) + " Pesetas\n");
		}
	}

}
