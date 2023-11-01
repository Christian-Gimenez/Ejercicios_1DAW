package numerocomplejo;

public class Complejo {
	private double real;
	private double imaginaria;
	
	public Complejo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	public Complejo producto(Complejo numero) {
		Complejo resultado = new Complejo(
				this.real * numero.getReal() - this.imaginaria * numero.getImaginaria(),
				this.real * numero.getImaginaria() + this.imaginaria * numero.getReal()
				);
		return resultado;
	}
	
	public String mostrarComplejo() {
		if(imaginaria < 0) {
			return real + " - " + -1*imaginaria + "i";
		}
		return real + " + " + imaginaria + "i";
	}
	
	public Complejo suma(Complejo numero) {
		Complejo resultado = new Complejo(
		this.real + numero.getReal(),
		this.imaginaria + numero.getImaginaria());
		return resultado;
	}
	
	public boolean equals(Complejo complejo) {
		return this.real == complejo.getReal() &&
			this.imaginaria == complejo.getImaginaria();
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
}
