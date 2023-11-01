package secuenciales;
import java.util.Scanner;
public class Ej16 {

	public static void main(String[] args) {
		/*Dos vehículos viajan a diferentes velocidades (v1 y v2)
		 * y están distanciados por una distancia d.
		 * El que está detrás viaja a una velocidad mayor.
		 * Se pide hacer un algoritmo para ingresar la distancia
		 * entre los dos vehículos (km) y sus respectivas velocidades (km/h)
		 * y con esto determinar y mostrar en que tiempo (minutos)
		 * alcanzará el vehículo más rápido al otro.
		 * */
		Scanner teclado = new Scanner(System.in);
		int v1, v2, tiempoTotalAdelantar;
		double distancia, diferenciaVelocidad, horas, minutos, parteDecimal, segundos;
		
		do {
		System.out.print("Introduce la velocidad del vehiculo 1 (Km/h): ");
		v1 = teclado.nextInt();
		
		System.out.print("Introduce la velocidad del vehiculo 2 (Km/h) siendo más veloz que el anterior: ");
		v2 = teclado.nextInt();
		} while (v1 > v2);
		
		System.out.print("Indica la distancia entre ambos vehiculos (Km): ");
		distancia = teclado.nextInt();
		
		diferenciaVelocidad = v1 - v2;
		horas = Math.abs(distancia / diferenciaVelocidad);
		minutos = horas * 60;
		segundos = (minutos % 1) * 100; 
				
		System.out.println("El segundo vehículo tardará " + Math.round(minutos) + " minutos y " + Math.round(segundos) + " segundos en adelantar al primer vehículo.");
		
	}

}
