package organizacion.departamento;

public class Sala {
	//Asegurar/Encapsular los datos/atributos
	private String nombre;
	private Ordenador[] ordenadores = new Ordenador[20];
	
	public Sala(String nombre) {
		this.nombre = nombre;
		for(int i = 0; i < ordenadores.length; i++) {
			Ordenador nuevoPC = new Ordenador(i+1);
			ordenadores[i] = nuevoPC;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public Ordenador getOrdenador(int numero) {
		return ordenadores[numero];
	}
	
	public String turnoManana() {
		return "Mañana (hora inicio: 8h, hora fin: 14h)";
	}

	public String turnoTarde() {
		return "Tarde (hora inicio: 16h, hora fin: 20:h)";
	}
	
	
}
