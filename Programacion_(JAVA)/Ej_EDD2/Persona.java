package org.villablanca.ejercicio1;

/**
 * Clase que abstrae una Persona con sus datos básicos
 * @author Cryptic-WebDev
 *
 */
public class Persona {
	private String nombre;
	private int edad;
	
	/**
	 * Crea un objeto de tipo Persona
	 * @param nombre Nombre de la Persona
	 * @param edad Edad de la Persona
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Getter que devuelve el nombre
	 * @return Nombre de la Persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Getter que devuelve la edad
	 * @return Edad de la Persona
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Devuelve los datos de la persona a una String
	 * @return Datos de la Persona, nombre y edad.
	 */
	public String toString() {
		return "Me llamo " + nombre + " y tengo " + edad + " años.";
	}
	
	/**
	 * Método que comprueba si el Object es de tipo Persona
	 * @param persona objeto a valorar
	 * @return true si el objeto es de tipo Persona. False si no lo es.
	 */
	public static boolean esPersona(Object objeto) {
		return objeto instanceof Persona;
	}
	
	/**
	 * Compara dos instancias para ver si son la misma Persona
	 * @param objeto objeto a valorar
	 * @return true si la persona es la misma
	 */
	@Override
	public boolean equals(Object objeto) {
		boolean resultado = false;
		if (esPersona(objeto)) {
			Persona persona;
			persona = (Empleado)objeto;
			if(nombre.equals(persona.getNombre()) &&
					edad == persona.getEdad()) {
				resultado = true;
			}
		}
		return resultado;
	}
}
