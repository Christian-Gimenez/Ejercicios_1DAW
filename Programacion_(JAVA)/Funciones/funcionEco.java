import java.util.Scanner;

public class funcionEco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Funcion eco, recibe un parametro de tipo entero e imprime por pantalla el texto "eco" las veces que se le indique
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime el número de veces que queremos imprimir eco: ");
		int veces = teclado.nextInt();
		System.out.println("********Llamo a la funcion Eco********");
		eco(veces);
		System.out.println("********Fin de la funcion Eco********");

	}
	
	public static void eco(int num) {
		for(int i = 1; i < num; i++) {
		System.out.println("Eco");
		}
	}

}
