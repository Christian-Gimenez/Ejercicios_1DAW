package poo;

public class Guitarra {

	//Características que compartirán todas las Guitarras
	private int cuerdas;
	
	
	//Características que podrán ser distintas en cada guitarra
	private int cuerpo;
	private boolean pastillas;
	private double escala;
	
	//Método CONSTRUCTOR
	public Guitarra() {
		cuerdas = 6;
		cuerpo = 1;
		pastillas = false;
		escala = 25.5;
	}
	
	//Metodo GETTER cuerdas
	public int cantidadCuerdas() {
		return cuerdas;
	}
	
	//Metodo GETTER pastillas
	public String tipoPastillas() {
		if(pastillas == false) {
			return "Pasivas";
		} else {
			return "Activas";
		}
	}
	
	//Metodo SETTER pastilas
	public void cambiarPastillas(boolean ActivasTrue_PasivasFalse) {
		
		if (ActivasTrue_PasivasFalse == true) {
			pastillas = true;
		} else {
			pastillas = false;
		}
	}
	
	//Método SETTER escala
	public void cambiarEscala(double EscalaConDosDecimales) {
		escala = EscalaConDosDecimales;
	}
	
	//Método GETTER escala
	public String mostrarEscala() {
		if (escala < 25.5) {
			return "corta/contra-tenor " + escala;
		} else if (escala > 25.5) {
			return "larga/barítona " + escala;
		} else {
			return "estándar " + escala;
		}
	}
	
	//Método SETTER cuerpo 
	public void cambiarCuerpo(int introduceTipo) {
		cuerpo = introduceTipo;
	}
	
	//Método GETTER cuerpo
	public String tipoCuerpo() {
		
		if (cuerpo == 1) {
			return "Stratocaster";
		} else if (cuerpo == 2) {
			return "Les Paul";
			
		} else if (cuerpo == 3) {
			return "Explorer";
			
		} else if (cuerpo == 4) {
			return "V";
		} else {
			return "cuerpo genérico";
		}
		 
		
	}
	
}
