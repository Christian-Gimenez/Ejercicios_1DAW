package org.villablanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password clave = new Password();
		int intentos = 0;
		while(!clave.esFuerte()) {
			System.out.println("Clave generada, no es fuerte: " + clave.getClave());
			clave = new Password(100);
			intentos++;
		}
		System.out.println("Clave generada en " + intentos +" intentos, SI es fuerte: " + clave.getClave());
	}

}
