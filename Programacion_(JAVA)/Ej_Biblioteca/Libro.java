package org.villablanca.biblioteca;

public class Libro extends Material {
	
	private int paginas;
	private String autor;
	private Genero genero;
	
	public Libro(String codigo, String titulo, int paginas, String autor, Genero genero, Bibliotecario bibliotecario) {
		super(codigo, titulo, bibliotecario);
		this.paginas = paginas;
		this.autor = autor;
		this.genero = genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public String getAutor() {
		return autor;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public int compareTo(Object o) {
		Libro that = (Libro)o;
		if (this.getAutor().compareTo(that.getAutor())==0) {
			 return this.getTitulo().compareTo(that.getTitulo());
		} else {
			return this.getTitulo().compareTo(that.getAutor());
		}
	}
	
}
