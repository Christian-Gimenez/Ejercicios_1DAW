import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dame capital
		//Dame Interés
		//Dame el tiempo (AÑOS)
		//Imprimir capital obtenido
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("¿Cuánto capital deseas invertir en el fondo?");
		double capital = teclado.nextDouble();
		
		System.out.println("¿Cuál es el tipo de interés?");
		double interes = teclado.nextDouble();
		
		System.out.println("¿Durante cuántos años quieres invertir ese dinero?");
		int tiempo = teclado.nextInt();
		
		double capitalFinal = ((capital * interes) / 100) * tiempo; //Dividimos el interes / 100 porque es un porcentaje
		System.out.println("El Capital Final obtenido es: " + capitalFinal + "€");
		
		
		/*Hacer con el interés compuesto:
		//CapitalInicial * (1 + (interes / 100))^nºMeses
		System.out.println("¿Cuánto capital deseas invertir en el fondo?");
		double capitalInicial = teclado.nextDouble();
		
		System.out.println("¿Cual es el tipo de interés compuesto?");
		double interesCompuesto = teclado.nextDouble();
		
		System.out.println("¿Durante cuántos meses quieres invertir ese dinero?");
		int numeroMeses = teclado.nextInt();
		
		
		//Tenemos que agrupar tooodo en parentesis
		//Primero tienes que fijarlo de manera sencilla, capitalinicial * (1 + (intereses / 100) 
		//Luego intenta meter todo en un parentesis global: (capitalInicial * (1+ (intereses / 100)
		//Por ultimo, en la formula se eleva SOLO el resultado de Math.pow((1 + (interes / 100)), numeroMeses)
		//Finalmente agrupamos todo en un parentesis global (capitalInicial * Math.pow((1 + (interesCompuesto / 100)), numeroMeses));
		double capitalFinal = (capitalInicial * Math.pow((1 + (interesCompuesto / 100)), numeroMeses));
		
		System.out.println("Tu capital final después del periodo de " + numeroMeses + " meses es de " + capitalFinal + " €");
		
		
		
		
		/* Hay una forma mas sencilla para no poner tantos parentesis:
		 * Ve metiendo todo en variables nuevas:
		 * 
		 * double resultado = (1 + (interesCompuesto / 100))
		 * double capitalFinal = (CapitalInicial * Math.pow(resultado, numeroMeses));
		 */
		
	}

}
