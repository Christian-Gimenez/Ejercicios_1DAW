package repetitivas;
import java.util.Scanner;
public class EjRep3 {

	public static void main(String[] args) {
		/*Pedir las notas de 10 alumnos por teclado
		 * y mostrar la cantidad de alumnos que han aprobado,
		 * los compensables (la nota es igual o superior a 4)
		 * y los alumnos suspensos.*/
		Scanner teclado = new Scanner(System.in);
		int aprobados=0, compensables=0, suspensos=0;
		double nota, media = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduce la nota del " + i + "º alumno: ");
			nota = teclado.nextDouble();
			media += nota;
			
			if (nota >= 5.0) {
				aprobados++;
			} else if (nota >= 4.0 && nota < 5.0) {
				compensables++;
			} else {
				suspensos++;
			}
		}
		media = media / 10;
		System.out.print("Hay " + aprobados + " aprobados, " + suspensos + " suspensos y " + compensables + " compensables.");
		System.out.println("\nLa nota media de la clase es de " + Math.round(media * 100.0)/100.0);
		
	}

}
