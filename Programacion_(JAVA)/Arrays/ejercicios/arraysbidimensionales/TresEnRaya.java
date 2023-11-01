package ejercicios.arraysbidimensionales;

import java.util.Scanner;

public class TresEnRaya {
	
	public static char ganador = '-';
	
	public static void iniciarTablero(char[][] tablero) {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}
	}
	
	public static boolean finPartida(char[][] tablero) {
		return hayTresEnRaya(tablero, 'X') ||
				hayTresEnRaya(tablero, 'O') ||
				tableroLleno(tablero);
		
	}
	
	
	public static boolean hayTresEnRaya(char[][] tablero, char jugador) {
		return hayDiagonalPrincipal(tablero, jugador) ||
				hayDiagonalSecundaria(tablero, jugador) ||
				hayColumna(tablero, jugador) ||
				hayFila(tablero, jugador);
	}
	
	public static boolean hayColumna(char[][] tablero, char jugador) {
		boolean resultado = false;
		for(int i = 0; i < tablero.length; i++) {
			if (hayColumnaNumero(tablero, i, jugador)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	public static boolean hayFila(char[][] tablero, char jugador) {
		boolean resultado = false;
		for(int i = 0; i < tablero.length; i++) {
			if (hayFilaNumero(tablero, i, jugador)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	public static boolean hayDiagonalPrincipal(char[][] tablero, char jugador) {
		boolean resultado = true;
		for(int i = 0; i < tablero.length; i++) {
			if(tablero[i][i] != jugador) {
				resultado = false;
			}
		}
		return resultado;
			
	}
	
	public static boolean hayDiagonalSecundaria(char[][] tablero, char jugador) {
		boolean resultado = true;
		for(int i = 0; i < tablero.length; i++) {
			if(tablero[i][tablero.length-1-i] != jugador) {
				resultado = false;
			}
		}
		
		return resultado;
	}
	
	public static boolean hayColumnaNumero(char[][] tablero, int columna, char jugador) {
		for(int i = 0; i < tablero.length; i++) {
			if(tablero[i][columna] != jugador) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean hayFilaNumero(char[][] tablero, int fila, char jugador) {
		for(int i = 0; i < tablero[fila].length; i++) {
			if(tablero[fila][i] != jugador) {
				return false;
			}
		}
		return true;
	}

	
	public static boolean tableroLleno(char[][] tablero) {
		boolean resultado = true;
		
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				if(posicionLibre(tablero, i, j)) {
					resultado = false;
				}
			}
		}
		return resultado;
	}
	
	/*
	public static boolean finPartida(char[][] tablero) {
		boolean fin = false, gana_X = false, gana_O = false;
		int d1_X = 0;
		int d1_O = 0;
		int d2_X = 0;
		int d2_O = 0;
		int col1_X = 0;
		int col1_O = 0;
		int col2_X = 0;
		int col2_O = 0;
		int col3_X = 0;
		int col3_O = 0;
		int row_X = 0;
		int row_O = 0;
		int sinFicha = 9;
		
		for(int i = 0; i < tablero.length && !fin; i++) {
			for(int j = 0; j < tablero[i].length && !fin; j++) {
				if (i == 0) {
					switch(j) {
					case 0:
						if(estaLaFicha(tablero, i, j, 'X')) {
							d1_X++;
							row_X++;
							col1_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							d1_O++;
							row_O++;
							col1_O++;
							sinFicha--;
						}
						break;
					case 1:
						if(estaLaFicha(tablero, i, j, 'X')) {
							row_X++;
							col2_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							row_O++;
							col2_O++;
							sinFicha--;
						}
						break;
					case 2:
						if(estaLaFicha(tablero, i, j, 'X')) {
							d2_X++;
							row_X++;
							col3_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							d2_O++;
							row_O++;
							col3_O++;
							sinFicha--;
						}
						break;
					}
				} else if (i == 1) {
					switch(j) {
					case 0:
						if(estaLaFicha(tablero, i, j, 'X')) {
							row_X++;
							col1_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							row_O++;
							col1_O++;
							sinFicha--;
						}
						break;
					case 1:
						if(estaLaFicha(tablero, i, j, 'X')) {
							d1_X++;
							d2_X++;
							row_X++;
							col2_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							d1_O++;
							d2_O++;
							row_O++;
							col2_O++;
							sinFicha--;
						}
						break;
					case 2:
						if(estaLaFicha(tablero, i, j, 'X')) {
							row_X++;
							col3_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							row_O++;
							col3_O++;
							sinFicha--;
						}
						break;
					}
				} else if (i == 2) {
					switch(j) {
					case 0:
						if(estaLaFicha(tablero, i, j, 'X')) {
							d2_X++;
							row_X++;
							col1_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							d2_O++;
							row_O++;
							col1_O++;
							sinFicha--;
						}
						break;
					case 1:
						if(estaLaFicha(tablero, i, j, 'X')) {
							row_X++;
							col2_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							row_O++;
							col2_O++;
							sinFicha--;
						}
						break;
					case 2:
						if(estaLaFicha(tablero, i, j, 'X')) {
							d1_X++;
							row_X++;
							col3_X++;
							sinFicha--;
						} else if (estaLaFicha(tablero, i, j, 'O')) {
							d1_O++;
							row_O++;
							col3_O++;
							sinFicha--;
						}
						break;
					}
				}
			}
			
			//Si no ha habido en esa columna 3 'X' || 'O'
			if (row_X == 3) {
				ganador = 'X';
				return true;
			} else {
				row_X = 0;
			}
			
			if (row_O == 3) {
				ganador = 'O';
				return true;
			} else {
				row_O = 0;
			}
			
			if(col1_X == 3 || col2_X == 3 || col3_X == 3 || d1_X == 3 || d2_X == 3) {
				ganador = 'X';
				return true;
			} else if (col1_O == 3 || col2_O == 3 || col3_O == 3|| d1_O == 3 || d2_O == 3) {
				ganador = 'O';
				return true;
			}
			
			if (sinFicha <= 0) {
				ganador = '-';
				return true;
			}
			/*
			 * X | 0 | X  ->  0,0 | 0,1 | 0,2
			 * 0 | 0 | X  ->  1,0 | 1,1 | 1,2
			 * X | 0 | -  ->  2,0 | 2,1 | 2,2
			 * 
			//switch(tablero[i])
		}
		
		return false;
	}
	*/
	
	//public static void comprobarDiagonales(char[][] tablero, int columna)
	
	/*
	public static boolean estaLaFicha(char[][] tablero, int fila, int columna, char ficha) {
		if (tablero[fila][columna] == ficha) {
			return true;
		} else {
			return false;
		}
	}*/
	
	/*
	public static void gana(char pj) {
		System.out.println("Ha ganado el jugador " + pj);
	}*/
	
	
	public static void mostrarTablero(char[][] tablero) {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length ; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static char cambiarJugador(char jugador) {
		char resultado = 'X';
		if (jugador == 'X') {
			resultado = 'O';
		}
		return resultado;
	}
	
	public static boolean posicionValida(char[][] tablero, int fila, int columna) {
		return (fila >= 0 && fila < tablero.length
				&& columna >= 0 && columna < tablero[fila].length);
		
	}
	
	public static void ponerFicha(char[][] tablero, char jugador) {
		Scanner teclado = new Scanner(System.in);
		int fila = 0, columna = 0;
		
		System.out.println("Juega el jugador '" + jugador + "'");
		
		do {
		System.out.print("Introduce la posición de la fila: ");
		fila = teclado.nextInt();
		
		System.out.print("Introduce la posición de la columna: ");
		columna = teclado.nextInt();
		
		
		if (!posicionLibre(tablero, fila, columna)) {
			if(!posicionValida(tablero, fila, columna)) {
				System.out.println("Error, por favor selecciona una posición válida.");
			} else {
				System.out.println("Esa posición ya está ocupada, selecciona otra.");
			}
		}
		
		} while (!posicionLibre(tablero, fila, columna));
		
		tablero[fila][columna] = jugador;
	}
	
	
	public static boolean posicionLibre(char[][] tablero, int fila, int columna) {
		if(!posicionValida(tablero, fila, columna)) {
			return false;
		}
		
		return tablero[fila][columna] == '-';
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tablero = new char[3][3];
		iniciarTablero(tablero);
		char jugador = 'X';
		
		do {
			mostrarTablero(tablero);
			jugador = cambiarJugador(jugador);
			ponerFicha(tablero, jugador);
		} while(!finPartida(tablero));
		
		mostrarTablero(tablero);
		
		if(hayTresEnRaya(tablero, jugador)) {
			System.out.println("ENHORABUENA, ha ganado el jugador '" + jugador + "'!!!!");
		} else {
			System.out.println("Tablas!!!");
		}
		
		//INFORMAR DE TABLAS O FELICITAR GANADOR
	}

}
