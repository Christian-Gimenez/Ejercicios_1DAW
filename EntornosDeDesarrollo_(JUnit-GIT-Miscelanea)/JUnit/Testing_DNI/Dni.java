package org.villablanca.ejercicio1;

public class Dni {

	private String dni;
	private static char[] letrasDni = {
			'T', 'R', 'W', 'A', 'G', 'Y', 'F', 'P', 'D', 'X', 'B',
			'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
	};
	
	public Dni(String dni) {
		this.dni = dni;
	}
	
	public boolean longitudValida() {
		return dni.length() == 9;
		}
	
	public int getNumero() {
		return Integer.parseInt(dni.substring(0,8));
	}
	
	public char getLetra() {
		return dni.charAt(8);
	}
	
	public boolean esValido() {
		char letra = this.getLetra();
		int numDni = this.getNumero();
		int resto = numDni % 23;
		return letra == Dni.letrasDni[resto] && this.longitudValida();
	}
}
