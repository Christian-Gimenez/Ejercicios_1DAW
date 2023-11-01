import java.util.*;
public class Ejercicio1 {
	
	public static double areaRectangulo(double largo, double ancho) {
		return largo * ancho;
	}
	
	public static double perimetroRectangulo(double largo, double ancho) {
		return 2 * (largo + ancho);
	}
	
	public static void opcionAreaoPerimetro(int opcion, double largo, double ancho) {
		
		switch (opcion) {
		case 1:
			System.out.println("El Área del Rectángulo es: " + areaRectangulo(largo, ancho));
			break;
		case 2:
			System.out.println("El Perímetro del Rectángulo es: " + perimetroRectangulo(largo, ancho));
			break;
		case 3:
			System.out.println("El Área del Rectángulo es: " + areaRectangulo(largo, ancho));
			System.out.println("El Perímetro del Rectángulo es: " + perimetroRectangulo(largo, ancho));
			break;
		default:
			System.out.println("Programa finalizado.");
		}
	}
	

	public static void main(String[] args) {
		/*Realiza un programa que calcule el área y perímetro de un rectángulo*/
		Scanner teclado = new Scanner(System.in);
		double largo, ancho;
		int opcion;
		
		System.out.print("Introduce el largo del rectánguo: ");
		largo = teclado.nextDouble();
		
		System.out.print("Introduce el ancho del rectángulo: ");
		ancho = teclado.nextDouble();
		
		System.out.println("Cuál de las dos operaciones deseas realizar:");
		System.out.println("1) Calcular el Área del Rectángulo.");
		System.out.println("2) Calcular el Perímetro del Rectángulo.");
		System.out.println("3) Calcular ambas, Área y Perímetro.");
		System.out.println("4) Ninguna, deseo salir del programa.");
		opcion = teclado.nextInt();
		
		opcionAreaoPerimetro(opcion, largo, ancho);
		
	}

}
