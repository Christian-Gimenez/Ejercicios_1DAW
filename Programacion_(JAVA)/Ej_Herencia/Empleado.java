package org.villablanca;

import daw.com.Teclado;

public class Empleado extends Persona {
	protected double salario;
	
	public Empleado(String nombre, int edad, double estatura, double salario) {
		super(nombre, edad, estatura);
		this.salario = salario;
	}
	
	@Override
	public void saluda() {
		System.out.println("Hola!! Me llamo " + getNombre() + ", soy un empleado y me quedan " +
				(65-getEdad()) + " años para jubilarme!!");
	}

	@Override //Indica al compilador que estamos sobreescribiendo el metodo padre
	public String toString() {
		return "Empleado [salario=" + salario + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getEstatura()=" + getEstatura() + "]";
	}
	
	

	
}
