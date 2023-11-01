
public class Sobrecarga {
	
	public static int suma(int a, int b) {
		int resultado = a + b;
		System.out.println("Funcion 1");
		return resultado;
	}
	
	public static double suma(int a, double b, int c, double d) {
		double resultado = a * b + c * d;
		System.out.println("Funcion 2");
		return resultado;
	}
	
	public static String suma(String a, String b) {
		String resultado = a + b;
		System.out.println("Funcion 3");
		return resultado;
	}
	
	public static String suma(int a, String b) {
		String resultado = "" + a + b;
		System.out.println("Funcion 4");
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(suma("1", "3"));

	}
	
}
