package org.villablanca;

import java.util.ArrayList;

public class Alumno extends Persona {
	private int id;
	private ArrayList<Matricula> cursosMatriculados;
	private float descuento;
	
	public Alumno(String nombre, String apellidos) {
		super(nombre, apellidos);
		this.id = genId();
		descuento = 0;
	}
	
	public Alumno(String nombre, String apellidos, float tipoDescuento) {
		super(nombre, apellidos);
		this.id = genId();
		this.descuento = tipoDescuento;
	}
	
	private int genId() {
		return (int)(Math.random() * 10e5);
	}
	
	public void setMatriculaCurso(Matricula matricula) {
		cursosMatriculados.add(matricula);
	}

	public int getId() {
		return id;
	}

	public ArrayList<Matricula> getCursosMatriculados() {
		return cursosMatriculados;
	}
	
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	public float getDescuento() {
		return this.descuento;
	}
	
}
