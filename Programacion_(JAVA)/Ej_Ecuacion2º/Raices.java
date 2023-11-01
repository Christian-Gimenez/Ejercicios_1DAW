package org.villablanca;

public class Raices {
	//a*X² + b*X + c = 0
	//X= (-b +- Math.sqrt(b² -4a*c) ) / 2a
	private double a, b, c;
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private double getDiscriminante() {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	private int getNumeroSoluciones() {
		if (getDiscriminante() > 0) {
			return 2;
		}
		if(getDiscriminante() < 0) {
			return 0;
		}
		return 1;
	}
	
	public double[] obtenerRaices() {
		double[] resultado;
		double discriminante = getDiscriminante();
		switch(getNumeroSoluciones()) {
		case 0:
			resultado = new double[1];
			resultado[0] = Double.NaN;
			break;
		case 1:
			resultado = new double[1];
			resultado[0] = -b / (2 * a);
			break;
		default:
			resultado = new double[2];
			resultado[0] = (-b - Math.sqrt(discriminante)) / (2 * a);
			resultado[1] = (-b + Math.sqrt(discriminante)) / (2 * a);
			break;
		}
		return resultado;
	}
	
	public String toString() {
		String resultado = a + "x²";
		if (b > 0) {
			resultado += " + " + b + "x";
		} else {
			if(b < 0) {
				resultado += b + "x";
			}
		}
		if (c > 0) {
			resultado += " + " + c;
		} else {
			if(c < 0) {
				resultado += " " + c;
			}
		}
		resultado += " = 0";
		return resultado;
	}
	
	public String dameSoluciones() {
		String resultado;
		switch(getNumeroSoluciones()) {
		case 0:
			resultado = "La ecuación no tiene ninguna solución real";
			break;
		case 1:
			resultado = "La ecuación tiene una única solución: ";
			resultado += obtenerRaices()[0];
			break;
		default:
			resultado = "La ecuación tiene las siguientes soluciones:\n";
			resultado += "x = " +obtenerRaices()[0] + "\n";
			resultado += "x = " +obtenerRaices()[1] + "\n";
		}
		return resultado;
	}
	
}
