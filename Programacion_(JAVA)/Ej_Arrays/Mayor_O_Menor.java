import javax.swing.*;
public class Mayor_O_Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Declara 2 variables numéricas (con el valor que desees),
		 * he indica cual es mayor de los dos.
		 * Si son iguales indicarlo también.
		 * Ves cambiando los valores para comprobar que funciona.
		 * */
		String numero1 = "";
		String numero2 = "";
		int num1 = 0;
		int num2 = 0;
		boolean intBug = false;
		boolean closeQ = false;
		boolean comparar = false;
		
		JOptionPane.showMessageDialog(null, "Bienvenido al programa comparador de números", "Comparador", JOptionPane.DEFAULT_OPTION);
		
		while (closeQ == false && comparar == false) {
			numero1 = JOptionPane.showInputDialog("Por favor, introduce un número entero:", "58");
			
			if (numero1 == null) {
				int salir = JOptionPane.showConfirmDialog(null, "¿Deseas salir del programa?", "Cerrar programa", JOptionPane.YES_NO_OPTION);
				//0 = yes	1 = no
				
				switch (salir) {
				case 0:
					JOptionPane.showMessageDialog(null, "El programa ha sido cancelado", "Cancelado", JOptionPane.WARNING_MESSAGE);
					closeQ = true;
					break;
				case 1:
					//Prosigue la ejecución
					break;
				}
				
				} else {
					try {
						num1 = Integer.parseInt(numero1);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "ERROR.\nHas introducido un dato no válido", "Tipo de dato erróneo", JOptionPane.ERROR_MESSAGE);
						intBug = true;
					}
					intBug = false;
					
				if (intBug == false) {
					
					while (closeQ == false) {
						numero2 = JOptionPane.showInputDialog("Por favor, introduce otro número entero:", "27");
						
						if (numero2 == null) {
							int salir = JOptionPane.showConfirmDialog(null, "¿Deseas salir del programa?", "Cerrar programa", JOptionPane.YES_NO_OPTION);
							//0 = yes	1 = no
							
							switch (salir) {
							case 0:
								JOptionPane.showMessageDialog(null, "El programa ha sido cancelado", "Cancelado", JOptionPane.WARNING_MESSAGE);
								closeQ = true;
								comparar = false;
								break;
							case 1:
								//Prosigue la ejecución
								break;
							}
							
							} else {
								try {
									num2 = Integer.parseInt(numero2);
								} catch (NumberFormatException ex) {
									JOptionPane.showMessageDialog(null, "ERROR.\nHas introducido un dato no válido", "Tipo de dato erróneo", JOptionPane.ERROR_MESSAGE);
									intBug = true;
								}
								closeQ = true;
								comparar = true;
							}
					}
					
				}
					
				
			}		
		}
		
		if (closeQ == true && intBug == false && comparar == true) {
			if (num1 > num2) {
				JOptionPane.showMessageDialog(null, num1 + " es MAYOR que " + num2);
			} else if (num1 < num2) {
				JOptionPane.showMessageDialog(null, num1 + " es Menor que " + num2);
			} else if (num1 == num2) {
				JOptionPane.showMessageDialog(null, num1 + " es IGUAL que " + num2);
			}
		}
		
		
		
	}

}
