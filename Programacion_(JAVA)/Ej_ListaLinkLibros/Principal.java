package org.villablanca.christian;

import java.util.Scanner;

public class Principal {
	
	public static int leerInt() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static String leerString() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static void introducirLibros(Lista lista) {
		System.out.print("Título del libro: ");
		String titulo = leerString();
		System.out.print("Nombre del autor: ");
		String autor = leerString();
		Libro nuevo = new Libro(titulo, autor);
		lista.addLibro(nuevo);
	}
	
	public static void mostrarCantidadLibros(Lista lista) {
		System.out.println("Actualmente hay " + lista.contarLibros() + " libros en tu colección.");
	}
	
	public static void imprimirLibros(Lista lista) {
		int i = 1;
		Nodo actual = lista.getPrimero();
		System.out.println("Lista de libros actuales:");
		while(actual.getSiguiente() != null) {
			System.out.println((i++) + "Autor: \"" + actual.getLibro().getAutor() + "\", Título: \"" + actual.getLibro().getTitulo() + "\"");
			actual = actual.getSiguiente();
		}
	}
	
	public static void ordenarLibros(Lista lista) {
		int opcion = 0;
		do {
			System.out.println("¿Cómo quieres ordenar los libros?");
			System.out.println("1) Autor (A-Z).");
			System.out.println("2) Título (A-Z).");
			opcion = leerInt();
		} while (opcion != 1 || opcion != 2);
		
		if (opcion == 1) {
			lista.ordenarPorAutor();
		} else {
			
		}
	}
	
	public static void printMenu() {
		System.out.println("1) Añadir Libro.");
		System.out.println("2) Consultar Libro.");
		System.out.println("3) Eliminar Libro.");
		System.out.println("4) Mostrar lista de Libros.");
		System.out.println("5) Mostrar cantidad de Libros.");
		System.out.println("6) Ordenar Libros.");
		System.out.print("-> ");
	}
	
	public static void menuPrincipal(Lista lista) {
		int opcion;
		System.out.println("Bienvenido a su biblioteca personal.");
		do {
			printMenu();
			opcion = leerInt();
			switch(opcion) {
			case 1:
				introducirLibros(lista);
				break;
			case 2:
				//consultar libro
				break;
			case 3:
				//Eliminar libro
				break;
			case 4:
				imprimirLibros(lista);
				break;
			case 5:
				mostrarCantidadLibros(lista);
				break;
			case 6:
				ordenarLibros(lista);
				break;
			}
		} while(opcion != 7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
