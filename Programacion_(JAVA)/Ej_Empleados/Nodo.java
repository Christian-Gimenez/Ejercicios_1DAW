package org.villablanca;

public class Nodo {
	private Empleado empleado;
	private Nodo siguiente;
	
	public Nodo(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}
}
