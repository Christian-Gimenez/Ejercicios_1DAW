package repaso.examen.arrays;

import java.util.Scanner;

import daw.com.Teclado;

public class EJ5_ProgramaEvaluadorNotas {
	
	public static double leerNota() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	
	public static boolean validarNotas(double nota1, double nota2, double nota3) {
		return nota1 >= 0.0 && nota1 <= 10.0 &&
				nota2 >= 0.0 && nota2 <= 10.0 &&
				nota3 >= 0.0 && nota3 <= 10.0;
	}
	
	public static void leerNotasAlumnos(String[] alumnos, double[] notas1, double[] notas2, double[] notas3) {
		boolean notasValidas;
		for(int i = 0; i < alumnos.length; i++) {
			do {
				System.out.print("Nombre del alumno: ");
				alumnos[i] = Teclado.leerString();
				
				System.out.print("Nota 1ª Evaluación: ");
				notas1[i] = leerNota();
				
				System.out.print("Nota 2ª Evaluación: ");
				notas2[i] = leerNota();
				
				System.out.print("Nota 3ª Evaluación: ");
				notas3[i] = leerNota();
				
				notasValidas = validarNotas(notas1[i], notas2[i], notas3[i]);
				
				if(!notasValidas) {
					System.out.println("Alguna de las notas introducidas es incorrecta. Por favor introduce una nota valida (0-10).");
				}
			} while(!notasValidas);
		}
	}
	
	//1
	public static void alumnoNotaMasAlta(double[] notas, int ev, String[] alumnos) {
		double notaMasAlta = notas[0];
		String alumnoPro = alumnos[0];
		for(int i = 1; i < notas.length; i++) {
			if (notaMasAlta < notas[i]) {
				notaMasAlta = notas[i];
				alumnoPro = alumnos[i]; 
			}
		}
		System.out.println("El alumno con la nota más alta es: " + alumnoPro + " con un " + notaMasAlta);
	}
	
	//2
	public static void alumnoNotaMasBaja(double[] notas, int ev, String[] alumnos) {
		double notaMasBaja = notas[0];
		String alumnoPro = alumnos[0];
		for(int i = 1; i < notas.length; i++) {
			if (notaMasBaja > notas[i]) {
				notaMasBaja = notas[i];
				alumnoPro = alumnos[i]; 
			}
		}
		System.out.println("El alumno con la nota más baja es: " + alumnoPro + " con un " + notaMasBaja);
	}
	
	//3
	public static void mostrarNotaMedia(double[] notas, int ev) {
		double media = notaMedia(notas);
		System.out.print("La nota media de la " + ev + "ª Evaluación es: ");
		System.out.printf("%.2f", media);
		System.out.println();
	}
	
	//4
	public static void mostrarAlumnosPorEncimaODebajo(double[] notas, String[] alumnos) {
		double puntos = 0, puntosPorEncima, puntosPorDebajo, media;
		boolean alguno = false;
		System.out.print("Introduce puntos por encima/debajo de la media: ");
		puntos = leerNota();
		media = notaMedia(notas);
		puntosPorEncima = media + puntos;
		puntosPorDebajo = media - puntos;
		
		//Por encima
		System.out.println("Alumnos " + puntos + " por encima de la media: ");
		for(int i = 0; i < notas.length; i++) {
			if (notas[i] > media && notas[i] <= puntosPorEncima) {
				System.out.println("-" + alumnos[i] + " con un " + notas[i]);
				alguno = true;
			}
		}
		if (!alguno) {
			System.out.println("Ninguno");
		}
		alguno = false;
		
		System.out.println("Alumnos " + puntos + " por debajo de la media: ");
		for(int i = 0; i < notas.length; i++) {
			if (notas[i] < media && notas[i] >= puntosPorDebajo) {
				System.out.println("-" + alumnos[i] + " con un " + notas[i]);
				alguno = true;
			}
		}
		if (!alguno) {
			System.out.println("Ninguno");
		}
		
	}
	
