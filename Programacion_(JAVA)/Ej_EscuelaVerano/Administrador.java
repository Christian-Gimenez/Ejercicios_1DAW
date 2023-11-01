package org.villablanca;

public class Administrador extends Persona {
	
	public Administrador(String nombre, String apellidos) {
		super(nombre, apellidos);
	}
	
	public void altaOferta(Curso curso, Fecha fechaCreacion) {
		Oferta nuevaOferta = new Oferta(curso, fechaCreacion);
	}
	
	public void bajaOferta(Oferta oferta) {
		oferta = null;
	}
}
