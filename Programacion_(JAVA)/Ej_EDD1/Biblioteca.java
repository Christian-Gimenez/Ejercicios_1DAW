package org.villablanca.biblioteca;

/**
 * Clase principal de la base de datos de la Biblioteca con el numero de Socios y de Libros
 * @author gimen
 *
 */
public class Biblioteca {
	private String direccion;
	private String nombre;
	private Socio[] socios;
	private Libro[] libros;
	
	/**
	 * Inicializa una biblioteca con su dirección, nombre, numero de socios y numero de libros
	 * @param direccion Dirección postal de la biblioteca
	 * @param nombre Nombre de la biblioteca
	 * @param cantidadSocios Cantidad total de socios que puede tener la biblioteca
	 * @param cantidadLibros Cantidad total de libros que puede tener la biblioteca
	 */
	public Biblioteca(String direccion, String nombre, int cantidadSocios, int cantidadLibros) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.socios = new Socio[cantidadSocios];
		this.libros = new Libro[cantidadLibros];
	}

	/**
	 * Obtiene la dirección de la biblioteca
	 * @return Dirección postal de la biblioteca
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Nombre de la biblioteca
	 * @return Nombre de la biblioteca
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el Array de Socios
	 * @return Array de Socio
	 */
	public Socio[] getSocios() {
		return socios;
	}

	/**
	 * Obtiene el Array de Libros
	 * @return Array de Libro
	 */
	public Libro[] getLibros() {
		return libros;
	}
	
	
	
}
