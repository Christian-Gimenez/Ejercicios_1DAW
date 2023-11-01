package org.villablanca;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public abstract class Deportista {
	private String dni;
	private String nombre;
	private LocalDate fecha;
	private LocalTime marca;
	
	public Deportista(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Deportista(String dni, String nombre, LocalDate fecha, LocalTime marca) {
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.marca = marca;
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public LocalTime getMarca() {
		return marca;
	}
	
	public void setMarca(LocalTime marca) {
		this.marca = marca;
		
	}

	@Override
	public String toString() {
		return "Deportista [dni=" + dni + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		return Objects.equals(dni, other.dni);
	}

	
	
}
