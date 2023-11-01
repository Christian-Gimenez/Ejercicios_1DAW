package ejercicios.arraysbidimensionales;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ej_SaldoTarjeta {

	public static void main(String[] args) {
		// Pedimos un prestamo de 1500€ en 12 meses. Calcular cuanto pagaremos al mes.
		// Con un interes de 14,06%
		
		//El primer mes:
		//14,06 / 12 = 1,17 Tipo de interes mensual
		//(1500 * 1,17) / 100 = 17,56 Intereses generados el primer mes
		//Pagaremos mensualmente 134,72€
		
		//El segundo mes, sumar los intereses generados + 1500 - la cuota mensual
		//(17,56 + 1500) - 134,72 = 1382,86€
		
		//Debemos realizar la matriz:
		//Saldo deudor | TiN | Intereses | Cuota
		
		//MOSTRAR NUM CUOTAS NECESITADAS PARA PAGARLO Y SUMARLAS PARA VER CUANTO NOS SALE
		
		
		//Y para la última, cuando el saldo deudor < que la cuota, liquidamos
		Scanner teclado = new Scanner(System.in);
		double saldoDeudor=0.0, tipoDeInteres = 0.0, cuota= 0.0, tin = 0.0;
		int i = 0;
		
		System.out.print("¿Cuál es el saldo deudor de la tarjeta? ");
		saldoDeudor = teclado.nextDouble();
		System.out.print("¿Cuál es el interes de tu tarjeta? ");
		tipoDeInteres = teclado.nextDouble();
		System.out.print("¿Cuál es la cuota en la que vas a pagar? ");
		cuota = teclado.nextDouble();
		
		tin = tipoDeInteres / 12;
		
		double[][] liquidacionTarjeta = new double [360][5];
		boolean fin = false;
		for(i = 0; i < liquidacionTarjeta.length && !fin; i++) {
			
			//Mes Cuota
			liquidacionTarjeta[i][0] = i+1;
			
			//Saldo Deudor
			if (i == 0) {
				liquidacionTarjeta[i][1] = saldoDeudor;
			} else {
				liquidacionTarjeta[i][1] = (liquidacionTarjeta[i-1][1] + liquidacionTarjeta[i-1][3]) - cuota;
			}
			
			//TiN
			liquidacionTarjeta[i][2] = tin;
			
			//Interes mensual a pagar
			liquidacionTarjeta[i][3] = (liquidacionTarjeta[i][1] * tin) / 100;

			//Cuota
			liquidacionTarjeta[i][4] = cuota;

			//Si el saldo deudor actual es menor a la cuota
			if (liquidacionTarjeta[i][1] < cuota) {
				fin = true;
				liquidacionTarjeta[i][2] = tin; // TiN
				liquidacionTarjeta[i][3] = (liquidacionTarjeta[i][1] * tin) / 100; // interes mensual a pagar
				liquidacionTarjeta[i][4] = liquidacionTarjeta[i][1] + liquidacionTarjeta[i][3]; //Ultima Cuota mensual
			}
				
		}
		
		System.out.println();
		printMatriz(liquidacionTarjeta);
		System.out.println("\nNecesitas pagar " + i + " cuotas para amortizar la deuda.");
		totalAPagar(liquidacionTarjeta);

	}
	
	public static void totalAPagar(double[][] matriz) {
		double total = 0.0;
		for(int i = 0; i < matriz.length; i++) {
			total += matriz[i][4];
		}
		System.out.print("Siendo la misma un total de ");
		System.out.printf("%.2f", total);
		System.out.print(" €.");
	}
	
	public static void printMatriz(double[][] matriz) {
		boolean cero = false;
		System.out.println(" Mes Cuota | Saldo Deudor |  TiN  | Intereses | Cuota");
		for(int i = 0; i < matriz.length && !cero; i++) {
			for( int j = 0; j < matriz[i].length && !cero; j++) {
				if (matriz[i][j] != 0.0) {
					switch (j) {
					case 0:
						if (matriz[i][j] < 10) {
							System.out.print(" " + Math.round(matriz[i][j]) + "         |");
						} else {
							System.out.print(" " + Math.round(matriz[i][j]) + "        |");
						}
						break;
					case 1:
						System.out.print(" ");
						System.out.printf("%.2f", matriz[i][j]);
						if (matriz[i][j] > 1000.0) {
							System.out.print(" €    |");
						} else if (matriz[i][j] > 100) {
							System.out.print(" €     |");
						} else if (matriz[i][j] > 10) {
							System.out.print(" €      |");
						} else {
							System.out.print(" €       |");
						}
						break;
					case 2:
						System.out.print(" ");
						System.out.printf("%.2f", matriz[i][j]);
						System.out.print("% |");
						break;
					case 3:
						System.out.print(" ");
						System.out.printf("%.2f", matriz[i][j]);
						if (matriz[i][j] > 10.0) {
							System.out.print(" €   |");
						} else {
							System.out.print(" €    |");
						}
						
						break;
					case 4:
						System.out.print(" ");
						System.out.printf("%.2f", matriz[i][j]);
						System.out.print(" €");
						break;
					}
				} else {
					cero = true;
				}
			}
			System.out.println();
		}
	}

}