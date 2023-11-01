package org.villablanca;

public class Coche extends Vehiculo {
	private int numPlazas;
	
	public Coche(int potencia, int numPlazas) {
		super(potencia);
		this.numPlazas = numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}
	
	
}
