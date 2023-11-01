package org.villablanca;

public class Main {
	
	/*
	 * +mostrarArticulos
	 * +añadirArticulo
	 * +añadirSocio
	 * +mostrarSocio
	 * +prestamos: devoluciones / solicitudes
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Socio socio1 = new Socio("1", "Pepe");
			Socio socio2 = new Socio("1", "Pepe");
			System.out.println(socio1.equals(socio2));
			System.out.println(socio1 == socio2);
			
	}

}
