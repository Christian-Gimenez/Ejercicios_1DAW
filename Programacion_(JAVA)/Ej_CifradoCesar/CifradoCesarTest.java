package org.villablanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CifradoCesarTest {

	@Test
	void testCifrar() {
		CifradoCesar textoCifrado = new CifradoCesar("Hola que tal mis amigoz!", 3);
		textoCifrado.cifrarTexto();
		assertEquals("Krod txh wdo plv dpljrc!", textoCifrado.getTexto());
		
		textoCifrado = new CifradoCesar("Chavales os huele a mierda la boca!?", 34);
		textoCifrado.cifrarTexto();
		assertEquals("Kpiditma wa pcmtm i uqmzli ti jwki!?", textoCifrado.getTexto());

		
	}
	
	@Test
	void testDescifrar() {
		CifradoCesar textoDescifrado = new CifradoCesar("Krod txh wdo plv dpljrc!", 3);
		textoDescifrado.descifrarTexto();
		assertEquals("Hola que tal mis amigoz!", textoDescifrado.getTexto());
		
		textoDescifrado = new CifradoCesar("Kpiditma wa pcmtm i uqmzli ti jwki!?", 34);
		textoDescifrado.descifrarTexto();
		assertEquals("Chavales os huele a mierda la boca!?", textoDescifrado.getTexto());
	}


}
