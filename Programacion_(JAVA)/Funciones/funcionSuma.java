import java.util.*;
public class funcionSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer operando: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo operando: ");
		int num2 = teclado.nextInt();
		
		System.out.println(suma(num1, num2));
		
	}
	
	public static int suma(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}

}
