import java.util.Scanner;
public class Ejercicio8ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero, contador;
		numero = 0;
		contador = 0;
		//System.out.print("Dame el numero: ");
		//numero = teclado.nextInt();
		
		while (numero < 10) {
			numero++;
			System.out.println("Tabla del: " + numero);
			
			while (contador <= 10) {
				System.out.println(numero + " x " + contador + " = " + numero * contador);
				contador++;
			}
			contador = 0;
			System.out.print("\n");
		}
	}

}
