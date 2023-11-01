import java.util.*;
public class Ejercicio7 {
	
	public static double areaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public static double perimetroCirculo(double radio) {
		return 2 * Math.PI * radio;
	}
	
	public static double pedirPorTeclado() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el radio de la circunferencia: ");
		return teclado.nextDouble();
	}

	public static void main(String[] args) {
		/*Diseñar una funcion que calcule el área y el perímetro
		de una circunferencia. Utiliza dicha función en un
		programa principa que lea el radio de una circunferencia
		y muestre su área y perímetro*/
		double radio = pedirPorTeclado();
		System.out.println("Área = " + areaCirculo(radio));
		System.out.println("Perímetro = " + perimetroCirculo(radio));
		
	}

}
