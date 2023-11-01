package org.villablanca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FicheroSocios {
	
	private File fichero;
	
	public FicheroSocios(File ruta) {
		fichero = ruta;
	}
	
	public Set<Socio> leerFichero() {
		Set<Socio> socios = new TreeSet<Socio>();
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(new FileInputStream(fichero));
			while (input.available() > 0) {
				String dni = input.readUTF();
				String nombre = input.readUTF();
				int dia = input.readInt();
				int mes = input.readInt();
				int anio = input.readInt();
				//LocalDate fecha = LocalDate.of(dia, mes, anio);
				//DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
				//Socio socio = new Socio(dni, nombre, fecha.format(dateTimeFormatter));
				Socio socio = new Socio(dni, nombre, dia + "/" + mes + "/" + anio);
				socios.add(socio);
			}
		} catch (IOException e) {
			System.out.println("No hay datos de Socios de momento");
			return null;
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return socios;
	}
	
	public void guardarSocios(Set<Socio> socios) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fichero));
			Iterator<Socio> it = socios.iterator();
			while(it.hasNext()) {
				Socio socio = it.next();
				out.writeUTF(socio.getDni());
				out.writeUTF(socio.getNombre());
				LocalDate fecha = socio.getFecha_alta();
				out.writeInt(fecha.getDayOfMonth());
				out.writeInt(fecha.getMonthValue());
				out.writeInt(fecha.getYear());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
