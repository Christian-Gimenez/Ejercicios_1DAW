package org.villablanca;

public class Cine {
	private Pelicula pelicula;
	private double precio;
	private Butaca[] butacas;
	
	public Cine(Pelicula pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		butacas = new Butaca[72];
		//int i = 0;
		for(int fila = 1, i = 0; fila <= 8; fila++) {
			for(char columna = 'A'; columna <= 'I'; columna++) {
				Butaca butaca = new Butaca(fila, columna);
				butacas[i++] = butaca; 
			}
		}
	}
	
	public String mostrarButacas() {
		String resultado = "";
		for(int i = 0; i < butacas.length; i++) {
			if(i > 0 && i % 9 == 0) {
				resultado += "\n";
			}
			resultado += butacas[i] + "\t";
			
		}
		return resultado;
	}
	
	public boolean admites(Espectador espectador) {
		if (espectador.getEdad() >= pelicula.getEdadMinima() && hayButacasDisponibles()) {
			return espectador.paga(this.precio);
		}
		return false;
	}
	
	public boolean hayButacasDisponibles() {
		boolean disponible = false;
		for(int i = 0; i < butacas.length && !disponible; i++) {
			if (butacas[i].estaDisponible()) {
				disponible = true;
			}
		}
		return disponible;
	}
	
	public boolean asignarButaca(int fila, char columna, Espectador espectador) {
		Butaca butaca = buscarButaca(fila, columna);
		if (butaca != null) {
			butaca.setEspectador(espectador);
			return true;
		}
		return false;
	}
	
	public Butaca buscarButaca(int fila, char columna) {
		for(int i = 0; i < butacas.length; i++) {
			Butaca butaca = butacas[i];
			if(butaca.getFila() == fila && butaca.getColumna() == columna) {
				return butaca;
			}
		}
		return null;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Butaca[] getButaca() {
		return butacas;
	}
	public void setButaca(Butaca[] butacas) {
		this.butacas = butacas;
	}
	
	
}
