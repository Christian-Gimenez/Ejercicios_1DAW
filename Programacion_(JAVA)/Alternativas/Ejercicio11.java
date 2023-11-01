import java.util.Scanner;
public class Ejercicio11 {

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
		
		System.out.print("Introduzca los kilos de uva: ");
		double kilosUva = teclado.nextDouble();
		
		System.out.print("Introduzca el tipo (A/B): ");
		teclado.nextLine();
		String tipo = teclado.nextLine();
		
		System.out.print("Introduzca el tamaño(1/2); ");
		int tam = teclado.nextInt();
		
		System.out.print("Introduzca el precio inicial: ");
		double precioInicial = teclado.nextDouble();
		double precioFinal = 0.0;
		
		if (tipo.equalsIgnoreCase("A") && tam == 1) {
			precioFinal = precioInicial + 0.2;
			
		} else if (tipo.equalsIgnoreCase("A") && tam == 2) {
			precioFinal = precioInicial + 0.3;
			
		} else if (tipo.equalsIgnoreCase("B") && tam == 1) {
			precioFinal = precioInicial - 0.3;
			
		} else if (tipo.equalsIgnoreCase("B") && tam == 2) {
			precioFinal = precioInicial - 0.5;
		} 
		
		double precioDefinitivo = kilosUva * precioFinal;
		System.out.println("El precio de " + kilosUva + " kgs de uva de tipo " + tipo.toUpperCase() + " y tamaño " + tam + " es " + precioDefinitivo + " €");
	}

}
