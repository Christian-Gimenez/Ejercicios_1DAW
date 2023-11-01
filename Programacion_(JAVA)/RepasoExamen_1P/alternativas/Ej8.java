package alternativas;
import java.util.*;
public class Ej8 {

	public static void main(String[] args) {
		/*Algoritmo que pida dos números 'nota' y 'edad' y un carácter 'sexo'
		 * y muestre el mensaje 'ACEPTADA' si la nota es mayor o igual a cinco,
		 * la edad es mayor o igual a dieciocho y el sexo es 'F'.
		 * En caso de que se cumpla lo mismo, pero el sexo sea 'M',
		 * debe imprimir 'POSIBLE'.
		 * Si no se cumplen dichas condiciones se debe mostrar 'NO ACEPTADA'.
		 * */
		Scanner teclado = new Scanner(System.in);
		int nota, edad;
		String sexo = "";
		
		System.out.print("Introduce tu nota: ");
		nota = teclado.nextInt();
		
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		System.out.print("Introduce tu sexo (F/M): ");
		teclado.nextLine();
		sexo = teclado.nextLine();
		
		if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("ACEPTADA.");
		} else {
			if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
				System.out.println("POSIBLE");
			} else {
				if (nota < 5 || edad < 18) {
					System.out.println("NO ACEPTADA");
				}
			}
		}
	}

}
