package org.villablanca.ave;

import org.villablanca.Hablar;

public class Piolin extends Canario implements Hablar {
	private int numPeliculas;
	
	public Piolin(String sexo, int edad, String canta, int numPeliculas) {
		super(sexo, edad, canta);
		// TODO Auto-generated constructor stub
		this.numPeliculas = numPeliculas;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy un PIOLIN y sé hablar.\n"
				+ "\tSexo: " + getSexo() + "\tEdad: " + getEdad() +"\n"
				+ "\tCanta: " + getCanta() + "\tPeliculas: " + numPeliculas);

	}

	public int getNumPeliculas() {
		return numPeliculas;
	}

}
