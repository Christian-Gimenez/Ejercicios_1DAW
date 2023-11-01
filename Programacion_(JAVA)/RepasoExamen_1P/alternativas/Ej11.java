package alternativas;
import java.util.Scanner;
public class Ej11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*Programa que lea 3 datos de entrada A, B y C.
		 * Estos corresponden a las dimensiones de los lados de un triángulo.
		 * El programa debe determinar que tipo de triangulo es,
		 * teniendo en cuenta lo siguiente:
			-Si se cumple Pitágoras entonces es triángulo rectángulo
			-Si sólo dos lados del triángulo son iguales entonces es isósceles.
			-Si los 3 lados son iguales entonces es equilátero.
			-Si no se cumple ninguna de las condiciones anteriores, es escaleno.*/
		double a, b, c, cateto1, cateto2, hipotenusa, pitagoras;
		boolean esRectangulo = false;
		//Teorema de Pitágoras: cateto1^2 + cateto2^2 == hipotenusa^2
		
		System.out.print("Introduce uno de los lados del triángulo: ");
		a = teclado.nextDouble();
		
		System.out.print("Introduce otro de los lados del triángulo: ");
		b = teclado.nextDouble();
		
		System.out.print("Introduce el último de los lados del triángulo: ");
		c = teclado.nextDouble();
		
		if (a > b && a > c) {
			hipotenusa = a;
			cateto1 = b;
			cateto2 = c;
			
			if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
				esRectangulo = true;
			}
		} else if (b > a && b > c) {
			hipotenusa = b;
			cateto1 = a;
			cateto2 = c;
			
			if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
				esRectangulo = true;
			}
		} else if (c > a && c > b) {
			hipotenusa = c;
			cateto1 = a;
			cateto2 = b;
			
			if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
				esRectangulo = true;
			}
		}
		
		if (esRectangulo) {
			System.out.println("Es un triángulo RECTÁNGULO");
		}
		
		
		if (a == b || a == c || c == b) {
			if (a == b && b == c) {
				System.out.println("Es un triángulo EQUILATERO");
			} else {
				System.out.println("Es un triángulo ISÓSCELES");
			}
		} else {
			System.out.println("Es un triángulo ESCALENO");
		}
	}

}
