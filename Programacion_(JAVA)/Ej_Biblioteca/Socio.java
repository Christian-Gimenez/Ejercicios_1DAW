package org.villablanca.biblioteca;

import java.util.ArrayList;

public class Socio extends Persona implements Comparable {

	private static int GENERADOR_NUMEROS = 0;
	private int numeroSocio = 0;
	
	private ArrayList<Prestamo> prestamos;
	
	public Socio(String nombre, String dni) {
		super(nombre, dni);
		Socio.GENERADOR_NUMEROS++;
		this.numeroSocio = Socio.GENERADOR_NUMEROS;
		this.prestamos = new ArrayList<Prestamo>();
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}
	
	public boolean addPrestamo(Prestamo prestamo) {
		if(prestamos.size() > Prestamo.NUMERO_MAXIMO) {
			return false;
		} else {
			prestamos.add(prestamo);
			return true;
		}
	}

	@Override
	public int compareTo(Object o) {
		Socio that = (Socio)o;
		return this.getNombre().compareTo(that.getNombre());
	}

	
}
