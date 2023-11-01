package org.villablanca;

public class Butaca {
	private int fila;
	private char columna;
	private Espectador espectador;
	
	public Butaca(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	
	public boolean estaDisponible() {
		return this.espectador == null;
	}

	public String toString() {
		if (!estaDisponible()) {
			return "     ";
		}
		//return String.valueOf(this.fila) + this.columna + ": " + (estaDisponible()?'X':'O');
		return String.valueOf(this.fila) + this.columna + ": " + 'X';
	}

	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}
	
	
	
}
