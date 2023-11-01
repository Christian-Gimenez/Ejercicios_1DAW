import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pide un numero y muestra todos los numeros desde 1 a N
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un número: ");
		int num = teclado.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			
		}
	}

}
