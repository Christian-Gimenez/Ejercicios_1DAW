import java.util.Scanner;
public class Ejercicio8 {
	
	public static double pedirPrecio() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el precio del articulo (€): ");
		return teclado.nextDouble();
	}
	
	public static double valorDescuento(double precio) {
		if (precio >= 6.0 && precio < 60.0) {
			return precio * 0.05;
		} else if (precio >= 60) {
			return precio * 0.10;
		}
		
		return 0;
	}
	
	public static double precioFinal(double precio_inicial, double valor_descuento) {
		return precio_inicial - valor_descuento;
	}

	public static void main(String[] args) {
		/*Programa que realice descuento dependiendo del precio de cada producto.
		 * si precio < 6 = no descuento.
		 * si precio >= 6 && precio < 60 = 0.05 descuento
		 * si precio >= 60 = 0.10 descuento.
		 * Mostrar precio inicial, valor del descuento y precio final
		 * */
		double precio_inicial = pedirPrecio();
		double valor_descuento = valorDescuento(precio_inicial);
		double precio_final = precioFinal(precio_inicial, valor_descuento);
		System.out.println("El precio inicial es: " + Math.round(precio_inicial*100.00)/100.00 + " €.");
		System.out.println("El valor del descuento es: " + Math.round(valor_descuento*100.00)/100.00 + " €.");
		System.out.println("Y el precio final es: " + Math.round(precio_final*100.00)/100.00 + " €.");
		}

}
