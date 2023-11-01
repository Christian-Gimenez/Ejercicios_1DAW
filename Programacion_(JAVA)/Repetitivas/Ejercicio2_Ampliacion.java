import java.util.Scanner;
public class Ejercicio2_Ampliacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
		
		//Inicializamos las variables que necesitamos
		Scanner teclado = new Scanner(System.in);
		int contador = 0, divisor, dividendo, cantidadPrimos = 0;
		
		System.out.print("Introduce un número: "); //Pedimos un número por pantalla
		int n = teclado.nextInt(); //Lo leemos por teclado y se lo asignamos a n
		
		//Mostramos al usuario el "título"
		System.out.println("Los números primos que hay entre 1 y " + n + " son: ");
		
		//Hacemos un bucle principal donde en cada vuelta irá cambiando el dividendo
		//hasta que el mismo sea igual a n
		for(dividendo = 1; dividendo <= n; dividendo++) {
			
			//Hacemos un bucle interno para poder dividir el dividendo entre todos los divisores de 1 a divisor
			for (divisor = 1; divisor <= dividendo; divisor++) {
				//Si la division entre dividendo y divisor da resto 0
				if (dividendo % divisor == 0) {
					//Aumentamos contador
					contador++;
				}
			}
			
			//Si al final del bucle interno, contador <= 2
			if (contador <= 2) {
				//Aumentamos la cantidad de nº Primos que hay
				cantidadPrimos++;
				System.out.print(dividendo + " "); //Mostramos por pantalla el número primo en cuestion
			}
			//Reiniciamos contador para poder evaluar en la siguiente iteración si el siguiente dividendo es primo
			contador = 0; 
		}
		//Por último mostramos lo que nos han pedido: mostrar cuantos números primos hay entre 1 y n
		System.out.println("\nHay " + cantidadPrimos + " números primos entre 1 y " + n);
	}

}
