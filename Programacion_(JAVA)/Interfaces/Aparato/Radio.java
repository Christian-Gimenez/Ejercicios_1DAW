package org.villablanca.aparato;

import org.villablanca.Hablar;

public class Radio extends Aparato implements Hablar {
	private boolean casette;
	private int potencia;
	
	public Radio(int consumo, double precio, boolean casette, int potencia) {
		super(consumo, precio);
		this.casette = casette;
		this.potencia = potencia;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy un TV y sé hablar.\n"
				+ "\tConsumo: " + getConsumo() + "\tPrecio: " + getPrecio() +"\n"
				+ "\tCasette: " + (casette?"Sí":"No") + "\tPotencia: " + potencia);
	}

	public boolean isCasette() {
		return casette;
	}

	public int getPotencia() {
		return potencia;
	}
	
	
}
