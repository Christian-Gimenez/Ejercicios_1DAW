package teatro;

import java.util.Scanner;

import daw.com.Teclado;

public class Programa {
	
	public static int buscarTeatro(Teatro[] teatros) {
		String nombreTeatro = "";
		int pos = -1;
		boolean encontrado = false;
		System.out.println("Nombre del teatro: ");
		nombreTeatro = Teclado.leerString();
		for(int i = 0; i < teatros.length && !encontrado; i++) {
			if (teatros[i].getNombre().equalsIgnoreCase(nombreTeatro)) {
				encontrado = true;
				pos = i;
			}
		}
		if (!encontrado) {
			System.out.println("No existe el teatro indicado.");
		}
		return pos;
	}
	
	public static void cambiarNombreFuncion(Teatro teatro) {
		String nombre = "";
		System.out.print("Antiguo nombre de la función: ");
		nombre = Teclado.leerString();
		int pos = teatro.buscarFuncion(nombre);
		if (pos != -1) {
			System.out.print("Nuevo nombre de la función: ");
			nombre = Teclado.leerString();
			teatro.getFuncionTeatro(pos).setNombre(nombre);
		} else {
			System.out.println("Lo sentimos, pero la función indicada no está en el teatro " + teatro.getNombre());
		}
	}
	
	public static void cambiarPrecioFuncion(Teatro teatro) {
		String nombre = "";
		double precio = 0.0;
		System.out.println("Nombre de la función de la cual desea cambiar el precio: ");
		nombre = Teclado.leerString();
		int pos = teatro.buscarFuncion(nombre);
		if (pos != -1) {
			precio = teatro.getFuncionTeatro(pos).getPrecio();
			do {
				System.out.println("El precio actual es de " + precio + "€.");
				System.out.print("Introduzca el nuevo precio: ");
				precio = leerPrecio();
			
				if (precio > 0.0) {
					teatro.getFuncionTeatro(pos).setPrecio(precio);
					System.out.println("Precio cambiado con éxito :) [" + precio + "€]");
				} else {
					System.out.println("Error, por favor, introduzca un precio válido.");
				}
			} while (precio > 0.0);

		}
	}
	
	public static void crearTeatros(Teatro[] teatros) {
		String nombre, direccion;
		for(int i = 0; i < teatros.length; i++) {
			System.out.print("Introduce nombre del Teatro:");
			nombre = Teclado.leerString();
			System.out.print("Introduce la direccion del Teatro: ");
			direccion = Teclado.leerString();
			teatros[i] = new Teatro(nombre, direccion);
		}
	}
	
	public static double leerPrecio() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	
	public static void agregarFunciones(Teatro teatro) {
		int cantidadFunciones = teatro.getNumeroFunciones();
		if (cantidadFunciones != 4) {
			System.out.println("Cuantas funciones vas a agregar (max " + (4 - cantidadFunciones) + "): ");
			int agregar = Teclado.leerInt();
			String nombreFuncion = "";
			double precioFuncion = 0.0;
			for(int i = teatro.getNumeroFunciones(); i < 4; i++) {
				System.out.print((i+1) + "-Introduce el nombre de la función: ");
				nombreFuncion = Teclado.leerString();
				System.out.print("Precio de la función '" + nombreFuncion + "': ");
				precioFuncion = leerPrecio();
				teatro.agregarFuncion(null);
				Funcion nuevaFuncion = new Funcion(nombreFuncion, precioFuncion);
				teatro.agregarFuncion(nuevaFuncion);
			}
		} else {
			System.out.println("Ya existe un total de 4 funciones (no se pueden agregar más).");
			System.out.println("¿Deseas eliminar alguna función? (S/N)");
			char opcion = Teclado.leerString().charAt(0);
			switch (opcion) {
			case 's', 'S':
				//eliminar funcion
				break;
			case 'n', 'N':
				break;
			default:
				System.out.println("Opcion invalida, volviendo al menú principal.");
				break;
			}
		}
	}
	
	public static Funcion buscarFunciones(Teatro teatro) {
		String funcionABuscar = "";
		int posicion = 0;
		System.out.println("Introduce el nombre de la función que buscas:");
		funcionABuscar = Teclado.leerString();
		posicion = teatro.buscarFuncion(funcionABuscar);
		if (posicion == -1) {
			System.out.println("La función que buscas no está disponible en el teatro " + teatro.getNombre());
			return null;
		} else {
			System.out.println("La función que buscas sí se encuentra disponible.");
			return teatro.getFuncionTeatro(posicion);
		}
	}
	
	public static void cambiarNombreTeatro(Teatro teatro) {
		String antiguoNombre = teatro.getNombre();
		System.out.println("Indique el nuevo nombre del teatro: ");
		teatro.setNombre(Teclado.leerString());
		System.out.println("Se ha cambiado el nombre del teatro '" + antiguoNombre + "' a -> '" + teatro.getNombre() + "'.");
	}
	
	public static void moverTeatro(Teatro[] teatros) {
		
	}
	
	public static void eliminarTeatro(Teatro[] teatros, Teatro teatro) {
		
	}
	
	public static void mostrarMenu() {
		System.out.println("Seleccione una de las opciones que desee realizar:");
		System.out.println("1) Dar de alta un nuevo teatro");
		System.out.println("2) Modificar nombre teatro.");
		System.out.println("3) Agreagar funcion/es a un teatro.");
		System.out.println("4) Buscar una función en un teatro.");
		System.out.println("5) Modificar nombre de una función de un teatro.");
		System.out.println("6) Modificar precio de una función de un teatro.");
		System.out.println("7) Eliminar una función de un teatro."); //Falta implementar
		System.out.println("8) Eliminar un teatro."); //Falta implementar
		System.out.println("9) Salir del programa.");
		System.out.print(": ");
	}
	
	public static void buscarTeatroYLuego(int opcion, Teatro[] teatros) {
		int pos = buscarTeatro(teatros);
		if (pos != -1) {
			switch (opcion) {
			case 2:
				cambiarNombreTeatro(teatros[pos]);
				break;
			case 3:
				agregarFunciones(teatros[pos]);
				break;
			case 4:
				buscarFunciones(teatros[pos]);
				break;
			case 5:
				cambiarNombreFuncion(teatros[pos]);
				break;
			case 6:
				cambiarPrecioFuncion(teatros[pos]);
				break;
			case 7:
				//eliminarFuncion(teatros[pos]);
				break;
			case 8:
				//eliminarTeatro(teatros[pos]);
				break;
			}
		}
	}
	
	public static void menuPrincipal(Teatro[] teatros) {
		int opcion = 0;
		do {
			mostrarMenu();
			opcion = Teclado.leerInt();
			
			switch(opcion) {
			case 1:
				crearTeatros(teatros); //Revisar
				break;
			case 2, 3, 4, 5, 6, 7, 8:
				buscarTeatroYLuego(opcion, teatros);
				break;
			default: 
				System.out.println("Opcion incorrecta!");
				break;
			}
		} while (opcion != 9);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teatro teatros[] = new Teatro[3];
		crearTeatros(teatros);
		
		
		
	}

}
