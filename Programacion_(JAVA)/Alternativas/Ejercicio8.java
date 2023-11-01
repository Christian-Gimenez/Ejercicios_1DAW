import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer 3 numeros y mostrarlos en orden de menor a mayor
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Dame el primer número");
		num1 = teclado.nextInt();
		
		System.out.println("Dame el segundo número");
		num2 = teclado.nextInt();
		
		System.out.println("Dame el tercer número");
		num3 = teclado.nextInt();
		
		int numeroMasGrande = 0;
		int numeroMasPeque = 0;
		int numeroDelCentro = 0;
		
		if (num1 >= num2) {
			if (num1 >= num3) {
				numeroMasGrande = num1;
				
				if (num2 >= num3) {
					numeroMasPeque = num3;
					numeroDelCentro = num2;
				} else {
					numeroMasPeque = num2;
					numeroDelCentro = num3;
				}
			}
		}
		
		if (num2 >= num1) {
			if (num2 >= num3) {
				numeroMasGrande = num2;
				
				if (num1 >= num3) {
					numeroMasPeque = num3;
					numeroDelCentro = num1;
				} else {
					numeroMasPeque = num1;
					numeroDelCentro = num3;
				}
			}
		}
		
		if (num3 >= num1) {
			if (num3 >= num2) {
				numeroMasGrande = num3;
				
				if (num2 >= num1) {
					numeroMasPeque = num1;
					numeroDelCentro = num2;
				} else {
					numeroMasPeque = num2;
					numeroDelCentro = num1;
				}
			}	
		}
		
		System.out.println(numeroMasPeque + " < " + numeroDelCentro + " < " + numeroMasGrande);
		
	}

}
