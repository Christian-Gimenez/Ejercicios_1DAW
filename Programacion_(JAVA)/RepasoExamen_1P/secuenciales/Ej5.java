package secuenciales;
import java.util.*;
public class Ej5 {

	public static void main(String[] args) {
		//Escribir un programa que convierta un valor dado en
		//grados Fahrenheit a grados Celsius.
		//Recordar que la fórmula para la conversión es: C = (F-32)*5/9
		Scanner teclado = new Scanner(System.in);
		
		double fahrenheit, celsius;
		
		System.out.print("Introduce los grados Fahrenheit: ");
		fahrenheit = teclado.nextDouble();
		
		celsius = (fahrenheit - 32)*5/9;
		celsius = Math.round(celsius *100)/100;
		
		System.out.println("En Celsius son: " + celsius + "ºC");
		
	}

}
