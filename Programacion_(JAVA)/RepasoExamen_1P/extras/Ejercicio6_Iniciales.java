package examen.extras;

public class Ejercicio6_Iniciales {
	
	public static String iniciales(String nombre) {
		String iniciales = ""; //Christian Miguel
		char caracter;
		nombre = nombre.trim();
		iniciales = "" + nombre.charAt(0);
		
		for(int i = 1; i < nombre.length(); i++) {
			caracter = nombre.charAt(i);
			//if (Character.isLetter(caracter) && nombre.charAt(i)) {
				//if (Character.isLetter(caracter)) {
					//iniciales += caracter;
				//}
				
			//}
		}
		
		return iniciales;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iniciales("Christian Miguel"));
	}

}
