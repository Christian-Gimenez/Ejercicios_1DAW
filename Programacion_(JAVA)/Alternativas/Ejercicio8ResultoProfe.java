import java.util.Scanner;
public class Ejercicio8ResultoProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a, b ,c;
		
		System.out.print("Dame un numero: ");
		a = teclado.nextInt();
		
		System.out.print("Dame otro numero: ");
		b = teclado.nextInt();
		
		System.out.print("Dame otro numero más: ");
		c = teclado.nextInt();
		
		if (a <= b && a <= c) {
			//A es el menor de todos
			System.out.print(a + " < ");
			if (b <= c) {
				System.out.print(b + " < " + c);
			} else {
				System.out.print(c + " < " + b);
			}
		} else {
			if (b <= a && b <= c) {
				//B es el menor de todos
				System.out.print(b + " < ");
				if (a <= c) {
					System.out.print(a + " < " + c);
				} else {
					System.out.print(c + " < " + a);
				}
			} else {
				//C es el menor de todos
				System.out.print(c + " < ");
				if (a <= b) {
					System.out.print(a + " < " + b);
				} else {
					System.out.print(b + " < " + a);
				}
			}
		}
		
		/*Otra manera de hacerlo
		if (a < b && a < c && b < c) {
			System.out.print(a + " < " + b + " < " + c);
		} else if (b < a && a < c && b < c) {
			System.out.print(b + " < " + a + " < " + c);
			ETC...
		} */
	}

}
