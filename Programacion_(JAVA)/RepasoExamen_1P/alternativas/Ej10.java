package alternativas;
import java.util.Scanner;
public class Ej10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*Algoritmo que pida los puntos centrales x1,y1,x2,y2 
		 * y los radios r1,r2 de dos circunferencias
		 * y las clasifique en uno de estos estados:
			-exteriores
			-tangentes exteriores
			-secantes
			-tangentes interiores
			-interiores
			-concéntricas*/
		
		double x1, y1, x2, y2, r1, r2, distancia, sumaRadios, restaRadios;
		
		System.out.print("Introduce el punto X1: ");
		x1 = teclado.nextInt();
		
		System.out.print("Introduce el punto Y1: ");
		y1 = teclado.nextInt();
		
		System.out.print("Introduce el punto X2: ");
		x2 = teclado.nextInt();
		
		System.out.print("Introduce el punto Y2: ");
		y2 = teclado.nextInt();
		
		System.out.print("Introduce el radio R1: ");
		r1 = teclado.nextInt();
		
		System.out.print("Introduce el radio R2: ");
		r2 = teclado.nextInt();
		
		distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		sumaRadios = r1 + r2;
		restaRadios = r1 - r2;
		
		if (distancia > sumaRadios) {
			System.out.println("Exteriores");
		} else if (distancia > 0 && distancia < Math.abs(restaRadios)) {
			System.out.println("Interiores");
		} else if (distancia == restaRadios) {
			System.err.println("Tangentes exteriores");
		} else if (distancia == restaRadios) {
			System.out.println("Tangentes interiores");
		} else if (distancia < sumaRadios && distancia > Math.abs(restaRadios)) {
			System.out.println("Secantes");
		} else if (distancia == 0) {
			System.out.println("Concéntricas");
		}
		
		
	}

}
