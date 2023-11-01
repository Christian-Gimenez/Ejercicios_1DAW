package org.villablanca.ave;

public class Buitre extends Ave {
	private int velocidadVuelo;
	private double peso;
	
	public Buitre(String sexo, int edad, int velocidadVuelo, double peso) {
		super(sexo, edad);
		this.velocidadVuelo = velocidadVuelo;
		this.peso = peso;
		// TODO Auto-generated constructor stub
	}

	public int getVelocidadVuelo() {
		return velocidadVuelo;
	}

	public double getPeso() {
		return peso;
	}

}
