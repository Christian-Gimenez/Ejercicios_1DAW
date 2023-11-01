package org.villablanca;

/**
 * Clase Pelicula que hereda de Material, añadiendo al mismo el Actor Principal
 * @author Christian
 *
 */
public class Pelicula extends Material {
	
	private String actorPrincipal;

	public Pelicula(int codigoReferencia, String nombre, String fechaEstreno, String categoria, String actorPrincipal) {
		super(codigoReferencia, nombre, fechaEstreno, categoria);
		this.actorPrincipal = actorPrincipal;
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

}
