package org.villablanca.biblioteca;

/**
 * Clase que describe el estado actual de un ejemplar de un libro de la biblioteca
 * con los atributos prestamo, disponible y si necesitaReparacion
 * @author Christian
 *
 */
public class Estado {
	private boolean prestamo;
	private boolean disponible;
	private boolean necesitaReparacion;
	
	/**
	 * Establece inicialmente el estado del ejemplar que no está prestado, que sí está disponible y que no necesita reparación
	 */
	public Estado() {
		prestamo = false;
		disponible = true;
		necesitaReparacion = false;
	}

	/**
	 * Establece el estado del prestamo, si se retira el mismo, lo pone disponible, si se establece, lo pone no disponible
	 * @param prestamo Indicar el estado que queremos ponerle al prestamo
	 */
	public void setPrestamo(boolean prestamo) {
		if(prestamo) {
			this.prestamo = true;
			disponible = false;
		} else {
			this.prestamo = false;
			disponible = true;
		}
	}

	/**
	 * Nos devuelve si está o no disponible
	 * @return Disponibilidad
	 */
	public boolean estaDisponible() {
		return disponible;
	}

	/**
	 * Nos devuelve si necesita o no reparación
	 * @return Estado físico del ejemplar
	 */
	public boolean getNecesitaReparacion() {
		return necesitaReparacion;
	}

	/**
	 * Indica si necesita o no reparación
	 * @param necesitaReparacion Establece si necesita o no reparacion
	 */
	public void setNecesitaReparacion(boolean necesitaReparacion) {
		this.necesitaReparacion = necesitaReparacion;
	}
	
	
}
