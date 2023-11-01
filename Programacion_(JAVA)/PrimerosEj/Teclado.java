import java.util.Scanner;
public class Teclado {

	public static void main(String[] args) {
		//Creamos una variable tipo scanner
		//Para ello indicamos el paquete donde se encuentra la clase Scanner, la cual es java/util
		//java.util.Scanner teclado;
		
		//Pero al haber importado java.util.Scanner, ya no es necesario
		Scanner teclado;
		teclado = new Scanner(System.in);
		String linea;
		//linea = teclado.nextLine(); //Devuelve un String, el que ponga el usuario por teclado
		//System.out.println(linea);
		
		//int edad;
		//edad = teclado.nextInt();
		//edad = edad + 1;
		//System.out.println("El año que viene tendrás " + (edad + 1) + " años");
		
		//double real;
		//real = teclado.nextDouble();
		//System.out.println(real);
		
	}

}
