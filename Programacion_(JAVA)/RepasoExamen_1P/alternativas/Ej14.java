package alternativas;
import java.util.Scanner;
public class Ej14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		 * la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
		 * Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño,
		 *  se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque,
		 *  considerando lo siguiente:
		 *  si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1;
		 *  y 30 céntimos si es de tamaño 2.
		 *  
		 *  Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1,
		 *  y 50 céntimos cuando es de tamaño 2.
		 *  
		 *  Realice un algoritmo para determinar la ganancia obtenida.*/
		
		final double A_1 = 0.20, A_2 = 0.30, B_1 = 0.30, B_2 = 0.50;
		double kilosUva, precioInicial, tamUva, gananciaObtenida = 0;
		String tipoUva;
		boolean correcto = false;
		
		System.out.print("Introduce la cantidad de Kilos de uva: ");
		kilosUva = teclado.nextDouble();
		
		System.out.print("Introduce el precio inicial Kg/€: ");
		precioInicial = teclado.nextDouble();
		
		System.out.print("Introduce el tipo de uva (A/B): ");
		teclado.nextLine();
		tipoUva = teclado.nextLine();
		
		System.out.print("Introduce el tamaño de uva (1/2): ");
		tamUva = teclado.nextInt();
		
		if(tipoUva.equalsIgnoreCase("A") && tamUva == 1) {
			gananciaObtenida = (precioInicial + (precioInicial * A_1)) * kilosUva;
			correcto = true;
			
		} else if (tipoUva.equalsIgnoreCase("A") && tamUva == 2){
			gananciaObtenida = (precioInicial + (precioInicial * A_2)) * kilosUva;
			correcto = true;
			
		} else if (tipoUva.equalsIgnoreCase("B") && tamUva == 1) {
			gananciaObtenida = (precioInicial - (precioInicial * B_1)) * kilosUva;
			correcto = true;
			
		} else if (tipoUva.equalsIgnoreCase("B") && tamUva == 2) {
			gananciaObtenida = (precioInicial - (precioInicial * B_2)) * kilosUva;
			correcto = true;
		}
		
		if (correcto) {
			System.out.println("La ganancia obtenida es de: " + gananciaObtenida + " €");
		} else {
			System.out.println("Ha habido un ERROR en alguno de los datos introducidos.");
		}
		
		
		
		
		
		
	}

}
