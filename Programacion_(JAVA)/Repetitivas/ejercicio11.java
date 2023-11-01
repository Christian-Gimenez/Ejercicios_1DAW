import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un N y mostrar los numeros que son multiplos de 7 entre 1 y N
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un número: ");
		int num = teclado.nextInt();
		
		/*
		for(int i = 1; i <= num; i++) {
			if(i % 7 == 0) {
				System.out.println(i + " es múltiplo de 7.");
			}
		}*/
		
		//Otra forma de hacerlo, incrementando en +7 en cada iteración
		for(int i = 7; i <= num; i = i + 7) {
			System.out.println(i);
		}
		
	}

}
