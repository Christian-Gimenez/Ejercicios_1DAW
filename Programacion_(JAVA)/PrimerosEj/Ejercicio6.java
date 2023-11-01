import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PIDE DOS NUMEROS ENTEROS (n y m)
		//ESCRIBIR POR PANTALLA <n> entre <m> da un cociente <cociente> y un resto de <resto>
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		int n = teclado.nextInt();
		
		System.out.println("Introduce otro número entero");
		int m = teclado.nextInt();
		
		int cociente = n / m;
		int resto = n % m;
		
		System.out.println(n + " entre " + m + " da un cociente de " + cociente + " y un resto de " + resto);
		
	}

}
