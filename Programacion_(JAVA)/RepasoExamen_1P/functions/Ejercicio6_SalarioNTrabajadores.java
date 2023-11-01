package examen.functions;

import java.util.Scanner;

public class Ejercicio6_SalarioNTrabajadores {
	
	public static double salarioBruto(int horas, double tarifaOrdinaria) {
		double sBruto = 0.0;
		int horasExtras = 0;
		if (horas <= 38) {
			sBruto = horas * tarifaOrdinaria;
		} else {
			sBruto = 38.0 * tarifaOrdinaria;
			horasExtras = horas - 38;
			sBruto += horasExtras * (tarifaOrdinaria * 1.5);
		}
		
		return sBruto;
	}
	
	public static double salarioNeto(double sBruto) {
		double sNeto = 0.0;
		if (sBruto > 50000) {
			sBruto = sBruto - 50000;
			sNeto += 50000;
			
			if (sBruto > 40000) {
				sBruto = sBruto - 40000;
				sNeto += 40000 - (40000 * 0.25);
				
				if (sBruto > 0) {
					sNeto += sBruto - (sBruto * 0.45);
				}
			} else {
				sNeto += sBruto - (sBruto * 0.25);
			}
		} else {
			sNeto += sBruto;
		}
		
		return sNeto;
	}

	public static void main(String[] args) {
		/*Diseñar un programa que obtenga el salario neto de n trabajadores
		de acuerdo a las siguientes premisas:
        Las 38 primeras horas semanales se cobran a la tarifa ordinaria.
        Cualquier hora extra realizada se cobra a 1,5 veces la tarifa ordinaria.
        Las primeras 50.000 pesetas están libres de impuestos.
        Las siguientes 40.000 están sometidas a unas retenciones del 25%
        y las restantes al 45%.
      	Pedir por teclado el n.º de trabajadores,
      	las horas trabajadas y la tarifa ordinaria.
		 * */
		Scanner teclado = new Scanner(System.in);
		int horasSemanales=0, nTrabajadores=0;
		double tarifaOrdinaria = 0.0, salario=0.0;
		
		System.out.print("¿A cuántos trabajadores vas a calcular su sueldo? ");
		nTrabajadores = teclado.nextInt();
		
		System.out.print("¿Cuál es la tarifa ordinaria Pesetas/h? ");
		tarifaOrdinaria = teclado.nextDouble();
		
		for(int i = 1; i <= nTrabajadores; i++) {
			System.out.print("\nIntroduce las horas trabajadas del " + i + "º trabajador: ");
			horasSemanales = teclado.nextInt();
			salario = salarioBruto(horasSemanales, tarifaOrdinaria);
			System.out.println("El salario bruto del " + i + "º trabajador es: " + salario + " Ptas.");
			
			salario = salarioNeto(salario);
			System.out.println("Y su salario Neto es: " + salario + " Ptas.");
			
		}

	}

}
