package org.villablanca;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atleta extends Deportista {
	private String lugarPrueba;
	private float distanciaRecorrida;
	
	public Atleta(String dni, String nombre) {
		super(dni, nombre);
	}

	public Atleta(String dni, String nombre, LocalDate fecha, LocalTime marca) {
		super(dni, nombre, fecha, marca);
		// TODO Auto-generated constructor stub
	}



	public String getLugarPrueba() {
		return lugarPrueba;
	}

	public float getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	@Override
	public String toString() {
		return "Atleta [lugarPrueba=" + lugarPrueba + ", distanciaRecorrida=" + distanciaRecorrida + ", getDni()="
				+ getDni() + ", getNombre()=" + getNombre() + "]";
	}


	
	
}
