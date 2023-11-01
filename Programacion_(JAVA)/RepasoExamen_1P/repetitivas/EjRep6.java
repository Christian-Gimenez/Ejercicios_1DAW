package repetitivas;
import java.util.Scanner;
public class EjRep6 {

	public static void main(String[] args) {
		/*Realizar un programa que pida ingresar dos datos enteros (coordenadas x e y).
		 * Al comenzar el programa se pedirá ingresar el total de puntos a procesar.
		 * Informar de cuantos puntos se han ingresado en cada uno de los cuatro cuadrantes.
		 * Cuadrante 1 (x, y)
		 * Cuadrante 2 (-x, y)
		 * Cuadrante 3 (-x, -y)
		 * Cuadrante 4 (x, -y)*/
		Scanner teclado = new Scanner(System.in);
		int x, y, iteraciones, cuadrante1=0, cuadrante2=0, cuadrante3=0, cuadrante4=0, ejeY=0, ejeX=0, cero=0;;
		
		System.out.print("Introduce la cantidad total de puntos a procesar: ");
		iteraciones = teclado.nextInt();
		
		for(int i = 1; i <= iteraciones; i++) {
			System.out.print(i + ") Valor X:");
			x = teclado.nextInt();
			
			System.out.print(i + ") Valor Y:");
			y = teclado.nextInt();
			System.out.println();
			
			if (x > 0 && y > 0) {
				cuadrante1++;
			} else if (x < 0 && y > 0) {
				cuadrante2++;
			} else if (x < 0 && y < 0) {
				cuadrante3++;
			} else if (x > 0 && y < 0) {
				cuadrante4++;
			} else if (x == 0 && (y > 0 || y < 0)) {
				ejeY++;
			} else if ((x > 0 || x < 0) && y == 0) {
				ejeX++;
			} else {
				cero++;
			}
		}
		System.out.println("Hay " + cuadrante1 + " puntos del 1º Cuadrante.");
		System.out.println("Hay " + cuadrante2 + " puntos del 2º Cuadrante.");
		System.out.println("Hay " + cuadrante3 + " puntos del 3º Cuadrante.");
		System.out.println("Hay " + cuadrante4 + " puntos del 4º Cuadrante.");
		
		if (ejeX > 0) {
			System.out.println("Hay " + ejeX + " puntos Exclusivos del eje X");
		}

		if (ejeY > 0) {
			System.out.println("Hay " + ejeY + " puntos Exclusivos del eje Y");
		}
		
		if (cero > 0) {
			System.out.println("Hay " + cero + " puntos 0,0.");
		}
		
		
		
	}


}
