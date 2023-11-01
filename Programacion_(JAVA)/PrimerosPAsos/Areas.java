import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaConsola = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		int figura = entradaConsola.nextInt();
		
		switch (figura) {
		
			case 1:
				//A = lado²
				double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del Cuadrado:"));
				double areaCuadrado = Math.pow(ladoCuadrado, 2);
				System.out.print("El Área de tu Cuadrado es: ");
				System.out.printf("%1.2f", areaCuadrado);
				break;
			case 2:
				//A = bas * alt
				double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del Rectángulo:"));
				double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del Rectángulo:"));
				double areaRectangulo = baseRectangulo * alturaRectangulo;
				System.out.print("El Área de tu Rectángulo es: ");
				System.out.print(Math.round(areaRectangulo * 100)/100);
				break;
			case 3:
				//A = bas * alt / 2
				double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del Triángulo:"));
				double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del Triángulo:"));
				double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
				System.out.print("El Área de tu Triángulo es: ");
				System.out.printf("%1.2f", areaTriangulo);
				break;
			case 4:
				//A = π * r²
				double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del Círculo:"));
				double areaCirculo = Math.PI * (Math.pow(radioCirculo, 2.0));
				System.out.print("El Área de tu Círculo es: ");
				System.out.printf("%1.2f", areaCirculo);
				break;
			default:
				System.out.println("Dato introducido erróneo");
				break;
		}
		
	}

}
