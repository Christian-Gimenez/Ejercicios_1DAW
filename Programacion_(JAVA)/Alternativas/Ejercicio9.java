import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PROGRAMA QUE LEA TRES DATOS DE ENTRADA A, B, C (LADOS DE UN TRIANGULO)
		 *DECIR SI ES UN TRIANGULO RECTANGULO (A² = B² + C²)
		 *SI NO MIRAR SI ES ISÓSCELES (DOS LADOS SON IGUALES)
		 *SI NO ES NINGUNO DE LOS ANTERIORES ES ESCALENO
		 * */
		
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c;
		System.out.println("Introduce la medida de un lado del triángulo: ");
		a = teclado.nextDouble();
		
		System.out.println("Introduce la medida de otro lado del triángulo: ");
		b = teclado.nextDouble();
		
		System.out.println("Introduce la medida del último lado del triángulo: ");
		c = teclado.nextDouble();
		
		
		if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))
				||
			Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2))
				||
			Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
			System.out.println("Es un triángulo RECTÁNGULO.");
			
		} else {
			if (a == b || b == c || c == a) {
				if (a == b && b == c && a == c) {
					System.out.println("Es un triángulo EQUILATERO");
				} else { //Añadido extra
					System.out.println("Es un triángulo ISÓSCELES");
				}
				
			} else {
				System.out.println("Es un triángulo ESCALENO");
			}
		}
	}

}
