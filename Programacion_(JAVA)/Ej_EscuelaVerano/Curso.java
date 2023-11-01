package org.villablanca;

import java.util.ArrayList;

public class Curso {
	private String nombre;
	private float precio;
	private ArrayList<Matricula> alumnosMatriculados;
	
	public Curso(String nombre, float precio) {
		this.nombre = nombre;
		if (precio < 0) {
			this.precio = 0;
		} else {
			this.precio = precio;
		}
	}
	
	public void addMatriculaAlumno(Matricula matricula) {
		alumnosMatriculados.add(matricula);
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if (precio < 0) {
			this.precio = 0;
		} else {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Matricula> getAlumnosMatriculados() {
		return alumnosMatriculados;
	}
	
	
	
}
