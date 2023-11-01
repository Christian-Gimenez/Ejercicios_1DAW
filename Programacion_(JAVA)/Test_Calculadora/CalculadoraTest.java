package org.villablanca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora calculadora; //Se suele poner el objeto a probar como atributo de la clase test
	
	@BeforeEach //Se utiliza para inicalizar el objeto que vamos a utilizar
	void inicializar() {
		calculadora = new Calculadora();
	}

	@Test //Si no ponemos Test, JUnit no lo testea
	void testSumar() {
		//Inicializacion	-	Arrange
		Calculadora calculadora = new Calculadora();
		
		//Ejercitación	-	Act
		float resultadoObtenido = calculadora.sumar(5, 7);
		float resultadoEsperado = 12; //Si falla (esperado != obtenido) es un falso positivo
		
		//Aserción	-	Assert
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testRestar() {
		//Inicializacion	-	Arrange
		Calculadora calculadora = new Calculadora();
		
		//Ejercitación	-	Act
		float resultadoObtenido = calculadora.restar(15, 7);
		float resultadoEsperado = 8;
		
		//Aserción	-	Assert
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testDividir() {
		//Ejercitacion & Aserción	-	Act & Assert
		assertEquals(0.333f, calculadora.dividir(1f, 3f),0.001f); //Indicamos que el margen de error sea de una milesima
	}

	@Test
	void testMultiplicar() {
		assertEquals(12, calculadora.multiplicar(6f, 2f));
	}

}
