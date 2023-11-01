package org.villablanca.ejercicio1;

/**
 * Clase que extiende la clase Persona, haciendo una especialización completa, agregando el atributo "sueldo" a la misma
 * @author Cryptic-WebDev
 */
public class Empleado extends Persona {
	private double sueldo;
	
	/**
	 * Constructor que crea una instancia de Empleado con los datos de Persona y el saldo de Empleado
	 * @param nombre Nombre del Empleado
	 * @param edad Edad del Empleado
	 * @param sueldo Sueldo bruto mensual del empleado
	 */
	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	
	/**
	 * Obtiene el sueldo del empleado
	 * @return Sueldo del empleado
	 */
	public double getSueldo() {
		return sueldo;
	}
	
	/**
	 * Baja el sueldo del empleado
	 * @param cantidad Si la cantidad es menor al sueldo, lo resta, si no, pone a 0€ el sueldo
	 */
	public void bajarSueldo(double cantidad) {
		if (cantidad < sueldo) {
			sueldo -= cantidad;
		} else {
			sueldo = 0.0;
		}
	}
	
	/**
	 * Aumenta el sueldo del empleado
	 * @param cantidad Cantidad a aumentar el sueldo.
	 */
	public void subirSueldo(double cantidad) {
		sueldo += cantidad;
	}
	
	/**
	 * Devuelve los datos del Empleado a una String
	 * @return Datos del Empleado, nombre, edad y sueldo mensual.
	 */
	@Override
	public String toString() {
		return "Me llamo " + getNombre() + " y tengo " + getEdad() + " años y mi salario es de " + sueldo + "€/Mes.";
	}
	
	/**
	 * Método que comprueba si el objeto es de tipo Empleado
	 * @param objeto Objeto a valoirar
	 * @return true si es de tipo Empleado. False si no lo es.
	 */
	public static boolean esEmpleado(Object objeto) {
		return objeto instanceof Empleado;
	}
	
	/**
	 * Compara dos instancias para ver si son el mismo empleado
	 * @param objeto objeto a valorar
	 * @return true si el Empleado es el mismo. False si no lo es.
	 */
	@Override
	public boolean equals(Object objeto) {
		boolean resultado = false;
		if (esEmpleado(objeto)) {
			Empleado empleado;
			empleado = (Empleado)objeto;
			if(super.equals(empleado) && sueldo == empleado.getSueldo()) {
				resultado = true;
			} 
		} 
		return resultado;
	}
}
