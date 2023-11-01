package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej8_MezclarDe3En3 {
	
	public static void printArray(int[] array) {
		for(int valor: array) {
			System.out.print("[" + valor + "]");
		}
		System.out.println();
	}
	
	public static void rellenarArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = Teclado.leerInt((i+1) + "-Introduce número: ");
		}
	}
	
	public static int[] mezclarArrays(int[] a, int[] b) {
		int [] mezcla = new int [a.length + b.length];
		
		//El for principal va de 0 a length, pero aumenta de 6 en 6
		for(int i = 0; i < mezcla.length; i=i+6) { //Ya que rellena 6 valores en cada vuelta
			//El for interno comienza en lo que vale i
			for(int j = 0; j < 3; j++) { //va hasta 3 (porque solo queremos que haga 3 veces la accion)
				//lo que vale i + j para acceder por donde iba i sumando +1, +2 y +3
				mezcla[i + j] = a[(i / 6) * 3 + j]; //divide i / 6 y luego lo multiplica * 3 y suma j
				
				mezcla[i + j + 3] = b[(i / 6) * 3 + j];
			}
		}
		
		return mezcla;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = new int[6];
		int b [] = new int[6];
		System.out.println("Introduce los valores del array \"A\":");
		rellenarArray(a);
		System.out.println("Introduce los valores del array \"B\":");
		rellenarArray(b);
		System.out.println("Valores del array \"A\":");
		printArray(a);
		System.out.println("Valores del array \"B\":");
		printArray(b);
		System.out.println("Valores del array que mazcla \"A\" y \"B\" de 3 en 3:");
		int mezcla[] = mezclarArrays(a, b);
		printArray(mezcla);
	}

}
