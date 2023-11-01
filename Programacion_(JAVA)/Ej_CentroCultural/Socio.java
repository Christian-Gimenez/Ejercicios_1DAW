package org.villablanca;

import java.util.ArrayList;
import java.util.Objects;

public class Socio {
	private String dni;
	private String nombre;
	private ArrayList<Prestamo> prestamos; //Max 5
	
	public Socio(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getNumeroPrestamos() {
		return prestamos.size();
	}

	@Override
	public boolean equals(Object obj) {
		Socio otro = (Socio)obj;
		return this.nombre.equals(otro.getNombre()) &&
				this.dni.equals(otro.getDni());
	}
	
}
