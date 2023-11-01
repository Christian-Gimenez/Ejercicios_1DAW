package org.villablanca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona implements Comparable<Persona> {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private int edad;
	
	@Override
	public int compareTo(Persona o) {
		return this.dni.compareTo(o.getDni());
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	
	public Persona(String dni, String nombre, String fechaNacimiento, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		setFechaNacimiento(fechaNacimiento);
		this.edad = edad;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFecha);
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	
	
	
	
}
