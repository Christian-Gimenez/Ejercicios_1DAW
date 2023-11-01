import java.util.Scanner;
public class Ejercicio7ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numerosALeer, contador, numero;
		int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
		contador = 0;
		System.out.println("Dime los numeros que tengo que leer: ");
		numerosALeer = teclado.nextInt();
		while (contador < numerosALeer) {
			System.out.println("Dame un numero: ");
			numero = teclado.nextInt();
			contador++;
			if (numero > 0) {
				contadorPositivos++;
			} else {
				if (numero < 0) {
					contadorNegativos++;
				} else {
					contadorCeros++;
				}
			}
		}
		
		contadorCeros= numerosALeer - contadorPositivos - contadorNegativos;
		System.out.println("Hemos leido " + contadorPositivos + " numeros positivos.");
		System.out.println("Hemos leido " + contadorPositivos + " numeros negativos.");
		System.out.println("Hemos leido " + contadorPositivos + " ceros.");
	}

}
