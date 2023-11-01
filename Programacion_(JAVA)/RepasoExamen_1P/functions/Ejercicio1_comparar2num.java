package examen.functions;

public class Ejercicio1_comparar2num {
	
	public static int compararNums(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void main(String[] args) {
		/*Diseñar una función que tenga como parámetros dos números,
		 * y que calcule el máximo.*/
		System.out.println(compararNums(5, 5));
	}

}
