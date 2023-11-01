package triangulo;

/*Diseñar e implementar en Java un clase para trabajar con triángulos
 * isósceles. Para ello, defina los atributos mínimos que se requiera,
 * proporcionar métodos de consulta, un método constructor e implementar
 * otros métodos para calcular el parímetro y el área del triángulo.
 * 
 * Implementar en Java un programa que a partir de un array de triángulos
 * muestre el área del triángulo de mayor superficie.
 * */

public class Triangulo {
	private double iguales;
	private double distinto;

	public Triangulo(double iguales, double distinto) {
		this.iguales = iguales;
		this.distinto = distinto;
	}
	
	public double getLadoDistinto() {
		return distinto;
	}
	
	public double getLadosIguales() {
		return iguales;
	}
	
	public double area() {
		double base = distinto;
		double altura = Math.sqrt(Math.pow(iguales, 2) - Math.pow(base/2, 2));
		return base * altura / 2; 
	}
	
	public double perimetro() {
		return 2 * iguales + distinto;
	}
}
