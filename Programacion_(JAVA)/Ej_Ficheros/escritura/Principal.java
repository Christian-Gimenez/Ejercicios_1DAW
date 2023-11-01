package org.villablanca.escritura;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rutaFichero = "/media/usertar/Christian/Programacion/NewWorkspace/FicherosJava/adios.txt";
		FileWriter out = null;
		double real = 3.14;
		try {
			out = new FileWriter(rutaFichero);
			out.write('A');
			out.write('d');
			out.write('i');
			out.write('o');
			out.write('s');
			out.write(String.valueOf(real));
		} catch (IOException ex) {
			System.out.println("ERROR E/S: " + ex.getMessage());
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch(IOException ex) {
					ex.printStackTrace();
				}
			}
			
		}
	}

}
