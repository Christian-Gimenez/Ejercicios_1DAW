package org.villablanca.persona;

import org.villablanca.Hablar;

public class Profesor extends Persona implements Hablar {
	private String despacho;
	private String email;
	
	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy un PROFESOR y sé hablar.\n"
				+ "\tNombre: " + getNombre() + "\tEdad: " + getEdad() +"\n"
				+ "\tDespacho: " + despacho + "\tEmail: " + email);
	}

	public String getDespacho() {
		return despacho;
	}

	public String getEmail() {
		return email;
	}
	
	
}
