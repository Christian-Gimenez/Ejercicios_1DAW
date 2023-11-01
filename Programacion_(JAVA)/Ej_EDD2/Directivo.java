package org.villablanca.ejercicio1;

/**
 * Clase que extiende la clase Empleado (y esta a su vez, extiende de Persona), haciendo una especialización
 * de un tipo de empleado que es además Directivo, y tiene una categoría como directivo, además cuenta
 * con un contador de subordinados.
 * @author Cryptic-WebDev
 */
public class Directivo extends Empleado {
	private int categoria;
	private Empleado[] subordinados;
	private int cantidadSubordinados;
	
	/**
	 * Crea una instancia de tipo Directivo con sus datos heredados de Empleado + categoría + agregación de empleados
	 * @param nombre Nombre del Directivo
	 * @param edad Edad del Directivo
	 * @param salario Salario del Directivo
	 * @param empleadosAcargo Número de empleados a su cargo
	 * @param categoria Categoría del Directivo (1 &lt 2 &lt 3) por defecto será 1;
	 */
	public Directivo(String nombre, int edad, double salario, int categoria) {
		super(nombre, edad, salario);
		if (categoriaCorrecta(categoria)) {
			this.categoria = categoria;
		} else {
			this.categoria = 1;
		}
		inicializarSubordinados();
		cantidadSubordinados = 0;
	}
	
	/**
	 * Método privado que indica si el valor introducido es una categoría correcta
	 * @param categoria Categoría del Directivo
	 * @return true si la categoría está entre 1 y 3.
	 */
	private boolean categoriaCorrecta(int categoria) {
		return categoria > 0 && categoria <= 3;
	}
	
	/**
	 * Método privado que inicializa el atributo de array de Empleado (subordinados)
	 * dependiendo  de su categoría: 1 = 10 empleados, 2 = 25 empleados, 3 = 50 empleados.
	 */
	private void inicializarSubordinados() {
		switch(this.categoria) {
		case 1:
			subordinados = new Empleado[10];
			break;
		case 2:
			subordinados = new Empleado[25];
			break;
		default:
			subordinados = new Empleado[50];
			break;
		}
	}
	
	/**
	 * Añade un Empleado como subordinado del Directivo
	 * @param empleado Empleado a agregar bajo el mando del Directivo
	 * @return true si se ha podido agregar el empleado, false si ya no se pueden agregar más empleados
	 * o el empleado == null.
	 */
	public boolean addEmpleado(Empleado empleado) {
		if(cantidadSubordinados < subordinados.length && empleado != null) {
			subordinados[cantidadSubordinados] = empleado;
			cantidadSubordinados++;
			return true;
		}
		return false;
	}
	
}
