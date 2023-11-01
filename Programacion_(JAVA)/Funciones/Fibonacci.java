import java.util.Scanner;
public class Fibonacci {
	
	/*fib(n) = fib(n-1) + fib(n-2)
	 * fib(0) = 1
	 * fib(1) = 1*/
	
	//Recibe un término,
	public static int resolucionRayFor(int num) {
		int resultado =0;
		int contador = 1;
		double division = 0;
		
		for(int i = 1; i != 1; i++) {
			division = num / 1618.0;
			division = Math.round(division);
		}

		return contador;
	}
	
	public static int resolucionRay(int num) {
		int contador = 1;
		double division = 1, numReal = num;
		
		 do {
			division = numReal / 1618.0;
			division = division;
			System.out.println(num + " / 1618 = " + division);
			//numReal = division;
			contador++;
		} while(division != 1);

		return contador;
	}
	
	public static int recursivoFibonacci(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		} else {
			return recursivoFibonacci(numero-1)+ recursivoFibonacci(numero-2);
		}
		
	}
	
	public static int iterativoFibonacci(int numero) {
		int ter1 = 1;//Establecemos el 1º termino
		int ter2 = 1;//y el 2º
		int fibonacci = 0;
		
		
		//Hacemos un bucle que empiece en 2 y vaya hasta el numero
		for(int i = 2; i <= numero; i++) {
			//En cada vuelta, se suman los 2 terminos
			fibonacci = ter1 + ter2;
			//El termino 1 pasa a ser el 2
			ter1 = ter2;
			//El termino 2 pasa a ser la suma que dio ter1 + ter2
			ter2 = fibonacci;
		}
		return fibonacci;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		System.out.println("Su termino en fibonacci es: " + iterativoFibonacci(num) + " y " + recursivoFibonacci(num));
		
		//System.out.println("El equivalente en la sucesión de Fibonacci es: " + resolucionRay(num));
	}

}
