package org.villablanca.baraja.sieteymedia;

import org.villablanca.baraja.esp.*;

public class Banca extends Jugador {
	
	public Banca() {
		super("La Banca");
	}
	
	public boolean mePlanto(double miPuntuacion, double puntuacionJugador) {
		return Juego_SieteYMedia.SIETE_Y_MEDIA - miPuntuacion < 2 ||
				Juego_SieteYMedia.SIETE_Y_MEDIA - puntuacionJugador < 2;
	}
}
