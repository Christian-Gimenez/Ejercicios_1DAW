import java.util.Date;

//Al ser abstract digo que no puedo tener un objeto/instancia de tipo Persona, tienes que especificarlo
public abstract class Persona {
	protected String nombre;
	protected String fechaNacimiento;
	
	public Persona(String nombre, String fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	
}
