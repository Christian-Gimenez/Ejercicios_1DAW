import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir al usuario el peso en kilos, luego preguntar la altura y devolver por pantalla el índice de masa corporal
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su peso en KG:");
		double pesoUser = teclado.nextDouble();
		
		System.out.println("Introduzca su altura en Metros:");
		double alturaUser = teclado.nextDouble();
		
		double resultadoIMC = pesoUser / Math.pow(alturaUser, 2);
		System.out.println("Su Índice de Masa Corporal es: " + resultadoIMC);
	}

}
