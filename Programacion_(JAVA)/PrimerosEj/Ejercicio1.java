import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicitar al usuario su nombre, y luego poner hola + su nombre
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cómo te llamas?");
		String nombreUser = teclado.nextLine();
		System.out.println("¡Hola " + nombreUser + "!");
		
		System.out.println(nombreUser + " ¿Cuántos años tienes?");
		int edadUser = teclado.nextInt();
		
		if (edadUser > 100) {
			System.out.println("Tienes " + edadUser + " años... ¡Eso es imposible!");
			
		} else if (edadUser < 100 && edadUser > 65) {
			System.out.println("Tienes " + edadUser + " años: Eres una persona jubilada");
			
		} else if (edadUser > 25 && edadUser < 65) {
			System.out.println("Tienes " + edadUser + " años: Eres un adulto");
		} else if (edadUser >= 18) {
			System.out.println("Tienes " + edadUser + " años: Eres joven");
		} else if (edadUser > 0 && edadUser < 18) {
			System.out.println("Tienes " + edadUser + " años: Eres menor de edad");
		} else {
			System.out.println("Eso es imposible... no mientas");
		}
		
		
	}

}
