package org.villablanca;

import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio2 {
	
	private ArrayList<Integer> enteros;
	
	public int aleatorio() {
		return (int)(Math.random() * 10) + 1;
		
	}
	
	public void generar() {
		enteros = new ArrayList<>();
		for(int i = 1; i<=100;i++) {
			enteros.add(aleatorio());
		}
		
		boolean encontrado = enteros.contains(5);
		while(encontrado) {
			encontrado = enteros.remove(Integer.valueOf(5));
		
		ArrayList<Integer> eliminar = new ArrayList<>();
		eliminar.add(3);
		eliminar.add(5);
		eliminar.add(7);
		eliminar.add(9);
		//Añadir a la lista enteros las de la otra lista
		enteros.addAll(eliminar);
		System.out.println(enteros);
		//Eliminame de la lista todos los elementos salvo los de esta otra lista
		enteros.retainAll(eliminar);
		System.out.println(enteros);
		//Eliminame todos los elementos de la lista
		enteros.removeAll(eliminar);
		System.out.println(enteros);
		}
		//Se puede convertir un arraylist a un array, pero al acceder hay que hacer cast
		Object[] array = enteros.toArray();
		Integer[] arrayEnteros = enteros.toArray(new Integer[0]);
	}
	
	public static void main(String[] args) {
		
		new Ejercicio2().generar();
	}
	
}
