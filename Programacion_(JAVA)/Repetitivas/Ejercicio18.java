import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir numero por pantalla
		//Imprimir un triangulo rectángulo por pantalla con asteriscos (la cantidad de * será la del número introducido)
		
		//Declaramos las variables necesarias
		Scanner teclado = new Scanner(System.in);
		int asteriscos = 0;
		
		//Haz
		do {
			//Pedir un número de 1 al 15, ambos inclusive, leerlo por teclado -> cantidadAsteriscos
			System.out.print("Introduce un número [1,15]: ");
			asteriscos = teclado.nextInt();
			
			//Si introducimos un número fuera del rango [1,15] mostramos el error
			if(asteriscos < 1 || asteriscos > 15) {
				System.out.println("Error. Por favor, introduce un número del 1 al 15");
			}
			//Repetir todo lo anterior mientras no se introduzca un número > 1 OR < 15
		} while (asteriscos < 1 || asteriscos > 15);
		
		//Inicializamos i con el valor de asteriscos, repetimos bucle hasta que i llegue a 0
		for(int i = asteriscos; i >= 0 ;i--) { //y restamos -1 en cada iteración
			
			//Hacemos un bucle anidado para imprimir * hasta que j sea <= i
			for(int j = 1; j <= i; j++) { //Sumamos +1 a j en cada iteración
				System.out.print("*");
			}
			//Al terminar el bucle interior, damos un salto de línea
			System.out.println();
		}
		/*Explicación:
		 * De esta forma, una vez finalizada la iteración completa del bucle for interior (j),
		 * el bucle exterior (i) restará un valor a asteriscos, por lo que se imprimiran
		 * los asteriscos formando un triángulo rectángulo cuyos catetos tendrán la mismca cantidad
		 * de asteriscos
		 * */
		
	}

}
