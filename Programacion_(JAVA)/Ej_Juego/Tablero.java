package org.villablanca.modelo;

public class Tablero {
	
	private Ficha[][] fichas;
	
	public Tablero() {
		fichas = new Ficha[Coordenada.DIMENSION][Coordenada.DIMENSION];
		for(int i = 0; i < Coordenada.DIMENSION; i++) {
			for(int j = 0; j < Coordenada.DIMENSION; j++) {
				fichas[i][j] = Ficha.V;
			}
		}
	}
	
	public Ficha getFicha(Coordenada coordenada) {
		//Pre-condicion, si no se cumple explota
		assert coordenada != null && coordenada.getFila() < Coordenada.DIMENSION
				&& coordenada.getFila() >= 0
				&& coordenada.getColumna() < Coordenada.DIMENSION
				&& coordenada.getColumna() >=0;
		return fichas[coordenada.getFila()][coordenada.getColumna()];
	}
	
	public boolean posicionLibre(Coordenada coordenada) {
		return getFicha(coordenada) == Ficha.V;
	}
	
	public void putFicha(Coordenada coordenada, Ficha ficha) {
		assert posicionLibre(coordenada);
		this.fichas[coordenada.getFila()][coordenada.getColumna()] = ficha;
	}
	
	public boolean hayTresEnRaya(Ficha ficha) {
		return hayFilaCompleta(ficha) ||
				hayColumnaCompleta(ficha) ||
				hayDiagonalCompleta(ficha);
	}
	
	public boolean hayFilaCompleta(Ficha ficha) {
		boolean hayFila = false;
		for(int i = 0; i < this.fichas.length; i++) {
			if (this.fichas[i][0] == ficha &&
				this.fichas[i][1] == ficha &&
				this.fichas[i][2] == ficha) {
				hayFila = true;
			}
		}
		
		return hayFila;
	}
	
	public boolean hayColumnaCompleta(Ficha ficha) {
		boolean hayColumna = false;
		for(int i = 0; i < this.fichas[0].length; i++) {
			if (this.fichas[0][i] == ficha &&
				this.fichas[1][i] == ficha &&
				this.fichas[2][i] == ficha) {
				hayColumna = true;
			}
		}
		return hayColumna;
		
	}
	
	public boolean hayDiagonalCompleta(Ficha ficha) {
		return hayDiagonalPrincipal(ficha) || hayDiagonalSecundaria(ficha);
	}
	
	public boolean hayDiagonalPrincipal(Ficha ficha) {
		return this.fichas[0][0] == ficha &&
				this.fichas[1][1] == ficha &&
				this.fichas[2][2] == ficha;
	}
	
	public boolean hayDiagonalSecundaria(Ficha ficha) {
		return this.fichas[0][this.fichas.length-1] == ficha &&
				this.fichas[this.fichas.length-2][1] == ficha &&
				this.fichas[2][this.fichas.length-3] == ficha;
	}
}
