package org.villablanca.contar;

public class Gato extends Animal {
	private String color;
	private double peso;
	
	public Gato(String nombre, String color, double peso) {
		this.setNombre(nombre);
		this.color = color;
		this.peso = peso;
	}
}
