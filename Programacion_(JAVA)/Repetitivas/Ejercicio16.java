import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducir un nº y decir si es primo o no.
		Scanner teclado = new Scanner(System.in);
		int num, resto;
		boolean noEsPrimo = true;
		
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		for(int i = num - 1; i >= 1; i++) {
			resto = num % i;
			System.out.println(resto);
			if (resto == 0) {
				noEsPrimo = false;
			}
		}
		
		/*
		//Iteramos hasta que i sea igual o mayor a la mitad de num
		for(int i = 2; i < num / 2; i++) {
			//Si num dividido entre cualquiera de sus numeros anteriores (i) da resto 0
			if (num % i == 0) {
				//NO es primo
				noEsPrimo = false;
			}
		} */
		
		//Con el resultado del bucle anterior indicamos si es o no primo.
		if (noEsPrimo == true) {
			System.out.println(num + " es primo.");
		} else {
			System.out.println(num + " no es primo.");
		}
	}

}
