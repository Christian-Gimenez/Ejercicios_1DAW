package ejercicios.clase.arrays;

import java.lang.reflect.Array;

import daw.com.Teclado;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*DISEÑAR UNA APLICACIÓN QUE DECLARE
		 * UNA TABLA DE 10 ELEMENTOS ENTEROS.
		 * LEER MEDIANTE EL TECLADO 8 NÚMEROS.
		 * DESPUÉS SE DEBE PEDIR UN NÚMERO Y UNA POSICIÓN,
		 * INSERTARLO EN LA POSICIÓN INDICADA,
		 * DESPLAZANDO LOS QUE ESTÉN DETRÁS. */
		
		int[] tabla = new int[10];
		int num, index;
		for (int i = 0; i < 8; i++) {
			System.out.print((i+1) + "º número entero: ");
			tabla[i] = Teclado.leerInt();
		}
		
		System.out.println("Tabla antes: ");
		for(int numero:tabla) {
			System.out.print("[" + numero + "]");
		}
		
		System.out.print("\nNúmero a insertar en la tabla: ");
		num = Teclado.leerInt();
		
		System.out.print("Posición: ");
		index = Teclado.leerInt();
		
		//Tabla antes =   {1, 2, 3, 4, 5, 6, 7, 8, 0, 0}
		
		insertarEnTabla(tabla, index, num);
		
		System.out.println("\nTabla despues: ");
		for(int nuevo:tabla) {
			System.out.print("[" + nuevo + "]");
		}
		//Tabla despues = {1, 2, 3, 4, X, 5, 6, 7, 8, 0}
		

	}
	
	public static void insertarEnTabla(int[] tabla, int index, int num) {
		//int aux;
		for(int i = tabla.length-1; i > index; i--) {
			tabla[i] = tabla[i-1];
		}
		
		tabla[index] = num;
		/*
		 * if (tabla[index] != 0) {
			for(int i = 0; i <= index; i++) {
				if (i == 0) {
					aux = tabla[i];
					tabla[tabla.length - 1] = aux;
				} else {
					aux = tabla[i];
					tabla[i-1] = aux;
				}
			}
		}
		tabla[index] = num;
		 * 
		if (index != 0) {
			for(int i = 1; i <= index; i++) {
				tabla[i-1] = tabla[i];
				if (index == i) {
					tabla[i] = num;
				}
			}
		} else {
			tabla[index] = num;
		}
		if (index != tabla.length-1) {
			tabla[tabla.length-1] = aux;
		} else {
			tabla[tabla.length-2] = aux;
		}*/
		
		
	}

}
