package org.villablanca.animales;

import java.time.LocalDate;

public class Animal {
	LocalDate fechaNacimiento;
	
	public Animal() {
		fechaNacimiento = LocalDate.now();
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
}
