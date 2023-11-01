package org.villablanca;

public class Auxiliar extends Empleado {
	private boolean ingles;
	
	public Auxiliar(String nombre, int edad, String dni, boolean ingles) {
		super(nombre, edad, dni);
		this.ingles = ingles;
	}

	public boolean isIngles() {
		return ingles;
	}

	public void setIngles(boolean ingles) {
		this.ingles = ingles;
	}
}
