package org.villablanca.contar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import daw.com.Teclado;

/*Programa que pida un primer fichero por teclado (fichero1).
 * Lea el nombre de un segundo fichero por teclado (fichero2)
 * que a continuación creará.
 * Escribe una primera linea en fichero 2 con un texto leido por teclado.
 * Luego, añade el texto de fichero 1 en fichero2.
 * Finalmente, introduce en fichero 2 un texto leido por teclado (puede constar de varias lineas).
 * */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2 programa = new Ejercicio2();
		programa.ejecutar();
	}

	private void ejecutar() {
		boolean rutaCorrecta;
		String rutaFichero1="";
		String rutaFichero2="";
		BufferedReader fichero1 = null;
		BufferedWriter fichero2 = null;
		do {
			rutaCorrecta = true;
			System.out.print("Introduce la ruta y el nombre del fichero1: ");
			rutaFichero1 = Teclado.leerString();
			try {
				fichero1 = new BufferedReader(new FileReader(rutaFichero1));
			} catch (FileNotFoundException e) {
				rutaCorrecta = false;
				System.out.println("Error, fichero no encontrado.");
			}
		} while (!rutaCorrecta);
		
		do {
			rutaCorrecta = true;
			System.out.print("Introduce la ruta y el nombre del fichero2 a crear: ");
			rutaFichero1 = Teclado.leerString();
			try {
				fichero2 = new BufferedWriter(new FileWriter(rutaFichero2));
			} catch (IOException e) {
				rutaCorrecta = false;
				System.out.println("Error E/S: " + e.getMessage());
			}
		} while (!rutaCorrecta);

		System.out.println("Introduce texto: ");
		try {
			fichero2.write("1ºTexto escrito por el user: \n");
			fichero2.write(Teclado.leerString());
			fichero2.newLine();
			fichero2.write("Contenido del fichero 2: \n");
			int caracter = fichero1.read();
			while(caracter != -1) {
				fichero2.write(caracter);
				fichero1.read();
			}
			fichero2.newLine();
			System.out.println("Introduce texto: ");
			fichero2.write("2ºTexto escrito por el user: \n");
			fichero2.write(Teclado.leerString());
			fichero2.newLine();
		} catch (IOException e) {
			System.out.println("Error E/S: " + e.getMessage());
		}
		
		
	}
	
	

}
