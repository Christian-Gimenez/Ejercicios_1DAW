package org.villablanca.clinica;

public class Gato extends Animal {
	private String color;
	private float peso;
	
	public Gato(String nombre, String color, float peso) {
		super(nombre);
		this.color = color;
		this.peso = peso;

	}

	public String getColor() {
		return color;
	}

	public float getPeso() {
		return peso;
	}
	
}
