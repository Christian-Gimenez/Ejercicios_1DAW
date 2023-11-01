import javax.swing.*;
public class MiniCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Declara dos variables numéricas (con el valor que desees),
		 * muestra por consola la suma, resta, multiplicación, división
		 * y módulo (resto de la división).
		 */
		
		String num1 = "";
		String num2 = "";
		int numero1 = 0;
		int numero2 = 0;
		String operacion = "";
		boolean seguirPreguntando = true;
		boolean cancelarPrograma = false;
		boolean valorCorrecto = true;
		
		do {
			num1 = JOptionPane.showInputDialog("Introduce un número entero");
			valorCorrecto = true;
			
			if (num1 == null) {
				JOptionPane.showMessageDialog(null, "El programa ha sido cancelado", "CANCELADO", JOptionPane.WARNING_MESSAGE);
				cancelarPrograma = true;
				
			} else {
				try {
					numero1 = Integer.parseInt(num1);
				
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"ERROR.\nPor favor, introduzca un numero entero válido.",
							"Error al pasar String a int", JOptionPane.ERROR_MESSAGE);
					valorCorrecto = false;
					
				}
				
				if(valorCorrecto == true) {
					num2 = JOptionPane.showInputDialog("Introduce otro número entero");
					
					if (num2 == null) {
						int salir = JOptionPane.showConfirmDialog(null, "¿Deseas salir del programa?", "CANCELAR", JOptionPane.YES_NO_OPTION);
						//0 = yes	1 = no
						if (salir == 0) {
							JOptionPane.showMessageDialog(null, "El programa ha sido cancelado", "CANCELADO", JOptionPane.WARNING_MESSAGE);
							cancelarPrograma = true;
						}
					} else {
						try {
							numero2 = Integer.parseInt(num2);
						} catch (NumberFormatException ex) {
							JOptionPane.showMessageDialog(null,
									"ERROR.\nPor favor, introduzca un numero entero válido.",
									"Error al pasar String a int", JOptionPane.ERROR_MESSAGE);
							valorCorrecto = false;
						}
						
						if (valorCorrecto == true) {
							
							boolean operando = false;
							while (operando == false) {
								operacion = JOptionPane.showInputDialog("Indica cual de las siguientes operaciones aritméticas deseas realizar:\n"
										+ "SUMA | RESTA | MULTIPLICACION | DIVISION");
								
								if (operacion.equalsIgnoreCase("suma") || operacion.equalsIgnoreCase("sumar") || operacion.equalsIgnoreCase("+")) {
									int resultado = numero1 + numero2;
									JOptionPane.showMessageDialog(null, "RESULTADO:\n" + numero1 + " + " + numero2 + " = " + resultado);
									seguirPreguntando = false;
									operando = true;
								} else if (operacion.equalsIgnoreCase("resta") || operacion.equalsIgnoreCase("restar") || operacion.equalsIgnoreCase("-")) {
									int resultado = numero1 - numero2;
									JOptionPane.showMessageDialog(null, "RESULTADO:\n" + numero1 + " - " + numero2 + " = " + resultado);
									seguirPreguntando = false;
									operando = true;
								} else if (operacion.equalsIgnoreCase("multiplicacion") || operacion.equalsIgnoreCase("multiplicar")
										||operacion.equalsIgnoreCase("*") || operacion.equalsIgnoreCase("+")) {
									int resultado = numero1 * numero2;
									JOptionPane.showMessageDialog(null, "RESULTADO:\n" + numero1 + " x " + numero2 + " = " + resultado);
									seguirPreguntando = false;
									operando = true;
								} else if (operacion.equalsIgnoreCase("division") || operacion.equalsIgnoreCase("dividir") || operacion.equalsIgnoreCase("/")) {
									int resultado = numero1 / numero2;
									int resto = numero1 % numero2;
									JOptionPane.showMessageDialog(null, "RESULTADO:\n" + numero1 + " / " + numero2 + " = " + resultado + "\nRESTO: " + resto);
									seguirPreguntando = false;
									operando = true;
								} else {
									JOptionPane.showMessageDialog(null, "ERROR. Por favor, introduzca un operando válido.", "ERROR OPERANDO", JOptionPane.ERROR_MESSAGE);
								}
							}
							
						}
					}
				}
				
			}
			
		} while (seguirPreguntando == true && cancelarPrograma == false);
		
		
		
		
		
		
	}

}
