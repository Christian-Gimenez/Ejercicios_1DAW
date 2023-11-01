package org.villablanca;

public class Directivo extends Empleado {
	protected String categoria;
	
	protected Empleado[] subordinados;
	
	public String mostrarDatos() {
		return "Soy un directivo. Mi nombre es " + nombre + " y tengo "
				+ edad + " años y categoria " + categoria;
	
	}
}
