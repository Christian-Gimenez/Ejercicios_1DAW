package org.villablanca.animales;

public class Gato extends Animal implements Sonido {
	
	private String nombre;
	
	public Gato() {
		this.nombre = "Callejero";
	}
	
	public Gato(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void voz() {
		System.out.println("Soy " + nombre);
		System.out.println("Meow meow");
	}
	
	public static void ronronea() {
		System.out.println("BRRRRRRRR!!!!");
	}
	
	public static void bostezo() {
		System.out.println("Miaaaaaauuuhh!");
	}

}
