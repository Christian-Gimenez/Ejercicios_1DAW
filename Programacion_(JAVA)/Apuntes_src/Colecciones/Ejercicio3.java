package org.villablanca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import daw.com.Teclado;

public class Ejercicio3 {
	
	//Crear una lista de numeros enteros positivos introducidos por teclado
	//hasta que se introduzca un numero negativo. A continuacion recorrer
	//la lista y mostrar por pantalla los indices de los elementos de valor par,
	//y se reemplazara por su valor multiplicado por 100
	
	public void numerosEnteros() {
		int numUser = 0;
		List<Integer> lista = new ArrayList<Integer>();
		while(numUser >= 0) {
			System.out.println("Introduce un número positivo (para salir, introduce uno negativo): ");
			numUser = Teclado.leerInt();
			if (numUser >= 0) {
				lista.add(numUser);
			}
		}
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 == 0) {
				System.out.print("Indice: " + i + "  ->  Su valor es: " + lista.get(i));
				 lista.set(i, lista.get(i)*100);
				System.out.println(" * 100 = " +  lista.set(i, lista.get(i)*100));
			}
		}
	}
	
public static void main(String[] args) {
		new Ejercicio3().numerosEnteros();
		
		List<Integer> lista = new ArrayList<>();
		int entero = Teclado.leerInt();
		while(entero >= 0) {
			lista.add(entero);
			entero = Teclado.leerInt();
		}
		
		Integer[] array = {1,1,2,3,5,8,13,21,34};
		//List<Integer> lista = Arrays.asList(array);
		List<Integer> lista = new ArrayList<Integer>(Arrays.asList(array));
		//ArrayList<Integer> listaDos = new ArrayList<Integer>();
		listaDos.addAll(lista);
		listaDos.add(100);
		
		System.out.println(lista);
		lista.get(0);
		lista.add(4, 15);
		List<Integer> otra = new ArrayList<>();
		lista.addAll(4, otra);
		Integer elemento = lista.set(0, 58);
		System.out.println(elemento);
		System.out.println(lista);
		lista.indexOf(34);
		lista.lastIndexOf(34);
		lista.equals(otra);
		
	}
}
