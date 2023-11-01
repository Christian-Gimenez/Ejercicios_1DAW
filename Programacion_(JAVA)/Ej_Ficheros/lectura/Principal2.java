package org.villablanca.lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rutaLinux = "/media/usertar/Christian/Programacion/NewWorkspace/FicherosJava/hola.txt"; //Ruta Linux
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(rutaLinux));
			String linea = in.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = in.readLine();
			}
		} catch(FileNotFoundException ex) {
			System.err.println("No existe el fichero");
			
		} catch(IOException ex) {
			System.err.println("Ha ocurrido un error de E/S");
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
