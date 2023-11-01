package repaso.examen.arrays;

public class Ej14_Search {
	/*Perro
	 *Perra*/
	
	public static boolean hayDesordenCharPorChar(String[] array, int anterior, int siguiente) {
		boolean iguales = true;
		boolean habiaDesorden = false;
		for(int i = 0; i < array[anterior].length() && i < array[siguiente].length() && iguales; i++) {
			if (array[anterior].charAt(i) != array[siguiente].charAt(i)) {
				iguales = false;
				if (array[anterior].charAt(i) > array[siguiente].charAt(i)) {
					habiaDesorden = true;
					cambiarOrden(array, anterior, siguiente);
				}
			}
		}
		return habiaDesorden;
	}
	
	public static void cambiarOrden(String[] array, int este, int porEste) {
		String aux = array[este];
		array[este] = array[porEste];
		array[porEste] = aux;
	}
	
	public static void ordenAlfabeticoAZ(String[] array) {
		boolean desorden = true;
		for(int i = 0; i < array.length && desorden; i++) {
			desorden = false;
			for(int j = 1; j < array.length; j++) {
				if (Character.toLowerCase(array[j-1].charAt(0)) >= Character.toLowerCase(array[j].charAt(0))) {
					hayDesordenCharPorChar(array, j-1, j);
					desorden = true;	
				}
			}
		}
	}
	
	public static String elMasCorto(String[] array) {
		String masCorto = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i].length() < masCorto.length()) {
				masCorto = array[i];
			}
		}
		return masCorto;
	}
	
	public static String elMasLargo(String[] array) {
		String masLargo = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i].length() > masLargo.length()) {
				masLargo = array[i];
			}
		}
		return masLargo;
	}
	
	public static int elMasPeque(int[] array) {
		int masPeque = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] < masPeque) {
				masPeque = array[i];
			}
		}
		return masPeque;
	}
	
	public static int elMasGrande(int[] array) {
		int masGrande = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] > masGrande) {
				masGrande = array[i];
			}
		}
		return masGrande;
	}
	
	public static int searchInt(int busqueda, int[] array) {
		int posicion = -1;
		boolean encontrado = false;
		for(int i = 0; i < array.length && !encontrado; i++) {
			if (array[i] == busqueda) {
				encontrado = true;
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static int searchString(String busqueda, String[] array) {
		int posicion = -1;
		boolean encontrado = false;
		for(int i = 0; i < array.length && !encontrado; i++) {
			if (array[i].equalsIgnoreCase(busqueda)) {
				encontrado = true;
				posicion = i;
			}
		}
		return posicion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt = { 1, 54, 8, 90, 122, 4, 2, -5, 1123, 5, 6 };
		String[] arrayString = { "Perro", "Perra", "Lucio", "Cherketovich", "Leo", "Aaer", "Nihiman", "plero"};
		int intGrande = elMasGrande(arrayInt);
		int posIntGrande = searchInt(intGrande, arrayInt);
		int intPeque = elMasPeque(arrayInt);
		int posIntPeque = searchInt(intPeque, arrayInt);
		String stringLargo = elMasLargo(arrayString);
		int posStringLargo = searchString(stringLargo, arrayString);
		String stringCorto = elMasCorto(arrayString);
		int posStringCorto = searchString(stringCorto, arrayString);


		ordenAlfabeticoAZ(arrayString);
	
		
		System.out.println("El Array ordenado de manera alfabética es:");
		for(String valor: arrayString) {
			System.out.println(valor);
		}

	}

}
