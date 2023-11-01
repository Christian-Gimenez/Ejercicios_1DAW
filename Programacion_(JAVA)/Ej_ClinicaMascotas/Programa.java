package org.villablanca.clinica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import daw.com.Teclado;

public class Programa {
	private ArrayList<Animal> animales;
	
	public Programa() {
		animales = new ArrayList<>();
		
	}
	
	public int preguntaMostrar() {
		int opcion = 0;
		do {
			System.out.println("¿Qué lista de animales deseas leer?");
			System.out.println("1) Almacenados en memoria RAM");
			System.out.println("2) Desde un fichero del disco duro");
			try {
				opcion = Teclado.leerInt();
			} catch(Exception ex) {
				System.out.println("Error, opción inválida!");
			}
		} while (opcion < 1 || opcion > 2);
		return opcion;
	}
	
	public void selector(int opcion) {
		switch(opcion) {
		case 1:
			addPerro();
			break;
		case 2:
			addGato();
			break;
		case 3:
			saveFichero();
			break;
		case 4:
			loadFichero();
			break;
		case 5:
			int subOpcion = preguntaMostrar();
			if (subOpcion == 1) {
				showAnimalesEnMemoria();
			} else {
				showAnimalesEnFichero();
			}
			break;
		case 6:
			System.out.println("Fin del programa");
			break;
		default:
			break;
		}
	}
	
	private void showAnimalesEnFichero() {
		BufferedReader fichero = null;
		System.out.println("Introduce ruta y nombre del fichero: ");
		String ruta = Teclado.leerString();
		try {
			fichero = new BufferedReader(new FileReader(ruta));
		} catch(IOException ex) {
			System.out.println("Error de E/S: " + ex.getMessage());
		}
		
		if(fichero != null) {
			try {
				String linea = fichero.readLine();
				while(linea != null) {
					System.out.println(linea);
					linea = fichero.readLine();
				}
				
			} catch (IOException ex) {
				System.err.println("Error de E/S: " + ex.getMessage());
			} finally {
				if(fichero != null) {
					try {
						fichero.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error de E/S: " + e.getMessage());
					}
				}
			}
		}
	}
	
	private void showAnimalesEnMemoria() {
		if (this.animales != null) {
			for(Animal animal:animales) {
				if (animal instanceof Perro) {
					Perro perro = (Perro) animal;
					System.out.println("Perro:");
					System.out.println("\tNombre: " + perro.getNombre());
					System.out.println("\tEdad: " + perro.getEdad());
					System.out.println("\tRaza: " + perro.getRaza());
					System.out.println();
				} 
				
				if (animal instanceof Gato) {
					Gato gato = (Gato) animal;
					System.out.println("Gato:");
					System.out.println("\tNombre: " + gato.getNombre());
					System.out.println("\tColor: " + gato.getColor());
					System.out.println("\tPeso: " + gato.getPeso());
					System.out.println();
					
				}
			}
		} else {
			System.out.println("La lista de animales en memoria está vacía");
		}
	}

	private void loadFichero() {
		BufferedReader fichero = null;
		System.out.println("Introduce ruta y nombre del fichero: ");
		String ruta = Teclado.leerString();
		try {
			fichero = new BufferedReader(new FileReader(ruta));
		} catch(IOException ex) {
			System.out.println("Error de E/S: " + ex.getMessage());
		}
		
		if(fichero != null) {
			try {
				this.animales = new ArrayList<>();
				String linea = fichero.readLine();
				while(linea != null) {
					if(linea.equals("Perro:")) {
						Perro perro;
						
						linea = fichero.readLine();
						String nombre = linea.replace("\tNombre: ", "");
						
						linea = fichero.readLine();
						int edad = -1;
						try {
							linea = linea.replace("\tEdad: ", "");
							edad = Integer.parseInt(linea);
						} catch (NumberFormatException ex) {
							System.out.println("Error de tipo de dato, edad no es un entero.");
						}
						
						linea = fichero.readLine();
						String raza = linea.replace("\tRaza: ", "");;
						
						perro = new Perro(nombre, edad, raza);
						if(edad != -1) {
							animales.add(perro);
						} else {
							System.out.println("Error al leer el perro.");
						}
					} else if (linea.equals("Gato:")) {
						Gato gato;
						
						linea = fichero.readLine();
						String nombre = linea.replace("\tNombre: ", "");;
						
						linea = fichero.readLine();
						String color = linea.replace("\tColor: ", "");;
						
						linea = fichero.readLine();
						linea = linea.replace("\tPeso: ", "");
						float peso = -1;
						try {
							peso = Float.parseFloat(linea);
						} catch(NumberFormatException ex) {
							System.out.println("Error de tipo de dato, peso no es un real.");
						}
						
						gato = new Gato(nombre, color, peso);
						if(peso != -1) {
							animales.add(gato);
						} else {
							System.out.println("Error al leer el gato.");
						}
					}
					linea = fichero.readLine();
				}
			} catch (IOException ex) {
				System.err.println("Error de E/S: " + ex.getMessage());
			} finally {
				if(fichero != null) {
					try {
						fichero.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error de E/S: " + e.getMessage());
					}
				}
			}
		}
	}
	

