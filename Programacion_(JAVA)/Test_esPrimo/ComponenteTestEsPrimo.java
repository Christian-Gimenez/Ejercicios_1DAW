package org.villablanca.primo;

public class ComponenteTestEsPrimo {
	
	public static void main(String[] args) {
		//Caso de prueba 1
		String[] s1 = new String[0];
		try {
			boolean b1 = EsPrimo.esPrimo(s1);
			System.out.println("Caso Prueba 1: INCORRECTO");
		} catch (FaltaParametroException ex) {
			System.out.println("Caso Prueba 1: CORRECTO");
		} catch (Exception ex) {
			System.out.println("Caso Prueba 1: INCORRECTO");
		}
		
		//Caso de prueba 2
		String[] s2 = new String[2];
		s2[0] = "xx";
		s2[1] = "yy";
		try {
			boolean b1 = EsPrimo.esPrimo(s2);
			System.out.println("Caso Prueba 2: INCORRECTO");
		} catch (Solo1ParametroException ex) {
			System.out.println("Caso Prueba 2: CORRECTO");
		} catch (Exception ex) {
			System.out.println("Caso Prueba 2: INCORRECTO");
		}
	}
	
}
