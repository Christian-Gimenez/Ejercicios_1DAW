package org.villablanca.accidentes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import daw.com.Teclado;

public class Programa {
	
	///home/administrador/Descargas
	public ArrayList<Accidente> accidentes;
	
	public Programa() {
		this.accidentes = new ArrayList<Accidente>();
	}
	
	public ArrayList<Accidente> getAccidentes() {
		return this.accidentes;
	}
	
	public Accidente leerAccidentes(String linea) {
		String cadena = "";
		Accidente accidente = new Accidente();
		StringTokenizer st =  new StringTokenizer(linea, ";");
		//System.out.println("Linea recibida por parametro: " + linea);
		accidente.setNumExpediente(st.nextToken());
		accidente.setFecha(st.nextToken());
		accidente.setHora(st.nextToken());
		accidente.setLocalizacion(st.nextToken());
		accidente.setNumero(st.nextToken());
		accidente.setCodigoDistrito(st.nextToken());
		accidente.setDistrito(st.nextToken());
		accidente.setTipoAccidente(st.nextToken());
		accidente.setEstadoMeteorologico(st.nextToken());
		accidente.setTipoVehiculo(st.nextToken());
		accidente.setTipoPersona(st.nextToken());
		accidente.setTramoEdad(st.nextToken());
		accidente.setSexo(st.nextToken());
		accidente.setLesividad(st.nextToken());
		st.nextToken();
		st.nextToken();
		st.nextToken();
		if(st.hasMoreTokens())
			accidente.setPositivoAlcohol("S".equalsIgnoreCase(st.nextToken()));
		if(st.hasMoreTokens())
			accidente.setPositivoDrogas("1".equals(st.nextToken()));
		return accidente;
	}
	
