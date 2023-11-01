package org.villablanca;

import daw.com.Teclado;

public class Main {
	
	public static int mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("1.-Crear agenda ");
			System.out.println("2.-Añadir contacto ");
			System.out.println("3.-Existe contacto ");
			System.out.println("4.-Listar contactos ");
			System.out.println("5.-Buscar contacto ");
			System.out.println("6.-Eliminar contacto ");
			System.out.println("7.-Agenda llena ");
			System.out.println("8.-Numero de huecos libres ");
			System.out.println("9.-Salir ");
			System.out.print("-> ");
			opcion = Teclado.leerInt();
		} while(opcion < 1 || opcion >9);
		
		return opcion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		Agenda agenda = null;
		while(opcion != 9) {
			opcion = mostrarMenu();
			if(agenda == null && opcion != 1) {
				System.out.println("Error. No tienes ninguna agenda, primero crea una para poder realizar gestiones con ella.");
			} else {
				switch (opcion) {
				case 1:
					
					if(agenda == null) {
						System.out.println("¿Quieres indicar el número de contactos? (S/N)");
						char respuesta = Teclado.leerString().charAt(0);
						if (Character.toUpperCase(respuesta) == 'S') {
							System.out.println("Número de contactos: ");
							int numeroContactos = Teclado.leerInt();
							agenda = new Agenda(numeroContactos);
						} else {
							agenda = new Agenda();
						}
					} else {
						System.out.println("No se puede crear otra agenda.");
					}
					
					break;
					
				case 2:
					System.out.println("Nombre del nuevo contacto: ");
					String nombre = Teclado.leerString();
					System.out.println("Número de teléfono: ");
					int numero = Teclado.leerInt();
					Contacto contacto = new Contacto(nombre, numero);
					boolean seHaCreado = agenda.aniadirContacto(contacto);
					if (!seHaCreado && !agenda.agendaLlena()) {
						System.out.println("Error. Ese contacto ya existe!");
					} else if (seHaCreado) {
						System.out.println("Contacto añadido correctamente a la agenda.");
					} else {
						System.out.println("Agenda llena! Ya no se pueden agregar más contactos.");
					}
					break;
					
				case 3:
					System.out.println("Nombre del contacto: ");
					nombre = Teclado.leerString();
					boolean existe = agenda.existeContacto(nombre);
					System.out.println("El contacto " + nombre + (agenda.existeContacto(nombre)? " existe":" no existe"));
					break;
					
				case 4:
					System.out.println(agenda.listarContactos());
					break;
					
				case 5:
					System.out.println("Dame el nombre: ");
					nombre = Teclado.leerString();
					numero = agenda.buscaContacto(nombre);
					if (numero != -1) {
						System.out.println("Su nº Telefono es: " + numero);
					} else {
						System.out.println("No existe el contacto");
					}
					break;
					
				case 6:
					System.out.println("Nombre contacto a eliminar:");
					nombre = Teclado.leerString();
					boolean seBorro = agenda.eliminarContacto(nombre);
					if (seBorro) {
						System.out.println("Se ha eliminado " + nombre + " de la agenda");
					} else {
						System.out.println("Error. No se pudo eliminar porque el contacto no existe en la agenda");
					}
					break;
					
				case 7:
					if (agenda.agendaLlena()) {
						System.out.println("La agenda llena.");
					} else {
						System.out.println("La agenda todavía no esta llena.");
					}
					break;
				case 8:
					System.out.println("Actualmente hay " + agenda.huecosLibres() + " huecos libres en la agenda.");
					break;
				case 9:
					System.out.println("Programa finalizado");
					break;
				default:
					System.out.println("Opción incorrecta.");
					break;
					
				}
				
			} 
		
			
		}
	}

}
