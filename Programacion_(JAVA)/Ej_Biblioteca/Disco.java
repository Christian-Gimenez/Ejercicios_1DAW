package org.villablanca.biblioteca;

public class Disco extends Material {
	
	private String grupo;

	public Disco(String codigo, String titulo, String grupo, Bibliotecario bibliotecario) {
		super(codigo, titulo, bibliotecario);
		this.grupo = grupo;
	}

	public String getGrupo() {
		return grupo;
	}

	@Override
	public int compareTo(Object o) {
		Disco that = (Disco)o;
		if (this.getGrupo().compareTo(that.getGrupo())==0) {
			 return this.getTitulo().compareTo(that.getTitulo());
		} else {
			return this.getGrupo().compareTo(that.getGrupo());
		}
	}

	@Override
	public String toString() {
		return "Disco [grupo=" + grupo + "]";
	}
	
	


}