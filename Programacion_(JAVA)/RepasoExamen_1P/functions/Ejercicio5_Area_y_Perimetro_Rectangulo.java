package examen.functions;

import java.util.Scanner;

public class Ejercicio5_Area_y_Perimetro_Rectangulo {
	
	public static double areaRectangulo(double lado1, double lado2) {
		double ancho = mayor(lado1, lado2);
		double alto;
		if (ancho == lado1) {
			alto = lado2;
		} else {
			alto = lado1;
		}
		
		double area = ancho * alto;
		return area;
	}
	
	public static double perimetroRectangulo(double lado1, double lado2) {
		return (lado1 * 2) + (lado2 * 2);
	}
	
	public static double mayor(double a, double b) {
		return (a > b)? a : b;
	}
	
	public static double leerDouble() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextDouble();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduce el ancho del rectangulo: ");
		double ancho = leerDouble();
		
		System.out.print("Introduce el alto del rectangulo: ");
		double alto = leerDouble();
		
		System.out.println("El área del rectángulo es = " + areaRectangulo(ancho, alto));
		System.out.println("El perímetro del rectángulo es = " + perimetroRectangulo(ancho, alto));
		
	}

}
