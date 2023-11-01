import java.util.*;
public class FuncionAreaoVolumen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza una funcion que calcule y muestre el area o el volumen de un cilindro,
		 * según se especifique. Para distinguir un caso de otro, se le pasara una opción
		 * con un número: 1 (para el area) o 2 (para el volumen). Además hay que pasarle a
		 * la función el radio de la base y la altura.
		 * 
		 * area = 2 * PI * radio * (altura + radio)
		 * volumen = PI * radio2 * altura
		 * */
		Scanner teclado = new Scanner(System.in);
		double radio, altura;
		int opcion;
		
		System.out.println("Elige una opción:");
		System.out.println("1) Calcular el área");
		System.out.println("2) Calcular el volumen");
		opcion = teclado.nextInt();
		
		System.out.print("Introduce el radio del cilindro: ");
		radio = teclado.nextDouble();
		
		System.out.print("Introduce la altura del cilindro: ");
		altura = teclado.nextDouble();
		
		area_volumen(opcion, radio, altura);
	}
	
	public static void area_volumen(int opcion, double radio, double altura) {
		double area, volumen;
		 switch(opcion) {
		 case 1:
			 area = 2 * Math.PI * radio * (altura + radio);
			 System.out.println("El área del cilindro es: " + area);
			 break;
		 case 2:
			 volumen = Math.PI * Math.pow(radio, 2) * altura;
			 System.out.println("El volumen del cilindro es: " + volumen);
			 break;
			 
		 }
	}

}