	public static double notaMedia(double[] notas) {
		double media = 0.0;
		for(int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		return media = media / notas.length;
	}
	
	//5
	public static void mostrarModaNotas(double[] notas, int ev) {
		int[] repeticiones = new int[notas.length];
		double masRepetida = 0.0, notaAContar;
		for(int i = 0; i < notas.length; i++) {
			notaAContar = notas[i];
			for(int j = 0; j < notas.length; j++) {
				if (notaAContar == notas[j]) {
					repeticiones[i]++;
				}
			}
		}
		
		for(int i = 0; i < repeticiones.length; i++) {
			if (masRepetida < repeticiones[i]) {
				masRepetida = notas[i];
			}
		}
		System.out.println("La moda de las notas es " + masRepetida);
	}
	
	public static double[] calcularNotasFinales(double[] notas1, double[] notas2, double[] notas3) {
		double[] notasFinales = new double[notas1.length];
		for(int i = 0; i < notasFinales.length; i++) {
			notasFinales[i] = (notas1[i] + notas2[i] + notas3[i]) / 3;
		}
		return notasFinales;
	}
	
	//6
	public static void listadoNotaFinal(double[] notas1, double[] notas2, double[] notas3, String[] alumnos) {
		double[] notasFinales = calcularNotasFinales(notas1, notas2, notas3);
		System.out.println("Listado de alumnos con nota final:");
		for(int i = 0; i < alumnos.length; i++) {
			System.out.print(alumnos[i] + ": ");
			System.out.printf("%.2f", notasFinales[i]);
			System.out.println();
		}
	}
	
	//7
	public static int buscarAlumno(String[] alumnos) {
		System.out.print("Nombre del alumno a buscar: ");
		String aBuscar = Teclado.leerString();
		int posicionAlumno = 0;
		for(int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].equalsIgnoreCase(aBuscar)) {
				posicionAlumno = i;
			}
		}
		return posicionAlumno;
	}
	
	//7
	public static void cambiarNota(double[] notas, int posicion) {
		double notaNueva;
		do {
			System.out.println("Introduce la nota a cambiar: ");
			notaNueva = leerNota();
			
			if (notaNueva < 0 || notaNueva > 10) {
				System.out.println("Por favor, introduce una nota válida (0-10).");
			}
		} while (notaNueva < 0 || notaNueva > 10);
		notas[posicion] = notaNueva;
	}
	
	public static void llamadaFuncionesEv1(double[] notas1, int opcion, String[] alumnos) {
		switch(opcion) {
		case 1:
			alumnoNotaMasAlta(notas1, 1, alumnos);
			break;
		case 2:
			alumnoNotaMasBaja(notas1, 1, alumnos);
			break;
		case 3:
			mostrarNotaMedia(notas1, 1);
			break;
		case 5:
			mostrarModaNotas(notas1, 1);
			break;
		case 7:
			cambiarNota(notas1, buscarAlumno(alumnos));
			break;
		}
	}
	
	public static void llamadaFuncionesEv2(double[] notas2, int opcion, String[] alumnos) {
		switch(opcion) {
		case 1:
			alumnoNotaMasAlta(notas2, 1, alumnos);
			break;
		case 2:
			alumnoNotaMasBaja(notas2, 1, alumnos);
			break;
		case 3:
			mostrarNotaMedia(notas2, 1);
			break;
		case 5:
			mostrarModaNotas(notas2, 1);
			break;
		case 7:
			cambiarNota(notas2, buscarAlumno(alumnos));
			break;
		}
	}
	
	public static void llamadaFuncionesEv3(double[] notas3, int opcion, String[] alumnos) {
		switch(opcion) {
		case 1:
			alumnoNotaMasAlta(notas3, 1, alumnos);
			break;
		case 2:
			alumnoNotaMasBaja(notas3, 1, alumnos);
			break;
		case 3:
			mostrarNotaMedia(notas3, 1);
			break;
		case 5:
			mostrarModaNotas(notas3, 1);
			break;
		case 7:
			cambiarNota(notas3, buscarAlumno(alumnos));
			break;
		}
	}
	
	
	
	public static void selectorSubMenu(int opcion, double[] notas1, double[] notas2, double[] notas3, String[] alumnos) {
		int evaluacion = deQueEvaluacion();
		
		switch (evaluacion) {
		case 1:
			llamadaFuncionesEv1(notas1, opcion, alumnos);
			break;
		case 2:
			llamadaFuncionesEv2(notas2, opcion, alumnos);
			break;
		case 3:
			llamadaFuncionesEv3(notas3, opcion, alumnos);
			break;
			
		}
	}
	
	public static void selectorMenu(int opcion, double[] notas1, double[] notas2, double[] notas3, String[] alumnos) {
		boolean salir = false;
		int evaluacion;
		switch(opcion) {
		case 1, 2, 3, 5, 7:
			selectorSubMenu(opcion, notas1, notas2, notas3, alumnos);
			break;
		case 4:
			mostrarAlumnosPorEncimaODebajo(calcularNotasFinales(notas1, notas2, notas3), alumnos);
			break;
		case 6:
			listadoNotaFinal(notas1, notas2, notas3, alumnos);
			break;
		default:
			System.out.println("Programa finalizado.");
			salir = true;
			break;	
		}
	}
	
	public static int menu() {
		int opcion;
		boolean opcionCorrecta;
		do {
			opcionCorrecta = true;
			System.out.println("""
					1.- Alumno con la nota más alta.
					2.- Alumno con la nota más baja.
					3.- Mostrar nota media.
					4.- Mostrar los alumnos que están X punto/s por encima o por debajo de la nota media. 
					5.- Mostrar la moda de las notas.
					6.- Listado de alumnos con nota final.
					7.- Buscar un alumno y cambiar su nota
					8.- Salir.
									""");
			System.out.print("Opción: ");
			opcion = Teclado.leerInt();
			if(opcion <= 0 || opcion > 8) {
				System.out.println("Por favor, introduzca una opción válida");
				opcionCorrecta = false;
			}
		} while (!opcionCorrecta);
		
		return opcion;
	}
	
	public static int numeroAlumnos() {
		int numAlumnos;
		do {
			System.out.print("Introduzca el número de alumnos: ");
			numAlumnos = Teclado.leerInt();
			if (numAlumnos <= 0) {
				System.out.println("Por favor, introduzca un número de alumnos válido.");
			}
		} while (numAlumnos <= 0);
		return numAlumnos;
	}
	
	public static int deQueEvaluacion() {
		int evaluacion;
		do {
			System.out.print("De qué evaluación: ");
			evaluacion = Teclado.leerInt();
		} while(evaluacion <= 0 || evaluacion > 3);
		return evaluacion;
	}

	public static void main(String[] args) {
		int opcion;
		int numAlumnos = numeroAlumnos();
		String[] alumnos = new String[numAlumnos];
		double[] notas1 = new double[numAlumnos];
		double[] notas2 = new double[numAlumnos];
		double[] notas3 = new double[numAlumnos];
		leerNotasAlumnos(alumnos, notas1, notas2, notas3);
		
		do {
		opcion = menu();
		if(opcion != 8) {
			selectorMenu(opcion, notas1, notas2, notas3, alumnos);
		}
		
		} while (opcion != 8);
	}

}
