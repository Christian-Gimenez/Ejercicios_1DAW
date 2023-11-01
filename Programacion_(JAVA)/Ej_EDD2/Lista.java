package org.villablanca.ejercicio1;

/**
 * Clase que crea una lista dinámica de Personas (Empleados o Clientes)
 * @author Cryptic-WebDev
 *
 */
public class Lista {
	private Nodo primero;
	
	/**
	 * Crea una lista dinámica vacía de Empleados
	 */
	public Lista() {
		primero = null;
	}
	
	/**
	 * Inserta una persona al siguiente nodo de la lista
	 * @param persona Persona que se introducirá al siguiente nodo de la lista
	 */
	public void add(Persona persona) {
		Nodo nuevo = new Nodo(persona);
		if(primero == null) {
			primero = nuevo;
		} else {
			Nodo aux = primero;
			while(primero.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
	}
	
}
