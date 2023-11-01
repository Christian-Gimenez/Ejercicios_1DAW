import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Otra forma de dar 2 decimales al imprimir por pantalla
		//double x = 10000.0;
		//Usamos el método printf dandole de args 1ºEl formato y 2ºLo que deseamos imprimir
		//El .2 hace referencia a la cantidad de decimales que queremos mostrar
		//System.out.printf("%1.2f", x / 3);
		
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		
		double num1Double = Double.parseDouble(num1);
		
		num1Double = Math.sqrt(num1Double);
		
		System.out.print("La raíz cuadrada de " + num1 + " es: ");
		
		System.out.printf("%1.2f", num1Double);		
		
	}

}
