package examen.functions;

public class Ejercicio4_ElDobledelParametro {
	
	public static int elDoble(int n) {
		return n * 2;
	}
	
	public static void muestraElDoble(int num) {
		int doble = elDoble(num);
		System.out.println("El doble de " + num + " es = " + doble);
	}

	public static void main(String[] args) {
		/*Función que muestra en pantalla
		 * el doble del valor que se le pasa como parámetro.*/
		muestraElDoble(8);
	}

}
