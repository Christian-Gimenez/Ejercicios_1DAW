package org.villablanca.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import daw.com.Teclado;

public class Programa {
	private Menu menu;
	private Biblioteca biblioteca;
	
	public Programa() {
		biblioteca = new Biblioteca("IES Villablanca", "Calle Villablanca, Madrid");
		menu = new Menu(biblioteca);
		biblioteca.agregarSocio(new Socio("Jose Luis Rodriguez", "111111111"));
		biblioteca.agregarSocio(new Socio("Antonio Perez", "222222222"));
		biblioteca.agregarSocio(new Socio("Almudena Fernandez", "333333333"));
		biblioteca.agregarSocio(new Socio("Ana Alvarez", "444444444"));
		biblioteca.agregarSocio(new Socio("Juan Jose Ramirez", "666666666"));
		biblioteca.agregarSocio(new Socio("Maria Diaz", "555555555"));
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public static void main(String[] args) {
		Programa programa = new Programa();
		programa.ejecutar();
	}
	
	public void ejecutar() {
		int opcion;
		do {
			opcion = menu.mostrarMenuPrincipal();
			switch(opcion) {
			case 1:
				agregarSocio();
				break;
			case 2:
				agregarDisco();
				break;
			case 3:
				agregarLibro();
				break;
			case 4:
				agregarPelicula();
				break;
			case 5:
				agregarBibliotecario();
				break;
			case 6:
				realizarPrestamo();
				break;
			case 7:
				buscarLibrosDeAutor();
				break;
			case 8:
				buscarDiscosDeGrupo();
				break;
			case 9:
				mostrarDiscosOrdenados();
				break;
			case 10:
				mostrarSociosOrdenados();
				break;
			case 11:
				System.out.println("Adiós!");
				break;
			}
		} while(opcion!=11);
		
		
	}
	

	private void buscarDiscosDeGrupo() {
		String grupo = Teclado.leerString("Introduce nombre del grupo: ");
		ArrayList<Disco> todosLosDiscos = biblioteca.getDiscos();
		ArrayList<Disco> discosDelGrupo = null;
		for(Disco disco: todosLosDiscos) {
			if(disco.getGrupo().equalsIgnoreCase(grupo)) {
				discosDelGrupo.add(disco);
			}
		}
		
		if(discosDelGrupo != null) {
			System.out.println("Discos del grupo " + grupo + ": ");
			mostrarDiscosDelGrupo(discosDelGrupo);
		} else {
			System.out.println("No se ha encontrado ningun disco del grupo " + grupo);
		}
		
	}



	private void buscarLibrosDeAutor() {
		String autor = Teclado.leerString("Introduce el nombre del autor:");
		ArrayList<Libro> todosLosLibros = biblioteca.getLibros();
		ArrayList<Libro> librosDelAutor = null;
		for(Libro libro: todosLosLibros) {
			if(libro.getAutor().equalsIgnoreCase(autor)) {
				librosDelAutor.add(libro);
			}
		}
		
		if (librosDelAutor != null) {
			System.out.println("Libros del autor " + autor + ": ");
			mostrarLibrosDelAutor(librosDelAutor);
		} else {
			System.out.println("No se ha encontrado ningún libro de " + autor);
		}
	}

	private void mostrarLibrosDelAutor(ArrayList<Libro> libros) {
		Material.ordenarMateriales(libros);
		menu.mostrarLibrosAutor(libros);
	}
	
	private void mostrarDiscosDelGrupo(ArrayList<Disco> discos) {
		Material.ordenarMateriales(discos);
		menu.mostrarDiscos(discos);
		
	}

	private void agregarBibliotecario() {
		Bibliotecario bibliotecario = menu.pedirDatosBibliotecario();
		boolean resultado = biblioteca.agregarBibliotecario(bibliotecario);
		if(resultado) {
			menu.informarExito();
		} else {
			menu.informarFracaso();
		}
		
	}

	private void agregarPelicula() {
		Pelicula pelicula = menu.pedirDatosPelicula();
		boolean resultado = biblioteca.agregarMaterial(pelicula);
		if(resultado) {
			menu.informarExito();
		} else {
			menu.informarFracaso();
		}
		
	}

	private void agregarLibro() {
		Libro libro = menu.pedirDatosLibro();
		boolean resultado = biblioteca.agregarMaterial(libro);
		if(resultado) {
			menu.informarExito();
		} else {
			menu.informarFracaso();
		}
		
	}

	public void mostrarSociosOrdenados() {
		int opcion = 0;
		do {
			System.out.println("Elige una opción:");
			System.out.println("1- Ordenar Socios por NOMBRE");
			System.out.println("1- Ordenar Socios por DNI");
			opcion = Teclado.leerInt();
		} while(opcion < 0 || opcion > 2);
		
		if(opcion == 1) {
			mostrarSociosOrdenadosPorNombre();
		} else {
			mostrarSociosOrdenadosPorDNI();
		}
	}
	
	
	
	private void mostrarDiscosOrdenados() {
		ArrayList<Disco> discos = biblioteca.getDiscos();
		Material.ordenarMateriales(discos);
		menu.mostrarDiscos(discos);
		//Material.ordenarMateriales(discos);
		//menu.mostrar(discos);
	}
	
	private void mostrarSociosOrdenadosPorDNI() {
		ArrayList<Socio> socios = biblioteca.getSocios();
		Collections.sort(socios, new ComparadorSocioPorDni());
		menu.mostrarSocios(socios);
	}
	
	private void mostrarSociosOrdenadosPorNombre() {
		ArrayList<Socio> socios = biblioteca.getSocios();
		Collections.sort(socios, new ComparadorSocioPorNombre());
		menu.mostrarSocios(socios);
		
		/*Apunte de como hacer una clase anonima
		Collections.sort(socios, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Socio socio1 = (Socio)o1;
				Socio socio2 = (Socio)o2;
				return socio1.compareTo(socio2);
			}
		});*/
	}

	private void agregarSocio() {
		Socio socio = menu.pedirDatosSocio();
		boolean resultado = biblioteca.agregarSocio(socio);
		if(resultado) {
			menu.informarExito();
		} else {
			menu.informarFracaso();
		}
	}
	
	public void agregarDisco() {
		Disco disco = menu.pedirDatosDisco();
		biblioteca.agregarMaterial(disco);
		menu.informarExito();
	}
	
	private void realizarPrestamo() {
		Prestamo prestamo = menu.pedirDatosPrestamo();
		if(prestamo == null) {
			menu.informarExito();
		} else {
			biblioteca.agregarPrestamo(prestamo);
			menu.informarFracaso();
		}
	}
}

class ComparadorSocioPorNombre implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Socio socio1 = (Socio)o1;
		Socio socio2 = (Socio)o2;
		return socio1.compareTo(socio2);
	}
}

class ComparadorSocioPorDni implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Socio socio1 = (Socio)o1;
		Socio socio2 = (Socio)o2;
		return socio1.getDni().compareTo(socio2.getDni());
	}
}
