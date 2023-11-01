package org.villablanca.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervaloTest {
	
	@Test
	void testIntervalo() {
		assertNotNull(new Intervalo(14, 19));
		assertThrows(IntervaloException.class,() -> {new Intervalo(19,14);});
	}

	@Test
	void testLongitud() {
		assertEquals(11, new Intervalo(8,19).longitud());
		assertEquals(14, new Intervalo(3,17).longitud());
		assertEquals(0, new Intervalo(8,8).longitud());
	}
	
	@Test
	void testContiene() {
		assertTrue(new Intervalo(-12, 78).contiene(0));
		assertFalse(new Intervalo(-4, 7).contiene(12));
		assertTrue(new Intervalo(2, 58).contiene(new Intervalo(5, 27)));
		assertFalse(new Intervalo(-20, 20).contiene(new Intervalo(21, 50)));
	}
	
	@Test
	void testInterseccion() {
		assertEquals(new Intervalo(12, 20),
				new Intervalo(12, 30).interseccion(new Intervalo(4, 20)));
		
		assertEquals(new Intervalo(-2, 5),
				new Intervalo(-2, 5).interseccion(new Intervalo(-6, 8)));
		assertNull(new Intervalo(3, 20).interseccion(new Intervalo(21, 30)));
		assertNotNull(new Intervalo(4, 9).interseccion(new Intervalo(7, 10)));
	}
	
	@Test 
	void testEstaAntes(){
		assertTrue(new Intervalo(5, 8).estaAntes(2));
		assertFalse(new Intervalo(-7, 9).estaAntes(4));
	}
	
	@Test
	void testEstaDespues() {
		assertTrue(new Intervalo(20, 40).estaDespues(41));
		assertFalse(new Intervalo(-4, 45).estaDespues(25));
	}
	
	@Test
	void testFinalizaEn() {
		assertTrue(new Intervalo(6, 12).finalizaEn(12));
		assertFalse(new Intervalo(-5, 5).finalizaEn(4));
	}
	
	@Test
	void testComienzaEn() {
		assertTrue(new Intervalo(0, 8).comienzaEn(0));
		assertFalse(new Intervalo(5, 8).comienzaEn(2));
	}
	
	@Test
	void testDesplazar() {
		Intervalo intervaloObtenido = new Intervalo(-5, 5);
		intervaloObtenido.desplazar(10);
		assertEquals(intervaloObtenido, new Intervalo(5, 15));
		
		intervaloObtenido = new Intervalo(23, 45);
		intervaloObtenido.desplazar(-4);
		assertEquals(intervaloObtenido, new Intervalo(19, 41));
	}

}
