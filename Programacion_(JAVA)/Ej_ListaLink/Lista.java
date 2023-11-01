package org.villablanca.christian;
/**
 * Esta clase crea una lista dinamica que, a diferencia de un array
 * podrán incluirse elementos sin tener que indicar el tamaño límite
 * @author Christian
 *
 */
public class Lista {
	/**
	 * La lista contiene el primer Nodo*/
	private Nodo primero;
	
	/**
	 * El constructor inicializa el primer nodo a null
	 * ya que al crearla, la lista estará vacía*/
	public Lista() {
		primero = null;
	}
	
	/**
	 * incluir añade un nodo, con el*/
	public void incluir(String color) {
		Nodo nodo = new Nodo(color);
		if(primero == null) {
			primero = nodo;	
		} else {
			Nodo aux = primero;
			while(aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nodo);
		}
	}
	
	public int length() {
		int contador = 1;
		if(primero == null) {
			return 0;
		}
		
		Nodo aux = primero;
		while(aux.getSiguiente()!= null) {
			++contador;
			aux = aux.getSiguiente();
		}
		return contador;
	}
	
}
