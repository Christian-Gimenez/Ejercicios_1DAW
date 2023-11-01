package org.villablanca;

public class Empleado {
	private String nombre;
	private int edad;
	private String dni;
	
	public Empleado(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public boolean equals(Object object) {
		//Si el objeto que me pasan es un empleado (De qué tipo es)
		if (object instanceof Empleado) {
			Empleado empleado;
			empleado = (Empleado)object;
			if(this.nombre.equals(empleado.getNombre()) 
					&& this.edad == empleado.getEdad()
					&& this.dni.equals(empleado.getDni())) {
				return true;
				
			} else {
				return false;
			}
		}
		return false;
	}
}
