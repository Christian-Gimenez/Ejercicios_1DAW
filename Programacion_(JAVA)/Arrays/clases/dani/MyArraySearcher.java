package clases.dani;
abstract class elHeavy {
	 
}

public class MyArraySearcher {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] matriz = { "asdf", "1234", "qwert", "butifarra", "fiesta", "zanahoria" };
		System.out.println(getElMasGrande(matriz));
		
	}
	
	public static String getElMasGrande(String[] lista) {
		String masGrande = lista[0];
		
		for (int i = 1; i < lista.length; i++) {
			if (esMasGrande(lista[i], masGrande)) {
				masGrande = lista[i];
			}
		}
		
		
		return masGrande;
	}

	private static boolean esMasGrande(String este, String queEste) {
		return este.length() > queEste.length();
	}

	

}
