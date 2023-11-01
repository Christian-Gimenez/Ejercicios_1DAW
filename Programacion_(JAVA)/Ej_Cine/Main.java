package org.villablanca;

import daw.com.Teclado;

public class Main {

	/*
	 * Cine -> Pelicula que se esta reproduciendo y precio
	 * Peliculas -> Titulo, duracion, edad minima, director
	 * Espectador -> Nombre, edad, dinero
	 * Asientos -> Estan etiquetados por fila (numero) y columna (letra)
	 * Nos interesa saber si el asiento está ocupado o no
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Espectador[] espectadores = new Espectador[1000];
		Espectador pedro = new Espectador("Pedro Pascal", 51, 105.20);
		Espectador sergio = new Espectador("Sergio Lazaro", 19, 19.20);
		Pelicula pelicula = new Pelicula("The Godfather", 177, 16, "Francis Ford Coppola");
		Cine cine = new Cine(pelicula, 9.50);
		
		System.out.println(cine.mostrarButacas());
		
		
		venderEntrada(pedro, cine);
		venderEntrada(sergio, cine);
		
		
	}
	
	public static void venderEntrada(Espectador espectador, Cine cine) {
		if(cine.admites(espectador)) {
			int fila;
			char columna;
			do {
				System.out.println(cine.mostrarButacas());
				System.out.println("Dame la fila: ");
				fila = Teclado.leerInt();
				
				System.out.println("Dame la columna: ");
				columna = Character.toUpperCase(Teclado.leerString().charAt(0));
				
			} while(!cine.asignarButaca(fila, columna, espectador));
			System.out.println("Enhorabuena " + espectador.getNombre() + ", ya tienes tu butaca!");
		}
	}

}
