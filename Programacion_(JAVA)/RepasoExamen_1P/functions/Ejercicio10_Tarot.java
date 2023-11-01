package examen.functions;

import java.util.Scanner;

public class Ejercicio10_Tarot {
	
	public static int cuentaDigitos(int num) {
		int digitos = 1;
		while (num / 10 != 0) {
			digitos++;
			num = num / 10;
		}
		return digitos;
	}
	
	public static int numTarot(int day, int month, int year) {
		int tarot = day + month + year;
		int suma = tarot % 10, aux, sumaTotal = 0;
		int digitos = cuentaDigitos(tarot);
		
		while (digitos != 1) {
			for (int i = 0; i <= digitos; i++) {
				tarot = tarot / 10;
				//System.out.println("tarot ->" + tarot);
			
				suma += tarot % 10;
				//System.out.println("suma ->" + suma);
			}
			
			digitos = cuentaDigitos(suma); // 2
			//System.out.println("Digitos suma: " + digitos);
			if (digitos != 1) {
				tarot = suma;
				suma = tarot % 10;
			}
		} 		
		return suma;
	}
	
	public static String figuraTarot(int numTarot) {
		String figura = "";
		switch(numTarot) {
		case 0:
			figura = "El Loco";
			break;
			
		case 1:
			figura = "El Mago";
			break;
			
		case 2:
			figura = "La Sacerdotisa";
			break;
			
		case 3:
			figura = "La Emperatriz";
			break;
			
		case 4:
			figura = "El Emperador";
			break;
			
		case 5:
			figura = "El Hierofante";
			break;
			
		case 6:
			figura = "El Enamorado";
			break;
			
		case 7:
			figura = "El Carro";
			break;
			
		case 8:
			figura = "La Justicia † o La Fuerza ‡";
			break;
			
		case 9:
			figura = "El Ermitaño";
			break;
		}
		return figura;
	}
	
	public static int pedirNum() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static void main(String[] args) {
		/*Para obtener el n.º del Tarot de una persona,
		 * hay que sumar los números de su fecha de nacimiento
		 * y reducirlos a un sólo dígito.
		 * Realizar un programa que lea una fecha
		 * de teclado y escriba el n.º del Tarot
		 * en base a la fecha leída.
		 * La fecha estará formada por tres números enteros,
		 * el día, el mes y el año (4 digitos).
        ◦ Ejemplo:
        ◦ Supongase que una persona nace
        el día 1 de Julio de 1966.
        La suma de los tres números da
        como resultado 1 + 7 + 1966 = 1974.
        El resultado obtenido no está formado
        por un sólo dígito, por lo que habrá
        que sumar las cuatro cifras que 
        componen el número: 1 + 9 + 7 + 4 = 21.
        Al igual que antes,
        el resultado no está formado por un dígito,
        por lo que hay que repetir el proceso, 2 + 1 = 3.
        El resultado obtenido es el núimero del Tarot 3.
        ◦ Luego se deberá devolver la figura del Tarot correspondiente a ese número:
            ▪ 0 - El loco
            ▪ 1 – El Mago
            ▪ 2 – La Sacerdotisa
            ▪ 3 – La Emperatriz
            ▪ 4 – El Emperador
            ▪ 5 – El Hierofante
            ▪ 6 – El Enamorado
            ▪ 7 – El Carro
            ▪ 8 – La Justicia † o La Fuerza ‡
            ▪ 9 – El Ermitaño
		 * */
		//System.out.println(cuentaDigitos(21));
		int dia, mes, anyo, tarot;
		System.out.println("Introduce tu fecha de nacimiento:");
		System.out.print("Dia: ");
		dia = pedirNum();
		
		System.out.print("Mes: ");
		mes = pedirNum();
		
		System.out.print("Año: ");
		anyo = pedirNum();
	
		tarot = numTarot(dia, mes, anyo);
		System.out.println("El numero del tarot es: " + tarot + " tu figura es: " + figuraTarot(tarot));

	}

}
