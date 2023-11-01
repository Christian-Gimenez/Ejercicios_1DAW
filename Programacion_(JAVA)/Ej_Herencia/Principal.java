package org.villablanca;

import daw.com.Teclado;

public class Principal {
	
	private static Empleado leerEmpleado() {
		System.out.println("Dame nombre: ");
		String nombre = Teclado.leerString();
		System.out.println("Dame edad: ");
		int edad = Teclado.leerInt();
		System.out.println("Dame estatura: ");
		double estatura = Teclado.leerFloat();
		System.out.println("Dame salario: ");
		double salario = Teclado.leerFloat();
		return new Empleado(nombre, edad, estatura, salario);
	}
	
	private static Persona leerPersona() {
		System.out.println("Dame nombre: ");
		String nombre = Teclado.leerString();
		System.out.println("Dame edad: ");
		int edad = Teclado.leerInt();
		System.out.println("Dame estatura: ");
		double estatura = Teclado.leerFloat();

		return new Persona(nombre, edad, estatura);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Empleado("Pepe", 35, 1.67, 14000);
		Persona persona2 = new Persona("Ana", 12, 1.10);
		
		persona1.saluda();
		persona2.saluda();
		
		Persona[] personas = new Persona[3];
		for(int i = 0; i < personas.length; i++) {
			System.out.println("1- Crear persona");
			System.out.println("2- Crear empleado");
			int opcion = Teclado.leerInt();
			/*if(opcion == 1) {
			 * 	personas[i] = leerPersona();
			 *} else {
			 *  personas[i] = leerEmpleado();
			 *}
			 * */
			personas[i] = (opcion == 1)? leerPersona() : leerEmpleado();
		}
		
		/*for(int i = 0; i < personas.length; i++) {
		 * 	Persona objeto = personas[i];
		 *  objeto.saluda();
		 * */
		for(Persona objeto: personas) {
			objeto.saluda();
		}
	
	}

}
