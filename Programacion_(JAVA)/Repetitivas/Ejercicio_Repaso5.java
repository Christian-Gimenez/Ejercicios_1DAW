import java.util.Scanner;
public class Ejercicio_Repaso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuántos sueldos vas a evaluar?");
		int n = teclado.nextInt();
		double sueldo, sueldoMaximo = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Introduce el sueldo: ");
			sueldo = teclado.nextDouble();
			
			if(sueldo > sueldoMaximo) {
				sueldoMaximo = sueldo;
			}
		}
		
		System.out.println("El sueldo máximo es: " + sueldoMaximo + " €");
		
	}

}
