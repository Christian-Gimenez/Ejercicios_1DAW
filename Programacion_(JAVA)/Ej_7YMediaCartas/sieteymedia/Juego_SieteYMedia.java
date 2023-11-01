package org.villablanca.baraja.sieteymedia;

import org.villablanca.baraja.esp.*;

import daw.com.Teclado;

public class Juego_SieteYMedia {
	
	public static final double SIETE_Y_MEDIA = 7.5;
	
	public static boolean sePlantaLaBanca(double miPuntuacion, double puntuacionJugador) {
		return Juego_SieteYMedia.SIETE_Y_MEDIA - miPuntuacion < 2 ||
				Juego_SieteYMedia.SIETE_Y_MEDIA - puntuacionJugador < 2;
		
	}
	
	public static Carta darCartaTapada(Baraja baraja, boolean tapada) {
		Carta carta = baraja.dar();
		carta.setTapada(tapada);
		return carta;
	}
	
	public static boolean preguntarPlantarse(Jugador jugador) {
		char respuesta;
		System.out.print(jugador.getNombre() + " ¿Deseas plantarte ahora? (S/N) ");
		respuesta = Teclado.leerString().charAt(0);
		if(jugador.mePlanto(respuesta)) {
			System.out.println(jugador.getNombre() + ": Sí, me planto.");
			return true;
		} else {
			System.out.println(jugador.getNombre() + ": No.");
			return false;
		}
	}
	
	public static void mostrarCartaRecibida(Jugador jugador) {
		if (!jugador.getMano()[jugador.getCantidadCartas()-1].isTapada()) {
			System.out.println("La carta que recibió " + jugador.getNombre() + " es:");
			System.out.println(jugador.getMano()[jugador.getCantidadCartas()-1]);
		}
	}
	
	public static double puntuacion(Jugador jugador) {
		double resultado = 0.0;
		for(int i = 0; i < jugador.getMano().length && i < jugador.getCantidadCartas(); i++) {
			Carta carta = jugador.getMano()[i];
			if (!carta.isTapada()) {
				resultado += carta.valorNumero();
			}
		}
		return resultado;
	}
	
	//public static void 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja baraja = new Baraja();
		Jugador banca = new Jugador("La Banca");
		Jugador jugador1;
		double puntuacionJ1 = 0.0;
		double puntuacionBanca = 0.0;
		boolean sePlantaJ1 = false;
		boolean sePlantaBanca = false;
		Carta carta;
		
		System.out.print("Jugador, introduce tu nombre: ");
		jugador1 = new Jugador(Teclado.leerString());
		
		System.out.println("¡Que cominece el juego!");
		System.out.println("La Banca barajea la baraja.");
		baraja.barajar();
		System.out.println("La Banca reparte 1 carta tapada a cada jugador.");
		carta = darCartaTapada(baraja, true);
		jugador1.dameCarta(carta);
		carta = darCartaTapada(baraja, true);
		banca.dameCarta(carta);
		
		while(!finPartida(puntuacionJ1, puntuacionBanca, sePlantaJ1, sePlantaBanca)) {
			puntuacionJ1 = puntuacion(jugador1);
			puntuacionBanca = puntuacion(banca);
			
			sePlantaJ1 = preguntarPlantarse(jugador1);
			if (!sePlantaJ1) {
				sePlantaBanca = sePlantaLaBanca(puntuacionBanca, puntuacionJ1);
				if (sePlantaBanca) {
					System.out.println("La banca se ha plantado.");
				} else {
					System.out.println("La banca reparte 1 carta destapada a cada jugador");
					carta = darCartaTapada(baraja, false);
					jugador1.dameCarta(carta);
					mostrarCartaRecibida(jugador1);
					System.out.println();
					
					carta = darCartaTapada(baraja, false);
					banca.dameCarta(carta);
					mostrarCartaRecibida(banca);
					System.out.println();
			
				}
			}
		}
		
		System.out.println("Se destapan todas las cartas y se hace conteo del resultado:");
		destaparTodasLasCartas(jugador1.getMano());
		destaparTodasLasCartas(banca.getMano());
		puntuacionJ1 = puntuacion(jugador1);
		puntuacionBanca = puntuacion(banca);
		
		System.out.println("Cartas de " + jugador1.getNombre() + ": ");
		System.out.println(jugador1.mostrarMano());
		System.out.println("Puntuación: " + puntuacionJ1);
		
		System.out.println("Cartas de " + banca.getNombre() + ": ");
		System.out.println(banca.mostrarMano());
		System.out.println("Puntuación: " + puntuacionBanca);
		
		System.out.println("El ganador de esta ronda es: " + gana(jugador1, puntuacionJ1, banca, puntuacionBanca).getNombre());
	}
	
	public static boolean finPartida(double puntuacionJ1, double puntuacionBanca, boolean sePlantaJ1, boolean sePlantaBanca) {
		return seHaPasado(puntuacionJ1) || seHaPasado(puntuacionBanca)
				|| sePlantaJ1 || sePlantaBanca;
	}
	
	public static boolean seHaPasado(double puntuacion) {
		return puntuacion > SIETE_Y_MEDIA;
	}

	public static boolean haySieteYMedia(double puntuacion) {
		return puntuacion == SIETE_Y_MEDIA; 
	}
	
	public static void destaparTodasLasCartas(Carta[] cartas) {
		for(int i = 0; i < cartas.length && cartas[i] != null; i++) {
			cartas[i].setTapada(false);
		}
	}
	
	public static Jugador gana(Jugador jugador1, double puntuacionJ1, Jugador banca, double puntuacionBanca) {
		Jugador ganador;
		if (haySieteYMedia(puntuacionBanca)) {
			ganador = banca;
		} else if (haySieteYMedia(puntuacionJ1)) {
			ganador = jugador1;
		} else {
			if (seHaPasado(puntuacionJ1)) {
				ganador = banca;
			} else if (seHaPasado(puntuacionBanca)) {
				ganador = jugador1;
			} else {
				if (SIETE_Y_MEDIA - puntuacionJ1 < SIETE_Y_MEDIA - puntuacionBanca) {
					ganador = jugador1;
				} else {
					ganador = banca;
				}
			}
		}
		return ganador;
	}
}
