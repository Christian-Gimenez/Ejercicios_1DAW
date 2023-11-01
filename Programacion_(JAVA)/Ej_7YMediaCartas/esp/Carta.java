package org.villablanca.baraja.esp;

public class Carta {
	private Palo palo;
	private Numero numero;
	private boolean tapada;
	
	public Carta(Palo palo, Numero numero) {
		this.palo = palo;
		this.numero = numero;
		this.tapada = true;
	}

	@Override
	public String toString() {
		return "[" + numero + " de " + palo + "]";
	}

	public boolean isTapada() {
		return tapada;
	}

	public void setTapada(boolean tapada) {
		this.tapada = tapada;
	}
	
	public double valorNumero() {
		double resultado = 0.0;
		switch(numero) {
		case AS:
			resultado = 1.0;
			break;
		case DOS:
			resultado = 2.0;
			break;
		case TRES:
			resultado = 3.0;
			break;
		case CUATRO:
			resultado = 4.0;
			break;
		case CINCO:
			resultado = 5.0;
			break;
		case SEIS:
			resultado = 6.0;
			break;
		case SIETE:
			resultado = 7.0;
			break;
		case SOTA, CABALLO, REY:
			resultado = 0.5;
			break;
		}
		return resultado;
	}
}
