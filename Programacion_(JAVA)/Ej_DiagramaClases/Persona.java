package org.villablanca;

/**
 * Clase que abstrae una persona con todos sus datos/atributos que se necesitan
 * @author Christian
 */
public class Persona {
	public final static char SEXO_HOMBRE = 'H';
	public final static char SEXO_MUJER = 'M';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private float peso;
	private float altura;
	
	/**
	 * Constructor por defecto. Crea una Persona sin valores asignados.
	 */
	public Persona() {
		this.dni = generaDNI();
	}
	
	/**
	 * Constructor reducido, crea una Persona con nombre, edad y sexo
	 * @param nombre Nombre de la persona
	 * @param edad Edad de la persona
	 * @param sexo Sexo de la persona (H/M)
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		this.dni = generaDNI();
	}
	
	/**
	 * Constructor completo, crea una Persona con todos sus datos.
	 * @param nombre Nombre de la persona
	 * @param edad Edad de la persona
	 * @param dni DNI de la persona
	 * @param sexo Sexo de la persona (H/M)
	 * @param peso Peso de la persona
	 * @param altura Altura de la persona
	 */
	public Persona(String nombre, int edad, char sexo, float peso, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	
	/**
	 * Metodo que calcula el Indice de Masa Corporal
	 * @return Retorna el IMC de la persona
	 */
	public double calcularIMC() {
		return peso / Math.pow(altura, 2);
	}
	
	/**
	 * Metodo que retorna si es mayor de edad
	 * @return True si es mayor de edad o False si es menor de edad
	 */
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
	/**
	 * Metodo que filtra el valor del atributo sexo para evitar incoherencias o errores. Inicializa por defecto a Mujer 'M'.
	 * @param sexo M Mujer / H Hombre
	 */
	private void comprobarSexo(char sexo) {
		this.sexo = (Character.toUpperCase(sexo) == Persona.SEXO_HOMBRE)? Persona.SEXO_HOMBRE : Persona.SEXO_MUJER;
	}
	
	/**
	 * Convierte a String todos los valores de los atributos de Persona
	 * @return Los atributos de la Persona en una String
	 */
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	/**
	 * Genera un DNI aleatorio a partir de un numero aleatorio de 8 cifras y le añade su correspondiente letra
	 * @return El Numero de DNI + Letra (calculada en función del numero del mismo)
	 */
	private String generaDNI() {
		char[] letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
		/*char[] codigoControl = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
								'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
								'Q', 'V', 'H', 'L', 'C', 'K', 'E'};*/
		int numero = generarAleatorio();
		int resto = numero % 23;
		return String.valueOf(numero) + letrasNIF[resto];
	}

	/**
	 * Genera un numero aleatorio de 8 cifras
	 * @return Numero aleatorio de 8 cifras.
	 */
	private int generarAleatorio() {
		return (int)(Math.random() * 1e8); //1e8 significa 1 * 10⁸
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(char sexo) {
		comprobarSexo(sexo);
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
