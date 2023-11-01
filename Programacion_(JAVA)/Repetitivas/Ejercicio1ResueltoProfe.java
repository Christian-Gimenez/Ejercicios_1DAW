import java.util.Scanner;
public class Ejercicio1ResueltoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//int secreto = 73;
		int secreto = (int)(Math.random()*100) + 1;
		int numeroUsuario = 0;
		int numeroIntentos = 0;
		
		do {
			numeroIntentos++;
			
			System.out.print("Dame un número: ");
			numeroUsuario = teclado.nextInt();
			
			if (secreto > numeroUsuario) {
				System.out.println("Te has equivocado! El numero buscado es Mayor!!");
					
				}
			if (secreto < numeroUsuario) {
				System.out.println("Te has equivocado! El numero buscado es menor!!");
				}
			
			} while (secreto != numeroUsuario);
		
		if (numeroIntentos == 1) {
			System.out.println("Enhorabuena!! Has acertado en " + numeroIntentos + " intento.");
		} else if (numeroIntentos > 1 && numeroIntentos < 20){
			System.out.println("Enhorabuena!! Has acertado en " + numeroIntentos + " intentos.");
		} else {
			System.out.println("Has acertado pero en " + numeroIntentos + " intentos... \nCreo que puedes hacerlo mejor :(");
		}
		
		
	}

}
