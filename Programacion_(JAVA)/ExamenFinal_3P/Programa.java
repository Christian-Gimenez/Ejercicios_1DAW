package org.villablanca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import daw.com.Teclado;

/**
 * Programa principal que contiene el FicheroQtveo y los TreeMap en memoria
 * de los datos de los Clientes y Materiales
 * @author Christian
 *
 */
public class Programa {
	
	private FicheroQtveo fichero;
	private TreeMap<Integer, Material> materiales;
	private TreeMap<String, Cliente> clientes;
	
	/**
	 * Al iniciar el programa, este comprobara si existe el fichero 'qtveo.dat'
	 * , si exite, modificará los TreeMap materiales y clientes introduciendo
	 * los datos del fichero en los mismos. Si no, prosigue con la ejecución del programa
	 * simplemente inicializando vacíos los TreeMap.
	 */
	public Programa() {
		this.fichero = new FicheroQtveo();
		this.materiales = new TreeMap<>();
		this.clientes = new TreeMap<>();
		if (fichero.getFichero().exists()) {
			fichero.leer(this.materiales, this.clientes);
		}
	}
	
	/**
	 * Menu principal que ejecuta la opcion que introduzca el usuario.
	 * Al seleccionar la opcion 5, se escribira todos los datos en memoria de los TreeMap
	 * en el fichero 'qtveo.dat'.
	 * @param opcion Opcion introducida por el usuario
	 */
	private void menu(int opcion) {
			switch(opcion) {
			case 1:
				System.out.println("****INSERTAR NUEVO MATERIAL****");
				insertarMaterial();
				break;
			case 2:
				System.out.println("****DAR DE ALTA NUEVO CLIENTE****");
				altaCliente();
				break;
			case 3:
				System.out.println("****REALIZAR VISUALIZACION****");
				realizarVisualizacion();
				break;
			case 4:
				System.out.println("****AUMENTAR 2 TEMPORADAS SERIES****");
				aumentarDosTemporadasSeries();
				break;
			case 5:
				this.fichero.escribir(this.materiales, this.clientes);
				System.out.println("Fichero 'qtveo.dat' Guardado correctamente!");
				System.out.println("Programa finalizado");
				break;
			default:
				System.out.println("Error, Opcion incorrecta!");
				break;
			}
	}
	
