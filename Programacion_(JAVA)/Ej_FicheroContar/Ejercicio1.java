package org.villablanca.contar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import daw.com.Teclado;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Solicitar un fichero por teclado (directorio y archivo)
		 * Cuenta el numero de caracteres distintos al caracter en blanco.
		 * Muestra el numero de caracteres y el numero de lineas del fichero*/
		boolean fallo;
		int distintosAEspacio=0;
		int numeroTotalCaracteres=0;
		int numeroLineas=0;
		BufferedReader in = null;
		String rutaArchivo="";
		String lineaLeida="";
		do {
			
			fallo = false;
			System.out.print("Introduce la ruta del archivo: ");
			rutaArchivo = Teclado.leerString();
			try {
				in = new BufferedReader(new FileReader(rutaArchivo));
			} catch(IOException ex) {
				System.err.println("Error de lectura de fichero: " + ex.getMessage());
				fallo = true;
			}
		} while (fallo);
		
		

		try {
			lineaLeida = in.readLine();
			while (lineaLeida != null) {
				for(int i = 0; i < lineaLeida.length(); i++) {
					char caracter = lineaLeida.charAt(i);
					if (!Character.isSpaceChar(caracter)) {
						distintosAEspacio++;
					}
					numeroTotalCaracteres++;
					
					}
				lineaLeida = in.readLine();
				numeroLineas++;
			}
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + ex.getMessage());
	
		} catch(NullPointerException ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		
		System.out.println("Cantidad de caracteres que no son un espacio en blanco: " + distintosAEspacio);
		System.out.println("Cantidad total de caracteres: " + numeroTotalCaracteres);
		System.out.println("Cantidad de lineas del fichero: " + numeroLineas);
		
	}

}
