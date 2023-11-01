import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CADA PAYASO PESA 112 GRAMOS
		 * CADA MUÑECA PESA 75 GRAMOS
		 * ESCRIBIR UN PROGRAMA QUE LEA EL NÚMERO DE PAYASOS Y MUÑECAS VENDIDOS EN EL 
		 * ÚLTIMO PEDIDO. TIENE QUE CALCULAR EL PESO DEL PAQUETE QUE VA A SER ENVIADO
		 * 
		 */
		
		/*
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuántos Payasos tiene este pedido?");
		int payasos = teclado.nextInt();
		
		System.out.println("¿Cuántas Muñecas tiene este pedido?");
		int muniecas = teclado.nextInt();
		
		System.out.println("¿Cuánto cuesta cada pedido por Gramo?");
		int pesoPorGramo = teclado.nextInt();
		
		int pesoMuniecas = muniecas * 75;
		int pesoPayasos = payasos * 112;
		int pesoTotalPedido = pesoMuniecas + pesoPayasos;
		double precioTotalPedido = pesoTotalPedido * pesoPorGramo;
		
		System.out.println("El peso total del paquete es de " + pesoTotalPedido + " Gramos."
							+ " \nCon un precio total de " + precioTotalPedido + " €.");
		*/
		
		//Forma de resolverlo del profe
		//Utilizamos constantes para tener siempre el valor del peso de payaso y muñeca almacenado
		final int PESO_PAYASOS = 112; 
		final int PESO_MUNIECAS = 75;
		
		Scanner teclado = new Scanner(System.in);
		int numeroMuniecas, numeroPayasos;
		System.out.println("Dame el número de muñecas: ");
		numeroMuniecas = teclado.nextInt();
		System.out.println("Dame el número de payasos: ");
		numeroPayasos = teclado.nextInt();
		int peso = (PESO_PAYASOS * numeroPayasos) + (PESO_MUNIECAS * numeroMuniecas);
		System.out.println("El peso del paquete es: " + peso + " gramos");
		
		
	}

}
