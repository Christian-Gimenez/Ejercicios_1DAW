package secuenciales;
import java.util.Scanner;
public class Ej4 {

	public static void main(String[] args) {
		//Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
		Scanner teclado = new Scanner(System.in);
		int num1, num2, suma, resta, multiplicacion, division, resto;
		
		System.out.print("Introduce un número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = teclado.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		resto = num1 % num2;
		
		System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
		System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta);
		System.out.println("La multiplicacion de " + num1 + " x " + num2 + " = " + multiplicacion);
		System.out.println("La division de " + num1 + " / " + num2 + " = " + division + ". Con resto: " + resto);
		
		
	}

}
