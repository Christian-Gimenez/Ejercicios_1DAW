package clases.dani;

public class MyArraySorter {

	public static void main(String[] args) {

		String[] matriz = { "asdf", "1234", "qwert", "butifarra", "fiesta", "zanahoria" };

		boolean changes = true;
		// Este es el metodo bubble sort (metodo burbuja)
		for (int i = 0; i < matriz.length && changes; i++) {
			changes = false;
			for (int j = 1; j < matriz.length - i; j++) {
				if (esMasGrande(matriz[j - 1], matriz[j])) {
					changes = true;
					String aux = matriz[j];
					matriz[j] = matriz[j - 1];
					matriz[j - 1] = aux;
				}
			}
			System.out.println(i);
		}

		for (String palabra : matriz) {
			System.out.println(palabra);
		}

		/*
		 * for(int i = 0; i < matriz.length; i++) { System.out.println(matriz[i]); }
		 */
	}

	private static boolean esMasGrande(String este, String queEste) {
		return este.length() > queEste.length();
	}

}
