package org.villablanca;

public class Empleado extends Persona {
	protected float sueldo;
	
	public String mostrarDatos() {
		return "Soy un empleado. Mi nombre es " + nombre + " y tengo " + edad + " años.";
	}
}
