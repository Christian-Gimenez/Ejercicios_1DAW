//Pedir un numero y sacar su tabla del 1 al 10
import javax.swing.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTabla, numMultiplicador, resultado, salirPrograma;
		String respuestaUser = "";
		numMultiplicador = 1;
		numTabla = -999;
		resultado = 0;
		boolean datoCorrecto = false;
		
		while (datoCorrecto == false) {
				respuestaUser = JOptionPane.showInputDialog("Introduce un número (1-10)");
				
				if (respuestaUser == null) {
					salirPrograma = JOptionPane.showConfirmDialog(null, "¿Deseas salir del programa?", "Cerrar APP", JOptionPane.YES_NO_OPTION);
					switch (salirPrograma) {
					case 0:
						datoCorrecto = true;
						break;
					case 1:
						datoCorrecto = false;
						break;						
					}
					
				} else {
					try {
						numTabla = Integer.parseInt(respuestaUser);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "ERROR. Por favor introduce un número entero válido", "Error: Tipo de dato", JOptionPane.ERROR_MESSAGE);
						datoCorrecto = false;
						numTabla = -999;
					}
					
					if (numTabla > 0 && numTabla <= 10) {
						datoCorrecto = true;
					} else if (numTabla > 10) {
						JOptionPane.showMessageDialog(null, "Tu número es mayor que 10.\nPor favor, introduce un número dentro del rango especificado", "Rango incorrecto", JOptionPane.WARNING_MESSAGE);
					} else if (numTabla < 1 && numTabla != -999) {
						JOptionPane.showMessageDialog(null, "Tu número es menor que 1.\nPor favor, introduce un número dentro del rango especificado", "Rango incorrecto", JOptionPane.WARNING_MESSAGE);
					}
				}	
		}
		
		if (numTabla > 0 && numTabla <= 10) {
			do {
				resultado = numTabla * numMultiplicador;
				System.out.println(numTabla + " x " + numMultiplicador + " = " + resultado);
				numMultiplicador++;
			} while (numMultiplicador <= 10);
		}
		
		
		
		
	}

}
