package org.villablanca;

import daw.com.Teclado;

public class Main {
	
	
	public static Persona pedirDatosBasicos() {
		int edad = 0;
		String nombre = "";
		char sexo = 'M';
		System.out.print("Introduce nombre: ");
		nombre = Teclado.leerString();
		do {
			System.out.print("Introduce edad: ");
			edad = Teclado.leerInt();
		} while(edad < 0);
		
		System.out.print("Introduce sexo (H/M): ");
		sexo = Teclado.leerString().charAt(0);
		return new Persona(nombre, edad, sexo);
	}
	
	public static Persona pedirTodosLosDatos() {
		int edad = 0;
		String nombre = "";
		char sexo = 'M';
		float peso = 0, altura = 0;
		System.out.print("Introduce nombre: ");
		nombre = Teclado.leerString();
		do {
			System.out.print("Introduce edad: ");
			edad = Teclado.leerInt();
		} while(edad < 0);
		
		System.out.print("Introduce sexo (H/M): ");
		sexo = Teclado.leerString().charAt(0);
		
		do {
			System.out.print("Introduce peso en Kg: ");
			peso = Teclado.leerFloat();
		} while (peso < 0);
		
		do {
			System.out.print("Introduce Altura en Metros: ");
			altura = Teclado.leerFloat();
		} while (peso < 0);
		
		return new Persona(nombre, edad, sexo, peso, altura);
	}
	
	public static void agregarDatos(Persona persona) {
		float peso = 0, altura = 0;
		do {
			System.out.print("Introduce peso en Kg: ");
			peso = Teclado.leerFloat();
		} while (peso < 0);
		
		do {
			System.out.print("Introduce Altura en Metros: ");
			altura = Teclado.leerFloat();
		} while (peso < 0);
		
		persona.setAltura(altura);
		persona.setPeso(peso);
	}
	
	public static void agregarTodosLosDatos(Persona persona) {
		int edad = 0;
		String nombre = "";
		char sexo = 'M';
		float peso = 0, altura = 0;
		System.out.print("Introduce nombre: ");
		nombre = Teclado.leerString();
		do {
			System.out.print("Introduce edad: ");
			edad = Teclado.leerInt();
		} while(edad < 0);
		
		System.out.print("Introduce sexo (H/M): ");
		sexo = Teclado.leerString().charAt(0);
		
		do {
			System.out.print("Introduce peso en Kg: ");
			peso = Teclado.leerFloat();
		} while (peso < 0);
		
		do {
			System.out.print("Introduce Altura en Metros: ");
			altura = Teclado.leerFloat();
		} while (peso < 0);
		
		persona.setNombre(nombre);
		persona.setEdad(edad);
		persona.setSexo(sexo);
		persona.setPeso(peso);
		persona.setAltura(altura);
	}
	
	public static void mostrarIMC(Persona persona) {
		System.out.println("Su IMC es: " + persona.calcularIMC());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Teclado.leerString("Dame el nombre: ");
		
		Persona churrasa = new Persona();
		System.out.println(churrasa.toString());
		agregarTodosLosDatos(churrasa);
		mostrarIMC(churrasa);
		System.out.println(churrasa.toString());
		
		Persona chanchito = pedirDatosBasicos();
		System.out.println(chanchito.toString());
		agregarDatos(chanchito);
		mostrarIMC(chanchito);
		System.out.println(chanchito.toString());
		
		Persona chimilla = pedirTodosLosDatos();
		System.out.println(chimilla.toString());
		mostrarIMC(chimilla);
		
	}

}
