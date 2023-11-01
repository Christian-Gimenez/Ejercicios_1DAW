package org.villablanca.biblioteca;

/**
 * Clase que abstrae un libro con sus datos más importantes, título, autor/autores, editorial y nº ejemplares
 * @author gimen
 *
 */
public class Libro {
	private String titulo;
	private Autor[] autores;
	private Editorial editorial;
	private Ejemplar[] ejemplares;
	private int numeroEjemplares;
	
	/**
	 * Constructor para un libro de un sólo autor.
	 * @param titulo Titulo del libro
	 * @param autor Autor del libro
	 * @param editorial Editorial del libro
	 * @param ejemplares Numero total de ejemplares del libro
	 */
	public Libro(String titulo, Autor autor, Editorial editorial, int ejemplares) {
		this.titulo = titulo;
		autores = new Autor[1];
		autores[0] = autor;
		this.numeroEjemplares = ejemplares;
		this.ejemplares = new Ejemplar[numeroEjemplares];
	}
	
	/**
	 * Constructor para un libro con varios autores.
	 * @param titulo Titulo del libro
	 * @param autores Array de Autores del libro
	 * @param editorial Editorial del libro
	 * @param ejemplares Numero total de ejemplares del libro
	 */
	public Libro(String titulo, Autor[] autores, Editorial editorial, int ejemplares) {
		this.titulo = titulo;
		this.autores = autores;
		this.numeroEjemplares = ejemplares;
		this.ejemplares = new Ejemplar[numeroEjemplares];
	}

	/**
	 * Obtiene el título del libro
	 * @return Título del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Obtiene la Editorial para operar con ella
	 * @return Editorial del libro
	 */
	public Editorial getEditorial() {
		return editorial;
	}

	/**
	 * Obtiene el array de Ejemplar para operar con ellos
	 * @return Array de Ejemplar para operar con ellos
	 */
	public Ejemplar[] getEjemplares() {
		return ejemplares;
	}

	/**
	 * Obtiene el número total de Ejemplares
	 * @return numero total de Ejemplares
	 */
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	
	
}
