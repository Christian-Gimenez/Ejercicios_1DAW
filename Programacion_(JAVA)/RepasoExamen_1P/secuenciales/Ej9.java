package secuenciales;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		/* Una tienda ofrece un descuento del 15% sobre el total de la compra
		 * y un cliente desea saber cuanto deberá pagar finalmente por su compra.
		*/
		Scanner teclado = new Scanner(System.in);
		final double DESCUENTO = 0.15;
		double totalCompra, descuentoAplicado, totalConDescuento;
		
		System.out.print("Introduzca el total de su compra: ");
		totalCompra = teclado.nextDouble();
		
		descuentoAplicado = totalCompra * DESCUENTO;
		totalConDescuento = totalCompra - descuentoAplicado;
		totalConDescuento = Math.round(totalConDescuento*100.0)/100.0;
		
		System.out.println("Aplicando el 15% de descuento, el total a pagar es: " + totalConDescuento + " €");
	}

}
