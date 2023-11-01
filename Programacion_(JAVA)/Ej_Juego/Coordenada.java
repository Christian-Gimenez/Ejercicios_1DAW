package org.villablanca.modelo;

public class Coordenada {
	public static final int DIMENSION = 3;
	
	private int fila;
	private int columna;
	
	public Coordenada(int fila, int columna) {
		super();
		this.fila = fila;
		this.columna = columna;
	}
	public int getFila() {
		return fila;
	}
	public int getColumna() {
		return columna;
	}
	
}
