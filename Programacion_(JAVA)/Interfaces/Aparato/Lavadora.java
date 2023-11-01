package org.villablanca.aparato;

public class Lavadora extends Aparato {
	private double alto;
	private double ancho;
	
	public Lavadora(int consumo, double precio) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
		// TODO Auto-generated constructor stub
	}

	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}
	
}
