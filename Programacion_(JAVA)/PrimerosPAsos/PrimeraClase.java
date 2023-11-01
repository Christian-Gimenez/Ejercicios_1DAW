
public class PrimeraClase {//Ponemos el modificador de acceso public y creamos la clase PrimeraClase

	public static void main(String args[]) {
		System.out.print("Imprimimos sin salto de línea");
		System.out.println("\n");//Hacemos manualmente un salto de línea
		System.out.println("Imprimimos con salto de línea"); //Imprimimos por pantalla el texto
		//Podemos hacer la abreviatura syso y pulsar ctrl + espacio y Eclipse autocompletará System.out.println()
		
		/* DECLARAR TRES VARIABLES DE TIPO INT (a, b, c)
		 * ASIGNAR UN VALOR A LAS VARIABLES a Y b
		 * ASIGNAR A c LA SUMA DE a Y b
		 * MOSTRAR POR PANTALLA EL VALOR DE c
		 */
		int a;
		int b;
		int c;
		a = 6;
		b = 9;
		c = a + b;
		System.out.println("El valor de sumar " + a + " + " + b + " es = " + c);
		
		c = a - b;
		System.out.println("El valor de restar " + a + " - " + b + " es = " + c);
		
		c = a * b;
		System.out.println("El valor de multiplicar " + a + " x " + b + " es = " + c);
		
		float d = (float)a; //Declaramos una nueva variable tipo float, y forzamos (float) a que tenga el valor de 'a'
		float e = (float)b;
		float f = (float)d / e;
		System.out.println("El valor de dividir " + a + " / " + b + " es = " + f);
		
		//Declaramos varias variables a la vez
		byte num1, num2;
		num1 = 3;
		num2 = 8;
		
		//Ampliamos esas variables automaticamente, cambiandolas de tipo byte a int
		int numero1 = num1, numero2 = num2; //Asi se asignan valores a varias variables en una sola línea
		int resultado = numero1 + numero2;
		System.out.println(resultado);
		
		//Incrementamos el valor de numero1
		numero1++;
		System.out.println(numero1);
		//Decrementamos el valor de numero2
		numero2--;
		System.out.println(numero2);
	}

}
