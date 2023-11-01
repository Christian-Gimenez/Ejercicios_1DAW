package org.villablanca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import java.util.Collection;
import java.util.HashMap;

public class FicheroDeportistas {
	
	private File archivo;
	
	public FicheroDeportistas(File archivo) {
		this.archivo = archivo;
	}
	
	public HashMap<String, Deportista> leerFichero() throws IOException {
		ObjectInputStream input = null;
		HashMap<String, Deportista> deportistas = new HashMap<String, Deportista>();
		try {
			input = new ObjectInputStream(new FileInputStream(archivo));
			int numero = input.readInt();
			for(int i = 1; i <= numero; i++) {
				char caracter = input.readChar();
				if(caracter == 'A') {
					Atleta atleta; 
					String dni = input.readUTF();
					String nombre = input.readUTF();
					atleta = new Atleta(dni, nombre);
					int horas = input.readInt();
					int minutos = input.readInt();
					int segundos = input.readInt();
					atleta.setMarca(LocalTime.of(horas, minutos, segundos));
					deportistas.put(atleta.getDni(), atleta);
				} else {
					Ciclista ciclista;
					String dni = input.readUTF();
					String nombre = input.readUTF();
					ciclista = new Ciclista(dni, nombre);
					int horas = input.readInt();
					int minutos = input.readInt();
					int segundos = input.readInt();
					ciclista.setMarca(LocalTime.of(horas, minutos, segundos));
					deportistas.put(ciclista.getDni(), ciclista);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}
		}
		return null;
	}
	
	public void escribirFichero(Collection<Deportista> deportistas) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(archivo));
			out.writeInt(deportistas.size());
			for(Deportista deportista:deportistas) {
				if(deportista instanceof Atleta) {
					Atleta atleta = (Atleta)deportista;
					out.writeChar('A');
					out.writeUTF(atleta.getDni());
					out.writeUTF(atleta.getNombre());
					out.writeUTF(atleta.getLugarPrueba());
					out.writeInt(atleta.getMarca().getHour());
					out.writeInt(atleta.getMarca().getMinute());
					out.writeInt(atleta.getMarca().getSecond());
				} else {
					Ciclista ciclista = (Ciclista)deportista;
					out.writeChar('C');
					out.writeUTF(ciclista.getDni());
					out.writeUTF(ciclista.getNombre());
					out.writeUTF(ciclista.getNombrePrueba());
					out.writeInt(ciclista.getNumeroEtapas());
					out.writeInt(ciclista.getPuestoClasificacion());
					out.writeInt(ciclista.getNumEtapasGanadas());
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
