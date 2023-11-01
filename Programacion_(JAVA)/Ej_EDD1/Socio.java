package org.villablanca.biblioteca;

/**
 * Clase que almacena los datos de socios de la biblioteca, heredando de Persona y añadiendo el atributo numero de socio.
 * @author Christian
 *
 */
public class Socio extends Persona {
	private int numeroSocio;
	private Sancion sancion;

	/**
	 * Construye una instancia de tipo Socio con sus datos básicos de Persona + numeroSocio y sancion a null
	 * @param dni DNI del Socio
	 * @param nombre Nombre del Socio
	 * @param edad Edad del Socio
	 * @param numeroSocio Número indentificativo único del Socio
	 */
	public Socio(String dni, String nombre, int edad, int numeroSocio) {
		super(dni, nombre, edad);
		this.numeroSocio = numeroSocio;
		this.sancion = null;
	}

	/**
	 * Obtiene el número del Socio
	 * @return Número de Socio
	 */
	public int getNumeroSocio() {
		return numeroSocio;
	}
	
	/**
	 * Establece una sanción al socio si no devolvió el prestamo
	 * @param sancion Sancion impuesta al socio
	 */
	public void setSancion(Sancion sancion) {
		this.sancion = sancion;
	}
	
	/**
	 * Obtiene la sanción interpuesta al usuario. Si retorna null es que no tiene sanción.
	 * @return
	 */
	public Sancion getSancion() {
		return sancion;
	}
	
}
