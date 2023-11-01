import javax.swing.JOptionPane;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que pida el género y la altura y calcule el peso ideal:
		//Mujer alturaCm - 120. Hombre alturaCm - 110
		
		final int PESO_IDEAL_M = 120;
		final int PESO_IDEAL_H = 110;
		
		String genero = "";
		int altura, pesoIdeal;
		
		do {
			genero = JOptionPane.showInputDialog("¿Cuál es tu género (H/M)?");
			
			if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
				JOptionPane.showMessageDialog(null, "ERROR: Has introducido un dato inválido.");
			}
					
		} while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
		
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu altura en centímetros?"));
		
		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - PESO_IDEAL_H;
		} else {
			pesoIdeal = altura - PESO_IDEAL_M;
		}
		
		JOptionPane.showMessageDialog(null, "Tu peso \"ideal\" es de " + pesoIdeal + " KG");
		//Voy por el video 21 min 0:00

	}

}
