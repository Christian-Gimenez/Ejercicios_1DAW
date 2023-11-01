package examen.functions;

import java.util.Scanner;

public class Ejercicio13_DescuentoDependeProducto {
	
	public static final double DESCUENTO = 0.10;
	
	public static boolean evaluarPrecio(double precio) {
		boolean seAplicaDescuento=false;
		
		if (precio < 6) {
			seAplicaDescuento = false;
		} else if (precio >= 60) {
			seAplicaDescuento = true;
		}
		return seAplicaDescuento;
	}
	
	public static void aplicarDescuento(double precioInicial) {
		double valorDescuento=0.0, precioFinal=0.0;
		if (evaluarPrecio(precioInicial)) {
			valorDescuento = precioInicial * DESCUENTO;
			System.out.println("El valor del descuento aplicado = " + valorDescuento + " €.");
			
			precioFinal = precioInicial - valorDescuento;
			System.out.println("El precio final es = " + precioFinal + " €.");
		} else {
			System.out.println("Este producto no se le aplica descuento.");
			System.out.println("El precio final es = " + precioInicial + " €.");
		}
	}
	
	public static double pedirPrecio() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextDouble();
		
	}
	
	public static String pedirProducto() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static int pedirCantidad() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		/*Crear el programa, utilizando la técnica de programación estructurada,
		 * para un determinado comercio en el que se realiza un descuento
		 * dependiendo del precio de cada producto.
		 * 
		 * Si el precio es inferior a 6 €, no se hace descuento.
		 * Si es mayor o igual a 60 €, se hace un 10% de descuento.
		 * Finalizar visualizando el precio inicial,
		 * el valor del descuento y el precio final.
		 * */
		double precioInicial=0.0;
		int cantidad = 0;
		String producto="";
		System.out.println("Introduce la cantidad de productos a evaluar su precio final:");
		cantidad = pedirCantidad();
		
		for(int i = 0; i < cantidad; i++) {
			System.out.print("\nIntroduce el producto: ");
			producto = pedirProducto();
			
			System.out.print("\nIntroduce su precio inicial: ");
			precioInicial = pedirPrecio();
			
			aplicarDescuento(precioInicial);
		}
		
		
	}

}
