package org.villablanca.biblioteca;

/**
 * Clase con los datos de la editorial del libro
 * @author Christian
 *
 */
public class Editorial {
	private int codigo;
	private String nombre;
	
	/**
	 * Crea una instancia de editorial con su código y nombre
	 * @param codigo
	 * @param nombre
	 */
	public Editorial(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene el código de la editorial
	 * @return Codigo identificativo de la editorial
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Obtiene el nombre de la editorial
	 * @return Nombre de la editorial
	 */
	public String getNombre() {
		return nombre;
	}



}
