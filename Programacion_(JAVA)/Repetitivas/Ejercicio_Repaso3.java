import java.util.Scanner;
public class Ejercicio_Repaso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
		 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
		 * */
		Scanner teclado = new Scanner(System.in);
		int edad, mayorEdad = 0, altos = 0, edadMedia = 0;
		double altura, estaturaMedia = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Introduce la edad del " + i + "º alumno: ");
			edad = teclado.nextInt();
			System.out.print("Introduce la altura en metros del "+ i + "º alumno: ");
			altura = teclado.nextDouble();
			
			if(edad > 18) {
				mayorEdad++;
			}
			
			if(altura > 1.75) {
				altos++;
			}
			
			edadMedia = edadMedia + edad;
			estaturaMedia = estaturaMedia + altura;
			System.out.print("\n");
		}
		
		System.out.println("La edad media de los alumnos es: " + edadMedia/5);
		System.out.print("La altura media de los alumnos es: ");
		System.out.printf("%.2f", estaturaMedia/5);
		System.out.println(" metros");
		System.out.println("La cantidad de alumnos mayores de edad: " + mayorEdad);
		System.out.println("La cantidad de alumnos que miden más de 1,75 metros: " + altos);


		
	}

}
