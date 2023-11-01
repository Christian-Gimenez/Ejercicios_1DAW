package alternativas;
import java.util.Scanner;
public class Ej9 {

	public static void main(String[] args) {
		//Algoritmo que pida tres números y los muestre ordenados (de mayor a menor);
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, menor=0, medio=0, mayor=0;
		
		System.out.print("Introduce un número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Introduce un número más: ");
		num3 = teclado.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			mayor = num1;
			
			if (num2 > num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
			
		} else if (num2 > num1 && num2 > num3) {
			mayor = num2;
			
			if(num1 > num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}
		} else if (num3 > num1 && num3 > num2) {
			mayor = num3;
			
			if (num1 > num2) {
				medio = num1;
				menor = num2;
			} else {
				medio = num2;
				menor = num1;
			}
		}
		
		System.out.println(mayor + " > " + medio + " > " + menor);
	}

}
