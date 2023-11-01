
public class Calculos_conMath {

	public static void main(String[] args) {
		//double raiz = Math.sqrt(9);
		//System.out.println(raiz);
		
		double num1 = 5.85;
		int resultado = (int)Math.round(num1);
		System.out.println(resultado);
		
		double base = 5;
		double exponente = 3;
		int resultado2 = (int)Math.pow(base, exponente);
		System.out.println("El resultado de " + Math.round(base) + " elevado a " + Math.round(exponente) + " es " + resultado2);
		
	}

}
