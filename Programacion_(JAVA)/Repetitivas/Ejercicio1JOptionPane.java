//import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		int userNumber = 0;
		String isNull = "";
		int programExit = 1;
		boolean exitApp = false;
		int secretNumber = (int)(Math.random()*100)+1;
		
		int numeroDeIntentos = 0;
		
		while (secretNumber != userNumber && exitApp == false) {
				try {
					isNull = JOptionPane.showInputDialog("Introduce un número (1-100): ");
					
					if(isNull == null) {
						programExit = JOptionPane.showConfirmDialog(null, "¿Deseas salir del programa?", "Cerrar APP", JOptionPane.YES_NO_OPTION);
						//0 = yes	1 = no
						if (programExit == 0) {
							exitApp = true;
						}
						
					} else {
						userNumber = Integer.parseInt(isNull);
					}
					
	
				} catch (NumberFormatException ex) {
					
					if (isNull != null) {
						JOptionPane.showMessageDialog(null, "ERROR. Has introducido un carácter no numérico!!", "ERROR", JOptionPane.ERROR_MESSAGE);
						userNumber = -1;
						numeroDeIntentos--;
					}
				}
				if (secretNumber != userNumber && userNumber != -1 && exitApp == false) {
					JOptionPane.showMessageDialog(null, "¡INCORRECTO! Prueba de nuevo.", "Número INCORRECTO", JOptionPane.WARNING_MESSAGE);
					
					if (userNumber > secretNumber) {
						JOptionPane.showMessageDialog(null, "Pista: Tu número era MAYOR que el número secreto", "PISTA", JOptionPane.INFORMATION_MESSAGE);
					} else if (userNumber < secretNumber) {
						JOptionPane.showMessageDialog(null, "Pista: Tu número era Menor que el número secreto", "PISTA", JOptionPane.INFORMATION_MESSAGE);
					} else if (userNumber < 0 || userNumber > 100) {
						JOptionPane.showMessageDialog(null, "Pista: El número que buscas está entre 1 y 100", "PISTA", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				numeroDeIntentos++;
		}
		
		if (userNumber == secretNumber && exitApp == false) {
			String pluralOsingular;
			if (numeroDeIntentos > 1) {
				pluralOsingular = "intentos";
			} else {
				pluralOsingular = "intento";
			}
			
			JOptionPane.showMessageDialog(null, "¡¡CORRECTO!!\nHas acertado, el número secreto era: " + secretNumber +
					".\nLo has conseguido en " + numeroDeIntentos + " " + pluralOsingular, "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
			
			switch (numeroDeIntentos) {
			case 1:
				JOptionPane.showMessageDialog(null, "¡ESO ES CASI IMPOSIBLE! :O Tu puntuación es 10/10");
				break;
				
			case 2:
			case 3:
			case 4:
				JOptionPane.showMessageDialog(null, "¡INCREÍBLE! :D Tu puntuación es 9/10");
				break;
				
			case 5:
			case 6:
			case 7:
				JOptionPane.showMessageDialog(null, "¡Lo has hecho muy bien! :) Tu puntuación es 8/10");
				break;
				
			case 8:
			case 9:
			case 10:
				JOptionPane.showMessageDialog(null, "No está nada mal :) Tu puntuación es 7/10)");
				break;
				
			case 11:
			case 12:
			case 13:
				JOptionPane.showMessageDialog(null, "Está bien :) Tu puntuación es 6/10");
				break;
				
			case 14:
			case 15:
				JOptionPane.showMessageDialog(null, "Por los pelos :/ Tu puntuación es 5/10");
				break;
				
			case 16:
			case 17:
				JOptionPane.showMessageDialog(null, "Suspenso :( Tu puntuación es 4/10");
				break;
				
			case 18:
			case 19:
				JOptionPane.showMessageDialog(null, "Mal :'( Tu puntuación es 3/10");
				break;
				
			case 20:
				JOptionPane.showMessageDialog(null, "Muy mal :'( Tu puntuación es 2/10");
				break;
				
			case 21:
				JOptionPane.showMessageDialog(null, "¡FATAL! >:( Tu puntuación es 1/10");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Pfff... ¡Mejor dedicate a otra cosa! >:( Tu puntuación es 0/10");
				break;
			}
		} else if (exitApp == true) {
			JOptionPane.showMessageDialog(null, "El programa se ha cerrado", "", JOptionPane.INFORMATION_MESSAGE);
		}
		
		

}
}
