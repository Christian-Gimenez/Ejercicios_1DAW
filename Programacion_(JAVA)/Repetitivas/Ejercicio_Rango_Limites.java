import java.util.Scanner;
public class Ejercicio_Rango_Limites {

	public static void main(String[] args) {
		/*1)
		 * Escribe un programa que pida el limite inferior y superior de un intervalo.
		 * Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
		 * A continuación se van introduciendo números hasta que introduzcamos el 0.
		 * Cuando termine el programa dará las siguientes informaciones:
			• La suma de los números que están dentro del intervalo (intervalo abierto).
			• Cuantos números están fuera del intervalo.
			• He informa si hemos introducido algún número igual a los límites del intervalo.
		 */
		
		//Inicializamos las variables necesarias
		Scanner teclado = new Scanner(System.in);
		int limiteInferior, limiteSuperior,
			num, suma = 0, igualIntervalo = 0,
			fueraLimites = 0;
		
		
		do {
			//Pide el numero límite inferior
			System.out.print("Dame el límite inferior: ");
			limiteInferior = teclado.nextInt();
			
			//Pide el numero límite superior
			System.out.print("Dame el límite superior: ");
			limiteSuperior = teclado.nextInt();
			
			//Si el límite inferior es mayor que límite superior, muestra error y repite el bucle
			if (limiteInferior > limiteSuperior) {
				System.out.println("Error, el límite inferior no puede ser mayor al superior");
			}
			//Cuando se introduzcan bien los limites, sale del bucle
		} while (limiteInferior > limiteSuperior); 
		
		
		do {
			//Pide un número
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
			
			//Si el número está entre el intervalo (límites incluidos)
			if (num >= limiteInferior && num <= limiteSuperior) {
				//Lo suma
				suma += num;
				
			//Si no, si el número es igual a limite inferior OR superior
			} else if (num == limiteInferior || num == limiteSuperior) {
				//Contabilízalo
				igualIntervalo++;
				
			//Y si no...
			} else {
				//Contabiliza los numeros fuera de los limites del rango
				fueraLimites++;
			}
			
		} while (num != 0); //Repetir hasta que el user introduzca 0
		
		//Imprimir la suma de los numeros que estaban dentro del rango
		System.out.println("La suma de los numeros que estan dentro del intervalo = " + suma);
		
		//Imprimir la cantidad de números introducidos iguales a los límites del rango
		System.out.println("Has introducido \"" + igualIntervalo + "\" números IGUAL a los límites del intervalo [" + limiteInferior + "," + limiteSuperior + "]");
		
		//Imprimir la cantidad de números introducidos fuera del rango
		System.out.println("Has introducido \"" + fueraLimites + "\" números FUERA de los límites [" + limiteInferior + "," + limiteSuperior + "]");
	}
}