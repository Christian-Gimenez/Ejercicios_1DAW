package examen.functions;

import java.util.*;

public class Ejercicio12_AreaYPerimetroCircunferencia {
	
	public static double perimetro(double radio) {
		double resultado = 0.0;
		resultado = Math.PI * (radio+radio);
		return resultado;
	}
	
	public static double area(double radio) {
		double resultado = 0.0;
		resultado = Math.PI * Math.pow(radio, 2);
		return resultado;
	}
	
	public static double leerRadio() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	public static void main(String[] args) {
		/*Diseñar una función que calcule el área
		 * y el perímetro de una circunferencia.
		 * Utilizar dicha función en un programa principal
		 * que lea el radio de una circunferencia
		 * y muestre su área (PI * r^2) y perímetro (PI * (r+r)).
		 * */
		double radio=0.0, perimetro=0.0, area=0.0;
		System.out.print("Introduce el radio de la circunferencia: ");
		radio = leerRadio();
		perimetro = perimetro(radio);
		area = area(radio);
		System.out.println("El perímetro es: " + perimetro);
		System.out.println("El área es: " + area);
	}

}
