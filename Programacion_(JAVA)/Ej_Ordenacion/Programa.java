package org.villablanca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import daw.com.Teclado;

public class Programa {
	
	public static final String RUTA_FICHEROS_LINUX = "/media/usertar/Christian/Programacion/NewWorkspace/FicherosJava/";
	public static final String RUTA_FICHEROS_WINDOWS = "F:\\Programacion\\NewWorkspace\\FicherosJava\\";
	private ArrayList<Alumno> alumnos;
	
	public Programa() {
		this.alumnos = new ArrayList<Alumno>();
	}
	
	private void mostrarAlumnos() {
		for(Alumno alumno:alumnos) {
			System.out.println(alumno);
		}
	}
	
	private int mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("1- Añadir alumno");
			System.out.println("2- Mostrar alumnos ordenados por edad");
			System.out.println("3- Mostrar alumnos ordenados por nota");
			System.out.println("4- Mostrar alumnos ordenados por nombre");
			System.out.println("5- Mostrar alumnos ordenados por apellidos");
			System.out.println("6- Guardar en fichero XML");
			System.out.println("7- Generar Alumnos aleatorios");
			System.out.println("8- Salir");
			opcion = Teclado.leerInt();
		} while(opcion < 0 || opcion > 7);
		return opcion;

	}
	
	public void ejecutar() throws AlumnoNoValidoException {
		boolean salir = false;
		
		do {
			int opcion = mostrarMenu();
			switch(opcion) {
			case 1:
				alumnos.add(leerAlumnos());
				break;
			case 2:
				Collections.sort(alumnos, new CompararEdades());
				System.out.println("Alumnos ordenados por edad:");
				mostrarAlumnos();
				break;
			case 3:
				Collections.sort(alumnos, new CompararNotas());
				System.out.println("Alumnos ordenados por notas:");
				mostrarAlumnos();
				break;
			case 4:
				Collections.sort(alumnos, new CompararNombres());
				System.out.println("Alumnos ordenados por nombre:");
				mostrarAlumnos();
				break;
			case 5:
				Collections.sort(alumnos, new CompararNombres());
				System.out.println("Alumnos ordenados por apellidos:");
				mostrarAlumnos();
				break;
			case 6:
				guardarEnFicheroXML();
				break;
			case 7:
				try {
					generarAlumnosAleatorios();
				} catch(NumeroNegativoException ex) {
					System.out.println(ex.getMessage());
				}
				
				break;
			case 8:
				System.out.println("Adios!!");
				salir = true;
				break;
			}
		} while(!salir);
	}
	
	private void generarAlumnosAleatorios() throws NumeroNegativoException {
		int cantidad = 0;
		boolean error = false;
		do {
			System.out.print("¿Cuantos alumnos aleatorios deseas generar? (Para Testing): ");
			try {
				cantidad = Teclado.leerInt();
				error = false;
			} catch (NumberFormatException ex) {
				System.err.println("Error: " + ex.getMessage());
				error = true;
			}
			
			if(cantidad < 0) {
				throw new NumeroNegativoException("Error: El número no puede ser negativo");
			}
		} while (error);
		
		String[] nombres = {
				"Pepe", "Juan", "María", "Luis", "Sofía", "José", "Lucía", 
        		"Antonio", "Isabel", "Javier", "Carmen", "Pedro", "Ana", "Miguel", "Elena", 
        		"Rubén", "Rocío", "Adrián", "Laura", "Fernando", "Marina", "Diego", "Esther", 
        		"Jorge", "Marta", "David", "Raquel", "Carlos", "Natalia", "Alejandro"
		};
		
		String[] apellidos1 = {
				"García", "Rodríguez", "González", "Fernández", "López", "Martínez",
	    		  "Sánchez", "Pérez", "Gómez", "Martín", "Jiménez", "Ruiz", "Hernández", "Díaz", 
	    		  "Moreno", "Álvarez", "Muñoz","Romero", "Alonso", "Serrano", "Ortega", "Flores", 
	    		  "Santos", "Castro", "Vega", "Cabrera", "Mora", "Ramos", "Gil", "Navarro", "Torres"
		};
		
		String[] apellidos2 = {
				"Pérez", "García", "Martínez", "Fernández", "Sánchez", "Rodríguez", "González", "López", 
                    "Gómez", "Ruiz", "Martín", "Hernández", "Moreno", "Díaz", "Álvarez", "Muñoz", "Romero", 
                    "Ortega", "Serrano", "Santos", "Flores", "Cabrera", "Castro", "Vega", "Mora", "Ramos", 
                    "Gil", "Navarro", "Torres", "Cruz"
		};
		
		for (int i = 0; i < cantidad; i++) {
			try {
				String nombre = nombres[(int)(Math.random() * nombres.length)];
				String apellidos = apellidos1[(int)(Math.random() * apellidos1.length)] + " " + apellidos2[(int)(Math.random() * apellidos2.length)];
				 int edad = (int)(Math.random() * 34) + 17; 
	             float nota = (float)(Math.random() * 10);
	             Alumno alumno = new Alumno(nombre, apellidos, edad, nota);
	             alumnos.add(alumno);
			} catch(AlumnoNoValidoException ex) {
				System.out.println("Error al crear alumno. Descripcion: " + ex.getMessage());
			}
		}
	}

	private void guardarEnFicheroXML() {
		System.out.println("Dame el nombre del fichero: ");
		String nombreFichero = Teclado.leerString();
		BufferedWriter out = null;
		
		try {
			out = new BufferedWriter(new FileWriter(RUTA_FICHEROS_WINDOWS + nombreFichero));
			out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
			out.newLine();
			out.write("<alumnos>");
			out.newLine();
			for(Alumno alumno:alumnos) {
				out.write("\t<alumno edad=\">" + alumno.getEdad() + "\">");
				out.newLine();
				out.write("\t\t<nombre>" + alumno.getNombre() + "</nombre>");
				out.newLine();
				out.write("\t\t<apellidos>" + alumno.getApellidos() + "</apellidos>");
				out.newLine();
				out.write("\t\t</nota>" + alumno.getNota() + "</nota>");
				out.newLine();
				out.write("\t</alumno>");
				out.newLine();
			}
			out.write("</alumnos>");
		} catch(IOException ex) {
			System.out.println("Error de E/S: " + ex.getMessage());
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch(IOException ex) {
					System.out.println("Error E/S: " + ex.getMessage());
				}
			}
		}
		
	}

	private Alumno leerAlumnos() throws AlumnoNoValidoException {
		String nombre, apellidos, edad, nota;
		int edadNumero;
		float notaNumero;
		System.out.print("Dame el nombre: ");
		nombre = Teclado.leerString();
		System.out.print("Dame los apellidos: ");
		apellidos = Teclado.leerString();
		
		do {
			System.out.println("Dame la edad: ");
			try {
				edad = Teclado.leerString();
				edadNumero = Integer.parseInt(edad);
				
			} catch (NumberFormatException ex) {
				//imprime el mensaje de error de la excepcion
				System.out.println("Error: " + ex.getMessage());
				System.out.println("¡¡¡Mete bien la edad!!!");
				edadNumero = -1;
			}
		} while (edadNumero == -1);
		
		
		
		do {
			System.out.println("Dame la nota: ");
			try {
				nota = Teclado.leerString();
				notaNumero = Float.parseFloat(nota);
				
			} catch (NumberFormatException ex) {
				//imprime la traza de la excepcion
				ex.printStackTrace();
				System.out.println("¡¡¡Mete bien la nota!!!");
				notaNumero = -1;
			}
		} while(notaNumero == -1);
		
		Alumno alumno;
		try {
			alumno = new Alumno(nombre, apellidos, edadNumero, notaNumero);
			
		} catch (AlumnoNoValidoException ex) {
			alumno = null;
			System.out.println(ex.getMessage());
		}

		return alumno;
	}

	public static void main(String[] args) throws AlumnoNoValidoException {
		Programa p = new Programa();
		p.ejecutar();
	}

}

class CompararEdades implements Comparator<Alumno> {
	@Override
	public int compare(Alumno o1, Alumno o2) {
	
		return o1.getEdad() - o2.getEdad();
	}
}

class CompararApellidos implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		return o1.getApellidos().compareTo(o2.getApellidos());
	}
}

class CompararNombres implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}

class CompararApellidosNombre implements Comparator<Alumno> {
	@Override
	public int compare(Alumno o1, Alumno o2) {
		if(o1.getApellidos().compareTo(o2.getApellidos()) == 0) {
			return o1.getNombre().compareTo(o2.getNombre());
		}
		return o1.getApellidos().compareTo(o2.getApellidos());
	}
}

class CompararNotas implements Comparator<Alumno> {
	@Override
	public int compare(Alumno o1, Alumno o2) {
		return (int)(o1.getNota() - o2.getNota());
	}
}
