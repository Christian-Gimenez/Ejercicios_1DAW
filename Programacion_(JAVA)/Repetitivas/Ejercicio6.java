import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pida numeros mientras estos sean positivos
		//Cuando se introduzca un numero negativo, deje de pedir numeros y
		//muestre el resultado de la suma de los numeros positivos y la media
		
		Scanner teclado = new Scanner(System.in);
		int numeroUser, numeroAlmacenado, resultado, contador, mediaAritmetica;
		resultado = 0;
		contador = 0;
		
		do {
			System.out.print("Introduce un número positivo: ");
			numeroUser = teclado.nextInt();
			
			if (numeroUser >= 0) {
				numeroAlmacenado = numeroUser;
				resultado += numeroAlmacenado;
			}
			contador++;
		} while (numeroUser >= 0);
		
		System.out.println("La suma de todos los números positivos introducidos da: " + resultado);
		if (resultado > 0) {
			mediaAritmetica = resultado / contador;
			System.out.println("La media aritmética de los números positivos es: " + mediaAritmetica);
		}
	}

}
