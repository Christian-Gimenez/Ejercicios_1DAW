package org.villablanca.biblioteca;

/**
 * Clase que abstrae el objeto persona con sus datos básicos: dni, nombre y edad
 * @author Christian
 *
 */
public class Persona {
	private String dni;
	private String nombre;
	private int edad;
	
	/**
	 * Construye una instancia de tipo Persona con sus datos básicos
	 * @param dni Dni de la persona
	 * @param nombre Nombre de la persona 
	 * @param edad Edad de la persona
	 */
	public Persona(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Obtiene el dni de la persona
	 * @return DNI de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Obtiene el nombre de la persona
	 * @return Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Obtiene la edad de la persona
	 * @return Edad de la persona
	 */
	public int getEdad() {
		return edad;
	}
	
}
