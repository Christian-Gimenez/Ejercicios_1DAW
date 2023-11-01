package org.villablanca.biblioteca;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Prestamo {

	private LocalDate inicio;
	private LocalDate fin;
	private Material material;
	
	public static final int DIAS_DURACION = 5;
	public static final int NUMERO_MAXIMO = 5;
	
	public Prestamo(Material material) {
		this.inicio = LocalDate.now();
		this.fin = calcularFechaDevolucion(inicio);
		this.material = material;
	}

	private LocalDate calcularFechaDevolucion(LocalDate fecha) {
		LocalDate devolucion = fecha.plusDays(DIAS_DURACION);
		if (devolucion.getDayOfWeek() == DayOfWeek.SATURDAY) {
			devolucion.plusDays(2);
		} else if (devolucion.getDayOfWeek() == DayOfWeek.SUNDAY) {
			devolucion.plusDays(1);		
		}
		return devolucion;
	}
	
	public boolean estaExpirado() {
		return this.fin.isBefore(LocalDate.now());
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public Material getMaterial() {
		return material;
	}
	
	
	
}
