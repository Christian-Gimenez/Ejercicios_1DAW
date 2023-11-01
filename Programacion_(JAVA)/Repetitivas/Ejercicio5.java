import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número por teclado
		//Mostrar la suma de ese numero hasta el mismo (sumatorio, si fuera 5 seria 5+4+3+2+1)
		
		int numero, suma, i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		numero = teclado.nextInt();
		suma = numero;
		i = numero;
		
		while (i > 0)  {
			
			if (i > 1) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
			
			i--;
			suma += i;
		}
		
		System.out.println(" = " + suma);
	}

}
