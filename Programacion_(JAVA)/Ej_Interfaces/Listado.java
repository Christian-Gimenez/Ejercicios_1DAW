package org.villablanca;

public class Listado {
	
	private Comparable[] listado;
	private int numero;
	
	public Listado() {
		listado = new Comparable[10];
		numero = 0;
	}
	
	public void agregar(Comparable persona) {
		if (numero < listado.length) {
			listado[numero] = persona;
			numero ++;
		}
	}
	
	public String mostrarListado() {
		String resultado = "";
		for(Comparable persona: listado) {
			if (persona != null) {
				resultado += persona + "\n";	
			}
		}
		return resultado;
	}
	
	public void ordenar() {
		boolean desorden = true;
		for(int i = 0; i < listado.length-1 && desorden; i++) {
			desorden = false;
			for(int j = 0; j < listado.length-1-i; j++) {
				Comparable esta = listado[j];
				Comparable aquella = listado[j+1];
				if(esta.compareTo(aquella) > 0) {
					desorden = true;
					listado[j] = aquella;
					listado[j+1] = esta;
				}
			}
		}
	}
}
