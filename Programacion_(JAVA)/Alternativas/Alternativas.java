import java.util.Scanner;
public class Alternativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); //Constructor
		
		System.out.println("Dime tu edad: ");
		int edad;
		edad = teclado.nextInt();
		
		if (edad < 14) { //Si la edad es menor a 14
			System.out.println("Eres un niño"); //Imprime eres un niño
			
		} else { //Si no...
			if (edad < 18) { //si la edad es menor a 18
				System.out.println("Eres un adolescente"); //Imprime eres un adolescente
				
			} else { //Si no es menora 18
				if (edad < 35) { //Si es menor a 35
					System.out.println("Eres joven"); //Imprime eres joven
					
				} else { //Si no es ninguna de las demas
					System.out.println("Eres un adulto"); //Imprime eres un adulto
				}
			}
			
		}
		
		System.out.println("Programa finalizado!");
	}

}
