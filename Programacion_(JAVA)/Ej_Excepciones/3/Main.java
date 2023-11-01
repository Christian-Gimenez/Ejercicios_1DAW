package org.villablanca;

import java.lang.reflect.Array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = {"Marcos", "Raul", "Liviu", "Noor"};
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(nombres[i]);
			}
			
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
