package org.villablanca.christian;

/**
 * Clase que abstrae un elemento de la lista
 * Recibiendo un Libro y estableciendo el siguiente nodo
 * para así indexar el siguiente nodo.
 * @author Christian
 *
 */
public class Nodo {
	private Libro libro;
	private Nodo siguiente;
	
	/**
	 * Crea un nodo y le introduce el librr
	 * @param libro que será introducido al nodo (de la lista)
	 */
	public Nodo(Libro libro) {
		this.libro = libro;
	}
	
	/**
	 * @return el siguiente elemento de la lista
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	
	/**
	 * @return libro de este nodo
	 */
	public Libro getLibro() {
		return libro;
	}
	
	/**
	 * @param nodo recibe el nodo que pondrá como siguiente de la lista
	 */
	
	public void setSiguiente(Nodo nodo) {
		siguiente = nodo;
	}
}
