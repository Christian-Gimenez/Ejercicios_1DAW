import java.util.Scanner;
public class Ejercicio_Repetitivas_nPrimo_ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero, contador = 1, divisores = 0;
		
		do {
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		} while (numero <= 1);
		
		for(contador = 1; contador <= numero; contador++) {
			if(numero % contador == 0) {
				divisores = divisores + 1;
			}
		}
		
		/*
		do {
			if(numero % contador == 0) {
				divisores = divisores + 1;
			}
			contador++;
		} while (contador <= numero);
		*/
		
		if(divisores <= 2) {
			System.out.println(numero + " es primo.");
		} else {
			System.out.println(numero + " NO es primo");
		}
	}

}
