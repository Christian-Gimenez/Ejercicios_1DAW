package org.villablanca.util;

import java.util.ArrayList;
import java.util.Objects;

public class Intervalo {
	private int inferior;
	private int superior;
	
	public Intervalo(int inferior, int superior) throws IntervaloException {
		if(inferior > superior) {
			throw new IntervaloException("No se puede crear el intervalo con " + inferior + " y " + superior);
		}
		this.inferior = inferior;
		this.superior = superior;
	}
	
	public int longitud() {
		return superior - inferior;
		
	}
	
	public boolean contiene(int valor) {
		return valor >= inferior && valor <= superior;
	}
	
	public boolean contiene(Intervalo otro) {
		return this.inferior <= otro.getInferior() && this.superior >= otro.getSuperior();
	}
	
	public Intervalo interseccion(Intervalo otro) {
		if (this.inferior > otro.getSuperior() || this.superior < otro.getInferior()) {
			return null;
		}

		//El "inferior" mayor será el inferior de la interseccion
		int inferiorInterseccion = (otro.getInferior() >= this.inferior)? otro.getInferior() : this.inferior;
		//el "superior" menor será el superior de la interseccion
		int superiorInterseccion = (otro.getSuperior() <= this.superior)? otro.getSuperior() : this.superior;

		return new Intervalo(inferiorInterseccion, superiorInterseccion);
	}
	
	public boolean estaAntes(int valor) {
		return valor < inferior;
	}
	
	public boolean estaDespues(int valor) {
		return valor > superior;
	}
	
	public boolean finalizaEn(int valor) {
		return valor == this.superior;
	}
	
	public boolean comienzaEn(int valor) {
		return valor == this.inferior;
	}
	
	public void desplazar(int valor) {
		this.inferior += valor;
		this.superior += valor;
	}

	public int getInferior() {
		return inferior;
	}

	public int getSuperior() {
		return superior;
	}

	@Override
	public String toString() {
		return "(" + inferior + ", " + superior + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Intervalo other = (Intervalo) obj;
		return inferior == other.inferior && superior == other.superior;
	}
	
	
	
}
