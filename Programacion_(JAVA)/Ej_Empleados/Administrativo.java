package org.villablanca;

public class Administrativo extends Empleado {
	private String categoria;
	private String destinoActual;
	
	public Administrativo(String nombre, int edad, String dni, String categoria, String destinoActual) {
		super(nombre, edad, dni);
		this.categoria = categoria;
		this.destinoActual = destinoActual;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDestinoActual() {
		return destinoActual;
	}

	public void setDestinoActual(String destinoActual) {
		this.destinoActual = destinoActual;
	}
}
