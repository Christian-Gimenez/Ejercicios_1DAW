package org.villablanca;

public abstract class Figura {
	private Color color;
	
	public Figura(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public abstract double area();
}
