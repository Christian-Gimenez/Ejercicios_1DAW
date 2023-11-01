package ejercicios.clase;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static int pedirNum() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public static float pedirNota() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextFloat();
	}
	
	public static String pedirNombre() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static boolean notaCorrecta(float nota) {
		if(nota >= 0 && nota <= 10) {
			return true;
		}
		return false;
	}
	
	public static void leerDatos(String[] alumnos, float[] notas1, float[] notas2, float[] notas3) {
		boolean nota = true;		
		
		for(int i = 0; i < alumnos.length; i++) {
			System.out.print("Nombre del " + (i+1) + "º alumno: ");
			alumnos[i] = pedirNombre();
			do {
				System.out.print("Introduce su nota de la 1ª Evaluación: ");
				notas1[i] = pedirNota();
				if (!notaCorrecta(notas1[i])) {
					nota = false;
					System.err.println("Error. La nota no puede ser menor a 0 ni mayor a 10.");
					} else {
						nota = true;
					}
			} while (!nota);
				
			do {
				System.out.print("Introduce su nota de la 2ª Evaluación: ");
				notas2[i] = pedirNota();
					if (!notaCorrecta(notas2[i])) {
						nota = false;
						System.err.println("Error. La nota no puede ser menor a 0 ni mayor a 10.");
					} else {
						nota = true;
					}
			} while(!nota);
			
			do {
				System.out.print("Introduce su nota de la 3ª Evaluación: ");
				notas3[i] = pedirNota();
				if (!notaCorrecta(notas3[i])) {
					nota = false;
					System.err.println("Error. La nota no puede ser menor a 0 ni mayor a 10.");
				} else {
					nota = true;
				}
			} while (!nota);
			System.out.print("\n");
		}
	}
	
	public static float[] calcularMediaGlobal(float[] notas1, float[] notas2, float[] notas3) {
		float[] notasMedias = new float[notas1.length];
		for(int i = 0; i < notasMedias.length; i++) {
			notasMedias[i] = (notas1[i] + notas2[i] + notas3[i]) / 3;
		}
		return notasMedias;
	}
	
	public static void listadoAlumnosNotaFinal(float[] notasMedias, String[] alumnos) {
		System.out.println("\nListado de alumnos con sus notas finales del curso:");
		for(int i = 0; i < alumnos.length; i++) {
			System.out.print(alumnos[i] + ": ");
			System.out.printf("%.2f", notasMedias[i]);
			System.out.println();
		}
	}
	
	public static void unPuntoDeLaMedia(float[] notasMedias, String[] alumnos) {
		float notaMedia = 0;
		int ninguno = 0;
		int puntos = 0;
		for(int i = 0; i < notasMedias.length; i++) {
			notaMedia += notasMedias[i];
		}
		notaMedia = notaMedia / notasMedias.length;
		
		System.out.println("¿Cuántos puntos por encima o por debajo de la media deseas evaluar?");
		System.out.print("-> ");
		puntos = pedirNum();
		
		System.out.print("\nListado de alumnos que están " + puntos + " por encima o por debajo de la media (");
		System.out.printf("%.2f", notaMedia);
		System.out.print("): \n");
		for(int i = 0; i < notasMedias.length; i++) {
			if (notasMedias[i] >= (notaMedia - puntos) && notasMedias[i] <= (notaMedia + puntos)) {
				System.out.print(alumnos[i] + " con una nota de ");
				System.out.printf("%.2f", notasMedias[i]);
				if (notasMedias[i] > notaMedia) {
					System.out.print(" está por encima de la media.\n");
				} else if (notasMedias[i] < notaMedia) {
					System.out.print(" está por debajo de la media.\n");
				} else {
					System.out.println(" tiene la misma nota que la media.\n");
				}
			} else {
				ninguno++;
				if (ninguno == notasMedias.length) {
					System.out.println("Ninguno...");
				}
			}
		}
	}
		
	public static void notaMedia(float[] notas, int evaluacion) {
		float media = 0;
		for(int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media / notas.length;
		System.out.print("\nLa nota media de la " + evaluacion + "º evaluación es: ");
		System.out.printf("%.2f", media);
		System.out.println();
	}
	
	public static void notaMasAlta(float[] notas, String[] alumnos, int evaluacion) {
		//int indiceNotaMasAlta = 0;
		float notaMasAlta = 0.0f;
		String alumnoNotaMasAlta = "";
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] > notaMasAlta) {
				//indiceNotaMasAlta = i;
				notaMasAlta = notas[i];
				alumnoNotaMasAlta = alumnos[i];
			}
		}
		System.out.print("El alumno con la nota más alta de la " + evaluacion + "º Evaluación es " + alumnoNotaMasAlta + " con un ");
		System.out.printf("%.2f", notaMasAlta);
		System.out.println();
	}
	
	public static void notaMasBaja(float[] notas, String[] alumnos, int evaluacion) {
		float notaMasBaja = 10.0f;
		String alumnoNotaMasBaja = "";
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < notaMasBaja) {
				notaMasBaja = notas[i];
				alumnoNotaMasBaja = alumnos[i];
			}
		}
		System.out.print("\nEl alumno con la nota más baja de la " + evaluacion + "º Evaluación es " + alumnoNotaMasBaja + " con un ");
		System.out.printf("%.2f", notaMasBaja);
		System.out.println();
	}
	
	public static int[] deFloatAInt(float[] decimal) {
		int[] entero = new int[decimal.length];
		for(int i = 0; i < entero.length; i++) {
			entero[i] = (int)decimal[i];
		}
		return entero;
	}
	
	public static void modaDeLasNotas(float[] notas) {
		/* CREAR UN ARRAY "APARICIONES" QUE ALMACENE UN CONTADOR
		 * INDICANDO DEL ARRAY NOTAS, CUANTAS VECES (RECORRIENDO EL MISMO) APARECE
		 * EL NUMERO EN SI
		 * NOTAS: 		[7][9][5][9]
		 * APARICIONES: [1][2][1][2]
		 * DESPUÉS VER EL MÁS GORDO, E IMPRIMIR SU EQUIVALENTE EN NOTAS[]
		 * */
		int[] aparece = new int[notas.length];
		int[] nota = new int[notas.length];
		nota = deFloatAInt(notas);
		int contador = 0, elemento = 0, notaModa=0, masGordo=0;
		
		for(int i = 0; i < aparece.length; i++) {
			elemento = nota[i];
			for(int j = 0; j < nota.length; j++) {
				if(elemento == nota[j]) {
					contador++;
				}
			}
			aparece[i] = contador;
			contador = 0;
			
		}
		
		
		for(int k = 0; k < aparece.length; k++) {
			if (aparece[k] > masGordo) {
				notaModa = nota[k];
				masGordo = aparece[k];
			}
		}
		
		
		//masGordo = mayorNum(aparece);
		
		System.out.println("\nLa moda de las notas es: " + notaModa);
	}
	
	public static int mayorNum(int[] array) {
		int mayor = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	public static void menuEvaluacion(int opcion, float[] notas1, float[] notas2, float[] notas3, String[] alumnos) {
		int subOpcion = 0;
		boolean opcionCorrecta;
		do {
			opcionCorrecta = true;
			System.out.print("""
					¿De qué evaluación?
					1ª Evaluación
					2ª Evaluación
					3ª Evaluación
					""");
			System.out.print("Opción -> ");
			subOpcion = pedirNum();
			switch(subOpcion) {
			case 1:
				subMenuEvaluacion(opcion, notas1, alumnos, 1);
				break;
			case 2:
				subMenuEvaluacion(opcion, notas2, alumnos, 2);
				break;
			case 3:
				subMenuEvaluacion(opcion, notas3, alumnos, 3);
				break;
			default:
				opcionCorrecta = false;
				System.err.println("Opción incorrecta, por favor vuelve a introducir la opción.");
				break;	
			}
		} while(!opcionCorrecta);
	}
	
	public static void subMenuEvaluacion(int opcion, float[] notas, String[] alumnos, int evaluacion) {
		switch(opcion) {
		case 1:
			notaMasAlta(notas, alumnos, evaluacion);
			break;
		case 2:
			notaMasBaja(notas, alumnos, evaluacion);
			break;
		case 3:
			notaMedia(notas, evaluacion);
			break;
		case 5:
			modaDeLasNotas(notas);
			break;
		}
	}
		
	public static void menuPrincipal(float[] notas1, float[] notas2, float[] notas3, String[] alumnos) {
		boolean opcionCorrecta, exit = false;
		int opcion = 0;
		do {
			System.out.print("""
			 \nSeleccione una de las siguientes opciones
			 1- Alumno con la nota más alta.
			 2- Alumno con la nota más baja.
			 3- Mostrar nota media.
			 4- Mostrar los alumnos que están un punto por encima o por debajo de la nota media.
			 5- Mostrar la moda de las notas(la nota más repetida).
			 6- Listado de alumnos con nota final.
			 7- Salir.
			 """);
			System.out.print("-> ");
			opcion = pedirNum();
			opcionCorrecta = true;
			switch(opcion) {
			case 1, 2, 3, 5:
				menuEvaluacion(opcion, notas1, notas2, notas3, alumnos);
				break;
			case 4, 6:
				float[] notasMedias = calcularMediaGlobal(notas1, notas2, notas3);
				if (opcion == 4) {
					unPuntoDeLaMedia(notasMedias, alumnos);
				} else if (opcion == 6) {
					listadoAlumnosNotaFinal(notasMedias, alumnos);
				}
				break;
			case 7:
				System.out.println("Programa finalizado.");
				exit = true;
				opcionCorrecta = true;
				break;
			default:
				opcionCorrecta = false;
				System.err.println("Opción incorrecta, por favor vuelve a introducir la opción.");
				
				break;
			}
		} while(!opcionCorrecta || !exit);
	}
	
	public static void main(String[] args) {
		/*Realizar un programa que solicite el nº de alumnos
		 * y habrá que leer los nombres de los alumnos y las notas
		 * de la 1ª, 2ª y 3ª evaluación.
		 * Mostrar un menú donde se imprimirá:
		 * 1.- Alumno con la nota más alta (y preguntar por qué evaluación mostrarla).
		 * 2.- Alumno con la nota más baja.(y preguntar por qué evaluación mostrarla).
		 * 3.- Mostrar nota media. (y preguntar por qué evaluación mostrarla).
		 * 4.- Mostrar los alumnos que están un punto (los que diga el usuario) por encima o por debajo de la nota media. 
		 * 5.- Mostrar la moda de las notas(la nota más repetida).(y preguntar por qué evaluación mostrarla).
		 * 6.- Listado de alumnos con nota final.
		 * 7.- Salir.
		 * Buscar un alumno y cambiar su nota
		 * */
		
		int numAlumnos;
		do {
			System.out.print("Introduzca el nº de alumnos: "); //Entre 1 y 30 alumnos
			numAlumnos = pedirNum();
			if (numAlumnos <= 0){
				System.err.println("\nError. Por favor introduzca un número entero mayor a 0.");
			}
		} while (numAlumnos <= 0);
		
		String[] alumnos = new String[numAlumnos];
		float[] notas1 = new float[numAlumnos];
		float[] notas2 = new float[numAlumnos];
		float[] notas3 = new float[numAlumnos];
		leerDatos(alumnos, notas1, notas2, notas3);

		
		menuPrincipal(notas1, notas2, notas3, alumnos);
		

	}

}
