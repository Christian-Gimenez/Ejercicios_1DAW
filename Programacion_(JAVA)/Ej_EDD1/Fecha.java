package org.villablanca.biblioteca;

/**
 * Clase que representa una fecha con el formato DD/MM/AAAA
 * @author Christian
 *
 */
public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	/**
	 * Establece una fecha para su posterior uso
	 * @param dia Dia
	 * @param mes Mes
	 * @param anio Año
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	/**
	 * Aumenta en 1 dia la fecha, teniendo en cuenta el mes y el dia actual, reiniciando los días si se cambia de mes.
	 */
	public void aumentarDiaFecha() {
		dia++;
		switch(mes) {
		case 2:
			if(dia > 28) {
				dia = 1;
				mes++;
			}
			break;
			
		case 4, 6, 9, 11:
			if (dia > 30) {
				dia = 1;
				mes++;
			}
			break;
		default:
			if (dia > 31) {
				dia = 1;
				mes++;
			}
			break;
		}
		aumentarAnio();
	}
	
	/**
	 * Si el mes pasa del 12, lo reinicia a 1 y aumenta el año
	 */
	public void aumentarAnio() {
		if (mes > 12) {
			mes = 1;
			anio++;
		}
	}

	/**
	 * Devuelve en un String la fecha con el formato DD/MM/AAAA
	 */
	@Override
	public String toString() {
		return "" + dia + "/" + mes + "/" + anio;
	}
	
	
	
	
}
