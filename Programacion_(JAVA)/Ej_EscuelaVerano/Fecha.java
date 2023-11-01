package org.villablanca;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		if(diaCorrecto(dia)) {
			this.dia = dia;
		} else {
			this.dia = 1;
		}
		if(mesCorrecto(mes)) {
			this.mes = mes;
		} else {
			this.mes = 1;
		}
		
		if(anioCorrecto(anio)) {
			this.anio = anio;
		} else {
			this.anio = 2000;
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}
	
	private boolean diaCorrecto(int dia) {
		if(dia <= 31 && dia > 0) {
			return true;
		} else {
			return false;
		} 
	}
	
	private boolean mesCorrecto(int mes) {
		if(mes <= 12 && mes > 0) {
			return true;
		} else {
			return false;
		} 
	}
	
	private boolean anioCorrecto(int anio) {
		if(anio >= 0) {
			return true;
		} else {
			return false;
		} 
	}
}
