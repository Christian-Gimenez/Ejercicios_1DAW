package org.villablanca.primo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EsPrimoTest {

	@ParameterizedTest
	@MethodSource("datosParaTestEsPrimoSinPars")
	void testEsPrimo() {
		fail("Not yet implemented");
	}
	
	static Stream<Arguments> datosParaTestEs() {
		return Stream.of(
				Arguments.of()
				);
	}

}
