package organizacion.departamento;

public class Ordenador {
	
	private int numeroPuesto;
	private Turno turnos;
	
	public Ordenador(int numeroPuesto) {
		this.turnos = new Turno();
		this.numeroPuesto = numeroPuesto;
	}
	
	public String toString() {
		return "Ordenador [numeroPuesto=" + numeroPuesto + ", turnos=" + turnos + "]";
	}
	
	

	public Turno getTurnos() {
		return turnos;
	}
	
	public void setTurnos(Turno turnos) {
		this.turnos = turnos;
	}
	
	public int getNumeroPuesto() {
		return numeroPuesto;
	}
	
	
}
