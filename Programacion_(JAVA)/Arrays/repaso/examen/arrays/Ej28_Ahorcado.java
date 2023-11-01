package repaso.examen.arrays;

import daw.com.Teclado;

public class Ej28_Ahorcado {
	
	public static void matarAlAhorcado(char[][] ahorcado, int trys) {
		switch (trys) {
		case 1: 
			primerIntento(ahorcado);
			break;
		case 2: 
			segundoIntento(ahorcado);
			break;
		case 3: 
			tercerIntento(ahorcado);
			break;
		case 4: 
			cuartoIntento(ahorcado);
			break;
		case 5: 
			quintoIntento(ahorcado);
			break;
		default:
			break;			
		}
	}
	
	public static void primerIntento(char[][] ahorcado) {
		ahorcado[1][4] = 'O';
	}
	
	public static void segundoIntento(char[][] ahorcado) {
		ahorcado[2][3]= '/';
		ahorcado[2][5] = '\\';	
	}
	
	public static void tercerIntento(char[][] ahorcado) {
		ahorcado[2][4] = '|';
	}
	
	public static void cuartoIntento(char[][] ahorcado) {
		ahorcado[3][4] = '|';
	}
	
	public static void quintoIntento(char[][] ahorcado) {
		ahorcado[4][3] = '/';
		ahorcado[4][5] = '\\';
	}
	
	public static boolean gana2Jugador(char[] intentos, char[] secreta) {
		for(int i = 0; i < intentos.length; i++) {
			if (intentos[i] != secreta[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static char[] inicializarIntentos(char[] secreta) {
		char[] intentos = new char[secreta.length];
		for(int i = 0; i < intentos.length; i++) {
			intentos[i] = '*';
		}
		return intentos;
	}
	
	public static void limpiarPantalla() {
		for(int i = 0; i < 30; i++) {
			System.out.println();
		}
	}
	
	public static char[] meterStringEnArrayChar(String palabra) {
		char[] secreta = new char[palabra.length()];
		for(int i = 0; i < secreta.length && i < palabra.length(); i++) {
			secreta[i] = palabra.charAt(i);
		}
		return secreta;
	}
	
	public static boolean introducirLetra(char[] intentos ,char[] secreta, char letra) {
		boolean seEncuentra = false;
		for(int i = 0; i < secreta.length; i++) {
			if (Character.toUpperCase(secreta[i]) == Character.toUpperCase(letra)) {
				seEncuentra = true;
				intentos[i] = secreta[i];
			}
		}
		return seEncuentra;
	}
	
	public static void pedirLetra(char[] intentos, char[] secreta) {
		boolean correcta = false;
		boolean fallo = true;
		String in = "";
		char letra;
		do {
			System.out.println("Introduce una letra (A-Z): ");
			in = Teclado.leerString();
			if (in.length() <= 1) {
				letra = in.charAt(0);
				if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
					correcta = introducirLetra(intentos, secreta, letra);
					fallo = false;
					if (!correcta) {
						System.out.println("La letra introducida no está :(");
					} else {
						System.out.println("¡¡Letra correcta :) !!");
					}
				} else {
					System.out.println("ERROR. Introduce una letra válida (A-Z).");
					fallo = true;
				}
			} else {
				System.out.println("ERROR. Por favor, introduce sólo una letra.");
			}
			
		} while (fallo);
	}
	
	public static void printPalabra(char[] secreta) {
		for(int i = 0; i < secreta.length; i++) {
			System.out.print(" " + secreta[i]);
		}
		System.out.println(" ");
	}
	
	public static char[][] inicializarAhorcado() {
		char[][] ahorcado = new char[6][6];
		
		for(int i = 0; i < ahorcado.length; i++) {
			for(int j = 0; j < ahorcado[i].length; j++) {
				if(i == 0 && j != 0) {
					if (j == i+1 || j == ahorcado[0].length-2) {
						ahorcado[i][j] = '+';
					} else if (j > 0 && j < ahorcado[0].length-1) {
						ahorcado[i][j] = '-';
					} else {
						ahorcado[i][j] = ' ';
					}
				} else if (i == ahorcado.length-1 && j != 0) {
					ahorcado[i][j] = '_';
				} else {
					if (j == 0) {
						ahorcado[i][j] = '|';
					} else {
						ahorcado[i][j] = ' ';
					}
				}
			}
		}
		
		/*
		for(int i = 0; i < ahorcado.length; i++) {
			if (i == 0) {
				for(int j = 0; j < ahorcado[0].length; j++) {
					if (j == i+1 || j == ahorcado[0].length-1) {
						ahorcado[i][j] = '+';
					} else {
						ahorcado[i][j] = '-';
					}
				}
			} else if (i == ahorcado.length-1) {
				for(int j = 0; j < ahorcado[ahorcado.length-1].length; j++) {
					ahorcado[i][j] = '_';
				}
			}
			ahorcado[i][0] = '|';
		} */
		return ahorcado;
	}
	
	public static void printAhorcado(char[][] ahorcado) {
		System.out.println();
		for(int i = 0; i < ahorcado.length; i++) {
			for(int j = 0; j < ahorcado[i].length; j++) {
				System.out.print(ahorcado[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void felicitarGanador(int trys, char[] secreta) {
		System.out.println("¡¡ENHORABUENA!! Has ganado en " + trys + " intentos :)");
		System.out.print("La palabra secreta era: ");
		printPalabra(secreta);
	}

	public static void main(String[] args) {
		/*Hacer un ahorcado, pedir una palabra y que vayan diciendo letras,
		 * si la adivinan se le pone en la posición, si no, se le suma un fallo(max 5)
		 * por ejemplo:
			si te dicen la palabra casa muestra " * * * * " y ve pidiendo letras,
			si dicen la A, mostrar " * a * a " y así hasta que adivinen o fallen.
		 *  |+-+     4
		 *  |    O     6 
		 *  |   /l\     8
		 *  |     l      7
		 *  |    /\     7
		 *  |______   8
		 * 
		 * */
		int trys = 0;
		boolean gana = false;
		char[][] ahorcado = inicializarAhorcado();
		System.out.println("Bienvenido al juego del:\n****A H O R C A D O****");
		System.out.println("1º Jugador, introduce la palabra secreta: ");
		String secret = Teclado.leerString();
		char[] secreta = meterStringEnArrayChar(secret.toUpperCase());
		char[] intentos = inicializarIntentos(secreta);
		limpiarPantalla();
		System.out.println("2º Jugador, es tu turno:");
		do {
			printAhorcado(ahorcado);
			System.out.print("Palabra a adivinar: ");
			printPalabra(intentos);
			pedirLetra(intentos, secreta);
			gana = gana2Jugador(intentos, secreta);
			if (gana) {
				felicitarGanador(++trys, secreta);
			} else {
				matarAlAhorcado(ahorcado, ++trys);
			}
		} while (trys < 5 && !gana);
		
		if (!gana) {
			printAhorcado(ahorcado);
			System.out.println("Se te acabaron los intentos :(");
			System.out.println("Última oportunidad, cual crees que es la palabra secreta: ");
			String ultimoIntento = Teclado.leerString();
			intentos = meterStringEnArrayChar(ultimoIntento.toUpperCase());
			gana = gana2Jugador(intentos, secreta);
			if (gana) {
				felicitarGanador(trys, secreta);
			} else {
				System.out.println("Has perdido...\n*****G A M E   O V E R*****");
				printAhorcado(ahorcado);
			}
			
		}
		
		
	}

}
