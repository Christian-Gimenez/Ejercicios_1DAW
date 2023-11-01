package org.villablanca.biblioteca;

public class Bibliotecario extends Persona {

	private float salario;
	
	public Bibliotecario(String nombre, String dni) {
		super(nombre, dni);
		this.salario = 20000;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	
}
