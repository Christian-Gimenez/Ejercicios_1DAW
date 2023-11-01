package org.villablanca;

public class Main {

	public static void main(String[] args) {
		Raices raices = new Raices(1, 4, -21);
		System.out.println(raices);
		System.out.println(raices.dameSoluciones());
		
		Raices raices2 = new Raices(9, -12, 4);
		System.out.println(raices2);
		System.out.println(raices2.dameSoluciones());
		
		Raices raices3 = new Raices(9, 1, 4);
		System.out.println(raices2);
		System.out.println(raices2.dameSoluciones());

	}

}
