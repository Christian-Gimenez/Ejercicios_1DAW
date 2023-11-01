import java.util.*;
public class FuncionMostrarEntre {

	public static void main(String[] args) {
		/*Escribir una funcion a la que se le pasen dos numeros enteros y mostrar los numeros que hay entre ellos
		 * */
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Introduce un número: ");
		n1 = teclado.nextInt();
		
		System.out.print("Introduce otro número: ");
		n2 = teclado.nextInt();
		
		numsEntre(n1, n2);

	}
	
	public static void numsEntre(int num1, int num2) {
		int mayor, menor;
		mayor = num1 > num2 ? num1 : num2;
		menor = num1 < num2 ? num1 : num2;
		
		System.out.println("Los números que hay entre " + menor + " y " + mayor + " son:");
		
		for(int i = menor; i <= mayor; i++) {
			System.out.print(i + " ");
		}
		
	}

}
