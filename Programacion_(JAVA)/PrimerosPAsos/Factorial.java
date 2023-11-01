import java.lang.reflect.Array;

import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long resultado = 1L;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		for (int i = numero; i > 0; i--) {
			
			resultado = resultado * i;	
		}
		
		JOptionPane.showMessageDialog(null, "El resultado de " + numero + "! es = " + resultado);
	
		/* Ejemplo propio recorrer un Array con for introduciendo los numeros del 1 al 10
		int[] miMatriz = new int[10];
		
		for (int i = 0; i < miMatriz.length; i++) {
			miMatriz[i] = 1 + i;
			System.out.println(miMatriz[i]);
		} */
		
	}

}