	private void saveFichero() {
		BufferedWriter fichero = null;
		System.out.println("Introduce ruta y nombre del fichero: ");
		String ruta = Teclado.leerString();
		try {
			fichero = new BufferedWriter(new FileWriter(ruta));
		} catch(IOException ex) {
			System.err.println("Error de E/S: " + ex.getMessage());
		}
		if (fichero != null) {
			try {
				for(Animal animal:animales) {
					if (animal instanceof Perro) {
						Perro perro = (Perro) animal;
						fichero.write("Perro:");
						fichero.newLine();
						fichero.write("\tNombre: " + perro.getNombre());
						fichero.newLine();
						fichero.write("\tEdad: " + perro.getEdad());
						fichero.newLine();
						fichero.write("\tRaza: " + perro.getRaza());
						fichero.newLine();
					} 
					
					if (animal instanceof Gato) {
						Gato gato = (Gato) animal;
						fichero.write("Gato:");
						fichero.newLine();
						fichero.write("\tNombre: " + gato.getNombre());
						fichero.newLine();
						fichero.write("\tColor: " + gato.getColor());
						fichero.newLine();
						fichero.write("\tPeso: " + gato.getPeso());
						fichero.newLine();
						}
					}
			} catch (IOException e) {
				System.err.println("Error de E/S: " + e.getMessage());
			} finally {
				if(fichero != null) {
					try {
						fichero.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error de E/S: " + e.getMessage());
					}
				}
			}
			
		}
		
	}
	
	private void addGato() {
		float peso = 0.0f;
		System.out.println("Introduce nombre: ");
		String nombre = Teclado.leerString();
		System.out.println("Introduce peso: ");
		try {
			peso = Teclado.leerFloat();
		} catch(NumberFormatException ex) {
			System.out.println("Error, número inválido: " + ex.getMessage());
		}
		System.out.println("Introduce color:");
		String color = Teclado.leerString();
		this.animales.add(new Gato(nombre, color, peso));
	}
	

	private void addPerro() {
		int edad = 0;
		System.out.println("Introduce nombre: ");
		String nombre = Teclado.leerString();
		System.out.println("Introduce edad: ");
		try {
			edad = Teclado.leerInt();
		} catch(NumberFormatException ex) {
			System.out.println("Error, número inválido: " + ex.getMessage());
		}
		System.out.println("Introduce raza:");
		String raza = Teclado.leerString();
		this.animales.add(new Perro(nombre, edad, raza));
	}
	
	
	public void menu() {
		System.out.println("1.- Añadir perro");
		System.out.println("2.- Añadir gato");
		System.out.println("3.- Guardar");
		System.out.println("4.- Recuperar");
		System.out.println("5.- Mostrar animales");
		System.out.println("6.- Salir");
	}
	
	
	public static void main(String[] args) {
		Programa programa = new Programa();
		int opcion= 0;
		do {
			programa.menu();
			try {
				opcion = Teclado.leerInt();
			} catch (NumberFormatException ex) {
				System.out.println("Error: Numero no valido");
			}
			programa.selector(opcion);
		} while (opcion != 6);
	}
}
