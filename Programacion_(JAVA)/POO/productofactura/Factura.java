package productofactura;

public class Factura {
	private String numero;
	private Producto[] productos;
	private static final int MAXIMO_PRODUCTOS = 100;
	private int contador;
	
	public static int NUMERO_FACTURAS = 1;
	
	public Factura(int anio) {
		numero = "" + Factura.NUMERO_FACTURAS + "/" + anio;
		Factura.NUMERO_FACTURAS++;
		this.productos = new Producto[Factura.MAXIMO_PRODUCTOS];
		contador = 0;
	}
	
	public void addProducto(Producto producto) {
		this.productos[contador] = producto;
		contador++;
	}
	
	public String getNumero() {
		return numero;
	}

	public String imprimir() {
		String resultado = "Factura Nº: " + this.numero;
		double totalFactura = 0.0;
		for(int i = 0; i < contador; i++) {
			Producto producto = productos[i];
			totalFactura += producto.getPrecio();
			resultado += "\n" + producto.getCodigo() + "\t" + producto.getPrecio()	+ "€";
			}
		resultado += "\nTotal Factura: " + totalFactura + " €.";
		return resultado;
	}
}
