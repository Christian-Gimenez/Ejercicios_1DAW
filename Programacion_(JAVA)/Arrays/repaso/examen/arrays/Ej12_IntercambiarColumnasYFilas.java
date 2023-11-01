package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej12_IntercambiarColumnasYFilas {
	
	public static void invertirColumnasExternas(char[][] tabla) {
		char aux;
		for(int i = 0; i < tabla.length; i++) {
			aux = tabla[i][0];
			tabla[i][0] = tabla[i][tabla.length-1];
			tabla[i][tabla.length-1] = aux;
		}
	}
	
	public static void invertirFilasExternas(char[][] tabla) {
		char aux;
		for(int i = 0; i < tabla[0].length; i++) {
			aux = tabla[0][i];
			tabla[0][i] = tabla[tabla.length-1][i];
			tabla[tabla.length-1][i] = aux;
		}
	}
	
	public static void invertirEstaColumna(char[][] tabla, int estaColumna, int porEsta) {
		char aux;
		for(int i = 0; i < tabla.length; i++) {
			aux = tabla[i][estaColumna];
			tabla[i][estaColumna] = tabla[i][porEsta];
			tabla[i][porEsta] = aux;
		}
	}
	
	public static void invertirEstaFila(char[][] tabla, int estaFila, int porEsta) {
		char aux;
		for(int i = 0; i < tabla[estaFila].length; i++) {
			aux = tabla[estaFila][i];
			tabla[estaFila][i] = tabla[porEsta][i];
			tabla[porEsta][i] = aux;
		}
	}
	
	public static void printTable(char[][] cadenas) {
		for(int i = 0; i < cadenas.length; i++) {
			for(int j = 0; j < cadenas[i].length; j++) {
				System.out.print(" " + cadenas[i][j] + " |");
			}
			System.out.println();
		}
	}
	
	public static int menu() {
		int opcion;
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1) Invertir 1ª Columna con la Última Columna.");
			System.out.println("2) Invertir Última Fila con la 1ª Fila.");
			System.out.println("3) Seleccionar qué Columnas intercambiar.");
			System.out.println("4) Seleccionar qué Filas intercambiar.");
			System.out.println("5) Salir.");
			opcion = Teclado.leerInt();
			if (opcion < 1 || opcion > 5) {
				System.out.println("ERROR. Opción incorrecta!");
			}
		} while (opcion < 1 || opcion > 5);
		
		return opcion;
	}
	
	public static int[] pedir(String esto, char[][] tabla) {
		int [] intercambiar = new int[2];
		do {
		System.out.print("Introduce el nº de la " + esto + ": ");
		intercambiar[0] = Teclado.leerInt();
		System.out.println("Ahora, introduce el otro nº " + esto + " por el cual intercambiar: ");
		intercambiar[1] = Teclado.leerInt();
		} while (intercambiar[0] < 0 || intercambiar[0] >= tabla.length ||
				intercambiar[1] < 0 || intercambiar[1] >= tabla.length);
		
		return intercambiar;
	}
	
	public static void selector(int opcion, char[][] tabla) {
		switch(opcion) {
		case 1:
			invertirColumnasExternas(tabla);
			break;
		case 2:
			invertirFilasExternas(tabla);
			break;
		case 3:
			int[] columnas = pedir("columna", tabla);
			invertirEstaColumna(tabla, columnas[0], columnas[1]);
			break;
		case 4:
			int [] filas = pedir("fila", tabla);
			invertirEstaFila(tabla, filas[0], filas[1]);
			break;
		default:
			System.out.println("Programa finalizado.");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		char[][] tabla = { 
				{'A', 'B', 'C', 'D', 'E'},
				{'F', 'G', 'H', 'I', 'J'},
				{'K', 'L', 'M', 'N', 'O'},
				{'P', 'Q', 'R', 'S', 'T'},
				{'U', 'V', 'W', 'X', 'Y'}
				};
		printTable(tabla);
		
		do {
			opcion = menu();
			selector(opcion, tabla);
			if (opcion != 5) {
				System.out.println("Resultado:");
				printTable(tabla);
			}
		} while (opcion != 5);
	}

}
