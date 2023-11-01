package org.villablanca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PointTest {

	@ParameterizedTest
	@MethodSource("datosTestPointNotNull")
	void testPointNotNull(double x, double y) {
		assertNotNull(new Point(x, y));
	}
	
	static Stream<Arguments> datosTestPointNotNull() {
		return Stream.of(
				Arguments.of(4, 7.56),
				Arguments.of(-20.1, 58),
				Arguments.of(99.1, 12.456),
				Arguments.of(1, 100)
				);
	}

	@ParameterizedTest
	@MethodSource("datosTestToString")
	void testToString(Point punto, String resultadoEsperado) {
		assertEquals(punto.toString(), resultadoEsperado);
	}
	
	static Stream<Arguments> datosTestToString() {
		return Stream.of(
				Arguments.of(new Point(40, 23.5), "(40.0, 23.5)"),
				Arguments.of(new Point(-2.8, 100.3), "(-2.8, 100.3)"),
				Arguments.of(new Point(123, -321), "(123.0, -321.0)"),
				Arguments.of(new Point(-4.5, 58.85), "(-4.5, 58.85)")
				);
	}

	@ParameterizedTest
	@MethodSource("datosTestDistance")
	void testDistance(Point punto, double resultadoEsperado) {
		assertEquals(punto.distance(), resultadoEsperado, 0.0001f);
	}
	
	static Stream<Arguments> datosTestDistance() {
		return Stream.of(
				Arguments.of(new Point(40, 23.5), 46.3923485070),
				Arguments.of(new Point(-2.8, 100.3), 100.33907514024)
				);
	}

	@ParameterizedTest
	@MethodSource("datosTestDistancePoint")
	void testDistancePoint(Point punto1, Point punto2, double resultadoEsperado) {
		assertEquals(punto1.distance(punto2), resultadoEsperado, 0.0001f);
	}
	
	static Stream<Arguments> datosTestDistancePoint() {
		return Stream.of(
				Arguments.of(new Point(22, 44), new Point(11, 22), 24.596747752497688),
				Arguments.of(new Point(-23, -34), new Point(10, 58), 97.73944955850733)
				);
	}

	@ParameterizedTest
	@MethodSource("datosTestQuadrant")
	void testQuadrant(Point punto, int resultadoEsperado) {
		assertEquals(punto.quadrant(), resultadoEsperado);
	}
	
	static Stream<Arguments> datosTestQuadrant() {
		return Stream.of(
				Arguments.of(new Point(4, 2.5), 1),
				Arguments.of(new Point(-2.8, 100.3), 2),
				Arguments.of(new Point(-23, -3), 3),
				Arguments.of(new Point(24.5, -58.85), 4),
				Arguments.of(new Point(0.0, 0.0), 0)
				);
	}

	@ParameterizedTest
	@MethodSource("datosTestNearest")
	void testNearest(Point punto, Point[] arrayPuntos, Point resultadoEsperado) {
		assertEquals(punto.nearest(arrayPuntos), resultadoEsperado);
	}
	
	static Stream<Arguments> datosTestNearest() {
		return Stream.of(
				Arguments.of(new Point(20, 21.4), new Point[] {
						new Point(21, 22),
						new Point(45.9, 80),
						new Point(30, -12.5)
				}, new Point(21.0, 22.0)),
				Arguments.of(new Point(-3.4, -5), new Point[] {
						new Point(59.9, 22.56),
						new Point(-2, 4),
						new Point(-12, -100.2)
				}, new Point(-2.0, 4.0)));
	}

}
