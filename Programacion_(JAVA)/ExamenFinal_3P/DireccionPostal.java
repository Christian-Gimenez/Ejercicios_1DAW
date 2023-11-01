package org.villablanca;

/**
 * Clase que representa la direccion de un cliente, con su calle, portal, localidad y C.P.
 * @author Christian
 *
 */
public class DireccionPostal {
	private String calle;
	private int portal;
	private String localidad;
	private int codigoPostal;
	
	public DireccionPostal(String calle, int portal, String localidad, int codigoPostal) {
		this.calle = calle;
		this.portal = portal;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public int getPortal() {
		return portal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

}
