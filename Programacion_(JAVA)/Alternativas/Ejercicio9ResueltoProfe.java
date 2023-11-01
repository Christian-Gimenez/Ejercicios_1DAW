import java.util.Scanner;
public class Ejercicio9ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Dame el primer lado: ");
		a = teclado.nextDouble();
		
		System.out.println("Dame el segundo lado: ");
		b = teclado.nextDouble();
		
		System.out.println("Dame el tercer lado: ");
		c = teclado.nextDouble();
		boolean esRectangulo = false;
		
		if (a > b && a > c) {
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				esRectangulo = true;
			}
		} else {
			if ( b > a && b > c) {
				if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
					esRectangulo = true;
				}			
			} else {
				if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
					esRectangulo = true;
				}
			}
		}
		
		//Si el if es simple, se puede poner sin { }
		if (esRectangulo)
			System.out.println("Es un triángulo RECTÁNGULO");
		
		if (!(a == b && b == c)) {
			if (a == b || b == c || a == c) {
				System.out.println("Es un triángulo ISÓSCELES");
			} else {
				System.out.println("Es un triángulo ESCALENO");
			}
		}
		/*
		if ( (a == b && b != c) || (a == c && a != b)) {	
		} */
		
	}

}
