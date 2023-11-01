package org.villablanca.christian;

/**
 * La clase nodo representa un solo elemento de la clase Lista
 * @author Christian
 *
 */

public class Nodo {
	
	private String color;
	private Nodo siguiente;
	
	public Nodo(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Nodo nodo) {
		this.siguiente = nodo;
	}
}
