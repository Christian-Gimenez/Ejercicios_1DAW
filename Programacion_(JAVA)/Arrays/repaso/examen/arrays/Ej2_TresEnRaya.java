package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej2_TresEnRaya {
	
	public static boolean hayColumna(char[][] tablero, char jugador) {
		return columnaCompleta(tablero, 0, jugador) ||
				columnaCompleta(tablero, 1, jugador) ||
				columnaCompleta(tablero, 2, jugador);
	}
	
	public static boolean hayFila(char[][] tablero, char jugador) {
		return filaCompleta(tablero, 0, jugador) ||
				filaCompleta(tablero, 1, jugador) ||
				filaCompleta(tablero, 2, jugador);
	}
	
	public static char gana(char[][] tablero) {
		char ganador = '-';
		if (hayTresEnRaya(tablero, 'X')) {
			ganador = 'X';
		} else if (hayTresEnRaya(tablero, 'O')) {
			ganador = 'O';
		}
		return ganador;
	}
	
	public static boolean hayTresEnRaya(char[][] tablero, char jugador) {
		return hayColumna(tablero, jugador) ||
				hayFila(tablero, jugador) ||
				diagonalPrincipal(tablero, jugador) ||
				diagonalSecundaria(tablero, jugador);
	}
	
	public static boolean diagonalSecundaria(char[][] tablero, char jugador) {
		boolean hayDiagonal = true;
		for(int i = 0; i < tablero.length; i++) {
			if (tablero[tablero.length - 1 - i][i] != jugador) {
				hayDiagonal = false;
			}
		}
		return hayDiagonal;
	}
	
	public static boolean diagonalPrincipal(char[][] tablero, char jugador) {
		boolean hayDiagonal = true;
		for(int i = 0; i < tablero.length; i++) {
			if (tablero[i][i] != jugador) {
				hayDiagonal = false;
			}
		}
		return hayDiagonal;
	}
	
	public static boolean columnaCompleta(char[][] tablero, int columna, char jugador) {
		boolean hayColumna = true;
		for(int i = 0; i < tablero.length; i++) {
			if (tablero[i][columna] != jugador) {
				hayColumna = false;
			}
		}
		return hayColumna;
	}
	
	public static boolean filaCompleta(char[][] tablero, int fila, char jugador) {
		boolean hayFila = true;
		for(int i = 0; i < tablero[fila].length; i++) {
			if (tablero[fila][i] != jugador) {
				hayFila = false;
			}
		}
		return hayFila;
	}
	public static char cambiarJugador(char jugador) {
		return (jugador == 'X')? 'O' : 'X'; 
	}
	
	public static boolean posicionValida(int fila, int columna) {
		return (fila >= 0 && fila <= 3) &&
				(columna >= 0 && columna <= 3);
	}
	
	public static boolean posicionLibre(int fila, int columna, char[][] tablero) {
		return tablero[fila][columna] != 'X' && tablero[fila][columna] != 'O';
	}
	
	public static boolean ponerFicha(char[][] tablero, char ficha) {
		boolean poner = false;
		int fila = Teclado.leerInt("Fila: ") - 1;
		int columna = Teclado.leerInt("Columna: ") - 1;
		if (posicionValida(fila, columna)) {
			if (posicionLibre(fila, columna, tablero)) {
				tablero[fila][columna] = ficha;
				poner = true;
			} else {
				System.out.println("La posición indicada ya está ocupado por '" + tablero[fila][columna] + "'.");
			}
		} else {
			System.out.println("Error. La posición indicada no es válida.");
		}
		return poner;
	}
	
	public static char cambiarPorEspacio(char ficha) {
		return (ficha == 'X' || ficha == 'O')? ficha : ' ';
	}
	
	public static void printTablero(char[][] tablero) {
		System.out.println("    1   2   3  ");
		System.out.println("  .-----------.");
		for(int i = 0; i < tablero.length; i++) {
			System.out.println((i+1)+ " | " + cambiarPorEspacio(tablero[i][0]) + " | " +
													cambiarPorEspacio(tablero[i][1]) + " | " +
													cambiarPorEspacio(tablero[i][2]) + " |");
			if (i != 2) {
				System.out.println("  |-----------|");
			} else {
				System.out.println("  '-----------'");
			}
			
		}
	}
	
	public static void inicializarTablero(char[][] tablero) {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}
	}
	
	public static boolean tablas(char[][] tablero) {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				if (posicionLibre(i, j, tablero)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean finPartida(char[][] tablero, char ganador) {
		return tablas(tablero) || ganador != '-';
	}

	public static void main(String[] args) {
		char [][] tablero = new char[3][3];
		char jugador = 'O';
		char ganador = '-';
		inicializarTablero(tablero);
		System.out.println("Bienvenido al juego de 3 en Raya :)");
		do {
			printTablero(tablero);
			jugador = cambiarJugador(jugador);
			System.out.println("Es el turno del jugador '" + jugador + "':");
			if (ponerFicha(tablero, jugador)) {
				ganador = gana(tablero);
			} else {
				jugador = cambiarJugador(jugador);
			}
		} while (!finPartida(tablero, ganador));
		printTablero(tablero);
		if (ganador == '-') {
			System.out.println("Ha habido TABLAS, ya no hay más posiciones libres :(");
		} else {
			System.out.println("¡¡ENHORABUENA jugador '" + jugador + "'!!\n       Has ganado :)");
		}

	}

}
