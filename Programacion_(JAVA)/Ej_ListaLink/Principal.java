package org.villablanca.christian;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		lista.incluir("verde");
		lista.incluir("amarillo");
		lista.incluir("azul");
		lista.incluir("marron");
		System.out.println("La longitud es...");
		System.out.println(lista.length());
		System.out.println("Programa terminado.");
	}

}
