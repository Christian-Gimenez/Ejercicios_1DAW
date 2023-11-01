package examen.extras;

public class ExamenDAM_Ej2 {
	
	public static int numeroConsonantes(String texto) {
		int consonantes = 0;
		char caracter;
		String caja1 = "";
		String almacenarCons = "";
		
		for(int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			
			switch (caracter) {
			case 'a', 'e', 'i', 'o', 'u':
				break;
			default:
				if (Character.isLetter(caracter)) {
					almacenarCons = "" + caracter;//C
					if (!caja1.contains(almacenarCons)) {
						consonantes++;//1
					}
					
					caja1 += "" + caracter;//CC
				}
				
				/*
				if (Character.isLetter(caracter)) {
					almacenarCons = "" + caracter; //C
					if (!caja1.contains(almacenarCons)) {
						consonantes++;//+2
					}
					caja1 = "" + caracter;//C
						
				}*/
				break;
			}
		}
		
		return consonantes;
	}
	
	/*Implementar una funcion numeroConsonantes(texto)
	 * que devuelva el número de consonantes diferentes
	 * que aparecen en el texto.
	 * Realizar un programa que pruebe dicha función.
	 * Nota: Sólo manejar minúsculas.
	 * 
	 * Ej: numeroConstantes("nuevo examen") devuelve 4
	 * ya que en el texto "nuevo examen" hay 4 consonantes
	 * diferentes ("n", "v", "x", "m")
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numeroConsonantes("cacafuti"));
	}

}
