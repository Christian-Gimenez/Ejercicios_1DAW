import java.util.*;
public class EjercicioIII_7 {
	
	public static int generarPrimoAleatorio(int minimo, int maximo) {
		int rangMin = (minimo < maximo)? minimo : maximo;
		int rangMax = (maximo > minimo)? maximo : minimo;
		int resultado = -1;
		int cantidadPrimos = contadorPrimos(rangMin, rangMax);
		if (cantidadPrimos == 0) {
			return -1;
		}
		System.out.println("Hay " + cantidadPrimos + " primos");
		int primoAleatorio=0;
		int numAleatorio =0;
		int contador=0;
		
		numAleatorio = aleatorio(cantidadPrimos);
		System.out.println("El nº aleatorio generado es: " + numAleatorio);
		
		for(int i = rangMin; i <= rangMax; i++) {
			if (esPrimo(i)) {
				contador++;
				if(contador == numAleatorio) {
					primoAleatorio = i;
				}
			}
		}

		return primoAleatorio;
	}
	
	public static boolean esPrimo(int num) {
		int divisores=0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		
		if (divisores <= 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int contadorPrimos(int min, int max) {
		int resultado=0;
		for(int i = min; i <= max; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
	}
	
	public static int aleatorio(int numero) {
		Random random = new Random();
		return random.nextInt(numero)+1;
	}
	
	public static int pedirNumero() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		/*ESCRIBIR UNA FUNCION generarPrimoAleatorio
		 * GENERA UN NUMERO PRIMO ALEATORIO COMPRENDIDO ENTRE UN VALOR MINIMO
		 * Y UN VALOR MAXIMO PASADOS A LA FUNCION (AMBOS POSITIVOS E INCLUIDOS).
		 * ADEMAS LA FUNCION DEBERA DEVOLVER -1 SI NO EXISTIESEN NUMEROS PRIMOS ENTRE
		 * LOS VALORES INTRODUCIDOS.
		 * EN EL CASO DE QUE EL MINIMO SEA INFERIOR AL MAXIMO, SE DEBERAN INTERCAMBIAR.
		 * HAY QUE HACER UN PROGRAMA PRINCIPAL QUE PRUEBE LA FUNCION,
		 * PARA ELLO HAY QUE PEDIR DOS NUMEROS
		 * AL USUARIO Y LUEGO MOSTRARÁ EL RESULTADO.
		 * 
		 * PASARLE A LA FUNCION aleatorio EL NUMERO DE PRIMOS QUE HAY ENTRE LOS NUMEROS DEL RANGO
		 * Y LUEGO IDENTIFICAR, EL X NUMERO PRIMO QUE HAY ENTRE LIMITE SUPERIOR E INFERIOR*/
		int min, max, primoAleatorio;
		do {
			System.out.print("Introduce el rango mínimo: ");
			min = pedirNumero();
			
			System.out.print("Introduce el rango mínimo: ");
			max = pedirNumero();
			
			if (min < 0 || max < 0) {
				System.err.println("Error, por favor introduzca numeros enteros y positivos");
			}
		} while (min < 0 || max < 0);
		
		primoAleatorio = generarPrimoAleatorio(min, max);
		if (primoAleatorio == -1) {
			System.out.println("No hay números primos entre los rangos. Resultado: " + primoAleatorio);
		} else {
			System.out.println("El número Primo Aleatorio generado es: " + primoAleatorio);
		}
		
		
	}

}
