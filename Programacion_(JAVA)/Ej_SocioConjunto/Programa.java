package org.villablanca;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import daw.com.Teclado;

public class Programa {
	
	private Set<Socio> socios;
	private FicheroSocios gestorFicheros;
	private final File RUTA_FICHERO = new File("socios.dat");
	
	public Programa() {
		gestorFicheros = new FicheroSocios(RUTA_FICHERO);
		socios = gestorFicheros.leerFichero();
		if (socios == null) {
			socios = new TreeSet<Socio>();
		}
	}
	
	/*Implementar la clase Socio
	 * dni, nombre y fecha de alta
	 * compareTo -> dni
	 * menu:
	 * 1. Alta
	 * 2. Baja
	 * 3. Modificaciones
	 * 4. Listado por DNI
	 * 5. Listado por antigüedad
	 * 6. Salir
	 * */
	
	public int menu() {
		int opcion = 0;
		do {
			System.out.println("1. Alta");
			System.out.println("2. Baja");
			System.out.println("3. Modificaciones");
			System.out.println("4. Listado por DNI");
			System.out.println("5. Listado por antigüedad");
			System.out.println("6. Salir");
			opcion = Teclado.leerInt();
		} while (opcion < 1 || opcion > 6);
		return opcion;
	}
	
	
	public boolean alta() {
		String nombre, dni, fecha_alta;
		System.out.println("Introduce nombre: ");
		nombre = Teclado.leerString();
		System.out.println("Introduce DNI: ");
		dni = Teclado.leerString();
		System.out.println("Introduce fecha alta (dd/mm/yyyy): ");
		fecha_alta = Teclado.leerString();
		Socio socio = new Socio(dni, nombre, fecha_alta);
		return socios.add(socio);
	}

	
	public boolean baja() {
		System.out.println("Introduce DNI: ");
		String dni = Teclado.leerString();
		return socios.remove(new Socio(dni));
	}
	
	public void ejecutar() {
		
		
		int opcion = 0;
		do {
			opcion = menu();
			switch(opcion) {
			case 1:
				System.out.println(alta()?"Se ha añadido correctamente.":"Error");
				break;
			case 2:
				System.out.println(baja()?"Se ha dado de baja el socio correctamente":"No se ha podido dar de baja el socio");
				break;
			case 3:
				modificacion();
				break;
			case 4:
				listadoPorDni();
				break;
			case 5:
				listadoPorFecha();
				break;
			case 6:
				System.out.println("Adios!!!");
				gestorFicheros.guardarSocios(socios);
			}
		} while (opcion != 6);
	}
	
	private void listadoPorFecha() {
		System.out.println("LISTADO POR FECHA");
		Comparator<Socio> comparadorFechas = new Comparator<Socio>() {

			@Override
			public int compare(Socio o1, Socio o2) {
				return o1.getFecha_alta().compareTo(o2.getFecha_alta());
			}
			
		};
		TreeSet<Socio> sociosPorFecha = new TreeSet<Socio>(comparadorFechas);
		sociosPorFecha.addAll(socios);
		System.out.println(sociosPorFecha);
	}

	private void listadoPorAntiguedad() {
		ArrayList<Socio> sociosOrdenadosAntiguedad = new ArrayList<>();
		sociosOrdenadosAntiguedad.addAll(socios);
		Collections.sort(sociosOrdenadosAntiguedad, Collections.reverseOrder(new ComparadorPorFechaAlta()));
		System.out.println("LISTADO POR ANTIGÜEDAD");
		for(Socio socio: sociosOrdenadosAntiguedad) {
			System.out.println(socio);
		}
	}

	private void listadoPorDni() {
		System.out.println("LISTADO POR DNI");
		Iterator<Socio> it = socios.iterator();
		while(it.hasNext()) {
			Socio socio = it.next();
			System.out.println(socio);
		}
	}


	private void modificacion() {
		//pedir dni
		//buscarlo -> socios
		//mostrarlo
		//pedir datos nuevos
		System.out.println("Introduce DNI: ");
		String dni = Teclado.leerString();
		Socio socioBuscado = new Socio (dni);
		Socio socioEncontrado = null;
		boolean encontrado = false;
		boolean existe = socios.contains(socioBuscado);
		
		if (existe) {
			Iterator<Socio> it = socios.iterator();
			while(it.hasNext() && !encontrado) {
				socioEncontrado = it.next();
				if (socioBuscado.equals(socioEncontrado)) {
					encontrado = true;
				}
			}
			System.out.println("Socio encontrado: " + socioEncontrado);
			System.out.println("Ahora introduce sus nuevos datos: ");
			String nombre, fecha_alta;
			System.out.println("Introduce nombre: ");
			nombre = Teclado.leerString();
			System.out.println("Introduce fecha alta (dd/mm/yyyy): ");
			fecha_alta = Teclado.leerString();
			socioEncontrado.setNombre(nombre);
			socioEncontrado.setFecha_alta(fecha_alta);
		} else {
			System.out.println("El socio con DNI " + dni + " no existe/no se ha encontrado.");
		}
	}


	public static void main(String[] args) {
		new Programa().ejecutar();
		
	}

}
