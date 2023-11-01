package secuenciales;
import java.util.Scanner;
public class Ej19 {

	public static void main(String[] args) {
		/*Escribir un algoritmo para calcular la nota final de un estudiante,
		 * considerando que: por cada respuesta correcta 5 puntos,
		 * por una incorrecta -1 y por respuestas en blanco 0.
		 * Imprime el resultado obtenido por el estudiante.*/
		Scanner teclado = new Scanner(System.in);
		
		final int CORRECTA = 5, INCORRECTA = -1, BLANCO = 0;
		int correctas, incorrectas, enblanco, notaFinal;
		
		System.out.print("Cuántas respuestas correctas ha tenido: ");
		correctas = teclado.nextInt();
		
		System.out.print("Cuántas respuestas incorrectas ha tenido: ");
		incorrectas = teclado.nextInt();
		
		System.out.print("Cuántas respuestas en blanco ha tenido: ");
		enblanco = teclado.nextInt();
		
		notaFinal = (correctas * CORRECTA) + (incorrectas * INCORRECTA) + (enblanco * BLANCO);
	
		System.out.println("La nota final del examen es: " + notaFinal);
	}

}
