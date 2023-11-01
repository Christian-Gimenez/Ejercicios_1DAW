import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ESCRIBIR UN PROGRAMA QUE PIDA DOS NUMEROS, UNO REAL (BASE) Y OTRO ENTERO POSITIVO (EXPONENTE)
		 * SAQUE POR PANTALLA EL RESULTADO DEL LA POTENCIA. NO SE PUEDE UTILIZAR MATH.POW!!!
		 * */
		double base = 0.0, resultado = 0;
		int exponente = 0, contador = 1;
		Scanner teclado = new Scanner(System.in);
		boolean fallo1 = true, fallo2 = true;
		
		while (fallo1 == true) {
			System.out.print("Dame la base: ");
			
			if (fallo1 == true) {
				try {
					base = teclado.nextDouble();
					fallo1 = false;
					
				} catch (InputMismatchException ex) {
					System.out.println("ERROR: Has introducido un carácter no numérico!!");
					teclado.nextLine();
					base = 0;
					fallo1 = true;
				}	
			} else {
				fallo1 = false;
			}
		}
		
		
		
		while (fallo2 == true) {
			System.out.print("Dame el exponente: ");
			
			if (fallo2 == true) {
				try {
					exponente = teclado.nextInt();
					fallo2 = false;
				} catch (InputMismatchException ex) {
					System.out.println("ERROR: Has introducido un carácter no numérico!!");
					teclado.nextLine();
					exponente = 0;
					fallo2 = true;
				}
			} else {
				fallo2 = false;
			}	
		}
		
		
		while (contador < exponente) {
			resultado += base * base;
			contador++;
		}
		
		System.out.println(base + "^" + exponente + " = " + resultado);
	}

}
