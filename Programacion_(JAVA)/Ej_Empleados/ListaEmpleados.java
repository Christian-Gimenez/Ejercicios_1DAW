package org.villablanca;

import java.util.Objects;

public class ListaEmpleados {
	private Nodo primero;
	private int numero = 0;
	
	public Nodo getPrimero() {
		return primero;
		
	}
	
	public void add(Empleado empleado) {
		if(primero == null) {
			Nodo nodo = new Nodo(empleado);
			primero = nodo;
		} else {
			Nodo nodo = new Nodo(empleado);
			Nodo aux = primero;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nodo);
		}
		numero++;
	}
	
	public int getNumeroElementos() {
		return numero;
	}
	
	public void delete(Empleado empleado) {
		
		Nodo auxiliar = primero;
		Nodo anterior = primero;
		while (!auxiliar.getEmpleado().equals(empleado) && auxiliar.getSiguiente() != null) {
			anterior = auxiliar;
			auxiliar = auxiliar.getSiguiente();
		}
		
		if (auxiliar.getEmpleado().equals(empleado)) {
			numero--;
			if(anterior == primero) {
				primero = primero.getSiguiente();
			}
			anterior.setSiguiente(auxiliar.getSiguiente());
		}
	}

	public Empleado[] getEmpleados() {
		Empleado[] empleados = new Empleado[numero];
		Nodo aux = primero;
		for(int i = 0; i < empleados.length; i++) {
			empleados[i] = aux.getEmpleado();
			aux = aux.getSiguiente();
		}
		boolean hayCambios = true;
		for(int i = 0; i < empleados.length && hayCambios; i++) {
			hayCambios = false;
			for(int j = 1; j < empleados.length; j++) {
				//Si va antes, numero negativo, si va despues, positivo
				if (empleados[j].getNombre().compareTo(empleados[j-1].getNombre()) > 0) {
					Empleado auxiliar = empleados[j-1];
					empleados[j-1] = empleados[j];
					empleados[j] = auxiliar;
				}
			}
		}
		return null;
	}
	
	
}
