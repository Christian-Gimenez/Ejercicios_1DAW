package org.villablanca.animales;

public class Salchicha extends Perro implements Sonido {
	@Override
	public void voz() {
		System.out.println("Mmmmmhh woof woof!");
	}
	
	@Override
	public void vozDormido() {
		System.out.println("GRRRRRRrrrr");
	}
}
