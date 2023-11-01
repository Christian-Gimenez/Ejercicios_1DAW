package org.villablanca;

public class Profesor extends Empleado {
	private String titulacion;
	private int numeroPublicaciones;
	
	public Profesor(String nombre, int edad, String dni, String titulacion, int numeroPublicaciones) {
		super(nombre, edad, dni);
		this.titulacion = titulacion;
		this.numeroPublicaciones = numeroPublicaciones;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getNumeroPublicaciones() {
		return numeroPublicaciones;
	}

	public void setNumeroPublicaciones(int numeroPublicaciones) {
		this.numeroPublicaciones = numeroPublicaciones;
	}
}
