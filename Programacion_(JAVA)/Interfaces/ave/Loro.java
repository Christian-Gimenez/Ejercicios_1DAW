package org.villablanca.ave;

import org.villablanca.Hablar;

public class Loro extends Ave implements Hablar{
	private String region;
	private String color;
	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.color = color;
		this.region = region;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy un LORO y sé hablar.\n"
				+ "\tSexo: " + getSexo() + "\tEdad: " + getEdad() +"\n"
				+ "\tRegion: " + region + "\tColor: " + color);

	
	}
	public String getRegion() {
		return region;
	}
	public String getColor() {
		return color;
	}

}
