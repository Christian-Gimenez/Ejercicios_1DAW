package teatro;

public class Teatro {
	private String nombre;
	private String direccion;
	private Funcion[] funciones;
	private int numeroFunciones;
	
	public Teatro(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		funciones = new Funcion[4];
		numeroFunciones = 0;
	}

	//SETTER
	public void setNombre(String nombre) {
		
	}
	
	public void agregarFuncion(Funcion funcion) {
		if(numeroFunciones < funciones.length) {
			 funciones[numeroFunciones++] = funcion;
		}
	}
	
	public int buscarFuncion(String nombreFuncion) {
		int posicionFuncion = -1;
		for(int i = 0; i < funciones.length && i < numeroFunciones; i++) {
			if(funciones[i].getNombre().equalsIgnoreCase(nombreFuncion)) {
				posicionFuncion = i;
			}
		}
		return posicionFuncion;
	}
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getNumeroFunciones() {
		return numeroFunciones;
	}
	
	public Funcion getFuncionTeatro(String nombreFuncion) {
		int pos = buscarFuncion(nombreFuncion);
		if (pos != -1) {
			return funciones[pos];
		}
		return null;
	}
	
	public Funcion getFuncionTeatro(int posicion) {
		if (posicion != -1) {
			return funciones[posicion];
		} else {
			return null;
		}
	}
}
