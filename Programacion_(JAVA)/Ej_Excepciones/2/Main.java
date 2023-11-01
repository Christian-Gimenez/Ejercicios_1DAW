package org.villablanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String objeto = null;
		try {
			System.out.println("La longitud es: " + objeto.length());
		} catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Programa terminado");
	}

}
