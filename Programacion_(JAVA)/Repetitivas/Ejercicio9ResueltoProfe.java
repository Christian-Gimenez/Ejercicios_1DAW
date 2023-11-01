import java.util.Scanner;
public class Ejercicio9ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame la base: ");
		double base = teclado.nextDouble();
		
		System.out.print("Dame el exponente: ");
		int exponente = teclado.nextInt();
		
		double resultado = 1;
		
		for (int i = 0; i < exponente; i++) {
			resultado = resultado * base;
		}
		
		System.out.println("El resultado es: " + resultado);
	}

}
