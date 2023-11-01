package org.villablanca.ave;

public class Canario extends Ave {
	private String canta;
	
	public Canario(String sexo, int edad, String canta) {
		super(sexo, edad);
		this.canta = canta;
		// TODO Auto-generated constructor stub
	}
	public String getCanta() {
		return canta;
	}

}
