package org.villablanca;

import java.util.Comparator;

public class ComparadorPorFechaAlta implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getFecha_alta().compareTo(o1.getFecha_alta());
	}

}
