package org.villablanca.lectura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	
	public static void imprimirContenido(FileReader in) {
		try {
			int leido;
			leido = in.read();
			in.reset();
			while(leido != -1) {
				System.out.print((char)leido);
				leido = in.read();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rutaWindows = "F:\\Programacion\\NewWorkspace\\FicherosJava\\hola.txt"; //Ruta Windows
		String rutaLinux = "/media/usertar/Christian/Programacion/NewWorkspace/FicherosJava/hola.txt"; //Ruta Linux
		
		FileReader in = null;
		try {
			in = new FileReader(rutaLinux);
			imprimirContenido(in);
			
		} catch(FileNotFoundException ex) {
			System.err.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Programa finalizado!!!!");

	}
}
