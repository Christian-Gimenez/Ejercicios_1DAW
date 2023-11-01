package org.villablanca.contar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import daw.com.Teclado;

public class Ejercicio2_corregido {
	
	private BufferedReader lectura;
	private BufferedWriter escritura;
	
	public Ejercicio2_corregido (String rutaLectura, String rutaEscritura) throws FileNotFoundException, IOException {
		lectura = new BufferedReader(new FileReader(rutaLectura));
		escritura = new BufferedWriter(new FileWriter(rutaEscritura));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2_corregido programa = null;
		String rutaLectura, rutaEscritura;
		rutaLectura = Teclado.leerString("Dame el fichero de lectura: ");
		rutaEscritura = Teclado.leerString("Dame el fichero de escritura: ");
		
		try {
			programa = new Ejercicio2_corregido(rutaLectura, rutaEscritura);
			programa.ejecutar();
		} catch (FileNotFoundException e) {
			System.out.println("Error. No existe el fichero: " + rutaLectura);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error. No se puede crear el fichero: " + rutaEscritura);
		} finally {
			if(programa != null) {
				programa.finalizar();
			}
		}
	}
	
	private void ejecutar() throws IOException {
		String linea = Teclado.leerString("Dame el encabezado: ");
		escritura.write(linea);
		escritura.newLine();
		while ((linea = lectura.readLine())!= null) {
			escritura.write(linea + "\n");
		}
		while ((linea = pedirLinea()) != null) {
			escritura.write(linea);
			escritura.newLine();
		}
		linea = pedirLinea();
	}

	private String pedirLinea() {
		// TODO Auto-generated method stub
		String linea = Teclado.leerString("Dame una linea (fin para acabar): ");
		if (linea.equalsIgnoreCase("fin")) {
			return null;

		}
		return linea;
	}

	public void finalizar() {
		try {
			if(lectura != null) {
				lectura.close();
			}
		} catch (IOException ex) {
		
		}
		
		try {
			if (escritura != null) {
				escritura.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
