import java.util.Scanner;
public class Ejercicio5 {

	public static int pedirFecha() {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anyo, suma;
		
		do {
		System.out.print("Introduce el día: ");
		dia = teclado.nextInt();
		
		System.out.print("Introduce el mes: ");
		mes = teclado.nextInt();
		
		System.out.print("Introduce el año: ");
		anyo = teclado.nextInt();
		
		suma = dia + mes + anyo;
		
		if (!esValidaFecha(dia, mes, anyo)) {
			System.out.println("ERROR. Fecha Inválida.");
		}
		
		} while (!esValidaFecha(dia, mes, anyo));
		return suma;
		
	}
	
	public static int digitos(int numero) {
		int digitos = 0;
		
		do {
			numero = numero / 10;
			digitos++;
		} while (numero != 0);
		
		return digitos;
	}
	
	public static int sumaDigitos(int numero) {
		int suma = 0;
		int digitos = digitos(numero);
		
		for (int i = 1; i <= digitos; i++) {
			suma += numero % 10;
			numero = numero / 10;
		}
		return suma;
	}
	
	public static boolean esValidaFecha(int dia, int mes, int anyo) {
		boolean diaValido = false, mesValido = false, anyoValido = false, fechaValida = false;
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia <= 31 && dia > 0) {
				diaValido = true;
			}
			break;
		case 4, 6, 9, 11:
			if (dia <= 30 && dia > 0) {
				diaValido = true;
			}
			break;
		case 2:
			if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {
				if (dia <= 29 && dia > 0) {
					diaValido = true;
				}
			} else {
				if (dia <= 28 && dia > 0) {
					diaValido = true;
				}
			}
			break;
		}
		
		if (anyo > 0) {
			anyoValido = true;
		}
		
		if (mes <= 12 && mes > 0) {
			mesValido = true;
		}
		
		if (diaValido && mesValido && anyoValido) {
			fechaValida = true;
		}
		
		return fechaValida;
	}
	
	public static String figuraTarot(int numero) {
		String figura ="";
		switch(numero) {
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
		case 10:
			figura = "La Rueda de la Fortuna";
			break;
		case 11:
			figura = "La Fuerza † o La Justicia ‡";
			break;
		case 12:
			figura = "El Colgado";
			break;
		case 13:
			figura = "La Muerte";
			break;
		case 14:
			figura = "La Templanza";
			break;
		case 15:
			figura = "El Diablo";
			break;
		case 16:
			figura = "La Torre";
			break;
		case 17:
			figura = "La Estrella";
			break;
		case 18:
			figura = "La Luna";
			break;
		case 19:
			figura = "El Sol";
			break;
		case 20:
			figura = "El Juicio";
			break;
		case 21:
			figura = "El Mundo";
			break;
		default:
			figura = "Ninguna";
			break;
		}
		
		return figura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroTarot = pedirFecha();
		numeroTarot = sumaDigitos(numeroTarot);
		System.out.println(figuraTarot(numeroTarot));
	}

}
