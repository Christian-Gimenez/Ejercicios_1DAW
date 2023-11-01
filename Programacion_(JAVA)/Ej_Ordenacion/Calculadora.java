package org.villablanca;

import daw.com.Teclado;

public class Calculadora {

	public static void main(String[] args) {
		int c;
		try {
			String a = Teclado.leerString("Dame a: ");
			String b = Teclado.leerString("Dame b: ");
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			c = a1/b1;
			System.out.println(a1 + "/" + b1 + " = " + c);
			
		} catch(NumberFormatException ex1) {
			System.out.println("No he sido capaz de convertir a entero.");
			System.out.println(ex1.getMessage());
			
		} catch(ArithmeticException ex2) {
			System.out.println("No he sido capaz de dividir por 0.");
			System.out.println(ex2.getMessage());
			
		} catch(Exception e) { //Excepcion generica
			System.out.println("ZZZZZZZZZ");
			
		} finally {
			System.out.println("Esto se ejecuta siempre!!!!");
		}
		
	}

}
