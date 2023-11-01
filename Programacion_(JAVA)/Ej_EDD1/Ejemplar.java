package org.villablanca.biblioteca;

/**
 * Clase que representa un ejemplar de un libro, el cual consta de:
 * <ul>
 * 	<li>Código identificativo del ejemplar</li>
 * <li>Fecha estimada de devolución</li>
 * <li>Estado actual del ejemplar</li>
 * <li>Socio asignado como préstamo de ese ejemplar</li>
 * </ul>
 * @author Christian
 *
 */
public class Ejemplar {
	private int codigo;
	private Libro libro;
	private Fecha fechaDevolucion;
	private Estado estado;
	private Socio socioPrestamo;
	
	/**
	 * Crea una instancia del ejemplar de un libro
	 * @param codigo Código identificativo del ejemplar
	 * @param libro Libro al cual pertenece el ejemplar
	 * @param estado Estado actual del libro
	 */
	public Ejemplar(int codigo, Libro libro, Estado estado) {
		this.codigo = codigo;
		this.libro = libro;
		this.fechaDevolucion =null;
		this.estado = estado;
		this.socioPrestamo = null;
	}
	
	/**
	 * Obtiene el libro al cual pertenece el ejemplar
	 * @return Libro del ejemplar
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * Obtiene la fecha de devolución del libro
	 * @return Fecha devolución del libro
	 */
	public Fecha getFechaDevolucion() {
		return fechaDevolucion;
	}

	/**
	 * Establece la fecha de devolución del libro tras ser prestado
	 * @param fechaDevolucion
	 */
	public void setFechaDevolucion(Fecha fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	/**
	 * Obtiene el socio que ha pedido prestado el libro
	 * @return Socio que tiene prestado el libro
	 */
	public Socio getSocioPrestamo() {
		return socioPrestamo;
	}

	/**
	 * Establece el socio que va a prestar ahora el libro
	 * @param socioPrestamo Nuevo socio que cogerá prestado el libro
	 */
	public void setSocioPrestamo(Socio socioPrestamo) {
		if (this.socioPrestamo != null) {
			this.socioPrestamo = socioPrestamo;
			estado.setPrestamo(true);
		}
		
	}

	/**
	 * Obtiene el código identificativo del ejemplar
	 * @return Código identificativo del ejemplar
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Obtiene el estado actual del ejemplar
	 * @return Estado actual
	 */
	public Estado getEstado() {
		return estado;
	}
	
	
	
	
	
}
