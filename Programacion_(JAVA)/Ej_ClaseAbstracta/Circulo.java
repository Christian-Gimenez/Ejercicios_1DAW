package org.villablanca;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(double radio, Color color) {
		super(color);
		this.radio = radio;
	}

	@Override 
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

}
