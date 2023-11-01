package org.villablanca.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TableroTest {

	@Test
	void testPutFicha() {
		Tablero tablero = new Tablero();
		Coordenada coordenada = new Coordenada(1,1);
		tablero.putFicha(coordenada, Ficha.O);
		assertEquals(Ficha.O, tablero.getFicha(coordenada));
	}
	
	@ParameterizedTest
	@MethodSource("datosParaHayTresEnRaya")
	void testHayTresEnRaya(Tablero tablero, Ficha ficha) {
		assertTrue(tablero.hayTresEnRaya(ficha));
	}
	
	@ParameterizedTest
	@MethodSource("datosParaNoHayTresEnRaya")
	void testNoHayTresEnRaya(Tablero tablero, Ficha ficha) {
		assertFalse(tablero.hayTresEnRaya(ficha));
	}
	
	static Stream<Arguments> datosParaHayTresEnRaya() {
		return Stream.of(
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.X, Ficha.V, Ficha.O},
							{Ficha.V, Ficha.O, Ficha.V},
							{Ficha.O, Ficha.V, Ficha.X}
						}) ,Ficha.O),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.O, Ficha.V, Ficha.X},
							{Ficha.V, Ficha.X, Ficha.V},
							{Ficha.X, Ficha.V, Ficha.O}
						}), Ficha.X),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.O, Ficha.V, Ficha.X},
							{Ficha.O, Ficha.X, Ficha.V},
							{Ficha.O, Ficha.V, Ficha.X},
						}), Ficha.O),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.V, Ficha.X, Ficha.O},
							{Ficha.V, Ficha.X, Ficha.O},
							{Ficha.O, Ficha.X, Ficha.V}
						}) ,Ficha.X),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.X, Ficha.V, Ficha.O},
							{Ficha.V, Ficha.X, Ficha.O},
							{Ficha.X, Ficha.V, Ficha.O}
						}), Ficha.O),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.X, Ficha.O, Ficha.O},
							{Ficha.V, Ficha.X, Ficha.V},
							{Ficha.O, Ficha.V, Ficha.X},
						}), Ficha.X)
				);
	}
	
	static Stream<Arguments> datosParaNoHayTresEnRaya() {
		return Stream.of(
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.X, Ficha.V, Ficha.O},
							{Ficha.V, Ficha.O, Ficha.V},
							{Ficha.X, Ficha.V, Ficha.X}
						}) ,Ficha.O),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.O, Ficha.O, Ficha.X},
							{Ficha.X, Ficha.X, Ficha.O},
							{Ficha.O, Ficha.X, Ficha.O}
						}), Ficha.X),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.O, Ficha.V, Ficha.X},
							{Ficha.X, Ficha.X, Ficha.O},
							{Ficha.O, Ficha.V, Ficha.X},
						}), Ficha.O),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.V, Ficha.X, Ficha.O},
							{Ficha.V, Ficha.O, Ficha.O},
							{Ficha.O, Ficha.X, Ficha.V}
						}) ,Ficha.X),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.X, Ficha.V, Ficha.O},
							{Ficha.V, Ficha.X, Ficha.X},
							{Ficha.X, Ficha.V, Ficha.O}
						}), Ficha.O),
				Arguments.of(crearTablero(
						new Ficha[][] {
							{Ficha.X, Ficha.O, Ficha.O},
							{Ficha.V, Ficha.O, Ficha.V},
							{Ficha.X, Ficha.V, Ficha.X},
						}), Ficha.X)
				);
	}
	
	static Tablero crearTablero(Ficha fichas[][]) {
		Tablero tablero = new Tablero();
		for(int i = 0; i < Coordenada.DIMENSION; i++) {
			for(int j = 0; j < Coordenada.DIMENSION; j++) {
				tablero.putFicha(new Coordenada(i, j), fichas[i][j]);
			}
		}
		return tablero;
	}

}
