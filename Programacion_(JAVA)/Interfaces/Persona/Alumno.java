package org.villablanca.persona;

import org.villablanca.Hablar;

public class Alumno extends Persona implements Hablar{
	private String carrera;
	private int curso;
	
	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy un ALUMNO y sé hablar.\n"
				+ "\tNombre: " + getNombre() + "\tEdad: " + getEdad() +"\n"
				+ "\tCarrera: " + carrera + "\tCurso: " + curso);

	}

	public String getCarrera() {
		return carrera;
	}

	public int getCurso() {
		return curso;
	}
	
}
