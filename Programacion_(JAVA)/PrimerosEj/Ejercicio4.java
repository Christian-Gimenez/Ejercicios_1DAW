import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que lea un entero positivo
		//Mostrar por pantalla la suma desde el 1 hasta ese numero 7
		//1 + 2 + 3 + 4 + 5 + 6 + 7
		//suma = n * (n + 1) / 2
		//Mostrar por pantalla el resultado 

		System.out.print("Introduzca un número: ");
		Scanner teclado = new Scanner(System.in);
		int entero = teclado.nextInt();
		int resultado;
		resultado = (entero * (entero + 1)) / 2;
		//Primera forma de resolverlo
		System.out.print(resultado);
	}
}
