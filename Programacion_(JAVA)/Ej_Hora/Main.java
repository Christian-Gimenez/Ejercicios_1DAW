package org.villablanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora horaActual = new Hora(20, 58, 59);
		horaActual.incrementarSegundos(120);
		System.out.println(horaActual);
	}

}
