package examen.functions;

public class Ejercicio8_MaximoComunDivisor {
	
	public static int cambiarValores(int a, int b) {
		int c = a;
		a = b;
		b = c;
		return a;
	}
	
	public static int mcd(int num1, int num2) {
		int resto, dividendo = 0, divisor = 0;
		//dividendo = (num1 > num2)? num1 : num2;
		//divisor = (num1 < num2)? num1 : num2;
		
		if (num1 > num2) {
			dividendo = num1;
			divisor = num2;
		} else {
			dividendo = num2;
			divisor = num1;
		}
		
		resto = dividendo % divisor;
		
		while(resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
		return divisor;
	}
	
	public static int mcdR(int a, int b) {
		if (a == 0) {
			return a;
		}
		
		if (a == b) {
			return b;
		}
		
		if (a >= b) {
			return mcdR(a-b, b);
		} else {
			return mcdR(a, b-a);
		}
	}

	public static void main(String[] args) {
		/*El Máximo Común Divisor (m.c.d.)
		 * entre dos números enteros mayores a cero
		 * viene dado por la siguiente forma:
        	n, si m % n = 0
        	mcd(m, n) =
              mcd (n, r), si m % n = r con r > 0
      	Escribir un programa que calcule el máximo común divisor entre dos números.
		 * */
		System.out.println(mcd(30, 40));
	}

}
