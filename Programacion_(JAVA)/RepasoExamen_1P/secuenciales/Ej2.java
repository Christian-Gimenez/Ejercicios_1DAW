package secuenciales;
import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		//Calcular el perímetro y área de un rectángulo dada su base y su altura.
		//P = 2*base + 2 altura. A= base*altura
		Scanner teclado = new Scanner(System.in);
		double base, altura, perimetro, area;
		
		System.out.print("Introduce el base del rectángulo: ");
		base = teclado.nextDouble();
		
		System.out.print("Introduce el altura del rectángulo: ");
		altura = teclado.nextDouble();
		
		perimetro = (base * 2) + (altura * 2);
		
		area = base * altura;
		
		System.out.println("El perímetro es: " + perimetro);
		System.out.println("El área es: " + area);
		

	}

}
