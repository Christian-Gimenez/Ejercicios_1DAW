package org.villablanca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/**
 * Clase que gestiona el fichero 'qtveo.dat'
 * @author Christian
 *
 */
public class FicheroQtveo {
	private File fichero;
	public static final String RUTA_FICHERO = "qtveo.dat";
	
	public FicheroQtveo() {
		fichero = new File(FicheroQtveo.RUTA_FICHERO);
	}
	
	/**
	 * Escribe en  el fichero 'qtveo.dat' todos los datos de los TreeMap de materiales y clientes
	 * (los clientes llevan consigo la lista de visualizaciones también) en el siguiente orden:
	 * 1) Materiales
	 * 2) Clientes
	 * 3) Visualizaciones de los clientes
	 * @param materiales TreeMap de los materiales
	 * @param clientes TreeMap de los clientes
	 */
	public void escribir(TreeMap<Integer, Material> materiales, TreeMap<String, Cliente> clientes) {
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream(this.fichero));
			Iterator<Material> itMat = materiales.values().iterator();
			output.writeInt(materiales.size());
			while(itMat.hasNext()) {
				Material material = (Material) itMat.next();
				if (material instanceof Pelicula) {
					Pelicula pelicula = (Pelicula) material;
					output.writeChar('P');
					output.writeInt(pelicula.getCodigoReferencia());
					output.writeUTF(pelicula.getNombre());
					output.writeUTF(pelicula.getFechaEstreno().format(DateTimeFormatter.ofPattern("d-M-yyyy")).toString());
					output.writeUTF(pelicula.getCategoria().name());
					output.writeUTF(pelicula.getActorPrincipal());
				} else {
					Serie serie = (Serie) material;
					output.writeChar('S');
					output.writeInt(serie.getCodigoReferencia());
					output.writeUTF(serie.getNombre());
					output.writeUTF(serie.getFechaEstreno().format(DateTimeFormatter.ofPattern("d-M-yyyy")).toString());
					output.writeUTF(serie.getCategoria().name());
					output.writeInt(serie.getNumTemporadasPrevistas());
					output.writeBoolean(serie.isSeEsperanMasTemporadas());
				}
			}
			
			Iterator<Cliente> itCli = clientes.values().iterator();
			output.writeInt(clientes.size());
			while (itCli.hasNext()) {
				Cliente cliente = (Cliente) itCli.next();
				output.writeUTF(cliente.getNif());
				output.writeUTF(cliente.getNombre());
				output.writeFloat(cliente.getCuotaAPagar());
				DireccionPostal direccion = cliente.getDireccionPostal();
				output.writeUTF(direccion.getCalle());
				output.writeInt(direccion.getPortal());
				output.writeUTF(direccion.getLocalidad());
				output.writeInt(direccion.getCodigoPostal());
				List<DatosVisualizaciones> visualizaciones = cliente.getMaterialVisualizado();
				output.writeInt(visualizaciones.size());
				for(DatosVisualizaciones visualizacion: visualizaciones) {
					output.writeInt(visualizacion.getMaterialVisualizado().getCodigoReferencia());
					output.writeUTF(visualizacion.getFechaVisualizacion().format(DateTimeFormatter.ofPattern("d-M-yyyy")).toString());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error, fichero no encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error de E/S: " + e.getMessage());
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					System.out.println("Error de E/S: " + e.getMessage());
				}
			}
		}
	}
	
	/**
	 * Lee el fichero 'qtveo.dat' todos los datos de los TreeMap de materiales y clientes
	 * (los clientes llevan consigo la lista de visualizaciones también) en el siguiente orden:
	 * 1) Materiales
	 * 2) Clientes
	 * 3) Visualizaciones de los clientes
	 * Modificando en el proceso los TreeMap que recibe por parametro.
	 * @param materiales TreeMap de materiales al cual se agregarán los leidos del fichero
	 * @param clientes TreeMap de clientes al cual se agregarán los leidos del fichero
	 */
	public void leer(TreeMap<Integer, Material> materiales, TreeMap<String, Cliente> clientes) {
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(new FileInputStream(this.fichero));
			materiales.clear();
			int cantidadMateriales = input.readInt();
			for(int i = 0; i < cantidadMateriales; i++) {
				char subtipoMaterial = input.readChar();
				if (Character.toUpperCase(subtipoMaterial) == 'P') {
					Pelicula pelicula;
					int codRef = input.readInt();
					String nombre = input.readUTF();
					String fechaEstreno = input.readUTF();
					String categoria = input.readUTF();
					String actorPrincipal = input.readUTF();
					pelicula = new Pelicula(codRef, nombre, fechaEstreno, categoria, actorPrincipal);
					materiales.put(codRef, pelicula);
				} else {
					Serie serie;
					int codRef = input.readInt();
					String nombre = input.readUTF();
					String fechaEstreno = input.readUTF();
					String categoria = input.readUTF();
					int numTemporadas = input.readInt();
					boolean seEsperanMas = input.readBoolean();
					serie = new Serie (codRef, nombre, fechaEstreno, categoria, numTemporadas, seEsperanMas);
					materiales.put(codRef, serie);
				}
			}
			
			clientes.clear();
			int cantidadClientes = input.readInt();
			for (int i = 0; i < cantidadClientes; i++) {
				Cliente cliente;
				String nif = input.readUTF();
				String nombre = input.readUTF();
				float cuotaAPagar = input.readFloat();
				DireccionPostal direccion;
				String calle = input.readUTF();
				int portal = input.readInt();
				String localidad = input.readUTF();
				int codigoPostal = input.readInt();
				direccion = new DireccionPostal(calle, portal, localidad, codigoPostal);
				cliente = new Cliente(nif, nombre, cuotaAPagar, direccion);
				int cantidadVisualizaciones = input.readInt();
				for(int j = 0; j < cantidadVisualizaciones; j++) {
					DatosVisualizaciones visualizacion;
					int codRef = input.readInt();
					LocalDate fechaVisualizacion = LocalDate.parse(input.readUTF());
					Material materialVisualizado = materiales.get(codRef);
					visualizacion = new DatosVisualizaciones(materialVisualizado, fechaVisualizacion);
					cliente.setMaterialVisualizado(visualizacion);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error, fichero no encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error de E/S: " + e.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println("Error de E/S: " + e.getMessage());
				}
			}
		}
	}
	
	public File getFichero() {
		return this.fichero;
	}

}
