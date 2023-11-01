package org.villablanca;

import java.util.Scanner;

public class Ej2 {
	static Scanner teclado = new Scanner(System.in);
	public static int mostrarMenu() {
		System.out.println("Elija una opcion: ");
		System.out.println("1.- Excepcion A");
		System.out.println("2.- Excepcion B");
		System.out.println("3.- Excepcion C");
		return teclado.nextInt();
	}
	
	public static void metodoDelicado() throws ExcepcionA, ExcepcionB, ExcepcionC {
		System.out.println("Bloque que produce excepciones A, B y C");
		int opcion;
		switch(opcion = mostrarMenu()) {
		case 1:
			throw new ExcepcionA();
		case 2:
			throw new ExcepcionB();
		case 3:
			throw new ExcepcionC();
		default:
			System.out.println("Error");
		}

	}

	public static void f() {
		try {
			metodoDelicado();
		} catch(ExcepcionA | ExcepcionB | ExcepcionC ex) {
			ex.printStackTrace();
			
		} finally {
			System.out.println("Siempre se ejecuta");
		}
		
	}
	
	public static void f1() throws ExcepcionC {
		try {
			metodoDelicado();
		} catch(ExcepcionA a) {
			a.printStackTrace();
			
		} catch(ExcepcionB b) {
			b.printStackTrace();
			
		} /*catch(ExcepcionC c) {
			throw c;
			
		}*/ finally {
			System.out.println("Siempre se ejecuta");
		}
	}
	
	public static void main(String[] args) {
		try {
			f1();
		} catch(ExcepcionC ex) {
			ex.printStackTrace();
		}
		f();
	}
}
