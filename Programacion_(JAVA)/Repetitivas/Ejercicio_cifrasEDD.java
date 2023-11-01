import java.util.Scanner;
public class Ejercicio_cifrasEDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int digitos;
		int num;
		
		
		System.out.print("Introduce un número entero positivo: ");
		num = teclado.nextInt();
		
		for(digitos = 0; num > 0; digitos++) {
			num = num / 10;
		}
		
		/*
		while(num > 0) {
			num = num / 10;
			digitos++;
		}
		*/
		
		System.out.println("El número que has introducido tiene " + digitos + " cifras");
	}

}
