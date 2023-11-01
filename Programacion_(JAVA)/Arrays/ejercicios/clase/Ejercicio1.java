package ejercicios.clase;
import java.util.*;
public class Ejercicio1 {
	
	public static int notaMasAlta(int[] notas) {
		int masAlta = 0;
		for(int nota:notas) {
			if(nota > masAlta) {
				masAlta = nota;
			}
		}
		return masAlta;
	}
	
	public static int notaMasBaja(int[] notas) {
		int masBaja = 10;
		for(int i = 0; i < notas.length; i++) {
			if (notas[i] < masBaja) {
				masBaja = notas[i];
			}
		}
		return masBaja;
	}
	
	public static int numeroAprobados(int[] notas) {
		int aprobados = 0;
		/*
		for(int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				aprobados++;
			}
		}
		*/	
		for(int nota: notas) {
			if (nota >= 5) {
				aprobados++;
			}
		}
		
		return aprobados;
	}
	
	public static int pedirNotas() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		//Pedir 10 notas de alumnos por teclado

		int[] notas = new int[10];
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Introduce la nota del " + (i+1) + "º alumno: ");
			notas[i] = pedirNotas();
		}
		
		/*
		System.out.println("Las notas de los alumnos son: ");
		for(int nota: notas) {
			System.out.print(nota + " ");
		}*/
		
		System.out.println("Han aprobado " + numeroAprobados(notas) + " alumnos.");
		System.out.println("La nota más alta: " + notaMasAlta(notas));
		System.out.println("La nota más baja: " + notaMasBaja(notas));
	}

}
