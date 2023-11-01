package org.villablanca.biblioteca;

public class Pelicula extends Material {

	private String director;
	private String resumen;
	
	public Pelicula(String codigo, String titulo, String director, String resumen, Bibliotecario bibliotecario) {
		super(codigo, titulo, bibliotecario);
		this.director = director;
		this.resumen = resumen;
	}

	public String getDirector() {
		return director;
	}

	public String getResumen() {
		return resumen;
	}
	
	@Override
	public int compareTo(Object o) {
		Pelicula that = (Pelicula)o;
		return this.getTitulo().compareTo(that.getTitulo());
	}
	

}
