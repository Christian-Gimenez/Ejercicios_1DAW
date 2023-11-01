import java.util.Scanner;
public class Ejercicio6ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, suma, contador;
		double media;
		Scanner teclado = new Scanner(System.in);
		suma = 0;
		contador = 0;
		
		do {
			System.out.print("Dame un numero: ");
			numero = teclado.nextInt();
			if (numero > 0) {
				suma = suma + numero;
				contador++;
			}
			
		} while (numero >=0);
		media = (double)suma / contador;
		System.out.println("La suma es: " + suma);
		if(contador == 0) {
			System.out.println("No se puede calcular la media");
		} else {
			System.out.println("La media es: " + media);
		}
		
	}

}
