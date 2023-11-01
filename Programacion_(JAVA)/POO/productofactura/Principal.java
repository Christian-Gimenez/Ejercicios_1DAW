package productofactura;

import daw.com.Teclado;

public class Principal {

	public static void main(String[] args) {
		Factura factura = new Factura(2023);
		String opcion;
		do {
			Producto producto;
			
			System.out.print("Dame codigo producto: ");
			String codigo = Teclado.leerString();
			
			System.out.print("Dame precio producto: ");
			double precio = Teclado.leerFloat();
			
			producto = new Producto(codigo, precio);
			factura.addProducto(producto);
			
			System.out.print("Desea introducir mas productos (S/N): ");
			opcion = Teclado.leerString();
		} while(opcion.equalsIgnoreCase("S"));
		System.out.println(factura.imprimir());
		
	}

}
