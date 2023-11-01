
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calcular (3 + 2 / 2 * 5)²
		
		//double base = ((3.0 + 2.0) / (2.0 * 5.0));
		//double exponente = 2.0;
		//System.out.println(Math.pow(base, exponente));
		
		//La manera de resolverlo del profe
		double numerador = 3.0 + 2.0;
		double denominador = 2.0 * 5.0;
		double resultado = Math.pow(numerador / denominador, 2);
		System.out.println(resultado);
		
	}

}
