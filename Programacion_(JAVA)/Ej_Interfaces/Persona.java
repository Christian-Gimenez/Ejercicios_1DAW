package org.villablanca;

public class Persona implements Comparable {
	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return apellidos + ", " + nombre;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Persona that = (Persona)o;
		int resultado = this.apellidos.compareTo(that.apellidos);
		if(resultado == 0) {
			resultado = this.nombre.compareTo(that.nombre);
		}
		return resultado;
	}
	

	
}
