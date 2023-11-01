package org.villablanca.biblioteca;

/**
 * Clase que indica las sanciones que puede tener un Socio si no devuelve el libro en la fecha indicada
 * @author Christian
 *
 */
public class Sancion {
	private int diasSancion;
	private Fecha tiempoSancion;
	
	/**
	 * Indica la sanción interpuesta
	 * @param dias Numero de Dias que excedió de la devolución
	 * @param tiempo Tiempo total de sancion
	 */
	public Sancion(int dias, Fecha tiempo) {
		diasSancion= dias;
		tiempoSancion = tiempo;
	}

	/**
	 * Obtiene el número de dias que se excedió el socio
	 * @return Número de dias de exceso de devolución
	 */
	public int getDiasSancion() {
		return diasSancion;
	}

	/**
	 * Obtiene el tiempo de sancion
	 * @return Fecha de sancion para poder volver a pedir prestado un libro
	 */
	public Fecha getTiempoSancion() {
		return tiempoSancion;
	}
}
