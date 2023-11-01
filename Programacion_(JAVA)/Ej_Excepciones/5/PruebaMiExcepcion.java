package org.villablanca;

public class PruebaMiExcepcion {

	public static void main(String[] args) {
		try {
			throw new MiExcepcion("Mi error");
		} catch(MiExcepcion ex) {
			System.out.println(ex.getMessage());
		}

	}

}
