package ejercicios.clase.arrays;

import daw.com.Teclado;

public class Ejercicio24 {
	
	public static void asignarTurno(boolean datos[][][]) {
		int sala, pc, hora, turno, opcion;
		do {
			
			System.out.println("Seleccione una opción (1-3):");
			System.out.println("1) Asignar turno.");
			System.out.println("2) Cancelar turno.");
			System.out.println("3) Mostrar Mapa de nuevo.");
			System.out.print(": ");
			opcion = Teclado.leerInt();
			
			if ((opcion > 2 && opcion != 3) || opcion <= 0) {
				System.out.println("Error, por favor introduzca una opción válida.");
			}
		} while (opcion > 2 || opcion <= 0);
		
		do {
			System.out.print("Por favor, indica la sala (1-5): ");
			sala = Teclado.leerInt();
			
			if (sala > 5 || sala <= 0) {
				System.out.println("Error, por favor introduzca una sala válida.");
			}
		} while (sala > 5 || sala <= 0);
		
		do {
			System.out.print("Por favor, indique el equipo que desea reservar (1-20): ");
			pc = Teclado.leerInt();
			
			if (pc > 20 || pc <= 0) {
				System.out.println("Error, por favor introduzca un equipo válido.");
			}
		} while (pc > 20 || pc <= 0);
		
		do {
			System.out.print("Seleccione un horario (1º Turno / 2º Turno): ");
			turno = Teclado.leerInt();
			
			if (turno > 2 || turno <= 0) {
				System.out.println("Error, por favor introduzca un horario válido (1/2).");
			}
				
		} while(turno > 2 || turno <= 0);
		
		if (opcion == 1) {
			datos[sala-1][pc-1][turno-1] = true;
			System.out.print("Se ha RESERVADO el equipo " + pc + " en la sala " + sala + " en el turno ");
			if (turno == 1) {
				System.out.print("de 12am a 1pm con éxito :)\n");
			} else {
				System.out.print("de 1pm a 2pm con éxito :)\n");
			}
		} else {
			if (datos[sala-1][pc-1][turno-1] == false) {
				System.out.println("El equipo seleccionado ya se encontraba libre de reservas.");
			} else {
				datos[sala-1][pc-1][turno-1] = false;
				System.out.print("Se ha CANCELADO la reserva del equipo " + pc + " en la sala " + sala + " en el turno ");
				if (turno == 1) {
					System.out.print("de 12am a 1pm con éxito.\n");
				} else {
					System.out.print("de 1pm a 2pm con éxito.\n");
				}	
			}
			
		}
		
		
	
	}
	
	/*
	public static int cuentaBooleanos(boolean datos[][][], boolean aBuscar, int dimension) {
		for(int i = 0; i < datos.length; i++) {
			for(int )
		}
	}*/
	
	public static void cantidadEquiposDisponibles(boolean datos[][][]) {
		int sala, disponiblesT1=0, disponiblesT2=0, totalmenteDisponibles=0;
		do {
			System.out.print("Introduzca la sala: ");
			sala = Teclado.leerInt();
			
			if (sala > 5 || sala <= 0) {
				System.out.println("Por favor, introduzca una sala válida (1-5).");
			}
		} while (sala > 5 || sala <= 0);
		
		for(int i = 0; i < datos[sala-1].length; i++) {
			if (datos[sala-1][i][0] == false) {
				System.out.println("Ordenador " + (i+1) + " Disponible de 12am a 1pm.");
				disponiblesT1++;
				if (datos[sala-1][i][1] == false) {
					System.out.println("Y también de 1pm a 2pm.");
					disponiblesT2++;
					totalmenteDisponibles++;
				}
			} else {
				if (datos[sala-1][i][1] == false) {
					System.out.println("Ordenador " + (i+1) + " Disponible de 1pm a 2pm.");
					disponiblesT2++;
				}
			}
		}
		
		System.out.println("\nActualmente hay: ");
		if (totalmenteDisponibles > 0) {
			System.out.println(totalmenteDisponibles + " equipos totalmentes disponibles en la sala " + sala);
		}
		System.out.print((disponiblesT1 - totalmenteDisponibles) + " Disponibles sólo de 12am a 1pm.");
		System.out.println(" y " + (disponiblesT2-totalmenteDisponibles) + " Disponibles sólo de 1pm a 2pm.");
		System.out.println();
	}
	
	public static void cantidadTurnosAsignados(boolean datos[][][]) {
		int cantidad = 0;
		int totalTurnos = 5 * 20 * 2;
		for(int i = 0; i < datos.length; i++) {
			for(int j = 0; j < datos[i].length; j++) {
				for(int k = 0; k < datos[i][j].length; k++) {
					if (datos[i][j][k] == true) {
						cantidad++;
					}
				}
			}
		}
		System.out.println("Hay un total de " + cantidad + " turnos asignados en toda la Universidad.");
		System.out.println();
	}
	
	public static void imprimirMapa(boolean datos[][][]) {
		for(int i = 0; i < datos.length; i++) {
			System.out.println("Sala " + (i+1) + ":");
			for(int j = 0; j < datos[i].length; j++) {
				System.out.println("  Ordenador " + (j+1) + ":");
				for(int k = 0; k < datos[i][j].length; k++) {
					if (k == 0) {
						System.out.print("    12am a 1pm: ");
					} else {
						System.out.print("    1pm a 2pm: ");
					}
					if(datos[i][j][k] == true) {
						System.out.print("Ocupado\n");
					} else {
						System.out.print("Libre\n");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void menu(boolean[][][] datos) {
		int opcion = 0;
		System.out.println("Bienvenido al sistema de gestion de reservas de equipos de la UCPR.");

		do {
			/*Sala 1:
			 * 	Ordenador 1:
			 * 	    12 a 1: Libre
			 * 		1 a 2: Ocupado
			 * */
			System.out.println();
			System.out.println("Seleccione la opción que desee realizar:");
			System.out.println("1. Asignar o cancelar turno.");
			System.out.println("2. Cantidad de equipos disponibles por sala.");
			System.out.println("3. Cantidad de turnos asignados en toda la Universidad.");
			System.out.println("4. Mostrar mapa.");
			System.out.println("5. Salir.");
			System.out.print(": ");
			opcion = Teclado.leerInt();
			switch(opcion) {
			case 1:
				asignarTurno(datos);
				break;
			case 2:
				cantidadEquiposDisponibles(datos);
				break;
			case 3:
				cantidadTurnosAsignados(datos);
				break;
			case 4:
				imprimirMapa(datos);
				break;
			case 5:
				System.out.println("Programa finalizado");
				break;
			default: 
				System.out.println("Opción incorrecta.");
				break;
				
			}
		} while (opcion != 5);
	}
	
	static final int SALAS = 5;
	static final int ORDENADORES = 20;
	static final int TURNOS = 2;

	public static void main(String[] args) {
		//boolean datos[sala][ordenador][turno]
		//boolean datos[0-4][0-19][0-1]
		boolean[][][] datosReserva = new boolean[SALAS][ORDENADORES][TURNOS];
		menu(datosReserva);

	}

}
