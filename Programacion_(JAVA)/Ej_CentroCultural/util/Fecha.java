package org.villablanca.util;

public class Fecha {
	int dia;
	int mes;
	int anio;
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
}
