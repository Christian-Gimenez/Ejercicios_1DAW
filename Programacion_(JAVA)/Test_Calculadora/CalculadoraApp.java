package org.villablanca;

import daw.com.Teclado;

public class CalculadoraApp {
	
	private Calculadora calculadora;
	
	public CalculadoraApp() {
		calculadora = new Calculadora();
	}
	
	public void menu() {
		double a, b;
		char operacion;
		System.out.print("Dame operando a: ");
		a = Teclado.leerFloat();
		System.out.print("Dame operando a: ");
		b = Teclado.leerFloat();
		System.out.print("Dame operación(+, -, *, /): ");
		operacion = Teclado.leerString().charAt(0);
	}

}
