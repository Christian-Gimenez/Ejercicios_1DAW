package org.villablanca.serie;

import org.villablanca.Entregable;

public class Serie implements Entregable {
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.numTemporadas = 3;
		this.entregado = false;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie:\n\t-Titulo: " + titulo +
				"\n\t-Número de temporadas: " + numTemporadas +
				"\n\t-Entregado: " + (entregado?"Sí":"No") +
				"\n\t-Genero: " + genero +
				"\n\t-Creador: " + creador;
	}
	
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}
	
}
