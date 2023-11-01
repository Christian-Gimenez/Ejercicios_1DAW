package org.villablanca;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "/media/usertar/Christian/Programacion/NewWorkspace/FicherosJava/numeros.txt";
		BufferedReader in = null;
		double suma = 0.0, media = 0.0, maximo = Double.MIN_VALUE, minimo = Double.MAX_VALUE, numero = 0.0;
		int contador = 0;
		boolean exitPrograma = false;
		boolean mostrarResultado = true;
		String linea = "";
		try {
			in = new BufferedReader(new FileReader(ruta));
			
				try {
					while (linea != null && !exitPrograma) {
						linea = in.readLine();
						
						try {
							numero = Double.parseDouble(linea);
							suma += numero;
							contador++;
							if (numero > maximo) {
								maximo = numero;
							} else if (numero < minimo) {
								minimo = numero;
							}	
						} catch(NumberFormatException ex) {
							System.err.println("Error: " + ex.getMessage());
							exitPrograma = true;
							mostrarResultado = false;
						} catch (NullPointerException ex) {
							exitPrograma = true;
						}
						
					}
				} catch (IOException e) {
					System.err.println("Error: " + e.getMessage());
					exitPrograma = true;
			}
			if (contador != 0) {
				media = suma / contador;
			}
			
			if (mostrarResultado) {
				System.out.println("La suma de los números es: " + suma);
				System.out.println("La media aritmética es: " + media);
				System.out.println("El número más pequeño es: " + minimo);
				System.out.println("El número más grande es: " + maximo);
			}
	
			
			
		} catch(FileNotFoundException ex) {
			System.err.println("No se encuentra el fichero.");
		}
	}
}
