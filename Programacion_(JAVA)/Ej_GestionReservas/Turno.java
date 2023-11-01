package organizacion.departamento;

public class Turno {
	public boolean manana;
	public boolean tarde;
	
	public Turno() {
		this.manana = true;
		this.tarde = true;
	}
	
	public boolean estaDisponibleManana() {
		return manana;
	}

	public boolean estaDisponibleTarde() {
		return tarde;
	}
	
	public void cambiarTurnoManana() {
		manana = (manana)? false : true;
	}
	
	public void cambiarTurnoTarde() {
		if(tarde) {
			tarde = false;
		} else {
			tarde = true;
		}
	}	

}
