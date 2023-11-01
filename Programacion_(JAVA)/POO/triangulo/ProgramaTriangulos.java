package triangulo;

public class ProgramaTriangulos {
	
	/* * Implementar en Java un programa que a partir de un array de triángulos
 * muestre el área del triángulo de mayor superficie. 
	 * */
	
	public static void inicializar(Triangulo[] triangulos) {
		for(int i = 0; i < triangulos.length; i++) {
			double iguales, distinto;
			iguales = Math.random()*100;
			distinto = Math.random()*100;
			Triangulo triangulo = new Triangulo(iguales, distinto);
			triangulos[i] = triangulo;
		}
	}
	
	public static Triangulo trianguloMayorSuperficie(Triangulo[] triangulos) {
		Triangulo mayor = triangulos[0];
	
		for(int i = 1; i < triangulos.length; i++) {
			Triangulo triangulo = triangulos[i];
			if (triangulo.area() > mayor.area()) {
				mayor = triangulo;
			}
		}
		return mayor;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo[] triangulos = new Triangulo[100];
		inicializar(triangulos);
		Triangulo mayor = trianguloMayorSuperficie(triangulos);
		System.out.println("El Triángulo con mayor superficie tiene un área de: " + mayor.area() + " y un perimetro de " + mayor.perimetro());
		System.out.println("Cuyos lados iguales son: " + mayor.getLadosIguales());
		System.out.println("Y su lado distinto es: " + mayor.getLadoDistinto());
	}

}
