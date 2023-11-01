package repetitivas;
import java.util.Scanner;
public class Ej4 {

	public static void main(String[] args) {
		/*Una empresa que se dedica a la venta de desinfectantes
		 necesita un programa para gestionar las facturas.
		 En cada factura figura:
		 -el código del artículo
		 -la cantidad vendida en litros
		 -y el precio por litro.
		 
		Se pide de 5 facturas introducidas:
		-Facturación total
		-cantidad en litros vendidos del artículo 1
		-y cuantas facturas se emitieron de más de 600 €.*/
		Scanner teclado = new Scanner(System.in);
		
		int codigo_articulo, factura600 = 0;
		double cantidadLitros, litros1factura = 0.0, precioXlitro,
		facturacionTotal = 0.0, factura;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Código del " + i + "º artículo: ");
			codigo_articulo = teclado.nextInt();
			
			System.out.print("-Cantidad vendida en litros: ");
			cantidadLitros = teclado.nextDouble();
			if (codigo_articulo == 1) {
				litros1factura = litros1factura + cantidadLitros;
			}
			
			System.out.print("-Precio por litro (€/l): ");
			precioXlitro = teclado.nextDouble();
			
			factura = cantidadLitros * precioXlitro;
			if (factura > 600.0) {
				factura600++;
			}
			facturacionTotal += factura;
			System.out.println();
		}
		System.out.println("La facturación total es de: " + (Math.round(facturacionTotal*100)/100) + " €");
		System.out.println("Se han vendido " + litros1factura + " litro/s del articulo con codigo 1.");
		System.out.println("Y se emitieron " + factura600 + " factura/s de +600 €");
	}

}
