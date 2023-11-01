import java.util.Scanner;
public class Ejercicio11ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		UNA ASOCIACION DE AGRICULTORES TIENE COMO POLITICA FIJAR UN PRECIO INICIAL
		AL KILO DE UVA, LA CUAL SE CLASIFICA POR TIPOS A Y B. ADEMAS EN TAMAÑOS 1, 2.
		
		CUANDO SE REALIZA UNA VENTA DE ESTE PRODUCTO, ESTA ES DE UN SOLO TIPO Y TAMAÑO.
		SE NECESITA DETERMINAR CUANTO RECIBIRÁ UN PRODUCTOR POR LA UVA QUE ENTREGUE EN UN EMBARQUE
		CONSIDERANDO LO SIGUIENTE:
			
		SI ES DE TIPO A, SE LE CARGAN 20 CENTIMOS AL PRECIO INICIAL CUANDO ES DE TAMAÑO 1
		Y 30 CENTIMOS CUANDO ES DE TAMAÑO 2.
		
		SI ES DE TIPO B, SE REBAJAN 30 CENTIMOS CUANDO ES DE TAMAÑO 1
		Y 50 CENTIMOS CUANDO ES DE TAMAÑO 2.
		
		HACER UN PROGRAMA QUE DETERMINE LA GANANCIA.
		*/
		Scanner teclado = new Scanner(System.in);
		double precioInicial, kilosUva, precioFinal;
		int tamanioUva;
		String tipoUva;
		
		System.out.println("Dame el precio inicial del kilo de uva: ");
		precioInicial = teclado.nextDouble();
		
		System.out.println("Dame los kilos de uva: ");
		kilosUva = teclado.nextDouble();
		
		System.out.println("Introduce el tipo de UVA: (A/B)");
		teclado.nextLine(); //ÑAPA
		tipoUva = teclado.nextLine();
		
		System.out.println("Introduzca el tamaño: (1/2)");
		tamanioUva = teclado.nextInt();
		
		if(tipoUva.equalsIgnoreCase("A")) {
			if (tamanioUva == 1) {
				precioFinal = precioInicial + 0.20;
			} else {
				precioFinal = precioInicial + 0.30;
			}
		} else {
			if (tamanioUva == 1) {
				precioFinal = precioInicial - 0.30;
			} else {
				precioFinal = precioInicial - 0.50;
			}
		}
		
		double precioTotal = precioFinal * kilosUva;
		System.out.println("El precio de " + kilosUva + " kgs de uva de tipo " + tipoUva + " y tamaño " + tamanioUva + " es " + precioTotal + " €.");
	}

}
