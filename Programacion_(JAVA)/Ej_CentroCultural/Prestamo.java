package org.villablanca;

import org.villablanca.util.Fecha;

public class Prestamo {
	private static int GENERADOR_CODIGO = 1;
	private int codigo;
	private String titulo;
	private String autor;
	private Fecha inicio;
	private Fecha fin;
	
	public Prestamo(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = GENERADOR_CODIGO++;
	}

	public Fecha getInicio() {
		return inicio;
	}

	public void setInicio(Fecha inicio) {
		this.inicio = inicio;
	}

	public Fecha getFin() {
		return fin;
	}

	public void setFin(Fecha fin) {
		this.fin = fin;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}
	
	@Override
	public String toString() {
		return codigo + "\tTitulo: " + titulo + "\tAutor: " + autor;
	}
}
