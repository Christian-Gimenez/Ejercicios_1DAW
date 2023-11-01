package clases;

public class Persona {
	private double altura;
	private String nombre;
	private int edad;
	private int dni;
	//Al poner static, todos los objetos de la clase comparten esa variable
	static int numerosDNIS = 1; // de CLASE
	
	//Metodo CONSTRUCTOR
	public Persona(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.dni = numerosDNIS;
		numerosDNIS++;
		
	}
	
	/*Podemos sobrecargar el Constructor
	public Persona(String n, int e) {
		nombre = n;
		edad = e;
		altura = 1.8;
	}*/
	
	void saludar() {
		System.out.println("Hola!!! Mi nombre es: " + nombre);
		System.out.println("Encantado de conocerte!!!");
	}
	
	void aniversarioNacimiento() {
		edad++;
	}
	
	void crecer(double crecimiento) {
		altura = altura + crecimiento;
	}
	
	void describir() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		if (8>=7) {
			int edad = 7;
			System.out.println("Edad: " + this.edad + " años."); //Al poner this. ignora la var local y se refiere a los atributos de la clase
		}
		
		System.out.println("Altura: " + altura + " metros.");
	}
	
}
