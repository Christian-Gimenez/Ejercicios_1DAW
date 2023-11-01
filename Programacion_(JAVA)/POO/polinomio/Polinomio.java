package polinomio;

/*Desarrollar una clase que sirva para evaluar el valor de un polinomio,
 * cuyo grado y coeficientes se introducen por teclado, en un valor de
 * abscisa determinado.
 * P(X) = An * X^n + An-1 * X^n-1 +.... A2*X²
 * X = es la abscisa
 * Grado = n, el exponente
 * A = el coeficiente                                                                                                                                                                                                                                                                                                                                  
 * */

public class Polinomio {
	private double[] coeficientes;
	
	public Polinomio(int grado) {
		coeficientes = new double[grado+1];
	}
	
	public void agregarCoeficiente(int grado, double coeficiente) {
		coeficientes[grado] = coeficiente;
		
	}
	
	public String mostrarPolinomio() {
		String resultado = "";
		for(int i = coeficientes.length-1; i >= 0; i--) {
			if (i > 0) {
				resultado += coeficientes[i] + "X^" + i + " + ";
			} else {
				resultado += coeficientes[i];
			}
		}
		return resultado;
	}
	
	public double evaluar(double x) {
		double resultado = 0;
		for(int i = 0; i < coeficientes.length; i++) {
			resultado += coeficientes[i] * Math.pow(x, i);
		}
		return resultado;
	}	

}
