package org.villablanca;

public class Reserva {
	private Alumno alumno;
	private Curso curso;
	private Fecha fechaReserva;
	
	public Reserva(Alumno alumno, Curso curso, Fecha fecha) {
		this.alumno = alumno;
		this.curso = curso;
		this.fechaReserva = fecha;
	}
	
	public Matricula generarMatricula() {
		return new Matricula(alumno, curso, generarNumeroMatricula());
	}
	
	private int generarNumeroMatricula() {
		return (int)(Math.random() * 10e10);
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public Fecha getFechaReserva() {
		return fechaReserva;
	}
		
	
}
