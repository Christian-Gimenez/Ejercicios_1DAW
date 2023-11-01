package org.villablanca;

import java.util.ArrayList;

public class Profesor extends Persona {
	private ArrayList<Curso> cursosImpartidos;
	
	public Profesor(String nombre, String apellidos) {
		super(nombre, apellidos);
	}
	
	public void addCursoImpartido(Curso curso) {
		cursosImpartidos.add(curso);
	}
	
	public ArrayList<Curso> getCursosImpartidos() {
		return cursosImpartidos;
	}
}
