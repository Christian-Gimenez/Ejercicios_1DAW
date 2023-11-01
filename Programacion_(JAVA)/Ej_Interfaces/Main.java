package org.villablanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona;
		Listado listado = new Listado();
		/*
		persona = new Persona("Christian", "Gimenez");
		listado.agregar(persona);
		persona = new Persona("Pepe", "Lopez");
		listado.agregar(persona);
		persona = new Persona("Laura", "Molina");
		listado.agregar(persona);
		persona = new Persona("Sergio", "Nabogrande");
		listado.agregar(persona);
		persona = new Persona("Cholo", "Perolo");
		listado.agregar(persona);
		persona = new Persona("sasd", "Gimenweqez");
		listado.agregar(persona);
		persona = new Persona("qweqqe", "qwrqwrfff");
		listado.agregar(persona);
		persona = new Persona("dfss", "dgasegh");
		listado.agregar(persona);
		persona = new Persona("qwrqwrq", "zzzzzz");
		listado.agregar(persona);
		persona = new Persona("vvvvv", "mmmmm");
		listado.agregar(persona);
		System.out.println(listado.mostrarListado());
		listado.ordenar();
		System.out.println("Ordenado:\n" + listado.mostrarListado());
		*/
		listado.agregar(45);
		listado.agregar(4);
		listado.agregar(17);
		listado.agregar(23);
		listado.agregar(33);
		listado.agregar(11);
		listado.agregar(145);
		listado.agregar(4235);
		listado.agregar(-5);
		listado.agregar(-145);
		listado.agregar(0);
		listado.ordenar();
		System.out.println(listado.mostrarListado());
		
	}

}
