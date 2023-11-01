package org.villablanca.accidentes;

import java.util.Comparator;

public class ComparadorAccidentesTipoVehiculo implements Comparator<Accidente>{

	@Override
	public int compare(Accidente o1, Accidente o2) {
		return o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo());
	}

}
