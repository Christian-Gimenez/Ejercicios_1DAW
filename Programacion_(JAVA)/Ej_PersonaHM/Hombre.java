import java.util.Date;

public class Hombre extends Persona {
	private double altura;
	private Persona pareja;

	public Hombre(String nombre, String fechaNacimiento) {
		super(nombre, fechaNacimiento);
	}
	
	public Hombre(String nombre, String fechaNacimiento, Double altura) {
		super(nombre, fechaNacimiento);
		this.altura = altura;
	}
	
	public String getEdad() {
		return fechaNacimiento;
	}
	
	
}
