package org.villablanca;

public class Disco extends Prestamo {
	private String discografica;
	
	public Disco(String titulo, String autor, String discografica) {
		super(titulo, autor);
		this.discografica = discografica;
	}
	
	public String getDiscografica() {
		return discografica;
	}
}
