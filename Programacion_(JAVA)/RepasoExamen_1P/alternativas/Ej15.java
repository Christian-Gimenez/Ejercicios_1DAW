package alternativas;
import java.util.Scanner;
public class Ej15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*El director de una escuela está organizando un viaje de estudios,
		 * y requiere determinar cuánto debe cobrar a cada alumno
		 * y cuánto debe pagar a la compañía de viajes por el servicio.
		 * La forma de cobrar es la siguiente:
		 * si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
		 * de 50 a 99 alumnos, el costo es de 70 euros,
		 * de 30 a 49, de 95 euros,
		 * y si son menos de 30, el costo de la renta del autobús es de 4000 euros,
		 * sin importar el número de alumnos.
		 * Realice un algoritmo que permita determinar el pago a la compañía de autobuses
		 * y lo que debe pagar cada alumno por el viaje.*/
		
		double cobroXAlumno, aPagar = 0.0, precioXalumno;
		int cantidadAlumnos = 0;
		
		System.out.print("¿Cuántos alumnos viajaran? ");
		cantidadAlumnos = teclado.nextInt();
		
		if (cantidadAlumnos >= 100) {
			aPagar = cantidadAlumnos * 65;
			
		} else if(cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
			aPagar = cantidadAlumnos * 70;
			
		} else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
			aPagar = cantidadAlumnos * 95;
		} else {
			aPagar = 4000;
		}
		
		cobroXAlumno = aPagar / cantidadAlumnos;
		System.out.println("El costo total del viaje será de: " + (Math.round(aPagar * 100.0)/100) + " €.");
		System.out.println("Cada alumno deberá pagar: " + (Math.round(cobroXAlumno * 100.0)/100) + " €.");
	}

}
