package org.villablanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("Prueba error");
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		} finally {
			System.out.println("Pasa por aqui");
		}
		
	}

}
