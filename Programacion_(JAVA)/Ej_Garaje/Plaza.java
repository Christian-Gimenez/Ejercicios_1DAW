package org.villablanca;

public class Plaza {
	private Vehiculo vehiculo;
	
	public Plaza(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void deleteVehiculo() {
		this.vehiculo = null;
	}
	
	
}
