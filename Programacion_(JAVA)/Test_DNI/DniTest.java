package org.villablanca.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DniTest {

	/*@Test
	void testDni() {
		fail("Not yet implemented");
	}*/

	@ParameterizedTest
	@MethodSource("datosParaLongitudValida")
	void testLongitudValida(String cadena) {
		Dni dni = new Dni(cadena);
		assertTrue(dni.longitudValida());
	}
	
	@ParameterizedTest
	@MethodSource("datosParaLongitudNoValida")
	void testLongitudNoValida(String cadena) {
		Dni dni = new Dni("1234567Z");
		assertFalse(dni.longitudValida());
	}
	

	
	
	
	
	
	static Stream<Arguments> datosParaLongitudNoValida() {
		return Stream.of(
					Arguments.of("123458Z"),
					Arguments.of("515906955675Q"),
					Arguments.of("4089"),
					Arguments.of("29824333096L")
				);
	}
	
	
	
	
	
	

	@ParameterizedTest
	@MethodSource("datosParaGetNumero")
	void testGetNumero(Dni dni, int numeroEsperado) {
		assertEquals(dni.getNumero(), numeroEsperado);
	}
	
	static Stream<Arguments> datosParaGetNumero() {
		return Stream.of(
					Arguments.of(new Dni("12345678Z"), 12345678),
					Arguments.of(new Dni("51590695Q"), 51590695),
					Arguments.of(new Dni("09242016H"), 9242016),
					Arguments.of(new Dni("29824096L"), 29824096)
				);
	}

	@ParameterizedTest
	@MethodSource("datosParaGetLetra")
	void testGetLetra(Dni dni, char letraEsperada) {
		assertEquals(dni.getLetra(), letraEsperada);
	}
	
	static Stream<Arguments> datosParaGetLetra() {
		return Stream.of(
					Arguments.of(new Dni("12345678Z"), 'Z'),
					Arguments.of(new Dni("51590695Q"), 'Q'),
					Arguments.of(new Dni("09242016H"), 'H'),
					Arguments.of(new Dni("29824096L"), 'L')
				);
	}

	@ParameterizedTest
	@MethodSource("datosParaDniValido")
	void testEsValido(Dni dni) {
		assertTrue(dni.esValido());
	}
	
	
	static Stream<Arguments> datosParaDniValido() {
		return Stream.of(
					Arguments.of(new Dni("12345678Z")),
					Arguments.of(new Dni("51590695Q")),
					Arguments.of(new Dni("09242016H")),
					Arguments.of(new Dni("29824096L"))
				);
	}

	
	@ParameterizedTest
	@MethodSource("datosParaDniNoValido")
	void testNoEsValido(Dni dni) {
		assertFalse(dni.esValido());
	}
	
	static Stream<Arguments> datosParaDniNoValido() {
		return Stream.of(
					Arguments.of(new Dni("12345678A")),
					Arguments.of(new Dni("51590695F")),
					Arguments.of(new Dni("092420146H")),
					Arguments.of(new Dni("2982409L"))
				);
	}
}
x