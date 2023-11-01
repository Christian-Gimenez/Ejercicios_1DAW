package org.villablanca.accidentes;

import java.util.Comparator;

public class ComparadorAccidentesPorBarrios implements Comparator<Accidente> {

	@Override
	public int compare(Accidente o1, Accidente o2) {
		return o1.getDistrito().compareTo(o2.getDistrito());
	}
	
}
