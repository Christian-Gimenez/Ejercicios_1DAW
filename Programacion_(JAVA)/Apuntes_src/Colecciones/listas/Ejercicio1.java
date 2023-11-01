package org.villablanca.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio1 {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer> (List.of(
				1, 1, 2, 3, 5, 8, 13, 21, 34, 55
				));
		//System.out.println(Collections.binarySearch(lista, 13)); //devuelve la posición en la lista, si no está devuelve la posicion
																									   //donde deberia estar para estar organizada pero en negativo
//		int indice = Collections.binarySearch(lista, 4);
//		System.out.println("El elemento no encontrado debería estar en la posicion " + Math.abs(indice));
//		int posicion = -indice -1;
//		lista.add(posicion, 4);
		/*
		Collections.swap(lista, 0, lista.size()-1);
		Collections.replaceAll(lista, 1, -1);
		
		List<Integer> copia = new ArrayList<Integer>(lista.size());
		
		for(int i = 0; i < copia.size();i++) {
			copia.add(0);
		}
		Collections.fill(copia, 0);
		Collections.copy(copia, lista);
		
		//copia.addAll(lista);
		System.out.println(lista);
		System.out.println(copia);
		*/
		Collections.shuffle(lista); //Desordena / baraja
		Collections.max(lista); //Devuelve el maximo
		Collections.min(lista); //Devuelve el minimo
		Collections.frequency(lista, 1); //Devuelve las veces que aparece el dato del 2º argumento
		Collections.reverse(lista); //Da la vuelta a la lista
		
	}
}
