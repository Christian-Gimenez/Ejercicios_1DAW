import javax.swing.*;
public class Conversor_BinarioDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numBinario, numDecimal, opcionConversor = 0, salir = 2;
		String opcion = "", numStr = "";
		boolean data = false, exit = false;
		
		while (data == false && exit == false) {
			
			if (exit == false) {
				opcion = JOptionPane.showInputDialog("Por favor, indique qué operación desea realizar:\n1) de Binario a Decimal\n2) de Decimal a Binario");
			}
			
			if (opcion == null) {
				salir = JOptionPane.showConfirmDialog(null, "¿Deseas salir del programa?", "Cerrar aplicación", JOptionPane.YES_NO_OPTION);						
				//0 = yes	1 = no
				switch (salir) {
				case 0:
					opcion = "";
					exit = true;
					break;
				case 1:
					exit = false;
					break;
				default:
					opcion = "";
					exit = true;
					break;
				}
				
			} else {
				try {
					opcionConversor = Integer.parseInt(opcion);
				} catch (NumberFormatException ex) {
					opcionConversor = 0;
					data = false;
				}
				
				switch (opcionConversor) {
				case 0:
					if (opcion.equals("")) {
						data = false;
					} else {
						JOptionPane.showMessageDialog(null, "ERROR\\nPor favor, introduzca una de las dos opciones indicadas (1 / 2)", "Opción inválida", JOptionPane.ERROR_MESSAGE);
						data = false;
					}
					break;
					
				case 1:
				case 2:
					data = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "ERROR\nPor favor, introduzca una de las dos opciones indicadas (1 / 2)", "Opción inválida", JOptionPane.ERROR_MESSAGE);
					data = false;
				}
			}
			
		}
		data = false;
		
		while (data == false) {
			switch (opcionConversor) {
			case 1:
				numStr = JOptionPane.showInputDialog("Introduce un número Binario dentro del rango:\n(8 bits/digitos):", "00111010");
				try {
					numBinario = Integer.parseInt(numStr);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ERROR\nPor favor, introduzca un número Binario válido", "Número inválido", JOptionPane.ERROR_MESSAGE);
					numBinario = 0;
					data = false;
				}
				
				if(numBinario == 00000000) {
					
				}
				break;
				
			case 2:
				if (opcionConversor == 2) {
				JOptionPane.showInputDialog("Introduce un número Decimal dentro del rango:\n(0 - 128)", "58");
				break;
				}
			}
		
		}
		
		
	}

}
