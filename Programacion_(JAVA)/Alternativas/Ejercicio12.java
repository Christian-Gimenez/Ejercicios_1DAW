import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa que pida por teclado el resultado (DATO ENTERO) obtenido al lanzar un dado de seis caras
		 * MUESTRA POR PANTALLA EL NUMERO EN LETRAS DE LA CARA OPUESTO AL DATO OBTENIDO.
		 * 1 - 6 -> "SEIS"
		 * 2 - 5 -> "CINCO"
		 * 3 - 4 -> "CUATRO
		 * ...etc
		 * */
		Scanner teclado = new Scanner(System.in);
		String ladoOpuesto = "";
		String lado = "";
		
		System.out.print("Introduce el resultado al lanzar el dado de seis caras (1-6): ");
		int dado = teclado.nextInt();
		
		switch (dado) {
			case 1:
				lado = "UNO";
				ladoOpuesto = "SEIS";
				System.out.println("La cara del lado opuesto a " + lado + " es: " + ladoOpuesto);
				break;
			
			case 2:
				lado = "DOS";
				ladoOpuesto = "CINCO";
				System.out.println("La cara del lado opuesto a " + lado + " es: " + ladoOpuesto);
				break;
			
			case 3:
				lado = "TRES";
				ladoOpuesto = "CUATRO";
				System.out.println("La cara del lado opuesto a " + lado + " es: " + ladoOpuesto);
				break;
			
			case 4:
				lado = "CUATRO";
				ladoOpuesto = "TRES";
				System.out.println("La cara del lado opuesto a " + lado + " es: " + ladoOpuesto);
				break;
			
			case 5:
				lado = "CINCO";
				ladoOpuesto = "DOS";
				System.out.println("La cara del lado opuesto a " + lado + " es: " + ladoOpuesto);
				break;
			
			case 6:
				lado = "SEIS";
				ladoOpuesto = "UNO";
				System.out.println("La cara del lado opuesto a " + lado + " es: " + ladoOpuesto);
				break;
			
			default:
				System.out.println("Lado imposible en un cubo de seis lados.");
		}
			
	}

}
