package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio23 {
	
	public static int contarGenero(int[][] estudiantes, int genero) {
		int cantidad = 0;
		for(int i = 0; i < estudiantes.length; i++) {
			if(estudiantes[i][1] == genero) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public static int contarGenero(int[][] estudiantes, int genero, int trabajan) {
		int cantidad = 0;
		for(int i = 0; i < estudiantes.length; i++) {
			if(estudiantes[i][1] == genero && estudiantes[i][2] == trabajan) {
				cantidad++;
			}
		}
		return cantidad;
	}

	
	public static int porcentaje(int[][] estudiantes, int genero) {
		int porcentaje;
		int cantidad = contarGenero(estudiantes, genero);
		porcentaje = cantidad * 100 / estudiantes.length;
		return porcentaje;
	}
	
	public static int porcentaje(int[][] estudiantes, int genero, int trabajan) {
		int porcentaje;
		int cantidad = contarGenero(estudiantes, genero, trabajan);
		porcentaje = cantidad * 100 / estudiantes.length;
		return porcentaje;
	}
	
	
	public static double sueldoPromedio(int[][] estudiantes, int genero) {
		double media = 0;
		int trabajan = 0;
		
		for(int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i][2] == 1 && estudiantes[i][1] == genero) {
				trabajan++;
				media += estudiantes[i][3];
			}
		}
		
		media = media / trabajan;
		
		return media;
	}
	
	public static String meterCerosAString (int cantCeros, String cadena) {
		do {
			cadena += "0";
			cantCeros--;
			
		} while (cantCeros != 0);
		return cadena;
	}
	
	public static void printTabla(int[][] tabla) {
		int cedula, sueldo, digitCedula;
		String genero = "", trabaja = "", cedulaStr = "";
		String fila = "";
		for(int i = 0; i < tabla.length; i++) {
			cedula = tabla[i][0];
			digitCedula = digitosNum(cedula);
			cedulaStr = "";
			cedulaStr = meterCerosAString(8-digitCedula, cedulaStr) + cedula; 
			
			if (tabla[i][1] == 1) {
				genero = "Masculino";
			} else if (tabla[i][1] == 2) {
				genero = "Femenino ";
			} else {
				genero = "Otro     ";
			}
			
			if (tabla[i][2] == 1) {
				trabaja = "Sí trabaja";
			} else {
				trabaja = "No trabaja";
			}
			
			sueldo = tabla[i][3];			
			
			System.out.println(cedulaStr + " | " + genero + " | " + trabaja + " | " + sueldo + " €");
		}
	}
	
	public static int[][] menu(int[][] matriz, int fila) {
		boolean cedula, genero, trabaja, sueldo;
		System.out.println();
		do {
			cedula = true;
			System.out.print("1. CEDULA (Nº entero  máximo de 8 digitos): ");
			matriz[fila][0] = Teclado.leerInt();
			if (digitosNum(matriz[fila][0]) > 8) {
				System.out.println("Error, el Cedula no puede tener más de 8 digitos.");
				cedula = false;
			}
		} while (!cedula);
		
		do {
			genero = true;
			System.out.print("2. GENERO (1-Masculino, 2-Femenino, 3-Otro): ");
			matriz[fila][1] = Teclado.leerInt();
			if (matriz[fila][1] > 3 || matriz[fila][1] <= 0) {
				System.out.println("Error, por favor selecciona una opción válida.");
				genero = false;
			}
		} while (!genero);
		
		
		do {
			trabaja = true;
			System.out.print("3. TRABAJA (1-Si trabaja, 2-no trabaja): ");
			matriz[fila][2] = Teclado.leerInt();
			if (matriz[fila][2] > 2 || matriz[fila][2] <= 0) {
				System.out.println("Error, por favor selecciona una opción válida.");
				trabaja = false;
			}
		} while (!trabaja);
		
		do {
			sueldo = true;
			System.out.print("4. SUELDO (Nº entero): ");
			matriz[fila][3] = Teclado.leerInt();
			if (matriz[fila][3] < 0) {
				System.out.println("Error, el sueldo no puede ser negativo.");
				sueldo = false;
			}
		} while (!sueldo);
		
		
		return matriz;
	}
	
	public static int digitosNum(int num) {
		int digitos = 0;
		do {
			num = num/10;
			digitos++;
			
		} while(num != 0);
		return digitos;
	}

	public static void main(String[] args) {
		System.out.print("Ingrese el número de estudiantes: ");
		int numeroEstudiantes = Teclado.leerInt();
		int[][] estudiantes = new int [numeroEstudiantes][4];
		
		for(int i = 0; i < estudiantes.length; i++) {
			estudiantes = menu(estudiantes, i);
		}
		
		System.out.println(
		" CEDULA  | GENERO    | TRABAJA    | SUELDO ");
		printTabla(estudiantes);
		
		System.out.println("El porcentaje de hombres en la Universidad es de " + porcentaje(estudiantes, 1) + "%");
		System.out.println("El porcentaje de mujeres en la Universidad es de " + porcentaje(estudiantes, 2) + "%");
		System.out.println("El porcentaje de personas no-binarias en la Universidad es de " + porcentaje(estudiantes, 3) + "%");
		System.out.println("\nEl porcentaje de hombres que trabajan es de " + porcentaje(estudiantes, 1, 1) + "%");
		System.out.println("Y su sueldo promedio es de " + sueldoPromedio(estudiantes, 1));
		System.out.println("\nEl porcentaje de mujeres que trabajan es de " + porcentaje(estudiantes, 2, 1) + "%");
		System.out.println("Y su sueldo promedio es de " + sueldoPromedio(estudiantes, 2));
		System.out.println("\nEl porcentaje de personas no-binarias que trabajan es de " + porcentaje(estudiantes, 3, 1) + "%");
		System.out.println("Y su sueldo promedio es de " + sueldoPromedio(estudiantes, 3));
		
		
	}

}
