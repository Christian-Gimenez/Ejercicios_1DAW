package org.villablanca.accidentes;

import java.util.Comparator;

public class ComparadorAccidentesPorSexo implements Comparator<Accidente> {

	@Override
	public int compare(Accidente o1, Accidente o2) {
		return o1.getSexo().compareTo(o2.getSexo());
	}
	
}
