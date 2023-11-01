package repaso.examen.arrays;

import java.util.Scanner;

import daw.com.Teclado;

public class Ej1_SaldoTarjeta {
	
	public static void printDecimales(double numero, int cantDecimales, int cantCeros, char simbolo) {
		String ceros = "";
		for(int i = 0; i < cantCeros; i++) {
			ceros += " ";
		}
		System.out.print(" ");
		System.out.printf("%." + cantDecimales + "f", numero);
		System.out.print(simbolo + ceros);
		
	}
	
	public static int calcularCantidadCeros(double valorArray, int cantidadMinima) {
		if (valorArray < cantidadMinima) {
			return 1;
		}
		return 0;
	}
	
	public static void printTabla(double[][] tabla) {
		int cantCeros = 0;
		int meses = cantidadCuotas(tabla);
		System.out.println(" Mes Cuota | Saldo Deudor | TiN   | Intereses | Cuota");
		for(int i = 0; i < tabla.length && i < meses ; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				switch(j) {
				case 0:
					cantCeros = calcularCantidadCeros(tabla[i][j], 10) + 6;
					printDecimales(tabla[i][j], 0, cantCeros, ' ');
					System.out.print(" |");
					break;
				case 1:
					cantCeros = calcularCantidadCeros(tabla[i][j], 1000) + 4;
					printDecimales(tabla[i][j], 2, cantCeros, '€');
					System.out.print(" |");
					break;
				case 2:
					printDecimales(tabla[i][j], 2, -1, '%');
					System.out.print(" |");
					break;
				case 3:
					cantCeros = calcularCantidadCeros(tabla[i][j], 10) + 3;
					printDecimales(tabla[i][j], 2, cantCeros, '€');
					System.out.print(" |");
					break;
				case 4:
					printDecimales(tabla[i][j], 2, -1, '€');
					break;
				}
			}
			System.out.println();
		}
	}
	
	public static double leerDouble() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextDouble();
	}
	
	public static double[][] pedirDatosPrestamo() {
		double[][] prestamo = new double[14][5];
		
		System.out.print("Introduce el total del prestamo concedido: ");
		prestamo[0][1] = leerDouble();
		
		System.out.print("Introduce el Tipo de Interes: ");
		prestamo[0][2] = calcularTipoInteresMensual(leerDouble(), 12);
		
		System.out.print("Introduce la cuota a pagar mensualmente: ");
		prestamo[0][4] = leerDouble();
		
		primerMes(prestamo);
		
		return prestamo;
	}
	
	public static double calcularTipoInteresMensual(double interes, int meses) {
		return interes / meses;
	}
	
	public static void primerMes(double[][] prestamo) {
		prestamo[0][0] = 1;
		prestamo[0][3] = (prestamo[0][1] * prestamo[0][2]) / 100;
	}
	
	public static int cantidadCuotas(double[][] prestamo) {
		int contador = 0;
		for(int i = 0; i < prestamo.length; i++) {
			if (prestamo[i][0] != 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void calcularCuotasPrestamo(double[][] prestamo) {
		boolean liquidado = false;
		for(int i = 1; i < prestamo.length && !liquidado; i++) {
			//Aumentamos mes cuota
			prestamo[i][0] = i + 1;
			//Calculamos el Saldo deudor = (los intereses del mes pasado + el anterior saldo deudor) - la cuota anterior
			prestamo[i][1] = (prestamo[i-1][3] + prestamo[i-1][1]) - prestamo[i-1][4];
			
			//Si el saldo deudor es menor a la cuota anterior
			if(prestamo[i][1] <= prestamo[i-1][4]) {
				//La cuota es el saldo deudor restante
				prestamo[i][4] = prestamo[i][1];
				//System.out.println("LIQUIDADO");
				liquidado = true;
			} else {
				//Si no, la cuota es la misma que la del mes pasado
				prestamo[i][4] = prestamo[i-1][4];
			}
			//El TiN se mantiene todos los meses
			prestamo[i][2] = prestamo[i-1][2];
			//Los intereses son = (el saldo deudor actual * el tipo TiN actual) / 100
			prestamo[i][3] = (prestamo[i][1] * prestamo[i][2]) / 100;
		}
	}

	public static void main(String[] args) {
		double[][] prestamo = pedirDatosPrestamo();
		calcularCuotasPrestamo(prestamo);
		printTabla(prestamo);
		
		
		
		
	}

}
