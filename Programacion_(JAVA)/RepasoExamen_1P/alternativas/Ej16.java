package alternativas;
import java.util.Scanner;
public class Ej16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*La política de cobro de una compañía telefónica es:
		 * cuando se realiza una llamada, el cobro es por el tiempo que ésta dura,
		 * de tal forma que los primeros cinco minutos cuestan 1 euro,
		 * los siguientes tres, 80 céntimos,
		 * los siguientes dos minutos, 70 céntimos,
		 * y a partir del décimo minuto, 50 céntimos.
		 * Además, se carga un impuesto de 3 % cuando es domingo,
		 * y si es otro día, en turno de mañana, 15 %,
		 * y en turno de tarde, 10 %.
		 * 
		 * Realice un algoritmo para determinar cuánto debe pagar por cada concepto
		 * una persona que realiza una llamada.
		 * */
		final double DOMINGO = 0.03, AM = 0.15, PM = 0.10;
		double tarifa = 1.0, precioTotal = 0.0;
		int tiempoLlamada = 0;
		String dia = "", hora = "";
		
		System.out.print("Introduzca el tiempo de la llamada en minutos: ");
		tiempoLlamada = teclado.nextInt();
		
		System.out.print("Introduzca el día de la semana en el que efectuó la llamada: ");
		teclado.nextLine();
		dia = teclado.nextLine();
		
		System.out.print("Cúando realizó la llamada, por la mañana o por la tarde (AM o PM):");
		hora = teclado.nextLine();
		
		
		if (tiempoLlamada > 5 && tiempoLlamada <= 8) {
			tarifa += 0.80;
		} else if (tiempoLlamada > 8 && tiempoLlamada <= 10) {
			tarifa += 0.70;
		} else if (tiempoLlamada > 10) {
			tarifa += 0.50;
		}
		
		System.out.println("Tarifa a aplicar: " + tarifa + " €/min.");
		
		if (dia.equalsIgnoreCase("Domingo")) {
			precioTotal = (tiempoLlamada * tarifa);
			precioTotal = precioTotal + (precioTotal * DOMINGO);
			
		} else if (hora.equalsIgnoreCase("AM") && !dia.equalsIgnoreCase("Domingo")) {
			precioTotal = (tiempoLlamada * tarifa);
			precioTotal = precioTotal + (precioTotal * AM);
			
		} else if (hora.equalsIgnoreCase("PM") && !dia.equalsIgnoreCase("Domingo")) {
			precioTotal = (tiempoLlamada * tarifa);
			precioTotal = precioTotal + (precioTotal * PM);
		}
		
		System.out.println("El precio total de la llamada es de: " + (Math.round(precioTotal * 100.0)/100.0) + " € .");
		

	}

}
