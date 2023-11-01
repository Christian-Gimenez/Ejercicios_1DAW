package org.villablanca.ejercicio1;

/**
 * Clase que sirve como base de datos para la empresa
 * almacenando todos sus empleados y clientes
 * @author Cryptic-WebDev
 *
 */
public class Empresa {
	private String nombre;
	private String direccion;
	private Lista empleados;
	private Lista clientes;

	public Empresa(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.empleados = new Lista();
		this.clientes = new Lista();
	}
	
	public void addPersona(Persona persona) {
		if (Empleado.esEmpleado(persona)) {
			empleados.add(persona);
		} else if (Cliente.esCliente(persona)) {
			clientes.add(persona);
		}
	}
	
}
