package ejercicios.clase.arrays;

public class Ejercicio18 {
	
	public static boolean esMenor(int este, int queEste) {
		boolean resultado = false;
		if(este < queEste) {
			resultado = true;
		}

		return resultado;
	}
	
	public static boolean esMayor(int este, int queEste) {
		boolean resultado = false;
		if(este > queEste) {
			resultado = true;
		}

		return resultado;
	}
	
	public static int elMayor(int[] vector) {
		int mayor = vector[0];
		for(int i = 1; i < vector.length; i++) {
			if(esMayor(vector[i], mayor)) {
				mayor = vector[i];
			}
		}
		return mayor;
	}
	
	public static int elMenor(int[] vector) {
		int menor = vector[0];
		for(int i = 0; i < vector.length; i++) {
			if(esMenor(vector[i], menor)) {
				menor = vector[i];
			}
		}
		return menor;
	}
	
	public static int elDelMedio(int[] vector) {
		int mayor = elMayor(vector);
		int menor = elMenor(vector);
		int medio;
		int[] losDelMedio = new int[vector.length-2];
		int j = 0;
		for(int i = 0; i < vector.length; i++) {
			if (vector[i] != mayor && vector[i] != menor) {
				losDelMedio[j++] = vector[i];
			}
		}
		
		losDelMedio = ordenarMenorAMayor(losDelMedio);
		medio = losDelMedio[1];
		
		return medio;
	}
	
	public static int[] copiarArray(int[] array) {
		int[] copia = new int[array.length];
		int i = 0;
		for(int valor:array) {
			copia[i++] = valor;
		}
		return copia;
	}
	
	public static int[] ordenarMenorAMayor(int[] ordenado) {
		boolean cambios = true;
		int aux;
		for(int i = 0; i < ordenado.length && cambios; i++) {
			cambios = false;
			for(int j = 1; j < ordenado.length; j++) {
				if (esMenor(ordenado[j], ordenado[j-1])) {
					cambios = true;
					aux = ordenado[j-1];
					ordenado[j-1] = ordenado[j];
					ordenado[j] = aux;
				}
			}
		}
		return ordenado;
	}
	
	public static void printOrden(int[] vector) {
		char orden;
		for(int i = 1; i < vector.length; i++) {
			
			System.out.print(vector[i-1] + " ");
			
			if(esMayor(vector[i-1], vector[i])) {
				orden = '>';
			} else if (esMenor(vector[i-1], vector[i])) {
				orden = '<';
			} else {
				orden = '=';
			}
			
			if(i != vector.length-1) {
				System.out.print(orden + " ");
			} else {
				System.out.print(orden + " " + vector[i]);
			}
			
			
		}
	}

	public static void main(String[] args) {
		int[] vector = {2, 5, 1, 2, 3};
		System.out.println("El mayor es: " + elMayor(vector));
		System.out.println("El menor es: " + elMenor(vector));
		System.out.println("El del medio es: " + elDelMedio(vector));
		System.out.println("El vector originalmente era: ");
		printOrden(vector);
		System.out.println("\nY todo el vector ordenado de mayor a menor queda así:");
		printOrden(ordenarMenorAMayor(vector));

	}

}
