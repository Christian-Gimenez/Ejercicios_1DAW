package org.villablanca;

import daw.com.Teclado;

public class Persona {
	private String nombre;
	private int edad;
	private double estatura;
	
	public String getNombre() {
		return nombre;
	}
	
	public void saluda() {
		System.out.println("Hola!! Me llamo " + nombre + ". Tengo " +
				edad + " años y soy un objeto de tipo persona.");
	}


	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	
}
