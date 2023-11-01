package org.villablanca.contar;
/*Solicitar un fichero por teclado (directorio y archivo)
 * Cuenta el numero de caracteres distintos al caracter en blanco.
 * Muestra el numero de caracteres y el numero de lineas del fichero*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import daw.com.Teclado;

public class Ejercicio1_corregido {
	
	private void ejecutar() {
		FileReader fichero = null;
		System.out.println("Dime la ruta donde vas a guardar el fichero: ");
		String ruta = Teclado.leerString();
		int caracteresNoSonEspacio = 0;
		int lineas = 1;
		int caracter = 0;
		try {
			fichero = new FileReader(ruta);
			while (caracter != -1) {
				caracter = fichero.read();
				while(caracter != -1) {
					char dato = (char)caracter;
					if(dato != ' ') {
						caracteresNoSonEspacio++;
					}
					if (dato == '\n') {
						lineas++;
					}
					caracter = fichero.read();
				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error, fichero no encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error E/S: " + e.getMessage());
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		}
		
		System.out.println("Nº Caracteres: " + caracteresNoSonEspacio);
		System.out.println("Nº Lineas: " + lineas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1_corregido ejer = new Ejercicio1_corregido();
		ejer.ejecutar();

	}

}
