package org.villablanca.baraja.esp;

public class Baraja {
	private Carta[] cartas = new Carta[40];
	private Carta[] monton;
	private int cima;
	
	public Baraja() {
		int i = 0;
		for(Palo palo: Palo.values()) {
			for(Numero numero: Numero.values()) {
				cartas[i++] = new Carta(palo, numero);
			}
		}
	}
	
	public String mostrarBaraja() {
		String resultado = "";
		for(int i = cima; i < cartas.length; i++) {
			Carta carta = cartas[i];
			resultado += carta + "\n";
		}
		return resultado;
	}
	
	public String mostrarMonton() {
		String resultado = "";
		for(int i = 0; i < cima; i++) {
			Carta carta = cartas[i];
			resultado += carta + "\n";
		}
		return resultado;
	}
	
	public boolean hayCartas() {
		return cima < 40;
	}
	
	public String toString() {
		String resultado = "";
		for(Carta carta:cartas) {
			resultado += carta + "\n";
		}
		return resultado;
	}
	
	public void barajar() {
		int intercambios = (int)(15 * Math.random())+17;
		
		for(int i = 0; i <= intercambios; i++) {
			intercambiarDosCartas();
		}
	}

	private void intercambiarDosCartas() {
		// TODO Auto-generated method stub
		int origen = (int)(40 * Math.random());
		int destino = (int)(40 * Math.random());
		Carta aux = cartas[origen];
		cartas[origen] = cartas[destino];
		cartas[destino] = aux;
		
	}
	
	public Carta dar() {
		if (hayCartas()) {
			return cartas[cima++];
		}
		return null;
	}
	
	
}
