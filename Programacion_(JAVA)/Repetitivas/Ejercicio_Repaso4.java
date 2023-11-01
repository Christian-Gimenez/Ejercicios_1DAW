import java.util.Scanner;
public class Ejercicio_Repaso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
		 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
		 * Se pide de 5 facturas introducidas:
		 * Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.
		 * */
		
		Scanner teclado = new Scanner(System.in);
		int codigoArticulo, facturasMas600 = 0;
		double litrosVendidos, precioLitro, facturacionTotal = 0, factura;
		String primerArtLitros = "";
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Introduce el código del " + i + "º artículo: ");
			codigoArticulo = teclado.nextInt();
			
			System.out.print("Introduce la cantidad vendida en litros: ");
			litrosVendidos = teclado.nextDouble();
			
			System.out.print("Introduce su precio por litro: ");
			precioLitro = teclado.nextDouble();
			
			factura = litrosVendidos * precioLitro;
			
			if(i == 1) {
				primerArtLitros = "En el primer artículo se han vendido: " + litrosVendidos + " litros.";
			}
			
			if(factura > 600) {
				facturasMas600++;
			}
			
			facturacionTotal += factura;
			System.out.print("\n");
		}
		
		System.out.println(primerArtLitros);
		System.out.println("Se emitieron " + facturasMas600 + " facturas superiores a 600 €");
	}

}
