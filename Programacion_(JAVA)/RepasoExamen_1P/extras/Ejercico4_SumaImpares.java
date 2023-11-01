package examen.extras;

public class Ejercico4_SumaImpares {
	
	public static boolean esImpar(int num) {
		if (num % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public static int sumaImpares(int num) {
		int suma = 0;
		for(int i = 1; i <= num*2; i++) {
			if(esImpar(i)) {
				suma += i;
				System.out.println(i +" + ");
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		/*Escribir una funcion que sume los n primeros numeros impares*/
		System.out.println(sumaImpares(10));
	}

}
