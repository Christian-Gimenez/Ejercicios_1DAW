package org.villablanca;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Socio> socios;
	private ArrayList<Disco> discos;
	private ArrayList<Libro> libros;

	public Biblioteca() {
		this.socios = new ArrayList<>();
		this.discos = new ArrayList<>();
		this.libros = new ArrayList<>();
	}
	
	public String obtenerListadoDiscos() {
		String resultado = "";
		
		for(Disco disco: discos) {
			if(disco.getFin()!=null) {
				resultado += "Disco: " + disco + " NO DISPONIBLE HASTA " + disco.getFin() + "\n";
			} else {
				resultado += "Disco: " + disco + "DISPONIBLE\n";
			}
			
		}
		return resultado;
	}
	
	public String obtenerListadoLibros() {
		String resultado = "";
		
		for(Libro libro: libros) {
			if(libro.getFin()!=null) {
				resultado += "Libro: " + libro + " NO DISPONIBLE HASTA " + libro.getFin() + "\n";
			} else {
				resultado += "Libro: " + libro + "DISPONIBLE\n";
			}
			
		}
		
		return resultado;
	}
	
	public boolean disponible(int codigo) {
		Prestamo prestamo = buscar(codigo);
		return prestamo != null && prestamo.getFin() == null;
	}
	
	/**
	 * Registra el prestamo de un articulo en la biblioteca a un socio
	 * determinado. Devuelve si el prestamo se puede llevar a cabo.
	 * @param socio codigo del socio que solicita el prestamo
	 * @param codigo articulo que se solicita en prestamo
	 * @return verdadero cuando se puede efectuar el prestamo y
	 * falso en caso cotrario
	 */
	public boolean prestar(int socio, int codigo) {
		if (!disponible(codigo)) {
			return false;
		}
		Prestamo prestamo = buscar(codigo);
		
	}
	
	private Socio buscar(String dni) {
		Socio resultado = null;
		for(Socio socio: socios) {
			if(socio.getDni().equals(dni)) {
				resultado = socio;
			}
		}
		return resultado;
	}
	
	private Prestamo buscar(int codigo) {
		Prestamo prestamo = null;
		for(Disco disco:discos) {
			if(disco.getCodigo()==codigo) {
				prestamo = disco;
			}
		}
		
		for(Libro libro:libros) {
			if(libro.getCodigo()==codigo) {
				prestamo = libro;
			}
		}
		return prestamo;
	}
}
