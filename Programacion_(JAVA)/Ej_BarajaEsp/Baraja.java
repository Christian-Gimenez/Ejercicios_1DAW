package org.villablanca.baraja.española;

public class Baraja {
	private Carta[] cartas = new Carta[40];
	private Carta[] fuera = new Carta[40];
	private int cartasDisponibles;
	
	public Baraja() {
		inicializarBaraja();
		cartasDisponibles = 40;
	}
	
	private void inicializarBaraja() {
		int posicionBaraja = 0;
		inicializarCartasPalo(Palo.BASTO, posicionBaraja);
		posicionBaraja += 10;
		inicializarCartasPalo(Palo.COPA, posicionBaraja);
		posicionBaraja += 10;
		inicializarCartasPalo(Palo.ESPADA, posicionBaraja);
		posicionBaraja += 10;
		inicializarCartasPalo(Palo.OROS, posicionBaraja);
	}
	
	private void inicializarCartasPalo(String palo, int posBaraja) {
		for(int i = 0; i < 10; i++) {
			switch(i+1) {
			case 8:
				cartas[posBaraja] = new Carta(10, palo);
				break;
			case 9:
				cartas[posBaraja] = new Carta(11, palo);
				break;
			case 10:
				cartas[posBaraja] = new Carta(12, palo);
				break;
			default:
				cartas[posBaraja] = new Carta((i+1), palo);
				break;
			}
			posBaraja++;
		}
	}
	
	public void barajar() {
		int posInicial;
		int posFinal;
		for(int i = 0; i < cartas.length; i++) {
			posInicial = numAleatorio();
			posFinal = numAleatorio();
			while (posInicial == posFinal) { 
				posFinal = numAleatorio(); 
			}
			cambiarCartaDeSitio(posInicial, posFinal);
		}
	}
	
	public Carta siguienteCarta() {
		cartasDisponibles--;
		Carta siguiente = cartas[cartasDisponibles];
		fuera[cartasDisponibles%40] = siguiente;
		cartas[cartasDisponibles] = null;
		return siguiente;
	}
	
	public int cartasDisponibles() {
		return cartasDisponibles;
	}
	
	public Carta[] darCartas(int cantidad) {
		if (cantidad > cartasDisponibles) {
			return null;
		}
		Carta[] manoCartas = new Carta[cantidad];
		for(int i = 0; i < manoCartas.length; i++) {
			manoCartas[i] = siguienteCarta();
		}
		return manoCartas;
	}
	
	public Carta[] cartasMonton() {
		if (fuera[0] == null) {
			return null;
		} else {
			return fuera;
		}
	}
	
	private void cambiarCartaDeSitio(int posInicial, int posFinal) {
		Carta aux;
		aux = cartas[posInicial];
		cartas[posInicial] = cartas[posFinal];
		cartas[posFinal] = aux;
	}
	
	private int numAleatorio() {
		return (int)(Math.random() * cartas.length);
	}
	
	public String mostrarBaraja() {
		String resultado = "";
		for(int i = 0; i < cartas.length && cartas[i] != null; i++) {
			resultado += cartas[i] + "\n";
		}
		return resultado.isBlank() ? "No hay cartas en la baraja" : resultado;
	}
	
	public String mostrarMonton() {
		String resultado = "";
		for(int i = fuera.length-1; i >= 0 && fuera[i] != null; i--) {
			resultado += fuera[i] + "\n";
		}
		return resultado.isBlank() ? "No hay cartas en el montón" : resultado;
	}
	
}
