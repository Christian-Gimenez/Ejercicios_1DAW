import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PEDIR UN AÑO POR TECLADO e IMPRIMIR si es BISIESTO
		//UN AÑO ES BISIESTO SI ES DIVISIBLE ENTRE 4 PERO NO LO ES ENTRE 100
		//O EL AÑO ES DIVISIBLE ENTRE 400
		
		Scanner teclado = new Scanner(System.in);
		
		int year = 0;
		
		System.out.print("Introduce un año: ");
		year = teclado.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Es un año BISIESTO");
		} else {
			System.out.println("NO es un año Bisiesto");
		}
	}

}
