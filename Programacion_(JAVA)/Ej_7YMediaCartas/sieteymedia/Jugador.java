package org.villablanca.baraja.sieteymedia;

import org.villablanca.baraja.esp.*;

public class Jugador {
	private Carta[] mano;
	private int cantidadCartas;
	private String nombre;
	
	public Jugador(String nombre) {
		mano = new Carta[14];
		this.nombre = nombre;
	}
	
	public void dameCarta(Carta carta) {
		mano[cantidadCartas] = carta;
		cantidadCartas++;
	}
	
	public void descubreCarta(int numeroCarta) {
		if (numeroCarta <= cantidadCartas && numeroCarta < mano.length) {
			mano[numeroCarta].setTapada(false);
		}
	}
	
	public double valorCartasDestapadas() {
		double resultado = 0.0;
		for(int i = 0; i < mano.length && mano[i] != null; i++) {
			if (!mano[i].isTapada()) {
				resultado += mano[i].valorNumero();
			}
		}
		return resultado;
	}
	
	public boolean mePlanto(char respuesta) {
		if (Character.toUpperCase(respuesta) == 'S') {
			return true;
		}
		return false;
	}

	public Carta[] getMano() {
		return mano;
	}

	public int getCantidadCartas() {
		return cantidadCartas;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String mostrarMano() {
		String resultado = "";
		for(int i = 0; i < mano.length && i < cantidadCartas; i++) {
			if (i == mano.length-1 || i == cantidadCartas-1) {
				resultado += mano[i];
			} else {
				resultado += mano[i] + "\n";
			}
		}
		return resultado;
	}
	
}
