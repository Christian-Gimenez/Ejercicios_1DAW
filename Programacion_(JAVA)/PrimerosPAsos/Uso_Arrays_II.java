import javax.swing.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* SE puede declarar el array y luego uno a uno introducir los datos en cada índice
		String [] paises = new String [8];
		
		paises[0] = "España";
		paises[1] = "México";
		paises[2] = "Colombia";
		paises[3] = "Perú";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		*/
		
		//O se puede declarar e inicializar de una todo el array con sus datos
		/*String [] paises = {"España", "México",
							"Colombia", "Perú",
							"Chile", "Argentina",
							"Ecuador", "Venezuela"
		}; */
		
		/*
		for (int i = 0; i < paises.length; i++) {
			System.out.println("País " + (i + 1) + ": " + paises[i]);
		} */
		
		/*
		int numInteraciones = 1;
		
		//Bucle FOR EACH
		for(String i:paises) {
			 System.out.println("País " + (numInteraciones++) + ": " + i);
		} */
		
		String [] paises = new String [8];
		
		for (int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
		}
		
		//Bucle FOR EACH
		for(String i:paises) {
			System.out.println("País " + ": " + i);
		}
		
		
		
	}

}
