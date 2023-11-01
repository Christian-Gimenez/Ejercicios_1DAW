package cuenta.corriente;

public class CuentaCorriente {

	private String dni;
	private String nombre_titular;
	private double saldo;

	public CuentaCorriente(String dni, String nombre_titular) {
		/*Algoritmo validar dni
		char[] letras = {'T', 'R', 'Z'};
		int resto = dni % 23;
		letras[resto]; */
		
		this.dni = dni;
		this.nombre_titular = nombre_titular;
		saldo = 0.0;
	}
	
	public boolean retirar(double cantidad) {
		boolean resultado = false;
		if (saldo >= cantidad) {
			resultado = true;
			saldo -= cantidad;
		}
		return resultado;
	}
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getTitular() {
		return nombre_titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String mostrarInformacion() {
		String resultado;
		resultado = "Titular: " + nombre_titular + "\n";
		resultado += "DNI: " + dni + "\n";
		resultado += "Saldo: " + saldo + "€.\n";
		return resultado;
	}
	//Clase para almacenar los datos de una cuenta corriente
	//


}
