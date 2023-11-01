import java.util.Scanner;
public class Ejercicio_Repetitivas_nPrimo {

	public static void main(String[] args) {
		/*2) Solicitar un número por teclado y mostrar por pantalla
		 * si el número es primo o no.
		*/
		
		//Inicializamos las variables necesarias
		Scanner teclado = new Scanner(System.in);
		int numero, contador = 0, resto;
		
		//Pide el número y lo lee por teclado
		System.out.print("Introduce un número: ");
		numero = teclado.nextInt();
		
		//Bucle para dividir todos los numeros de 1 a N
		for(int i = 1; i <= numero; i++) {
			//Guardamos el resto de numero / lo que valga i en cada iteración
			resto = numero % i;
			//Si en alguna de las divisiones el resto da 0
			if(resto == 0) {
				//Lo contabilizamos
				contador++;
			}
		}
		
		//Si las divisiones NO han devuelto + de 2 veces un resto 0
		if(contador <= 2) {
			//Sabemos que numero era PRIMO porque tendría +2 divisores positivos distintos a si mismo
			System.out.println("\"" + numero + "\" es un número PRIMO.");
		} else {
			//Si no, NO es primo
			System.out.println("\"" + numero + "\" NO es un número primo.");
		}
	}

}
