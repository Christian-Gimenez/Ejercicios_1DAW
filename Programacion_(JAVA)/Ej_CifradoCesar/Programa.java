package org.villablanca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import daw.com.Teclado;

public class Programa {
	
	public int menu() {
		int opcion = -1;
		System.out.println("1-Cifrar texto");
		System.out.println("2-Cifrar fichero");
		System.out.println("3-Descifrar fichero");
		System.out.println("4-Descifrar texto");
		System.out.println("5-Salir");
		try {
			opcion = Teclado.leerInt();
		} catch(NumberFormatException ex) {
			System.err.println(ex.getMessage());
			return -1;
		}
		return opcion;
	}
	
	public String textoPorTeclado() {
		System.out.println("Introduce el texto:");
		return Teclado.leerString();
	}
	
	public int pedirPassword() {
		int resultado = -1;
		System.out.println("Introduce la contraseña (valor numérico entero)");
		try {
			resultado = Teclado.leerInt();
		} catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		return resultado;
	}
	
	public String pedirRuta() {
		System.out.println("Introduce ruta del fichero: ");
		return Teclado.leerString();
	}
	
	public boolean existeFichero(String ruta) {
		File fichero = new File(ruta);
		return fichero.exists();
	}
	
	public void sobreescribirFichero(String ruta, String texto) {
		BufferedWriter fichero = null;
		try {
			fichero =  new BufferedWriter(new FileWriter(ruta));
			fichero.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public void escribirAlFinalFichero(String ruta, String texto) {
		BufferedWriter ficheroAlFinal = null;
		try {
			ficheroAlFinal =  new BufferedWriter(new FileWriter(ruta, true));
			ficheroAlFinal.newLine();
			ficheroAlFinal.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ficheroAlFinal != null) {
				try {
					ficheroAlFinal.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void existeFicheroEscribir(String ruta, String texto) {
		int opcion = 0;
		if (existeFichero(ruta)) {
			do {
				System.out.println("El fichero " + ruta + " ya existe.");
				System.out.println("¿Qué deseas hacer?");
				System.out.println("1) Sobrescribir");
				System.out.println("2) Escribir al final");
				System.out.println("3) Nada");
				try {
					opcion = Teclado.leerInt();
				} catch(NumberFormatException ex) {
					System.out.println("Opcion incorrecta: " + ex.getMessage());
				}
			} while (opcion > 3 || opcion < 1);

			switch(opcion) {
			case 1:
				sobreescribirFichero(ruta, texto);
				break;
			case 2:
				escribirAlFinalFichero(ruta, texto);
				break;
			default:
				break;
			}
		} else {
			sobreescribirFichero(ruta, texto);
		}
	}
	
	public void escribirDeFicheroAFichero(int opcion) {
		boolean existe;
		String ruta, linea = null;
		BufferedReader archivoAntiguo = null;
		BufferedWriter archivoNuevo = null;
		CifradoCesar textoCesar;
		int password;
		do {
			ruta = pedirRuta();
			existe = existeFichero(ruta);
			if (existeFichero(ruta)) {
				try {
					archivoAntiguo = new BufferedReader(new FileReader(ruta));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("No existe el fichero indicado, por favor inténtelo de nuevo.");
			}
		} while (!existe);
		
		password = pedirPassword();
		System.out.println("Ruta del nuevo fichero:");
		String rutaNueva = pedirRuta();
		try {
			archivoNuevo = new BufferedWriter(new FileWriter(rutaNueva));
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			linea = archivoAntiguo.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(linea != null) {
			try {
				textoCesar = new CifradoCesar(linea, password);
				if (opcion == 2) { //Cifrar
					textoCesar.cifrarTexto();
				} else if (opcion == 3) {//Descifrar
					textoCesar.descifrarTexto();
				}
				archivoNuevo.write(textoCesar.getTexto());
				archivoNuevo.newLine();
				linea = archivoAntiguo.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			archivoNuevo.close();
			archivoAntiguo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void escribirTextoEnFichero(int opcion) {
		String texto = textoPorTeclado();
		int password = pedirPassword();
		String ruta = pedirRuta();
		CifradoCesar textoCifrado = new CifradoCesar(texto, password);
		if (opcion == 1) {
			textoCifrado.cifrarTexto();
		} else if (opcion == 4) {
			textoCifrado.descifrarTexto();
		}
		existeFicheroEscribir(ruta, textoCifrado.getTexto());
		
	}
	
	public void selectorMenu(int opcion) {
		switch (opcion) {
		case 1, 4:
			escribirTextoEnFichero(opcion);
			break;
		case 2, 3:
			escribirDeFicheroAFichero(opcion);
			break;
		case 5:
			System.out.println("Fin del programa");
			break;
		default:
			System.out.println("Ups, algo mal ocurrió");
			break;
		}
	}
	
	public void ejecutar() {
		int opcion = -1;
		do {
			opcion = menu();
			selectorMenu(opcion);
		} while (opcion != 5);
	}

	public static void main(String[] args) {
		Programa programa = new Programa();
		programa.ejecutar();
	}

}
