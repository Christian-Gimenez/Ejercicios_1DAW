import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 2 numeros por teclado y mostrar los 2 numeros que ha pedido:
		//E <n1> es mayor que <n2>
		Scanner teclado = new Scanner(System.in);
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número entero:"));
		
		if (n1 > n2) {
			System.out.println("El " + n1 + " es mayor que " + n2);
		} else {
			if (n1 < n2) {
				System.out.println("El " + n1 + " es menor que " + n2);
				
			} else {
				System.out.println("El " + n1 + " es igual que " + n2);
				
			}
		}
		
	}

}
