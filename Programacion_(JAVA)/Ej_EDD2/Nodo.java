package org.villablanca.ejercicio1;

/**
 * Clase que sirve como Nodo de la lista dinámica de Clientes y Empleados (también de subtipo Directivo)
 * de manera que se puedan agregar y eliminar los mismos a la base de datos de la Empresa.
 * @author Cryptic-WebDev
 *
 */
public class Nodo {
	private Persona persona;
	private Nodo siguiente;
	
	/**
	 * Constructor del nodo que asigna el tipo Persona que contiene y establece el siguiente en null.
	 * @param persona Persona (Cliente o Empleado) a agregar a la lista
	 */
	public Nodo(Persona persona) {
		this.persona = persona;
	}
	
	/**
	 * Obtiene el siguiente nodo de la lista
	 * @return El siguiente nodo de la lista
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	/**
	 * Establece el siguiente nodo de la lista
	 * @param siguiente Siguiente nodo de la lista
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	/**
	 * Obtiene la persona que contiene el nodo
	 * @return la Persona que contiene el nodo
	 */
	public Persona getPersona() {
		return persona;
	}
}
