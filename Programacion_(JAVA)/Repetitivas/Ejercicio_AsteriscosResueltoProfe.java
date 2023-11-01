import java.util.Scanner;

public class Ejercicio_AsteriscosResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame la altura:");
		int altura = teclado.nextInt();
		do {
			for(int i = 0; i < altura; i++) {
				System.out.println("*");
			}
			System.out.println();
			altura = altura -1;
		} while(altura > 0);
		
	}

}
