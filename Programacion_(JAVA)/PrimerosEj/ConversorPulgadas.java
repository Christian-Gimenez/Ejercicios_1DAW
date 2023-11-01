
public class ConversorPulgadas {
	public static void main(String args []) {
		final double aPulgadas = 2.54; //Creamos la constante aPulgadas de tipo double
		double cm = 12.32; //Inicializamos la variable cm de tipo double
		double resultado = cm / aPulgadas; //Inicializamos la variable resultado y le asignamos el valor de multiplicar cm entre aPulgadas
		System.out.println(resultado);
		cm = 4;
		resultado = cm / aPulgadas;
		System.out.println(resultado);
		//aPulgadas = 3; //Da error porque NO se pueden modificar las constantes
		
		//EJERCICIO REPASO CASA
		final int deBitsABytes = 8;
		int NumBits = 1231090;
		System.out.println(NumBits + " son " + (NumBits / deBitsABytes) + " Bytes");
		

		}
}
