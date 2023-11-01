package examen.extras;

import java.util.Scanner;

public class OldExamenDAW_Ej4 {
	
	public static String meterMases(String texto) {
		String resultado = "";
		char caracter;
		for(int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			resultado += caracter;
			if (caracter == ' ' && i > 0) {
				resultado += "+ ";
			}
			
			if (i == (texto.length()-1)) {
				resultado += " =";
			}
			
			
		}
		return resultado.trim();
	}
	
	public static String pintarSuma(int num) {
		String suma = "";
		for(int i = 1; i < num; i++) {
			if (esDivisor(num, i)) {
				suma += " " + i;		
			}
		}
		return suma;
	}
	
	public static int pedirInt(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el " + n + " numero: ");
		return sc.nextInt();
	}
	
	public static boolean esDivisor(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean sonAmigos(int a, int b) {
		int sumaDivisoresA = sumaDivisores(a);
		int sumaDivisoresB = sumaDivisores(b);
		
		if (sumaDivisoresA == b && sumaDivisoresB == a) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int sumaDivisores(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (esDivisor(num, i)) {
				suma += i;
			}
		}
		return suma;
	}
	
	public static boolean enteroPositivo(int num1, int num2) {
		if (num1 > 0 && num2 > 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		/*Realizar un programa que solicite
		 * dos números enteros positivos
		 * (hay que comprobar que se introducen correctamente)
		 * e informe de si son amigos o no.
       	
       	Nota: Los números amigos son dos números
       	enteros positivos «a» y «b» tales que la suma
       	de los divisores propios de uno es igual al otro número y viceversa.
        ◦ El ejemplo más conocido es el de 220 y 284.
        ◦ Los divisores de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110.
        ◦ Si hacemos la suma 1+2+4+5+10+11+20+22+44+55+110 = 284. ¡Se cumple!
        ◦ Al igual, los divisores de 284 son 1, 2, 4, 71, 142.
        ◦ Al sumarlos 1+2+4+71+142 = 220. ¡Genial!
        ◦ Así vemos como 220 y 284 son números amigos.
        Existen muchos más, por ejemplo el 1.184 es amigo del 1.210.
        Del mismo modo, el 2.620 es amigo del 2.924.*/
		int num1, num2, sumaAmigos, sumaDivisores1, sumaDivisores2;
		String pintarAmigos;
		boolean fallo;
		do {
			fallo = false;
			num1 = pedirInt(1);
			num2 = pedirInt(2);
			if (!enteroPositivo(num1, num2)) {
				System.err.println("Error. Por favor, introduzca números enteros y positivos.");
			}
		} while (!enteroPositivo(num1, num2));
		
		if (sonAmigos(num1, num2)) {
			sumaDivisores1 = sumaDivisores(num1);
			sumaDivisores2 = sumaDivisores(num2);
			System.out.println("SON AMIGOS :) Ya que, la suma de los divisores de " + num1 + ":");
			pintarAmigos = pintarSuma(num1);
			pintarAmigos = meterMases(pintarAmigos);
			System.out.println(pintarAmigos + " " + sumaDivisores1);
			System.out.println("Y la suma de los divisores de " + num2 + ":");
			pintarAmigos = pintarSuma(num2);
			pintarAmigos = meterMases(pintarAmigos);
			System.out.println(pintarAmigos + " " + sumaDivisores2);
		} else {
			System.out.println("No son amigos :(");
		}
		
		

	}

}
