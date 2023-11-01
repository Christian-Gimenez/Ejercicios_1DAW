package secuenciales;
import java.util.Scanner;
public class Ej17 {

	public static void main(String[] args) {
		/*Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
		 * El tiempo de viaje hasta llegar a otra ciudad B es de T segundos.
		 * Escribir un algoritmo que determine la hora de llegada a la ciudad B.
		 * */
		Scanner teclado = new Scanner(System.in);
		//Declaramos variables
		double hh, mm, ss, t, segundosTotales, segundosRestantes;
		
		//Pedir datos al usuario
		System.out.println("Introduce la hora de salida HH/MM/SS:");
		System.out.print("Horas: ");
		hh = teclado.nextDouble();
		
		System.out.print("Minutos: ");
		mm = teclado.nextDouble();
		
		System.out.print("Segundos: ");
		ss = teclado.nextDouble();
		
		System.out.print("\nIntroduce el tiempo que va ha tardar en segundos: ");
		t = teclado.nextDouble();
		
		//Calculos
		segundosTotales = (hh * 3600) + (mm * 60) + ss + t;
		hh = segundosTotales / 3600;
		segundosRestantes = segundosTotales % 3600;
		mm = segundosRestantes / 60;
		ss = segundosRestantes % 60;
		
		System.out.println("La hora de llegada a la ciudad B es: " + Math.round(hh) + "/" + Math.round(mm) + "/" + Math.round(ss) + ".");
		
		
		
		
	}
}
