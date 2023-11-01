package org.villablanca;

public class MiExcepcion extends Exception {
	
	MiExcepcion() {
		super("Error genérico de mi excepcion");
	}
	
	MiExcepcion(String mensaje) {
		super(mensaje);
	}
	
}
