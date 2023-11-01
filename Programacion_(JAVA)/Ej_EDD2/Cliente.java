package org.villablanca.ejercicio1;

/**
 * Clase que extiende la clase Persona, haciendo una especialización completa, agregando el atributo "sueldo" a la misma
 * @author Cryptic-WebDev
 *
 */
public class Cliente extends Persona {
	private int numeroTelefono;
	
	/**
	 * Crea una instancia de tipo Cliente que hereda de Persona
	 * @param nombre Nombre del Cliente
	 * @param edad Edad del Cliente
	 * @param numeroTelefono Teléfono de contacto del Cliente
	 */
	public Cliente(String nombre, int edad, int numeroTelefono) {
		super(nombre, edad);
		this.numeroTelefono = numeroTelefono;
	}

	/**
	 * Obtiene el número de teléfono del Cliente
	 * @return Número teléfono
	 */
	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	/**
	 * Devuelve los datos del Cliente a una String
	 * @return Datos del Cliente, nombre, edad y teléfono.
	 */
	@Override
	public String toString() {
		return "Me llamo " + getNombre() + " y tengo " + getEdad() + " años y mi teléfono de contacto es " + numeroTelefono;
	}
	
	/**
	 * Método que comprueba si el Object es de tipo Cliente
	 * @param objeto objeto a valorar
	 * @return true si el objeto es de tipo Cliente. False si no lo es.
	 */
	public static boolean esCliente(Object objeto) {
		return objeto instanceof Cliente;
	}
	
	/**
	 * Compara dos instancias para ver si son el mismo cliente
	 * @param objeto objeto a valorar
	 * @return true si el Cliente es el mismo. False si no lo es.
	 */
	@Override
	public boolean equals(Object objeto) {
		boolean resultado = false;
		if(esCliente(objeto)) {
			Cliente cliente = (Cliente)objeto;
			if(super.equals(cliente) && this.numeroTelefono == cliente.numeroTelefono) {
				resultado = true;
			} 
		}
		return resultado;
	}
	
}

