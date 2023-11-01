package org.villablanca.persona;

import org.villablanca.Hablar;

public class Bedel extends Persona implements Hablar {
	private String turno;
	private int antiguedad;
	
	public Bedel(String nombre, int edad, String turno, int antiguedad) {
		super(nombre, edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy un BEDEL y sé hablar.\n"
				+ "\tNombre: " + getNombre() + "\tEdad: " + getEdad() +"\n"
				+ "\tTurno: " + turno + "\tAntiguedad: " + antiguedad);
	}

	public String getTurno() {
		return turno;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	
}
