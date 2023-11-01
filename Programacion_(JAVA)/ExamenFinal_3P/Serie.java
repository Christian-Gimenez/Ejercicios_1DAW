package org.villablanca;

import java.time.LocalDate;

/**
 * Clase Serie que hereda de Material, añadiendo al mismo el Nº de Temporadas Previstas
 * para la serie y si se espera que se añadan más temporadas
 * @author Christian
 *
 */
public class Serie extends Material {
	
	private int numTemporadasPrevistas;
	private boolean seEsperanMasTemporadas;

	public Serie(int codigoReferencia, String nombre, String fechaEstreno, String categoria, int numTemporadasPrevistas, boolean seEsperanMasTemporadas) {
		super(codigoReferencia, nombre, fechaEstreno, categoria);
		this.numTemporadasPrevistas = numTemporadasPrevistas;
		this.seEsperanMasTemporadas = seEsperanMasTemporadas;
	}

	public int getNumTemporadasPrevistas() {
		return numTemporadasPrevistas;
	}


	public boolean isSeEsperanMasTemporadas() {
		return seEsperanMasTemporadas;
	}
	
	/**
	 * Si se esperan más temporadas y su fecha de estreno es posterior al
	 * 1-1-2023, al llamar a este método se agregarán +2 temporadas previstas.
	 */
	public void aumentarTemporadas() {
		LocalDate principios2023 = LocalDate.of(2023, 1, 1);
		if(this.seEsperanMasTemporadas &&
				this.getFechaEstreno().isAfter(principios2023)) {
			this.numTemporadasPrevistas += 2;
		}
	}

}
