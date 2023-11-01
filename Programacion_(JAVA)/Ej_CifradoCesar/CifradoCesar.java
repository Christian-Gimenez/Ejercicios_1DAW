package org.villablanca;

public class CifradoCesar {
	private String texto;
	private int password;
	private static final int LONGITUD_ABCDARIO = 26;
	private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public CifradoCesar(String texto, int password) {
		this.texto = texto;
		if(password > LONGITUD_ABCDARIO) {
			this.password = password - LONGITUD_ABCDARIO;
		} else if (password < 0) {
			this.password = password + LONGITUD_ABCDARIO;
		} else {
			this.password = password;
		}
	}
	
	// A (65) - Z (90)
	// a (97) - z (122)
	
	public char cifrarCaracterRamon(char caracter) {
		String buscado = (""+caracter).toUpperCase();
		if (alfabeto.contains(buscado)) {
			int posicion = alfabeto.indexOf(buscado);
			posicion += password;
			posicion = posicion % alfabeto.length();
			if(Character.isUpperCase(caracter)) {
				return alfabeto.charAt(posicion);
			}
			return alfabeto.toLowerCase().charAt(posicion);
		}
		return caracter;
	}
	
	public char cifrarChar(char caracter) {
		if(Character.isLetter(caracter)) {
			if(Character.isLowerCase(caracter)) {
				caracter = (char) (caracter + password);
				if(caracter > 'z') {
					caracter = (char) (caracter - LONGITUD_ABCDARIO);
				}
			}
			if(Character.isUpperCase(caracter)) {
				caracter = (char) (caracter + password);
				if (caracter > 'Z') {
					caracter = (char) (caracter - LONGITUD_ABCDARIO);
				}
			}
		}
		return caracter;
	}
	
	private char descifrarChar(char caracter) {
		if(Character.isLetter(caracter)) {
			if(Character.isLowerCase(caracter)) {
				caracter = (char)(caracter - password);
				if (caracter < 'a') {
					caracter = (char) (caracter + LONGITUD_ABCDARIO);
				}
			}
			if(Character.isUpperCase(caracter)) {
				caracter = (char)(caracter - password);
				if (caracter < 'A') {
					caracter = (char) (caracter + LONGITUD_ABCDARIO);
				}
			}
		}
		return caracter;
	}
	
	public void cifrarTexto() {
		String cifrado = "";
		char caracterCifrado;
		for(int i = 0; i < texto.length(); i++) {
			caracterCifrado = cifrarChar(texto.charAt(i));
			cifrado += caracterCifrado;
		}
		this.texto = cifrado;
	}
	
	public void descifrarTexto() {
		String descifrado = "";
		char caracterDescifrado;
		for(int i = 0; i < texto.length(); i++) {
			caracterDescifrado = descifrarChar(texto.charAt(i));
			descifrado += caracterDescifrado;
		}
		this.texto = descifrado;
	}

	public String getTexto() {
		return texto;
	}

	public int getPassword() {
		return password;
	}
}
