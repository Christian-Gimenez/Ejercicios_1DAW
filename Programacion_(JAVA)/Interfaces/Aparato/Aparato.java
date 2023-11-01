package org.villablanca.aparato;

public class Aparato {
	private int consumo;
	private double precio;
	
	public Aparato(int consumo, double precio) {
		this.consumo = consumo;
		this.precio = precio;
	}

	public int getConsumo() {
		return consumo;
	}

	public double getPrecio() {
		return precio;
	}
	
}
