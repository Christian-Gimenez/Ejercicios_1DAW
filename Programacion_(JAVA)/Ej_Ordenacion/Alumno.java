package org.villablanca;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private float nota;
	
	public Alumno(String nombre, String apellidos, int edad, float nota) throws AlumnoNoValidoException {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nota = nota;
		if(edad < 0) {
			throw new AlumnoNoValidoException("Alumno con edad invalida: " + edad);
		}
		
		if(nota <0 || nota > 10) {
			throw new AlumnoNoValidoException("Alumno con nota invalida: " + nota);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public float getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", nota=" + nota + "]";
	}
	
	
}
