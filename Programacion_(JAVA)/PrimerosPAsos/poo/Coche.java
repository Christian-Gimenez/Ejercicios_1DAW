package poo;
//import debe ir despues de package
public class Coche {
	//Declaramos las caracteristicas que compartirán
	//todos los objetos pertenecientes a la clase Coche
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	//Declaramos las características que variarán según el coche
	String color;
	
	int peso_total;
	
	boolean asientos_lujo, climatizador;
	
	
	//METODO CONSTRUCTOR
	public Coche() {
		
		ruedas = 4;
		
		largo = 2000;
		
		ancho = 300;
		
		motor = 1600;
		
		peso_plataforma = 500;
		
		color = "blanco";
	}
	
	//Método GETTER
	public String dime_largo() {
		
		return "El largo del coche es " + largo;
	}
	
	//Método SETTER
	public void establece_color(String colorcillo) {
		
		color = colorcillo;
	}
	
	//Método GETTER
	public String dime_color() {
		return "El color del coche es " + color;
	}
	

}