	/**
	 * Muestra el texto al usuario del menu y recoge la opción, repitiendo si se introdujo una opción inválida.
	 * @return Opcion del usuario, debe estar entre [1-5].
	 */
	private int mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("****MENU PRINCIPAL****");
			System.out.println("1) Insertar un nuevo material");
			System.out.println("2) Dar de alta un nuevo cliente");
			System.out.println("3) Realizar una visualización");
			System.out.println("4) Aumentar 2 temporadas a todas las series previstas de crecer (estreno antes de 2023)");
			System.out.println("5) Salir y guardar fichero 'qtveo.dat'");
			try {
				opcion = Teclado.leerInt("Introduce opción: ");
			} catch (NumberFormatException e) {
				System.out.println("Error de lectura de tipo de dato: " + e.getMessage());
				opcion = -1;
			}
			if (opcion <= 0 || opcion > 5) {
				System.out.println("Error. Opción inválida.");
			}
		} while (opcion <= 0 || opcion > 5);
		return opcion;
	}

	/**
	 * Pide un Cod.Referencia del material, si este existe, muestra el error junto a un listado de los
	 * NºReferencia ya dados de alta. Si no existe, pide todos los datos y añade el Material al TreeMap materiales.
	 */
	private void insertarMaterial() {
		int codRef = Teclado.leerInt("Introduce Código de Referencia del material: ");
		if (this.materiales.containsKey(codRef)) {
			System.out.println("Error. Ese material ya existe");
			System.out.println("Mostrando listado de NºReferencia dados de alta:");
			mostrarNumerosReferencia();
		} else {
			String nombre = Teclado.leerString("Nombre del material: ");
			String fechaEstreno = Teclado.leerString("Fecha de estreno (debe ser posterior al 03-02-2022, y en formato DD-MM-AAAA): ");
			String categoria = Teclado.leerString("Categoria (AVENTURA, ACCION, TERROR o COMEDIA): ");
			char tipoMaterial = Teclado.leerString("Es una Película o una Serie (P/S): ").charAt(0);
			if (Character.toUpperCase(tipoMaterial) == 'P') {
				Pelicula pelicula;
				String actorPrincipal = Teclado.leerString("Introduce el Actor Principal de la película: ");
				pelicula = new Pelicula(codRef, nombre, fechaEstreno, categoria, actorPrincipal);
				materiales.put(codRef, pelicula);
				System.out.println("Pelicula dada de alta correctamente!");
				
			} else if (Character.toUpperCase(tipoMaterial) == 'S') {
				Serie seire;
				int numTemporadasPrevistas = Teclado.leerInt("Introduce el Nº Temporadas previstas: ");
				char respuesta = Teclado.leerString("¿Se esperan más temporadas? (S/N): ").charAt(0);
				boolean seEsperanMas = (Character.toUpperCase(respuesta) == 'S')?true:false;
				seire = new Serie(codRef, nombre, fechaEstreno, categoria, numTemporadasPrevistas, seEsperanMas);
				materiales.put(codRef, seire);
				System.out.println("Serie dada de alta correctamente!");
				
			} else {
				System.out.println("Error. Tipo de material inválido.");
			}
		}
	}
	
	/**
	 * Muestra todos los numeros de referencia de los materiales dados de alta en el TreeMap.
	 */
	private void mostrarNumerosReferencia() {
		TreeSet<Integer> numerosReferencia = (TreeSet<Integer>) this.materiales.keySet();
		for(Integer numRef: numerosReferencia) {
			System.out.println(numRef);
		}
	}

	/**
	 * Da de alta un cliente en el TreeMap de clientes sólo si ese cliente no existe.
	 * Si si NIF ya existe en el TreeMap, da un error, si no, pide todos los datos y lo añade.
	 */
	private void altaCliente() {
		String nif = Teclado.leerString("Introduce NIF del Cliente a crear: ");
		if (this.clientes.containsKey(nif)) {
			System.out.println("Error. Ese Cliente ya existe");
		} else {
			String nombre = Teclado.leerString("Introduce el nombre: ");
			float cuota = Teclado.leerFloat("Introduce la cuota a pagar: ");
			DireccionPostal direccion;
			String calle = Teclado.leerString("Introduce la calle donde vive: ");
			int portal = Teclado.leerInt("Introduce el Nº Portal: ");
			String localidad = Teclado.leerString("Introduce el nombre de la Localidad: ");
			int codigoPostal = Teclado.leerInt("Introduce el C.P.: ");
			direccion = new DireccionPostal(calle, portal, localidad, codigoPostal);
			Cliente cliente = new Cliente(nif, nombre, cuota, direccion);
			this.clientes.put(nif, cliente);
			System.out.println("Se ha dado de alta el cliente correctamente.");	
		}
	}

	/**
	 * Pide el NIF del cliente, si este existe, muestra la lista de los valores
	 * del TreeMap de materiales, mostrando en cada iteración un nº para que el cliente
	 * escoja del 1-n (siendo n el número máximo actual de materiales), de forma que 
	 * el usuario con poner por pantalla sólo el número, se extraerá de la lista el material
	 * se creará la Visualizacion con la fecha actual y se añadirá la visualizacion
	 * a la lista de visualizaciones del cliente.
	 */
	private void realizarVisualizacion() {
		String nif = Teclado.leerString("Introduce NIF del Cliente: ");
		if (this.clientes.containsKey(nif)) {
			LocalDate hoy = LocalDate.now();
			List<Material> listaMaterial = new ArrayList<>();
			listaMaterial.addAll(this.materiales.values());
			
			for(int i = 0; i<listaMaterial.size(); i++) {
				Material material = listaMaterial.get(i); 
				if (material.getFechaEstreno().isAfter(hoy)) {
					System.out.println((i+1) + ") Material:");
					System.out.println("\tCod. Ref: " + material.getCodigoReferencia());
					if (material instanceof Pelicula) {
						System.out.println("\tTipo de Material: Pelicula");
					} else {
						System.out.println("\tTipo de Material: Serie");
					}
					System.out.println("\tNombre: " + material.getNombre());
					System.out.println("\tFecha de estreno: " + material.getFechaEstreno());
				}
			}
			int referenciaSeleccionada = Teclado.leerInt("Seleccione uno de los materiales indicados [1-" + listaMaterial.size() + "]: ");
			if (referenciaSeleccionada >= 1 && referenciaSeleccionada <= listaMaterial.size()) {
				Cliente cliente = this.clientes.get(nif);
				Material material = listaMaterial.get(referenciaSeleccionada-1);
				DatosVisualizaciones visualizacion = new DatosVisualizaciones(material, LocalDate.now());
				cliente.setMaterialVisualizado(visualizacion);
				System.out.println("Material con Codigo: " + material.getCodigoReferencia() + " añadido correctamente al Cliente con NIF: " + cliente.getNif());
			} else {
				System.out.println("Error. No has seleccionado un número entre [1-"+listaMaterial.size()+"]");
			}
		} else {
			System.out.println("Error. El Cliente NO existe");
		}
	}

	/**
	 * Recorre el TreeMap de materiales y si estos son una Serie, llama al metodo .aumentarTemporadas()
	 * el cual si seEsperanMasTemporada == true y su fechaEstreno > 01-01-2023, añade +2 a la cantidad
	 * de seEsperanMasTemporadas.
	 */
	private void aumentarDosTemporadasSeries() {
		Collection<Material> series = this.materiales.values();
		Iterator<Material> it = series.iterator();
		while (it.hasNext()) {
			Material material = (Material) it.next();
			if (material instanceof Serie) {
				Serie serie = (Serie) material;
				serie.aumentarTemporadas();
				this.materiales.replace(serie.getCodigoReferencia(), serie);
			}
		}
		
	}

	/**
	 * Main que ejecuta en bucle el menú principal hasta que el usuario introduzca la opción 5.
	 */
	public static void main(String[] args) {
		Programa programa = new Programa();
		int opcion = 0;
		 do {
			 opcion = programa.mostrarMenu();
			 programa.menu(opcion); 
		 } while(opcion != 5);

	}

}
