package org.villablanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {
	
	@Test
	void testPrecioPorMes1() {
		//Inicializacion	-	Arrange
		Subscripcion subscripcion = new Subscripcion(120, 12);
		
		//Ejercitacion	-	Act
		double resultadoEsperado = 10.0;
		double resultadoObtenido = subscripcion.precioPorMes();
		
		//Asercion	-	Assert
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testPrecioPorMes2() {
		//Inicializacion	-	Arrange
		Subscripcion subscripcion = new Subscripcion(450, 10);
		
		//Ejercitacion	-	Act
		double resultadoEsperado = 45;
		double resultadoObtenido = subscripcion.precioPorMes();
		
		//Asercion	-	Assert
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testPrecioPorMes3() {
		//Inicializacion - Arrange
		Subscripcion subscripcion = new Subscripcion(138, 14);
		
		//Ejercitacion	-	Act
		double resultadoEsperado = 9.8571428;
		double resultadoObtenido = subscripcion.precioPorMes();
		
		//Asercion	-	Assert
		assertEquals(resultadoEsperado, resultadoObtenido,0.001f);
	}

}
