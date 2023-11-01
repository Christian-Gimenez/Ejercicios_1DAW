package org.villablanca;

import java.util.Collection;
import java.util.HashSet;

public class Ejercicio4 {
	


	public static void metodo() {
		Collection<Integer> coleccion = new HashSet<>();
		System.out.println(coleccion.isEmpty());
		boolean insertado = coleccion.add(7);
		System.out.println(insertado);
		insertado = coleccion.add(3);
		System.out.println(insertado);
		insertado = coleccion.add(5);
		System.out.println(insertado);
		insertado = coleccion.add(7);
		System.out.println(insertado);
		System.out.println(coleccion.size());
		System.out.println(coleccion.isEmpty());
		boolean resultado = coleccion.removeAll(getCollection());
		System.out.println(resultado);
		resultado = coleccion.addAll(getCollection());
		System.out.println(resultado);
		}
	
	public static Collection<Integer> getCollection() {
		Collection<Integer> coleccion = new HashSet<>();
		coleccion.add(1);
		coleccion.add(1);
		coleccion.add(2);
		coleccion.add(3);
		coleccion.add(5);
		coleccion.add(8);
		return coleccion;
	}
	
	public static void main(String[] args) {
		metodo();
	}

}
