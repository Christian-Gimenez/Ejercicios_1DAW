package org.villablanca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * Clase que representa un material de QTVEO, el cual luego será Serie o Película.
 * Todo material tiene en común su identificador único (codigoReferencia),
 * nombre, fecha de estreno, la cual no puede ser anterior al 03-02-2022
 * y Categoria del mismo (AVENTURA, ACCION, TERROR, COMEDIA).
 * @author Christian
 *
 */
public class Material implements Comparable<Material> {
	private int codigoReferencia;
	private String nombre;
	private LocalDate fechaEstreno;
	private Categoria categoria;
	
	/**
	 * Constructor único y completo para evitar errores.
	 * @param codigoReferencia Código UNICO que identifica el material
	 * @param nombre Nombre del material
	 * @param fechaEstreno Fecha de estreno (posterior al 03-02-2022) con formato DD-MM-AAAA
	 * @param categoria Categoria del material.
	 */
	public Material(int codigoReferencia, String nombre, String fechaEstreno, String categoria) {
		super();
		this.codigoReferencia = codigoReferencia;
		this.nombre = nombre;
		setFechaEstreno(fechaEstreno);
		setCategoria(categoria);
	}
	
	/**
	 * Set de fecha de estreno con formato DD-MM-AA que previene que la misma sea anterior al 03-02-2022
	 * si esta es anterior a la indicada, la pone a 'null'
	 * @param fechaEstreno
	 */
	public void setFechaEstreno(String fechaEstreno)  {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d-M-yyyy");
		LocalDate fecha = LocalDate.parse(fechaEstreno, formato);
		if (fecha.isAfter(LocalDate.parse("03-02-2022", formato))) {
			this.fechaEstreno = fecha;
		} else {
			this.fechaEstreno = null;
		}
	}
	
	/**
	 * Categoria por defecto: COMEDIA
	 * @param categoria Recibe una String y la convierte al enum Categoria
	 */
	public void setCategoria(String categoria) {
		if (categoria.equalsIgnoreCase("AVENTURA")) {
			this.categoria = Categoria.AVENTURA;
		} else if (categoria.equalsIgnoreCase("ACCION")) {
			this.categoria = Categoria.ACCION;
		} else if (categoria.equalsIgnoreCase("TERROR")) {
			this.categoria = Categoria.TERROR;
		} else {
			this.categoria = Categoria.COMEDIA;
		}
	}

	public int getCodigoReferencia() {
		return codigoReferencia;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Material [codigoReferencia=" + codigoReferencia + ", nombre=" + nombre + ", fechaEstreno="
				+ fechaEstreno + ", categoria=" + categoria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoReferencia);
	}

	/**
	 * Los materiales son iguales cuando su codigoReferencia es igual
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		return codigoReferencia == other.codigoReferencia;
	}

	/**
	 * El orden natural establecido para el material es su NOMBRE
	 */
	@Override
	public int compareTo(Material o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	
}
