package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio23_Ramon {
	
	public static int leerDatos(int[] cedula, char[] genero, char[] trabaja, int[] sueldo) {
		char respuesta = 'N';
		int posicion = 0;
		do {
			System.out.print("Introduce cedula del alumno: ");
			cedula[posicion] = Teclado.leerInt();
			
			System.out.print("Introduce el género del alumno: ");
			genero[posicion] = Teclado.leerString().charAt(0);
			
			do {
				System.out.print("¿Trabaja el alumno?(S/N): ");
				trabaja[posicion] = Teclado.leerString().charAt(0);
			} while (trabaja[posicion] != 'n' || trabaja[posicion] != 'N'
					|| trabaja[posicion] != 'S' || trabaja[posicion] != 's');
			
			
			if(trabaja[posicion] == 'S' || trabaja[posicion] == 's') {
				System.out.print("Introduce el salario: ");
				sueldo[posicion] = Teclado.leerInt();
			}
			
			if (posicion >= MAXIMO_ALUMNOS) {
				respuesta = 'N';
			} else {
				System.out.println("¿Quieres introducir más alumnos?(S/N)");
				respuesta = Teclado.leerString().charAt(0);
			}
			
		} while (respuesta == 'S');
		
		return posicion;
	}
	
	static final int MAXIMO_ALUMNOS = 50;
	
	public static float porcentaje(char[] genero, int numero, char busco) {
		float resultado;
		int contador = buscar(genero, numero, busco);
		
		resultado = 100f * contador / numero;
		return resultado;
	}
	
	public static int buscar(char datos[], int numero, char busco) {
		int contador = 0;
		for(int i = 0; i < numero; i++) {
			if(datos[i] == busco) {
				contador++;
			}
		}
		return contador;
	}
	
	public static float[] porcentajeTrabajan(char[] genero, char[] trabaja, int[] sueldo, int numero, char gen) {
		float[] resultado = new float[2];
		int hombresTrabajadores = 0;
		int numeroHombres = buscar(genero, numero, gen);
		int salarios = 0;
		for(int i = 0; i < numero; i++) {
			if(trabaja[i] == 'S' && genero[i] == gen) {
				hombresTrabajadores++;
				salarios += sueldo[i];
			}
		}
		
		resultado[0] = hombresTrabajadores * 100f / numeroHombres;
		resultado[1] = (float)salarios / hombresTrabajadores;
		
		return resultado;
	}
	
	public static float porcentajeHombres(char[] genero, int numero) {
		return porcentaje(genero, numero, 'H');
	}
	
	public static float porcentajeMujeres(char[] genero, int numero) {
		return porcentaje(genero, numero, 'M');
	}

	public static void main(String[] args) {
		int numeroEstudiantes;
		
		int[] cedula = new int [MAXIMO_ALUMNOS];
		char[] genero = new char [MAXIMO_ALUMNOS];
		char[] trabaja = new char [MAXIMO_ALUMNOS];
		int[] sueldo = new int [MAXIMO_ALUMNOS];
		numeroEstudiantes = leerDatos(cedula, genero, trabaja, sueldo);
		float hombres = porcentajeHombres(genero, numeroEstudiantes);
		//porcentajeMujeres()

	}

}
