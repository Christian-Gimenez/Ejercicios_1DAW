package org.villablanca;

public class Password {
	private int longitud = 8;
	private String clave;
	
	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	public Password() {
		generarPassword();
	}
	
	private void generarPassword() {
		this.clave = "";
		for(int i = 0; i < longitud; i++) {
			this.clave += caracterAleatorio();
		}
	}
	
	public boolean esFuerte() {
		boolean fuerte = false;
		int mayus = 0;
		int minus = 0;
		int nums = 0;
		for(int i = 0; i < clave.length() && !fuerte; i++) {
			//+2Mayus +1minus y +5Nums
			
			char caracter = clave.charAt(i);
			if(Character.isUpperCase(caracter)) {
				mayus++;
			}
			if(Character.isLowerCase(caracter)) {
				minus++;
			}
			if(Character.isDigit(caracter)) {
				nums++;
			}
			
			if(mayus >= 2 && minus >= 1 && nums >= 5) {
				fuerte = true;
			}
		}
		return fuerte;
	}
	
	private char caracterAleatorio() {
		String alfabeto ="0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz,.;:!\\\"$%&/()=?¿";
		int aleatorio =(int)(Math.random()*(alfabeto.length()));
		return alfabeto.charAt(aleatorio);
	}

	public int getLongitud() {
		return longitud;
	}

	public String getClave() {
		return clave;
	}
	
	
	
}
