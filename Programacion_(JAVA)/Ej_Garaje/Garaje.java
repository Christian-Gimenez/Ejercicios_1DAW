package org.villablanca;

public class Garaje {
	private Plaza[] plazas;
	private int plazasOcupadas;
	
	public Garaje(int plazasTotales) {
		if (plazasTotales > 0) {
			plazas = new Plaza[plazasTotales];
		}
	}
	
	public float cuotaMensualPlaza(int numeroPlaza) {
		float resultado = 0;
		if (plazas[numeroPlaza] != null) {
			if (plazas[numeroPlaza].getVehiculo() instanceof Coche) {
				Coche coche = (Coche)plazas[numeroPlaza].getVehiculo();
				resultado = coche.getPotencia() * coche.getNumPlazas();
				
			} else if (plazas[numeroPlaza].getVehiculo() instanceof Moto) {
				Moto moto = (Moto)plazas[numeroPlaza].getVehiculo();
				resultado = moto.getPotencia() * 2;
			}
		}
		return resultado;
	}
	
	public void addVehiculoPlaza(Vehiculo vehiculo) {
		if (plazasOcupadas < plazas.length) {
			plazas[plazasOcupadas++] = new Plaza(vehiculo);
		}
	}
	
	public Vehiculo getVehiculoPlaza(int numeroPlaza) {
		if (numeroPlaza < plazas.length && numeroPlaza >= 0) {
			return plazas[numeroPlaza].getVehiculo();
		}
		return null;
	}
	
	public void deleteVehiculoPlaza(int numeroPlaza) {
		if (numeroPlaza < plazas.length && numeroPlaza >= 0) {
			if(plazas[numeroPlaza] != null) {
				plazas[numeroPlaza].deleteVehiculo();
				plazasOcupadas--;
				plazas[numeroPlaza] = plazas[plazasOcupadas];
				plazas[plazasOcupadas] = null;
			}
		}
	}
	
}
