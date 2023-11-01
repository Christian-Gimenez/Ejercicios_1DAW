package org.villablanca;

public class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado(double lado, Color color) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
	}

}
