package org.villablanca;

public class Cliente extends Persona {
	protected String telefono;
	
	public String mostrarDatos() {
		return "Soy un cliente. Mi nombre es " + nombre + " y tengo " +
	edad + " años.\nMi telefono de contacto es " + telefono;
	}
}
