package org.villablanca.baraja.española;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja baraja = new Baraja();
		System.out.println("La baraja inicialmente \n" + baraja.mostrarBaraja());
		
		baraja.barajar();
		System.out.println("La baraja tras ser barajada: \n" + baraja.mostrarBaraja());
		
		baraja.darCartas(5);
		System.out.println("Las cartas obtenidas fueron: \n" + baraja.mostrarMonton());
		
		System.out.println("La baraja actualmente: \n" + baraja.mostrarBaraja());
		
	}

}
