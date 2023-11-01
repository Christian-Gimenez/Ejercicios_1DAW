package org.villablanca;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ciclista extends Atleta {
	private String nombrePrueba;
	private int numeroEtapas;
	private int puestoClasificacion;
	private int numEtapasGanadas;
	
	public Ciclista(String dni, String nombre) {
		super(dni, nombre);
	}

	public Ciclista(String dni, String nombre, LocalDate fecha, LocalTime marca) {
		super(dni, nombre, fecha, marca);
	}

	public String getNombrePrueba() {
		return nombrePrueba;
	}

	public int getNumeroEtapas() {
		return numeroEtapas;
	}

	public int getPuestoClasificacion() {
		return puestoClasificacion;
	}

	public int getNumEtapasGanadas() {
		return numEtapasGanadas;
	}

	@Override
	public String toString() {
		return "Ciclista [nombrePrueba=" + nombrePrueba + ", numeroEtapas=" + numeroEtapas + ", puestoClasificacion="
				+ puestoClasificacion + ", numEtapasGanadas=" + numEtapasGanadas + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + "]";
	}
	
	
	
}
