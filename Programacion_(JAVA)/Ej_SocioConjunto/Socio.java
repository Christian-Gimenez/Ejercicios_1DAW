package org.villablanca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Socio implements Comparable<Socio> {
	/*Implementar la clase Socio
	 * dni, nombre y fecha de alta
	 * compareTo -> dni
	 * menu:
	 * 1. Alta
	 * 2. Baja
	 * 3. Modificaciones
	 * 4. Listado por DNI
	 * 5. Listado por antigüedad
	 * 6. Salir
	 * */
	private String dni;
	private String nombre;
	private LocalDate fecha_alta;
	
	
	public Socio(String dni) {
		this.dni = dni;
	}

	public Socio(String dni, String nombre, String fecha_alta) {
		this.dni = dni;
		this.nombre = nombre;
		setFecha_alta(fecha_alta);
	}


	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFecha_alta() {
		return fecha_alta;
	}


	public void setFecha_alta(String fecha_alta) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		this.fecha_alta = LocalDate.parse(fecha_alta, dateTimeFormatter);
	}


	@Override
	public int compareTo(Socio o) {
		// TODO Auto-generated method stub
		return this.dni.compareTo(o.getDni());
	}

	@Override
	public boolean equals(Object obj) {
		return dni.equals(((Socio)obj).getDni());
	}

	@Override
	public String toString() {
		return "DNI: " + dni + "\tNombre: " + nombre + "\tFecha alta: " + fecha_alta;
	}
	
	
	
}
