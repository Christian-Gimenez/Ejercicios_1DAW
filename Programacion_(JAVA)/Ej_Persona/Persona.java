package org.villablanca.persona;

public class Persona {
	public static final char HOMBRE = 'H';
	public static final char MUJER = 'M';
	public static final int PESO_BAJO = -1;
	public static final int PESO_IDEAL = 0;
	public static final int SOBREPESO = 1;
	
	private String nombre;
	private int edad;
	private String dni;
	private char genero;
	private double peso;
	private double altura;
	
	public Persona() {
		dni = generarDNI();
		genero = Persona.HOMBRE;
	}
	
	public Persona(String nombre, int edad, char genero) {
		dni = generarDNI();
		this.genero = comprobarGenero(genero);
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, char genero, double peso, double altura) {
		dni = generarDNI();
		this.genero = comprobarGenero(genero);
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	private String generarDNI() {
		int numero = numeroDNI();
		char letra = letraDNI(numero);
		return "" + numero + letra;
	}
	
	private int numeroDNI() {
		return (int)(Math.random() * 10e8);
	}
	
	private char letraDNI(int numero) {
		String letras = "TRWWAGMYFPDXBNJZSQVHLCKE";
		char letra = letras.toCharArray()[numero % 23];
		return letra;
	}
	
	private char comprobarGenero(char genero) {
		if (Character.toUpperCase(genero) == Persona.MUJER) {
			return Persona.MUJER;
		} else {
			return Persona.HOMBRE;
		}
	}
	
	public String pesoIdeal() {
		String resultado = "";
		double imc = calcularIMC();
		switch(pesoIMC(imc)) {
		case Persona.PESO_BAJO:
			resultado = "Está por debajo de su peso ideal con un IMC: " + imc;
			break;
		case Persona.PESO_IDEAL: 
			resultado = "Está en su peso ideal con un IMC: " + imc;
			break;
		case Persona.SOBREPESO:
			resultado = "Tiene sobrepeso con un IMC: " + imc;
			break;
		default:
			resultado = "ERROR";
			break;
		}
		return resultado;
	}
	
	public double calcularIMC() {
		return peso / (Math.pow(altura, 2));
	}
	
	public int pesoIMC(double imc) {
		int resultado = -1;
		if (imc < 20) {
			resultado = Persona.PESO_BAJO;
		} else if (imc >= 20 && imc <= 25) {
			resultado = Persona.PESO_IDEAL;
		} else {
			resultado = Persona.SOBREPESO;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", genero=" + genero + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
}
