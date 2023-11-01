package examen.functions;

public class Ejercicio3_todosNumsEntre {
	
	public static int numMayor(int num1, int num2) {
		int resultado = (num1 > num2)? num1 : num2;
		return resultado;
	}
	
	public static void numerosEntre(int num1, int num2) {
		int mayor = 0, menor = 0;
		if (numMayor(num1, num2) == num1) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}
		
		if (mayor != menor) {
			for(int i = menor; i <= mayor; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("No hay números enteros entre " + mayor + " y " + menor);
		}
		
		
	}

	public static void main(String[] args) {
		/*Función a la que se le pasan dos enteros
		 * y muestra todos los números comprendidos entre ellos, inclusive.
		 */
		numerosEntre(2,2);
	}

}
