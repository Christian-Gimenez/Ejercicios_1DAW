package org.villablanca.christian;

/**
 * Clase que representa un Libro con su titulo y autor
 * @author Christian
 * */

public class Libro {
	private String titulo;
	private String autor;
	
	/**
	 * Crea un Libro con sus datos
	 * @param titulo el titulo del libro
	 * @param autor nombre del autor del libro
	 * */
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	/**
	 * Obtiene el autor
	 * @return nombre autor
	 * */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Obtiene el titulo
	 * @return titulo
	 * */
	public String getTitulo() {
		return titulo;
	}
	
	
}
