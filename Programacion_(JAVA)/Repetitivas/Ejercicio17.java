import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 10 calificaciones de alumnos por teclado
		//Informar de si hay algun suspenso (nota < 5)
		//Contar aprobados, compensables [4,5) y suspensos
	
		//Declaramos las variables necesarias
		Scanner teclado = new Scanner(System.in);
		double nota;
		boolean suspenso = false;
		int aprobados = 0, suspensos = 0, compensables = 0;
		
		//Hacemos un bucle for para que pida 10 veces la nota por teclado
		for(int i = 1; i <= 10; i++) {
			System.out.print("Introduce la nota del alumno: ");
			nota = teclado.nextDouble();
			
			//Si la nota > 5, contabilizamos los aprobados
			if (nota > 5.0) {
				aprobados++;
			}
			//Si la nota < 4, contabilizamos los suspensos e indicamos que ha habido algún suspenso
			if (nota < 4) {
				suspensos++;
				suspenso = true;
			}
			//Si la nota está entre el intervalo [4,5), contabilizamos los compensables
			if (nota <= 4 && nota < 5) {
				compensables++;
			}
		}
		//Si ha habido algún suspenso, lo notificamos y mostramos la cantidad de suspensos
		if (suspenso == true) {
			 System.out.println("Alguien ha suspendido.");
			 System.out.println("Ha habido " + suspensos + " suspensos");
		} else {//Y si no ha suspendido nadie, lo decimos
			System.out.println("No ha suspendido nadie.");
		}
		//Mostramos la cantidad de aprobados
		System.out.println(aprobados + " Aprobados.");
		//Mostramos la cantidad de compensables
		System.out.println("Y " + compensables + " Compensables [4,5)");
		
		
		
	}

}
