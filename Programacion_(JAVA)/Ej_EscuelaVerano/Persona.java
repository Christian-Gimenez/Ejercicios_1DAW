package org.villablanca;

public class Persona {
	private String nombre;
	private String apellidos;
	private String DNI;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = generarDNI();
	}
	
	
	private String generarDNI() {
		int numero = (int)(Math.random()*10e8);
		String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo = numero % 23;
		return "" + numero + "" + letrasPosibles.charAt(modulo);
	}
}
