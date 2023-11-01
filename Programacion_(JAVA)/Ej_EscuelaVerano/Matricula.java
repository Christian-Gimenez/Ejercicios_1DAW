package org.villablanca;

public class Matricula {
	private int numeroMatricula;
	private Alumno alumno;
	private Curso curso;
	private float precioMatricula;
	
	public Matricula(Alumno alumno, Curso curso, int numeroMatricula) {
		this.alumno = alumno;
		this.curso = curso;
		this.numeroMatricula = numeroMatricula;
		this.precioMatricula = curso.getPrecio() - alumno.getDescuento();
		if (this.precioMatricula < 0) {
			this.precioMatricula = 0;
		}
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public float getPrecioMatricula() {
		return precioMatricula;
	}
	
	
	
}
