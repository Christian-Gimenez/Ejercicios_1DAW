package org.villablanca.videojuego;

import org.villablanca.Entregable;

public class Videojuego implements Entregable {
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String compania;
	
	public Videojuego() {
		horasEstimadas = 10;
		entregado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		entregado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		entregado = false;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	@Override
	public String toString() {
		return "Videojuego:\n\t-Titulo: " + titulo +
				"\n\t-Número de horas estimadas: " + horasEstimadas +
				"\n\t-Entregado: " + (entregado?"Sí":"No") +
				"\n\t-Compañía: " + compania;
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
