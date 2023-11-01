import java.util.Scanner;
public class Ejemplo_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double acumulado, saldoFijo;
		double interes = 0.10;
		
		double [][] saldo = new double[6][5];
		
		System.out.print("Introduce tu saldo anual: ");
		saldoFijo = teclado.nextDouble();
		for(int i = 0; i < 6; i++) {
			saldo[i][0] = saldoFijo;
			acumulado = saldoFijo;
			
			for(int x = 1; x < 5; x++) {
				acumulado = acumulado + (acumulado * interes);
				saldo[i][x] = acumulado;
			}
			interes = interes + 0.01;
		}
		
		for(int z = 0; z < 6; z++) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.printf("%1.2f", saldo[z][j]);
				System.out.print("€ ");
			}
		}
	}

}
