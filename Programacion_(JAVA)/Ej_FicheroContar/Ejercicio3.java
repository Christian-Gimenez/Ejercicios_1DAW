package org.villablanca.contar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import daw.com.Teclado;

/*
 * Programa que va ha tener una lista de animales
 * La clase abstracta Animal va ha tener sublcases:
 * Perro:
 * 	Nombre
 * 	Edad
 * 	Raza
 * 
 * Gato:
 * 	Nombre
 * 	Color
 * 	Peso
 * 
 * Leer los animales y los guardar sus datos en un fichero*/

public class Ejercicio3 {
	
	private BufferedWriter fichero;
	
	public Ejercicio3(String rutaFichero) throws IOException {
	
		fichero = new BufferedWriter(new FileWriter(rutaFichero));
		
	}
	
	private Perro pedirDatosPerro() {
		int edad = 0;
		System.out.println("Introduce nombre: ");
		String nombre = Teclado.leerString();
		System.out.println("Introduce edad: ");
		try {
			edad = Teclado.leerInt();
		} catch(NumberFormatException ex) {
			System.out.println("Error, número inválido: " + ex.getMessage());
		}
		System.out.println("Introduce raza:");
		String raza = Teclado.leerString();
		return new Perro(nombre, edad, raza);
		
	}
	
	private void ejecutar() {
		ArrayList<Animal> animales;
		//fichero.write
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio3 programa = null;
		System.out.println("Introduce la ruta del fichero: ");
		try {
			programa = new Ejercicio3(Teclado.leerString());
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			System.out.println("Error E/S: " + ex.getMessage());
		}
		programa.ejecutar();
	}

}
