package org.villablanca.aparato;

import org.villablanca.Hablar;

public class Tv extends Aparato implements Hablar {
	
	private boolean teletexto;
	private float pulgadas;

	public Tv(int consumo, double precio, boolean teletexto, float pulgadas) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.pulgadas = pulgadas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy un TV y sé hablar.\n"
				+ "\tConsumo: " + getConsumo() + "\tPrecio: " + getPrecio() +"\n"
				+ "\tTeletexto: " + (teletexto?"Sí":"No") + "\tPulgadas: " + pulgadas);

	
	}

	public boolean isTeletexto() {
		return teletexto;
	}

	public float getPulgadas() {
		return pulgadas;
	}

}
