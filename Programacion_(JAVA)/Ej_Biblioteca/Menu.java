package org.villablanca.biblioteca;

import daw.com.Teclado;
import java.util.ArrayList;



public class Menu {
	
	private Biblioteca biblioteca;
	
	public Menu(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	
	
	public int mostrarMenuPrincipal() {
		int opcion = -1;
		do {
			System.out.println(" 1.-Agregar socio");
			System.out.println(" 2.-Agregar disco");
			System.out.println(" 3.-Agregar libro");
			System.out.println(" 4.-Agregar pelicula");
			System.out.println(" 5.-Agregar bibliotecario");
			System.out.println(" 6.-Realizar prestamo");
			System.out.println(" 7.-Buscar libros de un autor");
			System.out.println(" 8.-Buscar discos de grupo");
			System.out.println(" 9.-Mostrar discos ordenados");
			System.out.println("10.-Mostrar socios ordenados");
			System.out.println("11.-Salir");
			opcion = Teclado.leerInt();
		} while(opcion <1 || opcion > 11);
		return opcion;

	}
	public void mostrarSocios(ArrayList<Socio> socios) {
		System.out.println("LISTADO DE SOCIOS");
		System.out.println("NOMBRE\t\tDNI");
		for(Socio socio: socios) {
			System.out.println(socio.getNombre() + "\t\t" + socio.getDni());
		}
	}
	
	private String pedirNombre() {
		System.out.print("Introduce el nombre del Socio:");
		return Teclado.leerString();
	}
	
	private String pedirDNI() {
		System.out.print("Introduce DNI Socio: ");
		return Teclado.leerString();
	}

	public Socio pedirDatosSocio() {
		Socio socio;
		String dni, nombre;
		System.out.println("ALTA DE SOCIOS:");
		nombre = pedirNombre();
		dni = pedirDNI();

		socio = new Socio(nombre, dni);
		return socio;
	}
	
	public void informarExito() {
		System.out.println("Operación realizada con éxito :)");
	}
	
	public void informarFracaso() {
		System.out.println("Ha fallado la operación");
	}

	public Disco pedirDatosDisco() {
		// TODO Auto-generated method stub
		Disco disco;
		Bibliotecario bibliotecario;
		String codigo, titulo, grupo, dni;
		System.out.println("ALTA DE DISCO:");
		do {
			dni = pedirDNI();
			bibliotecario = biblioteca.buscarBibliotecario(dni);
		} while (bibliotecario == null);
		
		titulo = pedirTitulo();
		grupo = pedirGrupo();
		codigo = pedirCodigo();
		disco = new Disco(codigo, titulo, grupo, bibliotecario);
		return disco;
	}

	private String pedirCodigo() {
		System.out.print("Introduce Codigo: ");
		return Teclado.leerString();
	}
	
	private String pedirTitulo() {
		System.out.print("Introduce Titulo: ");
		return Teclado.leerString();
	}
	
	private String pedirGrupo() {
		System.out.print("Introduce Grupo: ");
		return Teclado.leerString();
	}



	public Prestamo pedirDatosPrestamo() {
		System.out.println("ALTA DE PRESTAMO");
		String dni, codigo;
		Socio socio = null;
		Material material = null;
		do {
			dni = pedirDNI();
			socio = biblioteca.buscarSocioPorDni(dni);
			
		} while(socio == null);
		do {
			codigo = pedirCodigo();
			material = biblioteca.buscarMaterial(codigo);
		}while(material == null);

		Prestamo prestamo = new Prestamo(material);
		if(socio.addPrestamo(prestamo)) {
			return prestamo;
		}
		return null;
	}



	public void mostrarDiscos(ArrayList<Disco> discos) {
		System.out.println("LISTADO DE DISCOS");
		System.out.println("GRUPO\t\tTITULO");
		for(Disco disco: discos) {
			System.out.println(disco.getGrupo() + "\t" + disco.getTitulo());
		}
	}



	public Libro pedirDatosLibro() {
		Libro libro;
		Bibliotecario bibliotecario;
		//(String codigo, String titulo, int paginas, String autor, Genero genero, Bibliotecario bibliotecario)
		String codigo, titulo, autor, dni;
		int paginas;
		Genero genero;
		System.out.println("ALTA DE LIBRO:");
		do {
			dni = pedirDNI();
			bibliotecario = biblioteca.buscarBibliotecario(dni);
		} while (bibliotecario == null);
		
		titulo = pedirTitulo();
		autor = pedirAutor();
		codigo = pedirCodigo();
		genero = pedirGenero();
		paginas = pedirPaginas();
		libro = new Libro(codigo, titulo, paginas, autor, genero, bibliotecario);
		return libro;
	}



	private int pedirPaginas() {
		System.out.print("Introduce el número de páginas: ");
		return Teclado.leerInt();
	}



	private Genero pedirGenero() {
		int opcion;
		do {
			System.out.println("Selecciona un género: ");
			System.out.println("1.-" + Genero.COMEDIA);
			System.out.println("2.-" + Genero.FICCION);
			System.out.println("3.-" + Genero.NOVELA);
			System.out.println("4.-" + Genero.TERROR);
			opcion = Teclado.leerInt();
		} while (opcion < 1 || opcion > 4);
		
		Genero genero = Genero.NOVELA;
		switch(opcion) {
		case 1:
			genero = Genero.COMEDIA;
			break;
		case 2:
			genero = Genero.FICCION;
			break;
		case 3:
			genero = Genero.NOVELA;
			break;
		case 4:
			genero = Genero.TERROR;
			break;
		}
		
		return genero;
	}



	private String pedirAutor() {
		System.out.print("Introduce Autor: ");
		return Teclado.leerString();
	}



	public Pelicula pedirDatosPelicula() {
		Pelicula pelicula;
		Bibliotecario bibliotecario;
		String codigo, titulo, dni, director, resumen;
		System.out.println("ALTA DE PELICULA:");
		do {
			dni = pedirDNI();
			bibliotecario = biblioteca.buscarBibliotecario(dni);
		} while (bibliotecario == null);
		
		titulo = pedirTitulo();
		director = pedirDirector();
		resumen = pedirResumen();
		codigo = pedirCodigo();
		pelicula = new Pelicula(codigo, titulo, director, resumen, bibliotecario);
		return pelicula;
	}



	private String pedirDirector() {
		System.out.println("Introduce el nombre del director: ");
		return Teclado.leerString();
	}
	
	private String pedirResumen() {
		System.out.println("Introduce el resumen del libro: ");
		return Teclado.leerString();
	}



	public Bibliotecario pedirDatosBibliotecario() {
		String nombre = pedirNombre();
		String dni = pedirDNI();
		return new Bibliotecario(nombre, dni);
	}



	public void mostrarLibrosAutor(ArrayList<Libro> libros) {
		for(Libro libro: libros) {
			int i = 1;
			System.out.println(i + "-" + libro.getTitulo());
		}
	}
	
	

}
