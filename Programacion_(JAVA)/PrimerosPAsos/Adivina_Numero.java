import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random() * 100);
		
		int numero = 0;
		
		int intentos = 0;
		
		// Con el bucle do... while
		do {
			intentos++;
			
			System.out.println("Por favor, introduce un número: ");
			
			numero = entrada.nextInt();
			
				if (numero > aleatorio) {
					System.out.println("Más bajo\n");
					
				} else if (numero < aleatorio) {
					System.out.println("Más alto\n");
				
				}
		} while (numero != aleatorio);
		
		System.out.println("\n¡Número correcto, enhorabuena!\nLo has conseguido en " + intentos + " intentos.");

		
		/* Con el bucle while
		while (numero != aleatorio) {
			intentos++;
			
			System.out.println("Por favor, introduce un número: ");
			
			numero = entrada.nextInt();
			
				if (numero > aleatorio) {
					System.out.println("Más bajo\n");
					
				} else if (numero < aleatorio) {
					System.out.println("Más alto\n");
				
				}
			
			
			}
		
		System.out.println("\n¡Número correcto, enhorabuena!\nLo has conseguido en " + intentos + " intentos.");
		*/
	}

}
