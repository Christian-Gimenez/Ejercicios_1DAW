package org.villablanca.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrdenTest {
	
	private static int atributoDeClase = 1;
	private int atributoDeInstancia;
	
	
	public OrdenTest() { 
		this.atributoDeInstancia = 22;
		System.out.println("Creado objeto: " + this);
	}
	
	@Test
	@Order(3)
	void test1() {
		System.out.println("test1. ANTES de incrementar atributos. atributoDeClase vale: "
				+ OrdenTest.atributoDeClase + " y atributoDeInstancia vale: "
				+ this.atributoDeInstancia);
		OrdenTest.atributoDeClase++;
		this.atributoDeInstancia++;
		
		System.out.println("test1. DESPUES de incrementar atributos. atributoDeClase vale: "
		+ OrdenTest.atributoDeClase + " y atributoDeInstancia vale: "
		+ this.atributoDeInstancia);
	}
	
	@Test
	@Order(1)
	void test2() {
		System.out.println("test2. ANTES de incrementar atributos. atributoDeClase vale: "
				+ OrdenTest.atributoDeClase + " y atributoDeInstancia vale: "
				+ this.atributoDeInstancia);
		OrdenTest.atributoDeClase++;
		this.atributoDeInstancia++;
		
		System.out.println("test2. DESPUES de incrementar atributos. atributoDeClase vale: "
		+ OrdenTest.atributoDeClase + " y atributoDeInstancia vale: "
		+ this.atributoDeInstancia);
		//assertEquals(null, null);
		//assertNotEquals(null, null);
		assertNull(null); // -> Casca cuando la referencia NO sea NULL
		assertNotNull(null); // -> Casca cuando la referencia sea NULL
		assertSame(null, null); // -> Las referencias son al mismo objeto a == b, si no son identicas casca
		assertNotSame(null, null); //-> Si son identicas casca
		fail(); // -> Para asgurarnos de que falla y mostrar un mensaje descriptivo
	}
	
	@Test
	@Order(2)
	void test3() {
		System.out.println("test3. ANTES de incrementar atributos. atributoDeClase vale: "
				+ OrdenTest.atributoDeClase + " y atributoDeInstancia vale: "
				+ this.atributoDeInstancia);
		OrdenTest.atributoDeClase++;
		this.atributoDeInstancia++;
		
		System.out.println("test3. DESPUES de incrementar atributos. atributoDeClase vale: "
		+ OrdenTest.atributoDeClase + " y atributoDeInstancia vale: "
		+ this.atributoDeInstancia);
	}

}