	public void leerCSV() {
		File carpeta;
		String linea = "";		
		int opcion;
		BufferedReader input = null;
		carpeta = pedirRutaCarpeta();
		ArrayList<File> archivos = muestraFiherosCSV(carpeta);		
		do {
			System.out.println("Dime el fichero CSV a leer: ");
			opcion = Teclado.leerInt();
		} while (opcion <= 0 || opcion > archivos.size());
		opcion--;
		try {
			input = new BufferedReader(new FileReader(archivos.get(opcion)));
			linea = input.readLine();			
			while((linea = input.readLine()) != null) {
				this.accidentes.add(leerAccidentes(linea));
			}
			
		} catch (IOException ex) {
			System.err.println("Error E/S: " + ex.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException ex) {
					System.err.println("Error E/S: " + ex.getMessage());
				}
			}
		}
		}

	private ArrayList<File> muestraFiherosCSV(File carpeta) {
		ArrayList<File> archivos = new ArrayList<File>();
		System.out.println("Ficheros .csv dentro de " + carpeta.getAbsolutePath());
		for(File fichero: carpeta.listFiles()) {
			if (fichero.isFile() && fichero.getAbsolutePath().endsWith(".csv")) {
				archivos.add(fichero);
				System.out.println(archivos.size() + ") " + fichero.getAbsolutePath());
			}
		}
		return archivos;
	}		
		


	private File pedirRutaCarpeta() {
		File carpeta;
		String rutaCarpeta;
		do {
			System.out.println("Dime la ruta donde están los ficheros CSV: ");
			rutaCarpeta = Teclado.leerString();
			carpeta = new File(rutaCarpeta);
		}while(!carpeta.isDirectory());
		return carpeta;
	}

	public void ejecutar() {
		leerCSV();
		mostrarAccidentesAlcoholDrogas(new LinkedList<Accidente>(accidentes));
	}
	//Mostrar accidentes que se produzcan en fin de semana y de noche (a partir de las 8 de la tarde hasta las 6 de la mañana)
	private void accidentesDeNocheFinde(List<Accidente> accidentes) {
		Iterator<Accidente> it = accidentes.iterator();
		while(it.hasNext()) {
			Accidente accidente = it.next();
			if(!(accidente.isFinDeSemana() &&
					accidente.esDeNoche())) {
				it.remove();
			}
			mostrarAccidentesFinDeSemanaDeNoche(accidentes);
		}
	}
	

	
	//Mostrar accidentes en fin de semana, ordenados por barrios, en los que están implicados alcohol o drogas.
	private void accidentesFinDeSemanaPorDrogasyAlcohol(List<Accidente> accidentes) {
		Iterator<Accidente> it = accidentes.iterator();
		while(it.hasNext()) {
			Accidente accidente = it.next();
			if(!accidente.isFinDeSemana()) {
				it.remove();
			}
		}
		Collections.sort(accidentes, new ComparadorAccidentesPorBarrios());
		mostrarAccidentesFechaAlcoholDrogas(accidentes);
		
	}
	
	private void cantidadAccidentesAlcoholDrogas(List<Accidente> accidentes) {
		int[] resultado = new int[2];
		Iterator<Accidente> it = accidentes.iterator();
		while(it.hasNext()) {
			Accidente accidente = it.next();
			if(accidente.isPositivoAlcohol()) {
				resultado[0]++;
			}
			if(accidente.isPositivoDrogas()) {
				resultado[1]++;
			}
		}
		System.out.println("Accidentes positivo en Alcohol: " + resultado[0]);
		System.out.println("Accidentes positivo en Drogas: " + resultado[1]);

	}
	
	private int[] contarAccidentesMensuales(List<Accidente> accidentes) {
		int[] accidentesMensuales = new int[12];
		//si es un mes, otro contador
		for(Accidente accidente: accidentes) {
			Month mes = accidente.getFecha().getMonth();
			switch (mes) {
			case JANUARY:
				accidentesMensuales[0]++;
				break;
			case FEBRUARY:
				accidentesMensuales[1]++;
				break;
			case MARCH:
				accidentesMensuales[2]++;
				break;
			case APRIL:
				accidentesMensuales[3]++;
				break;
			case MAY:
				accidentesMensuales[4]++;
				break;
			case JUNE:
				accidentesMensuales[5]++;
				break;
			case JULY:
				accidentesMensuales[6]++;
				break;
			case AUGUST:
				accidentesMensuales[7]++;
				break;
			case SEPTEMBER:
				accidentesMensuales[8]++;
				break;
			case OCTOBER:
				accidentesMensuales[9]++;
				break;
			case NOVEMBER:
				accidentesMensuales[10]++;
				break;
			case DECEMBER:
				accidentesMensuales[11]++;
				break;
			}
		}
		return accidentesMensuales;
	}
	
	private void accidentesMensualesDeUnSexo(List<Accidente> accidentes, Sexo sexo) {
		Iterator<Accidente> it = accidentes.iterator();
		while(it.hasNext()) {
			Accidente accidente = it.next();
			if(accidente.getSexo() != sexo) {
				it.remove();
			}
		}
		int[] accidentesPorMes = contarAccidentesMensuales(accidentes);
		Month[] meses = Month.values();
		for(int i = 0; i < accidentesPorMes.length && i < meses.length; i++) {
			System.out.println(meses[i] + "\t" + sexo + "\tCantidad Accidentes: " + accidentesPorMes[i]);
		}
	}
	
	//Mostrar accidentes mensuales agrupados por sexo.
	private void accidentesMensualesPorSexo(List<Accidente> accidentes) {
		accidentesMensualesDeUnSexo(accidentes, Sexo.HOMBRE);
		accidentesMensualesDeUnSexo(accidentes, Sexo.MUJER);
		accidentesMensualesDeUnSexo(accidentes, Sexo.NO_ASIGNADO);
		
	}
	
	
	//Mostrar accidentes, ordenados por barrios, en los que están implicados alcohol o drogas. 
	private void accidentesConAlcoholYDrogas(List<Accidente> accidentes) {
		Iterator<Accidente> it = accidentes.iterator();
		while(it.hasNext()) {
			Accidente accidente = it.next();
			if(!accidente.isPositivoAlcohol() && !accidente.isPositivoDrogas()) {
				it.remove();
			}
		}
		Collections.sort(accidentes, new ComparadorAccidentesPorBarrios());
		mostrarAccidentesAlcoholDrogas(accidentes);
		/*
		accidentes.add(new Accidente());
		accidentes.remove(new Accidente());
		accidentes.isEmpty();
		accidentes.contains(new Accidente());
		for(Accidente accidente:accidentes) {
			if(accidente.isPositivoAlcohol())
				System.out.println(accidente);
		}*/
	}
	
	private void mostrarAccidentesFinDeSemanaDeNoche(Collection<Accidente> accidentes) {
		for(Accidente accidente: accidentes) {
			System.out.println(accidente.getFecha() + "\t"
					+ accidente.getFecha().getDayOfWeek() + "\t"
					+ accidente.getNumExpediente() + "\t"
					+ accidente.getTipoAccidente() + "\t"
					);
		}
	}
	
	private void mostrarAccidentesFechaAlcoholDrogas(Collection<Accidente> accidentes) {
		for(Accidente accidente: accidentes) {
			System.out.println(accidente.getFecha() + "\t"
					+ accidente.getFecha().getDayOfWeek() + "\t"
					+ accidente.getTipoAccidente() + "\t"
					+ (accidente.isPositivoAlcohol()?"Positivo Alcohol":"0,0") + "\t"
					+ (accidente.isPositivoDrogas()?"Positivo Drogas":"Sin Drogas"));
		}
	}
	
	
	private void mostrarAccidentesAlcoholDrogas(Collection<Accidente> accidentes) {
		for(Accidente accidente:accidentes) {
			System.out.println(accidente.getDistrito() + "\t"
					+ accidente.getNumExpediente() + "\t"
					+ accidente.getTipoAccidente() + "\t"
					+ (accidente.isPositivoAlcohol()?"Positivo Alcohol":"0,0") + "\t"
					+ (accidente.isPositivoDrogas()?"Positivo Drogas":"Sin Drogas"));
		}
	}
	

	private void  numeroAccidentesPositivoAlcoholYDrogas() {
		int resultado = 0;
		for(int i = 0; i < accidentes.size(); i++) {
			if (accidentes.get(i).isPositivoAlcohol() && accidentes.get(i).isPositivoDrogas()) {
				resultado++;
			}
		}
		System.out.println("Hay " + resultado + " accidentes por positivos en alcohol y drogas.");
	}
	
	private void accidentesAgrupadosTipoVehiculo(List<Accidente> accidentes) {
		Collections.sort(accidentes, new ComparadorAccidentesTipoVehiculo());
		for(Accidente accidente: accidentes) {
			System.out.println(accidente.getNumExpediente() + "\t"
					+ accidente.getTipoVehiculo() + "\t"
					+ accidente.getFecha() + "\t"
					+ accidente.getDistrito());
		}
	}
	
	private void accidentesOcurridosEnLaCalle(String calle, ArrayList<Accidente> accidentes) {
		Iterator<Accidente> it = accidentes.iterator();
		while(it.hasNext()) {
			Accidente accidente = it.next();
			if (!accidente.getLocalizacion().equalsIgnoreCase(calle)) {
				it.remove();
			}
		}
		for(Accidente accidente: accidentes) {
			System.out.println(accidente.getNumExpediente() + "\t"
					+ accidente.getLocalizacion() + "\t"
					+ accidente.getFecha() + "\t"
					+ accidente.getDistrito());
		}
		
	}
	
	public static void main(String[] args) {
		Programa programa = new Programa();
		programa.ejecutar();
		//Mostrar accidentes, ordenados por barrios, en los que están implicados alcohol o drogas. 
		programa.accidentesConAlcoholYDrogas(programa.getAccidentes());
		//Mostrar accidentes en fin de semana, ordenados por barrios, en los que están implicados alcohol o drogas.
		programa.accidentesFinDeSemanaPorDrogasyAlcohol(programa.getAccidentes());
		//Mostrar accidentes que se produzcan en fin de semana y de noche (a partir de las 8 de la tarde hasta las 6 de la mañana)
		programa.mostrarAccidentesFinDeSemanaDeNoche(programa.getAccidentes());
		//Mostrar el número de accidentes que han dado positivo en alcohol y drogas.
		programa.cantidadAccidentesAlcoholDrogas(programa.getAccidentes());
		//Mostrar accidentes mensuales agrupados por sexo.
		programa.accidentesMensualesPorSexo(programa.getAccidentes());
		//Mostrar accidentes agrupados por tipos de vehículos.
		programa.accidentesAgrupadosTipoVehiculo(programa.getAccidentes());
		//Mostrar accidentes ocurridos en una determinada calle.
		String calle = "PASEO. PRADO / CALL. ATOCHA";
		programa.accidentesOcurridosEnLaCalle(calle, programa.getAccidentes());
	}

	

}			

