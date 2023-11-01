package org.villablanca.accidentes;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Accidente implements Comparable<Accidente> {
	private String numExpediente;
	private LocalDate fecha;
	private LocalTime hora;
	private String localizacion;
	private String numero;
	private String codigoDistrito;
	private String distrito;
	private String tipoAccidente;
	private String estadoMeteorologico;
	private String tipoVehiculo;
	private TipoPersona tipoPersona;
	private String tramoEdad;
	private Sexo sexo;
	private Lesividad lesividad;
	private boolean positivoAlcohol;
	private boolean positivoDrogas;

	public Accidente() {
	}

	public boolean isPositivoAlcohol() {
		return positivoAlcohol;
	}

	public void setPositivoAlcohol(boolean positivoAlcohol) {
		this.positivoAlcohol = positivoAlcohol;
	}

	public boolean isPositivoDrogas() {
		return positivoDrogas;
	}

	public void setPositivoDrogas(boolean positivoDrogas) {
		this.positivoDrogas = positivoDrogas;
	}

	public String getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(String numExpediente) {
		this.numExpediente = numExpediente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		DateTimeFormatter formateoFecha = DateTimeFormatter.ofPattern("d/M/yyyy");
		this.fecha = LocalDate.parse(fecha, formateoFecha);
	}

	public void setFechaConString(String fecha) {
		StringTokenizer st = new StringTokenizer(fecha, "/");
		String dia, mes, anio;
		dia = st.nextToken();
		mes = st.nextToken();
		anio = st.nextToken();
		this.fecha = LocalDate.of(Integer.parseInt(anio), Integer.parseInt(mes), Integer.parseInt(dia));
		
	}
	public LocalTime getHora() {
		return hora;
	}

	public void setHora(String hora) {
		DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("H:mm:ss");		
		this.hora = LocalTime.parse(hora, formateadorHora);
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoDistrito() {
		return codigoDistrito;
	}
	
	public void setCodigoDistrito(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getTipoAccidente() {
		return tipoAccidente;
	}

	public void setTipoAccidente(String tipoAccidente) {
		this.tipoAccidente = tipoAccidente;
	}

	public String getEstadoMeteorologico() {
		return estadoMeteorologico;
	}

	public void setEstadoMeteorologico(String estadoMeteorologico) {
		this.estadoMeteorologico = estadoMeteorologico;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		switch(tipoPersona) {
			case "Pasajero":
				this.tipoPersona = TipoPersona.VIAJERO;	
				break;
			case "Conductor":
				this.tipoPersona = TipoPersona.CONDUCTOR;	
				break;
			case "Testigo":
				this.tipoPersona = TipoPersona.TESTIGO;	
				break;
			default:
				this.tipoPersona = TipoPersona.PEATON;	
				break;		
		}	
	}

	public String getTramoEdad() {
		return tramoEdad;
	}

	public void setTramoEdad(String tramoEdad) {
		this.tramoEdad = tramoEdad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		switch(sexo) {
		case "Hombre":
			this.sexo = Sexo.HOMBRE;	
			break;
		case "Mujer":
			this.sexo = Sexo.MUJER;
			break;
		default:
			this.sexo = Sexo.NO_ASIGNADO;
		}
		
	}

	public Lesividad getLesividad() {
		return lesividad;
	}

	public void setLesividad(String codigo) {
		switch(codigo){
			case "01" , "1", "02", "2", "05", "5", "06", "6", "07", "7":
				this.lesividad = Lesividad.LEVE;
			break;
			case "03", "3":
				this.lesividad = Lesividad.GRAVE;
			break;
			case "04":
				this.lesividad = Lesividad.FALLECIDO;
				break;
			case "14":
				this.lesividad = Lesividad.SIN_ASISTENCIA;
				break;
			case "77":
				this.lesividad = Lesividad.DESCONOCIDO;
				break;
			default:
				this.lesividad = Lesividad.SIN_ASISTENCIA; 
		}
		
	}
	
	public boolean isFinDeSemana() {
		return this.fecha.getDayOfWeek() == DayOfWeek.SATURDAY
				|| this.fecha.getDayOfWeek() == DayOfWeek.SUNDAY;
	}
	
	public boolean esDeNoche() {
		return this.hora.isBefore(LocalTime.of(6, 0)) ||
				this.hora.isAfter(LocalTime.of(20, 0)); 
	}

	@Override
	public String toString() {
		return "Accidente [numExpediente=" + numExpediente + ", fecha=" + fecha + ", hora=" + hora + ", localizacion="
				+ localizacion + ", numero=" + numero + ", codigoDistrito=" + codigoDistrito + ", distrito=" + distrito
				+ ", tipoAccidente=" + tipoAccidente + ", estadoMeteorologico=" + estadoMeteorologico
				+ ", tipoVehiculo=" + tipoVehiculo + ", tipoPersona=" + tipoPersona + ", tramoEdad=" + tramoEdad
				+ ", sexo=" + sexo + ", lesividad=" + lesividad + ", positivoAlcohol=" + positivoAlcohol
				+ ", positivoDrogas=" + positivoDrogas + "]";
	}

	@Override
	public int compareTo(Accidente o) {
		
		return this.getFecha().compareTo(o.getFecha());
	}
	
	
	
}
