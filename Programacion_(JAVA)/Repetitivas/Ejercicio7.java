import java.util.*;
public class Ejercicio7 {
	
	public static void main(String[] args) {
		//Introduce un n
		//Pide otro numero (n veces)
		//Decir cuantos numeros de los introducidos son positivos
		Scanner teclado = new Scanner(System.in);
		
		int contador, numeroIteraciones, numero, negativos = 0, positivos = 0, zeros = 0;
		contador = 0;
		
		System.out.print("¿Cuantos números quieres leer? ");
		numeroIteraciones = teclado.nextInt();
		
		while (contador < numeroIteraciones) {
			System.out.print("Introduce un número: ");
			numero = teclado.nextInt();
			if (numero > 0) {
				System.out.println(numero + " es Positivo");
				positivos++;
			} else if (numero < 0) {
				System.out.println(numero + " es Negativo");
				negativos++;
			} else {
				System.out.println(numero + " no es positivo ni negativo");
				zeros++;
			}
			contador++;
		}
		
		System.out.println("Hemos leido " + positivos + " nº positivos,");
		System.out.println(negativos + " nº negativos");
		System.out.println("y hemos leido " + zeros + " ceros.");
	}

}
