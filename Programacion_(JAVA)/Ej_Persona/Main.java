package org.villablanca.persona;

import daw.com.Teclado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		char genero;
		double peso, altura;
		nombre = Teclado.leerString("Introducir nombre: ");
		edad = Teclado.leerInt("Introducir edad: ");
		genero = Teclado.leerString("Introduce genero (H/M): ").charAt(0);
		peso = Teclado.leerFloat("Introducir peso: ");
		altura = Teclado.leerFloat("Introducir altura: ");
		Persona persona1 = new Persona();
		Persona persona2 = new Persona(nombre, edad, genero);
		Persona persona3 = new Persona(nombre, edad, genero, peso, altura);
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
	}

}
