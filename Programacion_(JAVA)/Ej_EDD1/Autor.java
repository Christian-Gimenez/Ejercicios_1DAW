package org.villablanca.biblioteca;

/**
 * Clase que almacena los datos de los autores de los libros, heredando de Persona y añadiendo el atributo nacionalidad
 * @author Christian
 *
 */
public class Autor extends Persona {
	private String nacionalidad;

	/**
	 * Construye una instancia de tipo Autor con sus datos básicos de Persona + nacionalidad
	 * @param dni Dni del Autor
	 * @param nombre Nombre del Autor
	 * @param edad Edad del Autor
	 * @param nacionalidad Nacionalidad del Autor
	 */
	public Autor(String dni, String nombre, int edad, String nacionalidad) {
		super(dni, nombre, edad);
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Obtiene la nacionalidad del Autor
	 * @return Nacionalidad de la persona
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	
}
