package secuenciales;
import java.util.Scanner;
public class Ej8 {

	public static void main(String[] args) {
		/*Un vendedor recibe un sueldo base mas un 10% extra por comisión
		 * de sus ventas, el vendedor desea saber cuanto dinero obtendrá
		 * por concepto de comisiones por las tres ventas que realiza en el mes
		 * y el total que recibirá en el mes tomando en cuenta su sueldo base
		 * y comisiones.
		 * */
		Scanner teclado = new Scanner(System.in);
		
		final double COMISION_EXTRA = 0.10;
		double sueldoBase, venta1, venta2, venta3, sueldoTotal = 0;
		
		System.out.print("Introduce tu sueldo base: ");
		sueldoBase = teclado.nextDouble();
		
		System.out.print("Introduce la primera venta: ");
		venta1 = teclado.nextDouble();
		
		System.out.print("Introduce la segunda venta: ");
		venta2 = teclado.nextDouble();
		
		System.out.print("Introduce la tercera venta: ");
		venta3 = teclado.nextDouble();
		
		sueldoTotal += sueldoBase;
		sueldoTotal += venta1 * COMISION_EXTRA;
		sueldoTotal += venta2 * COMISION_EXTRA;
		sueldoTotal += venta3 * COMISION_EXTRA;
		sueldoTotal = Math.round(sueldoTotal*100.0)/100.0;
		
		System.out.println("El salario total de este mes sumando las comisiones de cada venta será de " + sueldoTotal + " €.");
	}

}
