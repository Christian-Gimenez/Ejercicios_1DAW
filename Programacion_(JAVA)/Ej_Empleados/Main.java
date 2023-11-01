package org.villablanca;

import daw.com.Teclado;

public class Main {
	
	public static int preguntarTipoEmpleado() {
		System.out.println("Tipo de empleado:");
		System.out.println("1) Profesor");
		System.out.println("2) Administrativo");
		System.out.println("3) Auxiliar");
		return Teclado.leerInt();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad, edad;
		String nombre, dni;
		do {
			System.out.print("Cuantos empleados hay? ");
			cantidad = Teclado.leerInt();
		} while (cantidad > 0);
		Empleado empleados[] = new Empleado[cantidad];
		
		for(int i = 0; i < empleados.length; i++) {
			System.out.print("Nombre: ");
			nombre = Teclado.leerString();
			
			do {
				System.out.println("Edad: ");
				edad = Teclado.leerInt();
			} while(edad > 0);
			
			System.out.println("DNI: ");
			dni = Teclado.leerString();
			
			
			
		}
	}

}
