import java.util.Scanner;
public class Ejercicio6_REPETITIVAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que pida ingresar dos datos enteros (coordenadas x e y).
		 * Al comenzar el programa se pedirá ingresar el total de puntos a procesar.
		 * Informar de cuantos puntos se han ingresado en cada uno de los cuatro cuadrantes.
		 * */
		Scanner teclado = new Scanner(System.in);
		int x, y, cuadrante1 = 0, cuadrante2 = 0, cuadrante3 = 0, cuadrante4 = 0;
		
		System.out.print("¿Cuál será el total de puntos a procesar? ");
		int cantidadPuntos = teclado.nextInt();
		
		for(int i = cantidadPuntos; i > 0; i--) {
			System.out.print("Introduce la coordenada X: ");
			x = teclado.nextInt();
			
			System.out.print("Introduce la coordenada Y: ");
			y = teclado.nextInt();
			
			if(x > 0 && y > 0) {
				cuadrante1++;
			}
			
			if(x < 0 && y > 0) {
				cuadrante2++;
			}
			
			if(x < 0 && y < 0) {
				cuadrante3++;
			}
			
			if(x > 0 && y < 0) {
				cuadrante4++;
			}
			System.out.println();
		}
		
		System.out.println("Has introducido:");
		System.out.println(cuadrante1 + " coordenada/s del 1er Cuadrante (+, +)");
		System.out.println(cuadrante2 + " coordenada/s del 2º Cuadrante (-, +)");
		System.out.println(cuadrante3 + " coordenada/s del 3er Cuadrante (-, -)");
		System.out.println(cuadrante4 + " coordenada/s del 4º Cuadrante (+, -)");
		System.out.println("Sobre alguno de los ejes " + (cantidadPuntos - cuadrante1 - cuadrante2 - cuadrante3 - cuadrante4));
	}

}
