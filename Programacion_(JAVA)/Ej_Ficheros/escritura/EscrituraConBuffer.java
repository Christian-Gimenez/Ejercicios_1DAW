package org.villablanca.escritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraConBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rutaFichero = "/media/usertar/Christian/Programacion/NewWorkspace/FicherosJava/adios.txt";
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(rutaFichero));
			out.write('A');
			out.write('d');
			out.write('i');
			out.write('o');
			out.write('s');
			out.newLine(); //Igual que out.write('\n');
			//out.flush(); Si no ponemos esto, no vacia el buffer, si lo ponemos obliga a hacerlo
		} catch(IOException ex) {
			System.out.println("Error E/S: " + ex.getMessage());
		} finally {
			if (out!=null) {
				try {	
					out.close(); //El close vacia el buffer tambien escribirá
				} catch(IOException ex) {
					System.out.println("Error E/S: " + ex.getMessage());
				}
			}
			
			
		}
	}

}
