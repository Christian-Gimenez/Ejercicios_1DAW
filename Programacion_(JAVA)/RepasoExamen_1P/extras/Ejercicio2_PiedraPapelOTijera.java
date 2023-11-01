package examen.extras;

import java.util.*;

public class Ejercicio2_PiedraPapelOTijera {
	
	public static String transcribirOpcion(char opcion) {
		if (opcion == 'A') {
			return "PIEDRA";
		} else if (opcion == 'B') {
			return "PAPEL";
		} else if (opcion == 'C') {
			return "TIJERA";
		} else {
			return "!";
		}
	}
	
	public static boolean opcionCorrecta(char opcion) {
		if (opcion == 'A') {
			return true;
		} else if (opcion == 'B') {
			return true;
		} else if (opcion == 'C') {
			return true;
		} else {
			return false;
		}
	}
	
	public static char aleatorio() {
		String rango = "ABC";
		Random random = new Random();
		char cpu = rango.charAt(random.nextInt(rango.length()));
		return cpu;
	}
	
	public static char leerOpcion() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().charAt(0);
	}
	
	public static char comprobarJugada(char jugador1, char jugador2) {
		//piedra (A), papel (B) y tijera(C)
		jugador1 = Character.toUpperCase(jugador1);
		jugador2 = Character.toUpperCase(jugador2);
		char ganador = ' ';
		
		if (jugador1 == 'A' && jugador2 == 'B') {
			//System.out.println("Piedra < Papel");
			ganador = jugador2;
			
		} else if (jugador1 == 'A' && jugador2 == 'C') {
			//System.out.println("Piedra > Tijera");
			ganador = jugador1;
			
		} else if (jugador1 == 'B' && jugador2 == 'A') {
			//System.out.println("Papel > Piedra");
			ganador = jugador1;			
			
		} else if (jugador1 == 'B' && jugador2 == 'C') {
			//System.out.println("Papel < Tijera");
			ganador = jugador2;
			
		} else if (jugador1 == 'C' && jugador2 == 'A') {
			//System.out.println("Tijera < Piedra");
			ganador = jugador2;
			
		} else if (jugador1 == 'C' && jugador2 == 'B') {
			//System.out.println("Tijera > Papel");
			ganador = jugador1;
		} else {
			//System.err.println("Empate");
			ganador = '=';
		}
		
		return ganador;
	}

	public static void piedraPapelTijera() {
		int jugador=0, cpu=0;
		char opJugador, opCPU, ganador;
		System.out.println("----BIENVENIDX AL JUEGO: PIEDRA | PAPEL | TIJERA----");
		System.out.println("----Reglas:");
		System.out.println("*-Introduce sólo el caracter de la opción que elijas.");
		System.out.println("*-Gana quien llegue a 3 victorias");
		System.out.print("\n");
		
		while(jugador < 3 && cpu < 3) {
			System.out.println("(A) Piedra");
			System.out.println("(B) Papel");
			System.out.println("(C) Tijera");
			System.out.println("Elige una de las 3 opciones [ A | B | C ]:");
			System.out.print("-> ");
			opJugador = Character.toUpperCase(leerOpcion());
			
			
			if (opcionCorrecta(opJugador)) {
				opCPU = aleatorio();
				ganador = comprobarJugada(opJugador, opCPU);
				
				if (ganador == opJugador) {
					System.out.println("(JUGADOR-> " + transcribirOpcion(opJugador) + ") > (CPU-> " + transcribirOpcion(opCPU) + ")");
					System.out.println("\nHas ganado esta ronda!");
					jugador++;
				} else if (ganador == opCPU) {
					System.out.println("(JUGADOR-> " + transcribirOpcion(opJugador) + ") < (CPU-> " + transcribirOpcion(opCPU) + ")");
					System.out.println("\nHas perdido esta ronda :( ");
					cpu++;
				} else {
					System.out.println("(JUGADOR-> " + transcribirOpcion(opJugador) + ") == (CPU-> " + transcribirOpcion(opCPU) + ")");
					System.out.println("\nHabéis EMPATADO, ambos sacasteis: " + transcribirOpcion(opCPU));
				}
			} else {
				System.out.println("Introdujiste mal tu opción, por favor, vuelve a intentarlo.");
			}
			System.out.print("\n");
		}
		
		System.out.println("Resultado: (JUGADOR) " + jugador + " - (CPU) " + cpu);
		
		if (jugador >= 3) {
			System.out.println("¡HAS GANADO! Enhorabuena :)");
		} else {
			System.out.println("GAME OVER... Has perdido :(");
		}
	}
	
	public static void main(String[] args) {
		/* juego de piedra, papel o tijera,
		 * estableciendo valores: piedra (A), papel (B) y tijera(C)
		 * Hacer que segun sea una cosa, A gana a C, C gana a B y B gana a A
		 * */
		piedraPapelTijera();
		
		
	}

}
