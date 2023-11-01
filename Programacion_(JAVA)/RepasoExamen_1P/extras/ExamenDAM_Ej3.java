package examen.extras;

import java.util.Scanner;

public class ExamenDAM_Ej3 {
	
	public static int leerNum() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void programaAnalizarCoordenadas() {
		int opcion;
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Punto más centrado");
			System.out.println("2. Punto más bajo");
			System.out.println("3. Puntos espejados horizontalmente");
			System.out.println("4. Puntos en las diagonales");
			System.out.println("5. Salir");
			System.out.print("-> ");
			opcion = leerNum();
			
			System.out.print("\n");
			
			switch(opcion) {
			case 1:
				
				puntoMasCentrado();
				break;
			case 2:
				puntoMasBajo();
				break;
			case 3:
				puntosEspejadosHorizontalmente();
				break;
			case 4:
				puntosEnLasDiagonales();
				break;
			case 5: 
				System.out.println("Programa finalizado");
				break;
			default:
				System.err.println("Opción inválida, por favor seleccione una de las 5 opciones del menú");
				break;
			}
			
		} while (opcion != 5);	
	}
	
	public static boolean esPunto(int coordenada) {
		if (coordenada == 0) {
			return true;
		}
		return false;
	}
	
	public static int comprobarSiEsPunto(char coordenada) {
		boolean punto;
		int coord;
		do {
			punto = false;
			coord = leerCoordenadas(coordenada);
			if (esPunto(coord)) {
				punto = true;
				System.err.println("Error: No se permiten puntos (0)");
			} 
		} while(punto);
		return coord;
	}
	
	public static int leerCoordenadas(char coordenada) {
		System.out.print(coordenada + " = ");
		return leerNum();
	}
	
	public static double distanciaRaiz(int x, int y) {
		double resultado;
		
		resultado = ((Math.pow(x, 2)) + (Math.pow(y, 2)));
		resultado = Math.sqrt(resultado);
		
		return resultado;
	}
	
	public static String printDistanciaRaiz(int x, int y, double distancia) {
		return printCoordenada(x, y)+ " -> " + distancia;
	}
	
	public static void puntoMasCentrado() {
		boolean punto;
		int x1, x2, y1, y2;
		double distancia1, distancia2;
		System.out.println("Introduzca los valores de la primera coordenada:");
		x1 = comprobarSiEsPunto('X');
		y1 = comprobarSiEsPunto('Y');
		System.out.print("\n");
		distancia1 = distanciaRaiz(x1, y1);
		
		System.out.println("Introduzca los valores de la segunda coordenada:");
		x2 = comprobarSiEsPunto('X');
		y2 = comprobarSiEsPunto('Y');
		distancia2 = distanciaRaiz(x2, y2);
		
		System.out.print("El punto con menor distancia a la raíz es: ");
		if (distancia1 < distancia2) {
			System.out.println(printDistanciaRaiz(x1, y1, Math.round(distancia1*1000.0)/1000.0));
		} else {
			System.out.println(printDistanciaRaiz(x2, y2, Math.round(distancia2*1000.0)/1000.0));
		}
	}
	
	public static String printCoordenada(int x, int y) {
		return "(" + x + ", " + y + ")";
	}
	
	public static void puntoMasBajo() {
		int x1, x2, y1, y2, x3, y3;
		System.out.println("Introduzca los valores de la primera coordenada:");
		x1 = leerCoordenadas('X');
		y1 = leerCoordenadas('Y');
		System.out.print("\n");
		
		System.out.println("Introduzca los valores de la segunda coordenada:");
		x2 = leerCoordenadas('X');
		y2 = leerCoordenadas('Y');
		System.out.print("\n");
		
		System.out.println("Introduzca los valores de la tercera coordenada:");
		x3 = leerCoordenadas('X');
		y3 = leerCoordenadas('Y');
		System.out.print("\n");
		
		if (y1 <= y2 && y1 <= y3) {
			if (y1 < y2 && y1 < y3) {
				System.out.println("El punto más bajo es: " + printCoordenada(x1, y1));
			} else if (y1 <= y2 && y1 < y3) {
				System.out.println("Los puntos más bajos son: " + printCoordenada(x1, y1) + " y " + printCoordenada(x2, y2));
			} else if (y1 < y2 && y1 <= y3) {
				System.out.println("Los puntos más bajos son: " + printCoordenada(x1, y1) + " y " + printCoordenada(x3, y3));
			}	
		} else if (y2 <= y1 && y2 <= y3) {
			if (y2 < y1 && y2 < y3) {
				System.out.println("El punto más bajo es: " + printCoordenada(x2, y2));
			} else if (y2 <= y1 && y2 < y3) {
				System.out.println("Los puntos más bajos son: " + printCoordenada(x2, y2) + " y " + printCoordenada(x1, y1));
			} else if (y2 < y1 && y2 <= y3) {
				System.out.println("Los puntos más bajos son: " + printCoordenada(x2, y2) + " y " + printCoordenada(x3, y3));
			}
			
		} else if (y3 < y1 && y3 < y2) {
			if (y3 < y1 && y3 < y2) {
				System.out.println("El punto más bajo es: " + printCoordenada(x3, y3));
			} else if (y3 <= y1 && y3 < y2) {
				System.out.println("Los puntos más bajos son: " + printCoordenada(x3, y3) + " y " + printCoordenada(x1, y1));
			} else if (y3 < y1 && y3 <= y2) {
				System.out.println("Los puntos más bajos son: " + printCoordenada(x3, y3) + " y " + printCoordenada(x2, y2));
			}
		} else {
			System.out.println("Todos los puntos son igual de bajos: " + printCoordenada(x1, y1) + ", " + printCoordenada(x2, y2) + " y " + printCoordenada(x3, y3));
		}
		
	}

	public static void puntosEspejadosHorizontalmente() {
		int x1, x2, y1, y2;
		System.out.println("Introduzca los valores de la primera coordenada:");
		x1 = leerCoordenadas('X');
		y1 = leerCoordenadas('Y');
		System.out.print("\n");
		
		System.out.println("Introduzca los valores de la segunda coordenada:");
		x2 = leerCoordenadas('X');
		y2 = leerCoordenadas('Y');
		System.out.print("\n");
		
		if (y1 == y2 && (Math.abs(x1) == x2 || Math.abs(x2) == x1)) {
			System.out.println(printCoordenada(x1, y1) + " y " + printCoordenada(x2, y2) + "están espejados porque la coordenada Y es igual (" + y1 + ") y las coordenadas X son opuestas " + printCoordenada(x1, x2));
		} else {
			System.out.println(printCoordenada(x1, y1) + " y " + printCoordenada(x2, y2) + "NO están espejados porque la coordenada Y NO es igual y las coordenadas X NO son opuestas ");
		}
}

	public static boolean esDiagonal(int x, int y) {
		if (Math.abs(x) == y || Math.abs(y) == x) {
			return true;
		}
		
		return false;
	}
	
	public static int cuentaDiagonales(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		int cuenta = 0;
		if (esDiagonal(x1, y1)) {
			cuenta ++;
		}
		
		if (esDiagonal(x2, y2)) {
			cuenta ++;
		}
		
		if (esDiagonal(x3, y3)) {
			cuenta ++;
		}
		
		if (esDiagonal(x4, y4)) {
			cuenta ++;
		}
		return cuenta;
	}
	
	public static void puntosEnLasDiagonales() {
		int x1, x2, y1, y2, x3, y3, x4, y4, cantidadDiagonales=0;
		System.out.println("Introduzca los valores de la primera coordenada:");
		x1 = leerCoordenadas('X');
		y1 = leerCoordenadas('Y');
		System.out.print("\n");
		
		System.out.println("Introduzca los valores de la segunda coordenada:");
		x2 = leerCoordenadas('X');
		y2 = leerCoordenadas('Y');
		System.out.print("\n");
		
		System.out.println("Introduzca los valores de la tercera coordenada:");
		x3 = leerCoordenadas('X');
		y3 = leerCoordenadas('Y');
		System.out.print("\n");
		
		System.out.println("Introduzca los valores de la cuarta coordenada:");
		x4 = leerCoordenadas('X');
		y4 = leerCoordenadas('Y');
		System.out.print("\n");
		
		cantidadDiagonales = cuentaDiagonales(x1, y1, x2, y2, x3, y3, x4, y4);
		
		if (cantidadDiagonales > 0) {
			System.out.print("Las coordenadas: ");
			if(esDiagonal(x1, y1)) {
				System.out.print(printCoordenada(x1, y1) + " ");
			}
			
			if(esDiagonal(x2, y2)) {
				System.out.print(printCoordenada(x2, y2) + " ");
			}
			
			if(esDiagonal(x3, y3)) {
				System.out.print(printCoordenada(x3, y3) + " ");
			}
			
			if(esDiagonal(x4, y4)) {
				System.out.print(printCoordenada(x4, y4) + " ");
			}
			System.out.print("Se encuentran en las Diagonales.");
		} else {
			System.out.println("Ninguna coordenada introducida se encuentra en una diagonal");
		}
}
	
	/*Realiza un programa que de manera indefinida hasta
	 * que el usuario decida salir de él, muestre
	 * en pantalla un menú con las opciones:
	 * 1. Punto más centrado
	 * 2. Punto más bajo
	 * 3. Puntos espejados horizontalmente
	 * 4. Puntos en las diagonales
	 * 5. Salir
	 * 
	 * En cada una de las opciones salvo en Salir,
	 * el programa debe pedir por teclado los datos
	 * correspondientes para realizar la opción correspondiente
	 * y mostrar el resultado.
	 * 
	 * La opcion púnto más centrado, debe leer coordenadas de
	 * dos puntos en el plano, es decir, sus coordenadas X e Y
	 * con el siguiente formato pantalla para cada punto:
	 * X =
	 * Y =
	 * 
	 * No se permiten puntos en el origen de coordenadas.
	 * A continuación el programa mostrará el punto cuya la
	 * distancia al origen de coordenadas sea menor. La distancia
	 * al origen de coordenadas es el resultado de raiz:
	 * ((x*x) + (y*y)).
	 * El formato de pantalla para mostrar un punto es:
	 * (valor de coordenada x, valor de coordenada y) -> distancia al origen
	 * Ej: (2, 3) -> 3,605
	 * 
	 * La opcion punto más bajo: lee 3 puntos, según el anterior formato
	 * y muestra por pantalla el punto que tenga la coordenada más pequeña.
	 * 
	 * La opcion puntos espejados horizontalmente, lee 2 puntos,
	 * según el formato anterior y muestra por pantalla un mensaje
	 * indicando si los dos puntos tienen el mismo valor de la coordenada y,
	 * al mismo tiempo que tienen la coordenada x opuestas, es decir,
	 * el mismo valor numérico pero de signo cambiado.
	 * Ej: (-3, 5) y (3, 5) están espejados porque la coordenada Y es igual (5)
	 * y las coordenadas X son opuestas (-3 y 3)
	 * 
	 * La opcion puntos en las diagonales: lee 4 puntos, y muestra
	 * por pantalla, con el anterior formato, los puntos que se encuentren
	 * en las bisectrices de los ejes de coordenadas, es decir los puntos
	 * que estén a la misma distancia del eje horizontal y vertical.
	 * Ej: el punto (-3, 3) se encuentra en las diagonales, porque su distancia
	 * al eje horizontal es 3 (abs(-3) = 3) y su distancia al eje vertical
	 * es 3 (abs(3)= 3)= son iguales, en cambio el punto (4, -2)
	 * no está en las diagonales por sus distancias a los ejes son 4 y 2
	 * respectivamente y no son iguales.
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programaAnalizarCoordenadas();
	}
	
}
