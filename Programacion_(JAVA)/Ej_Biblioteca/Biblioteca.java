package org.villablanca.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private String direccion;
	
	private ArrayList<Bibliotecario> bibliotecarios;
	private ArrayList<Socio> socios;
	private ArrayList<Material> materiales;
	private ArrayList<Prestamo> prestamos;
	
	public Biblioteca(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.bibliotecarios = new ArrayList<>();
		this.socios = new ArrayList<>();
		this.materiales = new ArrayList<>();
		this.prestamos = new ArrayList<>();
	}
	
	public boolean agregarMaterial(Material material) {
		return this.materiales.add(material);
	}
	
	public boolean agregarBibliotecario(Bibliotecario bibliotecario) {
		return this.bibliotecarios.add(bibliotecario);
	}
	
	public Socio buscarSocioPorDni(String dni) {
		for(int i = 0; i < socios.size(); i++) {
			if(socios.get(i).getDni().equals(dni)) {
				return socios.get(i);
			}
		}
		return null;
	}

	public boolean agregarSocio(Socio socio) {
		Socio aux = buscarSocioPorDni(socio.getDni());
		if(aux != null) {
			socios.add(socio);
			return true;
		} else {
			return false;
		}
	}

	public Bibliotecario buscarBibliotecario(String dni) {
		for(Bibliotecario bibliotecario: bibliotecarios) {
			if(bibliotecario.getDni().equals(dni)) {
				return bibliotecario;
			}
		}
		return null;
	}
	
	public ArrayList<Material> getMaterial() {
		return materiales;
	}
	
	public ArrayList<Disco> getDiscos() {
		ArrayList<Disco> discos = new ArrayList<>();
		for(Material material: materiales) {
			if(material instanceof Disco) {
				discos.add((Disco)material);
			}
		}
		return discos;
	}
	public ArrayList<Libro> getLibros() {
		ArrayList<Libro> libros = new ArrayList<>();
		for(Material material: materiales) {
			if(material instanceof Libro) {
				libros.add((Libro)material);
			}
		}
		return libros;
	}

	public ArrayList<Socio> getSocios() {
		// TODO Auto-generated method stub
		return socios;
	}
	

	public Material buscarMaterial(String codigo) {
		for(Material material:materiales) {
			
		}
		return null;
	}

	public void agregarPrestamo(Prestamo prestamo) {
		this.prestamos.add(prestamo);
		
	}
	
	
}
