package org.villablanca;

public class Subscripcion {
	private int precio;
	private int periodo;
	
	//12,45 -> 1245
	public Subscripcion(int precio, int periodo) {
		this.precio = precio;
		this.periodo = periodo;
	}
	
	public double precioPorMes() {
		if(precio==0 || periodo==0) {
			return 0;
		}
		double resultado = (double)precio/periodo;
		double resto = resultado % 1;
		if(resto > 0) {
			resultado ++;
		}
		return resultado;
	}
}
