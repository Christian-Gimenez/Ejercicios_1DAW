import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PROGRAMA QUE PIDA DOS NUMEROS: NOTA, EDAD
		 * Y UNA CADENA DE CARACTERES: GENERO
		 * MUESTRA EL MENSAJE: "ACEPTADA" SI LA NOTA ES MAYOR O IGUAL A 5, LA EDAD ES MAYOR O IGUAL A 18 Y EL GENERO ES "Mujer".
		 * En caso de que se cumpla lo mismo, pero el genero sea "Hombre", debe imprimir "POSIBLE".
		 * Si no se cumplen dichas condiciones, debe imprimir "NO ACEPTADA".
		 */
		Scanner teclado = new Scanner(System.in);
		
		float nota, edad;
		String genero;
		
		System.out.println("Introduzca su nota: ");
		nota = teclado.nextFloat();
		
		System.out.println("Introduzca su edad: ");
		edad = teclado.nextFloat();
		
		System.out.println("Introduzca su género (Hombre/Mujer): ");
		teclado.nextLine(); //Para que no guarde el caracter "enter" y funcione bien
		genero = teclado.nextLine(); //PREGUNTAR AL PROFE  
		
		
		if (nota >= 5 && edad >= 18 && genero.equalsIgnoreCase("Mujer")) {
			System.out.println("Aceptada :)");
			
		} else if (nota >= 5 && edad >= 18 && genero.equalsIgnoreCase("Hombre")) {
			System.out.println("Posible :|");
			
		} else if (nota < 5 || edad < 18) {
			
			if (genero.equalsIgnoreCase("Mujer")) {
				System.out.println("No aceptada :(");
				
			} else {
				System.out.println("No aceptado :(");
			}
			
		} else { 
			System.out.println("Alguno de los datos introducidos es erróneo");
		}
		
	}

}
