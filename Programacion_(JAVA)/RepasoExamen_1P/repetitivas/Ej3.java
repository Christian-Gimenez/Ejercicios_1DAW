package repetitivas;
import java.util.*;
public class Ej3 {

	public static void main(String[] args) {
		/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
		 * la cantidad de alumnos mayores de 18 años,
		 * y la cantidad de alumnos que miden más de 1.75.*/
		Scanner teclado = new Scanner(System.in);
		
		int edad, mediaEdad = 0, mayoresEdad = 0, altos = 0;
		double estatura, mediaEstatura = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Introduce la edad del " + i + "º alumno: ");
			edad = teclado.nextInt();
			
			if (edad <= 0) {
				System.out.println("ERROR: Edad introducida errónea.");
				i--;
			} else {
				System.out.print("Introduce la estatura (en metros) del " + i + "º alumno: ");
				estatura = teclado.nextDouble();
				
				if (estatura <= 0) {
					System.out.println("ERROR: Datos introducidos erróneos.");
					i--;
				} else {
					mediaEdad += edad;
					mediaEstatura += estatura;
					if (edad >= 18) {
						mayoresEdad++;
					} else if (estatura > 1.75) {
						System.out.println("Ha pasao por aqui");
						altos++;
					}
				}
			}	
		}
		
		
		mediaEstatura = mediaEstatura / 5;
		mediaEdad = mediaEdad / 5;
		
		System.out.println("La edad media de los alumnos es de: " + mediaEdad + " años");
		System.out.println("La estatura media de los alumnos es de: " + (Math.round(mediaEstatura*100.0)/100.0) + "m");
		System.out.println("Hay " + altos + " alumno/s que miden más de 1.75m");
		System.out.println("Y hay " + mayoresEdad + " alumno/s mayor/es de 18 años");
	}

}
