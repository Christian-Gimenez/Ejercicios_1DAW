package org.villablanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Clase que reune todos los datos de los clientes de QTVEO.
 * Con sus datos NIF (identificador UNICO), nombre, cuota a pagar, direccion postal y
 * Lista de material visualizado (contiene el material visualizado y la fecha de visualizacion).
 * @author Christian
 *
 */
public class Cliente {
	private String nif;
	private String nombre;
	private float cuotaAPagar;
	private DireccionPostal direccionPostal;
	private List<DatosVisualizaciones> materialVisualizado;
	
	/**
	 * Constructor de cliente. Para evitar errores no hay constructor por defecto
	 * @param nif Nif del cliente, este debe ser UNICO
	 * @param nombre Nombre completo del cliente.
	 * @param cuotaAPagar Cuota a pagar del cliente.
	 * @param direccionPostal Direccion postal del cliente (calle, portal, localidad y C.P.)
	 */
	public Cliente(String nif, String nombre, float cuotaAPagar, DireccionPostal direccionPostal) {
		this.nif = nif;
		this.nombre = nombre;
		this.cuotaAPagar = cuotaAPagar;
		this.direccionPostal = direccionPostal;
		this.materialVisualizado = new ArrayList<>();
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getCuotaAPagar() {
		return cuotaAPagar;
	}
	
	public void setCuotaAPagar(float cuotaAPagar) {
		this.cuotaAPagar = cuotaAPagar;
	}
	public DireccionPostal getDireccionPostal() {
		return direccionPostal;
	}
	
	public void setDireccionPostal(DireccionPostal direccionPostal) {
		this.direccionPostal = direccionPostal;
	}
	
	
	public List<DatosVisualizaciones> getMaterialVisualizado() {
		return materialVisualizado;
	}
	
	/**
	 * Añade una visualizacion (Material + Fecha Visualizacion) al cliente
	 * @param visualizacion Visualizacion del cliente (Material + Fecha Visualizacion)
	 */
	public void setMaterialVisualizado(DatosVisualizaciones visualizacion) {
		this.materialVisualizado.add(visualizacion);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}
	
	/**
	 * Los clientes son iguales cuando sus NIF son iguales.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nif, other.nif);
	}
	
}
