package org.villablanca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.HashMap;
import java.util.HashSet;

public class Programa {
	
	private FicheroDeportistas fichero;
	private HashMap<String, Deportista> deportistas;
	private LocalDateTime horaInicio;
	
	public Programa() {
		horaInicio = LocalDateTime.now();
	
		fichero = new FicheroDeportistas(new File("deportistas.dat"));
		try {
			deportistas = fichero.leerFichero();
		} catch (FileNotFoundException e) {	
			System.out.println("Generando fichero...");
			this.deportistas = new HashMap<String, Deportista>();
			fichero.escribirFichero(deportistas.values());
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		/*
		Atleta pepe =  new Atleta("12345678", "Pepe");
		Ciclista maria =new Ciclista("12345678", "Maria");
		deportistas.put(pepe.getDni(), pepe);
		System.out.println(deportistas.values());
		if(deportistas.containsKey(maria.getDni())) {
			deportistas.put(maria.getDni(), maria);
		}
		System.out.println(deportistas.values());
	}*/
		Programa principal = new Programa();
		//Period.between(principal.horaInicio, LocalTime.now());
	}
}
