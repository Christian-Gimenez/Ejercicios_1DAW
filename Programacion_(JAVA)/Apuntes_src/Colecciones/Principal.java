package org.villablanca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Principal {
	
	private ArrayList<Integer> numeros = new ArrayList<>();
	
	public int aleatorio() {
		return (int)(Math.random() * 100) + 1;
	}
	
	public void sorteo() {
		int cantidad = 0;
		while(numeros.size() < 20) {
			int aleatorio = aleatorio();
			if(!this.numeros.contains(aleatorio)) {
				numeros.add(aleatorio);
			}
		}
		imprimir();
	}
	
	private void imprimir() {
		Comparator<Integer> ordenNatural = Comparator.naturalOrder();
		Comparator<Integer> ordenDecreciente = ordenNatural.reversed();
		Collections.sort(numeros, ordenNatural);
		System.out.println("ASC:" + numeros);
		Collections.sort(numeros, ordenDecreciente);
		System.out.println("DESC: " + numeros);
	}

	public static void main(String... args) {
		
		//Collection<Integer> coleccion = new ArrayList<>();
		Collection<Integer> coleccion2 = new ArrayList<>();
		coleccion2.add(8);
		coleccion1.add(7);
		coleccion1.add(3);
		boolean insertado = coleccion1.add(7);
		System.out.println("Se ha insertado: " + insertado);
		System.out.println(coleccion1);
		boolean borrado=coleccion1.remove(7);
		System.out.println("Se ha borrado: " + borrado);
		System.out.println(coleccion1);
		System.out.println("7? " + coleccion1.contains(7));
		coleccion1.clear();
		System.out.println(coleccion1);
		
		new Principal().sorteo();
		
		Collection<Integer> coleccion = new ArrayList<>();
		//Podemos agregar elemntos o un array convencional a la instancia de:
		//List -> ArrayList/LinkedList
		//Set -> HashSet/TreeSet
		boolean bienAgregado = Collections.addAll(coleccion, 1, 2, 3, 4);
		bienAgregado = Collections.addAll(coleccion, new Integer[] {1, 2, 3 ,4});
		
		Collection<Character> lista = new LinkedList<>();
		lista.add('A'); lista.add('B'); lista.add('C');
		//Podemos rellenar una lista no vacía sustituyendo todos sus elementos por el indicado
		Collections.fill(lista, 'X');
		System.out.println(lista);
		
	}

}
