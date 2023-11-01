import java.util.Scanner;
public class Ejercicio4 {
	
	public static int mcd(int a, int b) {
		
		if (b == 0) {
			return a;
		}
		if (a == b) {
			return b;
		}
		
		if (a >= b) {
			return mcd(a - b, b);
		} else {
			return mcd(a, b - a);
		}
		
		
	}
	
	public static int maxComDiv(int a, int b) {
		int dividendo = a > b ? a : b;
		int divisor = b < a ? b : a;
		int resto = dividendo % divisor;
		
		while (resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
		
		return divisor;
	}
	
	public static int dameNum() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir Número: ");
		return teclado.nextInt();
		
	}

	public static void main(String[] args) {
		/*El mcd entre dos números enteros mayores que cero
		 * viene dado por la siguiente forma:
		 * n, si m % n = 0
		 * mcd(m,n) =
		 * 		mcd(n,r), si m % n = r con r > 0
		 * */
		int a, b, opcion;
		boolean repetir;
		String fin = "Programa finalizado";
		System.out.println("Introduce los dos números a calcular su M.C.D.");
		a = dameNum();
		b = dameNum();
		
		
		do {
			System.out.println("Elige una de las dos opciones: ");
			System.out.println("1) Iterativa");
			System.out.println("2) Recursiva");
			System.out.println("3) Salir");
			opcion = dameNum();
		
			repetir = false;
			
			switch (opcion) {
			case 1:
				System.out.println("El M.C.D. Iterativo es: " + maxComDiv(a, b));
				break;
			case 2:
				System.out.println("El M.C.D. Recursivo es: " + mcd(a, b));
				break;
			case 3:
				break;
			default:
				System.out.println("Opción incorrecta:");
				repetir = true;
				break;
			}
		} while (repetir);
		
		System.out.println(fin);
		
		
	}

}
