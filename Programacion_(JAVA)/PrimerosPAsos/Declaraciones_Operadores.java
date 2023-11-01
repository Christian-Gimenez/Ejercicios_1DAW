
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		//int a = 5
		double a = 5; //Inicializamos la variable a y le asignamos el valor 5
		
		//int b;
		double b; //Inicializamos la variable b
		b = 7; //Asignamos el valor 7 a la variable b
		
		//int c = b + a; //Inicializamos la variable c y le asignamos el valor de a + b
		//int c = b - a; // " asignamos el valor de a - b
		//int c = b * a; // " asignamos el valor de a * b
		double c = b / a; //Al ser variable tipo entero, desecha la parte decimal y convierte en entero el resultado sin redondeo
		
		//c++; //Incrementamos +1 el valor de c
		
		//c += 5; //Incrementamos en +5 el valor de c
		
		System.out.println(c);
		
		//--CONSTANTES--
		
		//final int num1 = 5; //Inicializamos una constante y le asignamos el valor 5
		//num1 = 8; //DA ERROR - NO se pueden modificar las CONSTANTES
		//System.out.println(num1);
		
		//Mini programa para pasar de cm a pulgadas
		final double a_pulgadas = 2.54;
		
		int cm = 6;
		
		double resultado = cm / a_pulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas.");
		
		
		
		
		
		
		
		
	}

}
