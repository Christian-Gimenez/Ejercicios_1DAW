import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que pida un numero por teclado y diga si es par o impar
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int numero = teclado.nextInt();
		boolean esPar;
		//Guardamos el resultado de comparar esa condicion en la variable esPar
		esPar = numero % 2 == 0;
		
		if (esPar) { //Si la condicion es true
			System.out.println(numero + " es Par"); //Imprime es Par
		} else { //Y si no...
			System.out.println(numero + " es Impar"); //Imprime es Impar
		}
	}

}
