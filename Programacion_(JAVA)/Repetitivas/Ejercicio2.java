import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DIME TU GENERO (H/M) -> Validarlo
		//DIME TU EDAD
		//CALCULAR LA FRECUENCIA CARDIACA MAXIMA
		//SI ES UN HOMBRE = 220 - Edad
		//SI ES UNA MUJER = 230 - Edad
		Scanner teclado = new Scanner(System.in);
		int edad = 0;
		String genero;
		
		do {
			System.out.println("Dime tu género (H/M): ");
			genero = teclado.nextLine();
			
			if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
				System.out.println("Te has equivocado, por favor introduce un dato válido.");
			}
			
		} while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
		
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		int frecuenciaCardiaca;
		
		if (genero.equalsIgnoreCase("H")) {
			frecuenciaCardiaca = 220;
		} else {
			frecuenciaCardiaca = 230;
		}
		
		frecuenciaCardiaca = frecuenciaCardiaca - edad;
		System.out.println("Tu Frecuencia Cardíaca Máxima es de " + frecuenciaCardiaca);

	}

}
