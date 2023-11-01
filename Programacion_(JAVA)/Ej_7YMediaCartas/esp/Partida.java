package org.villablanca.baraja.esp;

import daw.com.Teclado;

public class Partida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Comparamos el orden de creacion en el enum
		 * System.out.println(Palo.BASTOS.ordinal()>Palo.COPAS.ordinal()); Palo[] palos
		 * = Palo.values(); for(int i = 0; i < palos.length; i++) {
		 * 
		 * }
		 */

		Baraja baraja = new Baraja();
		System.out.println(baraja);

		do {
			System.out.println("1- Dar carta");
			System.out.println("2- Mostrar baraja");
			System.out.println("3- Mostrar monton");
			int opcion = Teclado.leerInt();
			switch (opcion) {
			case 1:
				System.out.println(baraja.dar());
				break;
			case 2:
				System.out.println(baraja.mostrarBaraja());
				break;
			case 3:
				System.out.println(baraja.mostrarBaraja());
				break;
			}
		} while (true);
	}

}
