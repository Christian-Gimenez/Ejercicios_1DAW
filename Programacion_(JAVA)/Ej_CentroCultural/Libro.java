package org.villablanca;

public class Libro extends Prestamo {
	private int paginas;
	
	public Libro(String titulo, String autor, int paginas) {
		super(titulo, autor);
		this.paginas = paginas;
	}

	public int getNumeroPaginas() {
		return paginas;
	}
	
	
}
