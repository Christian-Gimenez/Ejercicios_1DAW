import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CREAR UNA FUNCION QUE CALCULE LA TEMP MEDIA DE UN DIA A PARTIR DE LA TEMPERATURA MÁXIMA Y MÍNIMA.
		 * CREA UN PROGRAMA PRINCIPAL, QUE UTILIZANDO LA FUNCIÓN ANTERIOR, VAYA PIDIENDO LA TEMPERATURA MÁXIMA
		 * Y MÍNIMA DE CADA DÍA Y VAYA MOSTRANDO LA MEDIA. EL PROGRAMA PEDIRÁ EL NÚMERO DE DÍAS
		 * QUE SE VAN A INTRODUCIR*/
		Scanner teclado = new Scanner(System.in);
		int nDias;
		double maxima, minima;
		
		System.out.print("Introduce el número de días: ");
		nDias = teclado.nextInt();
		
		for(int i = 1; i <= nDias; i++) {
			maxima = leerTemperatura("maxima");
			minima = leerTemperatura("minima");
			
			System.out.println("La temperatura media del " + i + " día es: " + temperaturaMedia(maxima, minima) + "ºC.");
		}
	}
	
	public static double temperaturaMedia(double maxima, double minima) {
		return (maxima + minima)/2;
	}
	
	public static double leerTemperatura(String cual) {
		double temperatura;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame temperatura " + cual + ": ");
		return teclado.nextDouble();
	}

}
