package ejercicios.clase.arrays;

import java.util.Scanner;

public class GestiónDeTienda {
	
	public static double leerPrecio() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	
	public static int leerStock() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static String leerProducto() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void darDeAlta(String[] producto, double[] precio, int[] stock) {
		for(int i = 0; i < producto.length; i++) {
			System.out.println("Nombre del producto: ");
			producto[i] = leerProducto();
			
			System.out.println("Precio(€): ");
			precio[i] = leerPrecio();
			
			System.out.println("Nº de Uds en Stock: ");
			stock[i] = leerStock();
		}
	}
	
	public static boolean buscarProducto(String busqueda, String[] listaProductos, double[] precio, int[] stock) {
		int indice = -1;
		for (int i = 0; i < listaProductos.length; i++) {
			if (listaProductos[i].equalsIgnoreCase(busqueda)) {
				indice = i;
				System.out.println("Se ha encontrado lo que buscabas!");
			}
		}
		
		if (indice != -1) {
			System.out.println("El producto que buscabas con nombre " + listaProductos[indice] + " tiene un precio de " + precio[indice] + "€ y actualmente hay " + stock[indice] + " en stock");
			return true;
		} else {
			System.out.println("No se ha encontrado el producto.");
			return false;
		}
	}
	
	public static int indiceDelProducto(String busqueda, String[] listaProductos) {
		int indice = -1;
		for(int i = 0; i < listaProductos.length; i++) {
			if (listaProductos[i].equalsIgnoreCase(busqueda)) {
				indice = i;
			}
		}
		return indice;
	}
	
	public static void modificarStock(String[] productos, double[] precio, int[] stock) {
		String aCambiar = "";
		boolean encontrado = false;
		int indiceMod = -1;
		do {
			System.out.println("Indica qué producto deseas cambiar el precio/stock: ");
			aCambiar = leerProducto();
			if (buscarProducto(aCambiar, productos, precio, stock)) {
				encontrado = true;
				indiceMod = indiceDelProducto(aCambiar, productos);
			}
		} while (!encontrado);
		
		System.out.println("Ahora, introduce el nuevo precio del producto (Actualmente es " + precio[indiceMod] + "€)");
		System.out.print("-> ");
		precio[indiceMod] = leerPrecio();
		
		System.out.println("Por último, introduce el stock del producto (Actualmente es " + stock[indiceMod] + ")");
		System.out.print("-> ");
		stock[indiceMod] = leerStock();
	}
	public static void main(String[] args) {
		/*Realiza un programa que gestione los datos de stock de una tienda de comestibles,
		 * la información a recoger será:
		 * nombre del producto, precio, cantidad en stock.
		 * La tienda dispone de 10 productos distintos.
		 * El programa debe ser capaz de:
			Dar de alta un producto nuevo.
    		Buscar un producto por su nombre.
    		Modificar el stock y precio de un producto dado.
		 * */
		String[] productos = new String[10];
		int[] stock = new int[10];
		double[] precios = new double[10];
		darDeAlta(productos, precios, stock);
		System.out.println("Qué deseas realizar.");
		
	}

}
