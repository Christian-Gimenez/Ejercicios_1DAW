package alternativas;
import java.util.*;
public class Ej4 {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y
		//muestre su división si el segundo no es cero,
		//o un mensaje de aviso en caso contrario.
		Scanner teclado = new Scanner(System.in);
		
		int dividendo, divisor, cociente, resto;
		
		System.out.print("Introduce el dividendo: ");
		dividendo = teclado.nextInt();
		
		System.out.print("Introduce el divisor: ");
		divisor = teclado.nextInt();
		
		if (divisor != 0) {
			cociente = dividendo / divisor;
			resto = dividendo % divisor;
			System.out.println("El resultado de " + dividendo + " / " + divisor + " = " + cociente + "\nCon resto = " + resto);
		} else {
			System.out.println("¡El divisor NO puede ser 0!");
		}
		
		
	}

}
