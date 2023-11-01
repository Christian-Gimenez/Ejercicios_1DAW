import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dame numerador, dame denominador y luego mostrar el cociente por pantalla o que la division x 0 no existe
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el numerador:");
		int numerador;
		double denominador, cociente, resto;
		numerador = teclado.nextInt();
		
		System.out.println("Introduzca el denominador:");
		denominador = teclado.nextDouble();
		
		if (denominador == 0) {
			System.out.println("No se puede dividir, la división entre 0 no existe.");
		} else {
			cociente = numerador / denominador;
			resto = numerador % denominador;
			System.out.println("El cociente de dividir " + numerador + " entre " + Math.round(denominador) + " es = " + cociente + "\nY el resto es = " + resto);
		}
		
		
	}

}
