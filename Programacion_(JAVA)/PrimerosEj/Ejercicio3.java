import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nº Horas trabajadas
		//Coste por horas trabajadas
		//Mostrar por consola el salario/resultado
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántas horas trabajas?");
		double horasTrabajadas = teclado.nextInt();
		System.out.println("¿Cuál es el coste por hora trabajada?");
		double costePorHoras = teclado.nextDouble();
		System.out.println("Tu salario es de " + (horasTrabajadas * costePorHoras));
		
	}

}
