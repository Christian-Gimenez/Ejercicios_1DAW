import java.util.Scanner;

public class Ejercicio1 {
	
	public static int pedirKilometros() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static double costeDelAlquiler(int kilometros) {
		double precioAlquiler = 0.0;
		if (kilometros > 0 && kilometros <= 300) {
			precioAlquiler = 100.0;
		} else if (kilometros <= 1000) {
			kilometros = kilometros - 300;
			precioAlquiler = 100.0 + (kilometros * 0.15);
		} else {
			precioAlquiler = 100.0;
			kilometros = kilometros - 1000;
			precioAlquiler += 700.0 * 0.15;
			precioAlquiler += kilometros * 0.10;
		} 
		return precioAlquiler;
	}

	public static void main(String[] args) {
		//devolver el coste del alquiler.
		//Cantidad fija 100€ si no se rebasan 300KM
		//Si la distancia es <= 1000KM, se cobraran 100€ + el KM que exceda de 300KM a 0,15€/KM
		//Si la distancia > 1000KM, se cobraran 100€ + KM a 0,15€ para los 300-1000
		//Y a partir de ahi, 0,10€/km para el resto.
		int km = 0;
		double precioAlquiler = 0.0;
		System.out.print("Introduzca el kilometraje realizado por el cliente: ");
		km = pedirKilometros();
		precioAlquiler = costeDelAlquiler(km);
		System.out.println("Se cobrarán " + precioAlquiler + " € tras realizar " + km + " KM");
	}

}
