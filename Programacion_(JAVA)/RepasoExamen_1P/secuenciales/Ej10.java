package secuenciales;
import java.util.*;
public class Ej10 {

	public static void main(String[] args) {
		/*Un alumno desea saber cual será su calificación final en la materia de Algoritmos.
		 * Dicha calificación se compone de los siguientes porcentajes:
				55% del promedio de sus tres calificaciones parciales.
				30% de la calificación del examen final.
				15% de la calificación de un trabajo final.
		 * */
		Scanner teclado = new Scanner(System.in);
		final double PARCIALES = 0.55, EXAMEN_FINAL = 0.3, TRABAJO_FINAL = 0.15;
		double parcial1, parcial2, parcial3, promedioParciales,
				examenFinal, trabajoFinal, calificacionFinal;
		
		System.out.print("Introduce la nota del primer parcial: ");
		parcial1 = teclado.nextDouble();
		
		System.out.print("Introduce la nota del segundo parcial: ");
		parcial2 = teclado.nextDouble();
		
		System.out.print("Introduce la nota del tercer parcial: ");
		parcial3 = teclado.nextDouble();
		
		promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
		promedioParciales = promedioParciales * PARCIALES;
		
		System.out.print("Introduce la nota del Examen Final: ");
		examenFinal = teclado.nextDouble();
		examenFinal = examenFinal * EXAMEN_FINAL;
		
		System.out.print("Introduce la nota del Trabajo Final: ");
		trabajoFinal = teclado.nextDouble();
		trabajoFinal = trabajoFinal * TRABAJO_FINAL;
		
		calificacionFinal = promedioParciales + examenFinal + trabajoFinal;
		
		System.out.println("Tu calificación final será de: " + Math.round(calificacionFinal * 100.0)/100.0);
		
		
		
		
		
	}

}
