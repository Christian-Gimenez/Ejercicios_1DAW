
public class EjerciciosMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = 4.0;
		int raiz = (int)Math.sqrt(numero); //Obligamos a Java a devolver un tipo entero int, devuelve 2 en vez de 2.0 con armado explícito
		//double raiz = Math.sqrt(numero);
		System.out.println(raiz);
		
		//System.out.println(Math.sqrt(numero)); Esto se podría hacer como en javascript
		byte variableByte = 3;
		
		short variableShort = variableByte; //Conversion implícita de tipo 
		
		numero = 5.176;
		long resultado = Math.round(numero); //Redondeamos el numero y devuelve tipo long, lo almacenamos en la variable resultado
		System.out.println(resultado);
		
		double base = 5;
		double exponente = 3;
		double resultado2 = Math.pow(base, exponente);
		System.out.println(resultado2);
		
		//EJERCICIOS REPASO EN CASA		
		double bas1 = 3;
		double exp1 = 5;
		double res1 = Math.pow(bas1, exp1);
		System.out.println("El resultado de elevar " + bas1 + " a " + exp1 + " es = " + res1);
		
		long redondearRes1 = Math.round(res1);
		System.out.println("Redondeado sería: " + redondearRes1);
		
		int numeroEntero = 58;
		double numeroReal = (double)numeroEntero;
		System.out.println(numeroReal);
		
		int number = 58;
		double numberD = (double)number;
		double raizCuadrada = Math.sqrt(numberD);
		System.out.println("La raíz cuadrada de " + number + " es: " + raizCuadrada);
		
		
		
	}

}
