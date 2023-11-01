package org.villablanca;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean paga(double cantidad) {
		if (dinero < cantidad) {
			return false;
		} else {
			dinero = dinero - cantidad;
			return true;
		}
	}

}
