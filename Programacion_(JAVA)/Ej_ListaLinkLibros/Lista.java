package org.villablanca.christian;

/**
 * Clase que abstrae una lista dinámica de objetos Libro
 * Contiene un obj Nodo que representa el primer elemento de la Lista
 * @author Christian
 *
 */
public class Lista {
	private Nodo primero;
	
	/**
	 * Crea una lista e inicializa en "vacío" el primer elemento
	 */
	public Lista() {
		primero = null;
	}
	
	/**
	 * Crea un nodo y le mete el libro, si el primer elemento de la lista está null
	 * mete el nuevo nodo como primer elemento de la lista
	 * Si no, busca el siguiente hasya encontrar un nodo vacío
	 * Para poder meter al final de la lista el nodo con el libro
	 * @param libro El libro a añadir en la lista
	 */
	public void addLibro(Libro libro) {
		Nodo nodo = new Nodo(libro);
		if(primero == null) {
			primero = nodo;
		} else {
			Nodo aux = primero;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nodo);
		}
	}
	
	/**
	 * Cuenta la cantidad de libros actuales en la lista
	 * @param lista lista en la cual contar sus libros
	 * @return cantidad de libros de la lista
	 */
	public int contarLibros() {
		int contador = 0;
		Nodo aux = primero;
		while (aux.getSiguiente() != null) {
			aux = aux.getSiguiente();
			contador ++;
		}
		return contador;
	}
	
	public void ordenarPorAutor() {
		Nodo aux = primero;
		String actual;
		String siguiente;
		boolean hayDesorden = true;
		while(aux.getSiguiente() != null && hayDesorden) {
			hayDesorden = false;
			while(aux.getSiguiente() != null) {
				actual = aux.getLibro().getAutor();
				siguiente = aux.getSiguiente().getLibro().getAutor();
				if(actual.compareToIgnoreCase(siguiente) > 0) {
					hayDesorden = true;
					Nodo aux2 = aux.getSiguiente();
					aux.setSiguiente(aux);
					aux2.setSiguiente(aux);
				}
			}
			aux = aux.getSiguiente();
		}
	}
	
	public void ordenarPorTitulo() {
		
	}
	
	/**
	 * @return obtiene el primer nodo de la lista
	 */
	public Nodo getPrimero() {
		return primero;
	}
}
