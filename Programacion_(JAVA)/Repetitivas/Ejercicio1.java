import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*NUMERO_SECRETO (0-100)
		 * Pedir al usuario números hasta que acierte
		 * cuando hacierte decirle enhorabuena
		 * */
		Scanner teclado = new Scanner(System.in);
		//int secretNumber = 58;
		int userNumber = 0;
		int secretNumber = (int)(Math.random()*100)+1;
		
		int numeroDeIntentos = 0;
		
		while (secretNumber != userNumber) {
				try {
					System.out.print("Introduce un número (1-100): ");
					userNumber = teclado.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("ERROR. Has introducido un carácter no numérico!!");
					teclado.nextLine();
					userNumber = -1;
					numeroDeIntentos--;
				}
				if (secretNumber != userNumber && userNumber != -1) {
					System.out.println("¡INCORRECTO! Prueba de nuevo.");
					if (userNumber > secretNumber) {
						System.out.println("Pista: Tu número era mayor que el número secreto");
					} else if (userNumber < secretNumber) {
						System.out.println("Pista: Tu número era menor que el número secreto");
					} else if (userNumber < 0 || userNumber > 100) {
						System.out.println("Pista: El número que buscas está entre 1 y 100");
					}
				}
				numeroDeIntentos++;
		}
		
		String pluralOsingular;
		if (numeroDeIntentos > 1) {
			pluralOsingular = "intentos";
		} else {
			pluralOsingular = "intento";
		}
		
		System.out.println("¡¡CORRECTO!!\nHas acertado, el número secreto era: " + secretNumber +
				".\nLo has conseguido en " + numeroDeIntentos + " " + pluralOsingular);
		
		switch (numeroDeIntentos) {
		case 1:
			System.out.println("¡ESO ES CASI IMPOSIBLE! :O Tu puntuación es 10/10");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("¡INCREÍBLE! :D Tu puntuación es 9/10");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("¡Lo has hecho muy bien! :) Tu puntuación es 8/10");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("No está nada mal :) Tu puntuación es 7/10)");
			break;
		case 11:
		case 12:
		case 13:
			System.out.println("Está bien :) Tu puntuación es 6/10");
			break;
		case 14:
		case 15:
			System.out.println("Por los pelos :/ Tu puntuación es 5/10");
			break;
		case 16:
		case 17:
			System.out.println("Suspenso :( Tu puntuación es 4/10");
			break;
		case 18:
		case 19:
			System.out.println("Mal :'( Tu puntuación es 3/10");
			break;
		case 20:
			System.out.println("Muy mal :'( Tu puntuación es 2/10");
			break;
		case 21:
			System.out.println("¡FATAL! >:( Tu puntuación es 1/10");
			break;
		default:
			System.out.println("Pfff... ¡Mejor dedicate a otra cosa! >:( Tu puntuación es 0/10");
			break;
		
		}
		
	}

}
