package alternativas;
import java.util.Scanner;
public class Ej17 {

	public static void main(String[] args) {
		/*Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras
		 * y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
			Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
			Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: "ERROR: número incorrecto.".
			Ejemplo:
			Introduzca número del dado: 5
			En la cara opuesta está el "dos".
		 * */
		Scanner teclado = new Scanner(System.in);
		int dado, ladoOpuesto= 0;
		
		System.out.print("Introduce el resultado de lanzar el dado: ");
		dado = teclado.nextInt();
		
		if (dado < 1 || dado > 6) {
			System.err.println("ERROR: número incorrecto.");
		} else {
			switch(dado) {
			case 1:
				ladoOpuesto = 6;
				break;
			case 2: 
				ladoOpuesto = 5;
				break;
			case 3:
				ladoOpuesto = 4;
				break;
			case 4:
				ladoOpuesto = 3;
				break;
			case 5:
				ladoOpuesto = 2;
				break;
			case 6:
				ladoOpuesto = 1;
				break;
			}
			
			System.out.println("El lado opuesto es: " + ladoOpuesto);
		}

	}

}
