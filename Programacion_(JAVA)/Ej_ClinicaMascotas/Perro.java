package org.villablanca.clinica;

public class Perro  extends Animal {
	private int edad;
	private String raza;
	
	public Perro(String nombre, int edad, String raza) {
		super(nombre);
		this.edad = edad;
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public String getRaza() {
		return raza;
	}

}
