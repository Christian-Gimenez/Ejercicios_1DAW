package organizacion.departamento;

public class Main {
	/*Gestión de reservas
       El Departamento de Sistemas de la Universidad cuenta con cinco SALAS de ordenadores,
       cada una de ellas con 20 ORDENADORES, de cada ordenador interesa su puesto (numero incremental)
       y si está o no ocupado.
       Se requiere sistematizar el proceso de reserva o cancelación de TURNOS
       para dichas salas en el horario disponible, habra dos horarios:
       Mañana (hora inicio: 8h, hora fin: 14h)
       Tarde (hora inicio: 16h, hora fin: 20:h)
       
       Construir un programa que solicite al usuario la siguiente información
       (SALA, ORDENADOR), tanto para asignar TURNO como para cancelarlo.
       Igualmente, el programa deberá permitir conocer el numero de equipos disponibles (sin asignar) por sala,
       y el número total de turnos asignado (todas las salas).
       
       Tener en cuenta que el programa deberá funcionar permanentemente mostrando un menú de opciones así:
       1. Asignar o cancelar turno
       2. Cantidad de equipos disponibles por sala, tanto en el 1º turno, como en el 2º, como en ambos turnos.
       3. Cantidad de turnos asignados en toda la Universidad
       4. Mostrar mapa.
       5. Salir
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 salas
		Sala sala1 = new Sala("Sala nº1");
		System.out.println(sala1.turnoManana() + "\n" + sala1.turnoTarde());
		
		/*
		 * Sala
		 * ----ordenadores[i].cambiarTurnoManana()
		 * -----------------Turnos
		 * */
	}

}
