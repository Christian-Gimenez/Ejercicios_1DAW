package org.villablanca;

public class Agenda {
	private int numero;
	private Contacto[] contactos;
	
	public Agenda() { 
		numero = 0;
		contactos = new Contacto[10];
	}
	
	public Agenda(int cantidad) {
		numero = 0;
		contactos = new Contacto[cantidad];
	}
	
	public boolean aniadirContacto(Contacto c) {
		if (c != null) {
			String nombre = c.getNombre();
			int telefono = c.getTelefono();
			
			if(huecosLibres() != 0 && !existeContacto(nombre)) {
				contactos[numero] = c;
				numero++;
				return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean existeContacto(String nombre) {
		return buscaContacto(nombre) != -1;
	}
	
	public String listarContactos() {
		String resultado = "";
		for(int i = 0; i < contactos.length && i < numero; i++) {
			resultado += contactos[i].toString() + "\n";
		}
		return resultado;
	}
	
	public int buscaContacto(String nombre) {
		int numTel = -1;
		for(int i = 0; i < contactos.length && numTel == -1; i++) {
			if (contactos[i] != null) {
				if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
					numTel = contactos[i].getTelefono();
				}
			}
			
		}
		return numTel;
	}
	
	/*
	public int siguientePosicionLibre() {
		int libres = huecosLibres();
		return contactos.length - libres;
	}*/
	
	public boolean eliminarContacto(String nombre) {
		for(int i = 0; i < numero; i ++) {
			if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				contactos[i] = contactos[numero-1];
				contactos[numero-1] = null;
				numero--;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean agendaLlena() {
		return huecosLibres() == 0;
	}
	
	public int huecosLibres() {
		return contactos.length - numero;
	}
	
	public boolean hayContactos() {
		return numero > 0;
	}
	
	
}

/*Nos piden realizar una agenda telefónica de contactos.
Un contacto está definido por un nombre y un teléfono (No es necesario de validar). Un contacto es
igual a otro cuando sus nombres son iguales.
Una agenda de contactos está formada por un conjunto de contactos (Piensa en que tipo puede ser)
Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10)
Los métodos de la agenda serán los siguientes:


• existeContacto(Conctacto c): indica si el contacto pasado existe o no.
• listarContactos(): Lista toda la agenda
• buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
• eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
• agendaLlena(): indica si la agenda está llena.
• huecosLibres(): indica cuantos contactos más podemos meter.
Crea un menú con opciones por consola para probar todas estas funcionalidades. 
 * */
