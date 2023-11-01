import java.util.*; //Importamos todo el paquete java.util en vez de solo su clase java.util.Scanner
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
				
		/* Estructura basica y sencilla de if
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		} */
		
		/*Si eres > 18 "Somos adolescentes"
		//Si eres 18-40 "Somos jóvenes"
		//Si eres 40-65 "Somos maduros"
		//Si eres < 65 "Cuidate"
		
		System.out.println("Introduce tu edad, por favor:");
		
		int edad = entrada.nextInt();
		
		if (edad < 18) {
			System.out.println("Eres un adolescente.");
			
		} else if (edad < 40) {
			System.out.println("Eres joven.");
			
		} else if (edad < 65) {
			System.out.println("Eres maduro.");
			
		} else {
			System.out.println("Cuídate.");
			
		} */
		
		// Ejemplo propio
		boolean datoEdad = false;
		int edad;

		while (datoEdad == false) {
			System.out.println("Introduce tu edad, por favor:");
			edad = entrada.nextInt();
			
			if (edad > 0 && edad < 10) {
				System.out.println("Eres un/a niño/a pequeño/a");
				datoEdad = true;
			
			} else if (edad > 10 && edad < 18) {
				System.out.println("Eres un adolescente");
				datoEdad = true;
				
			} else if (edad >= 18 && edad < 40) {
				System.out.println("Eres un adulto joven");
				datoEdad = true;
			
			} else if (edad > 40 && edad < 65) {
				System.out.println("Eres un adulto maduro/a");
				datoEdad = true;
				
			} else if (edad >= 65 && edad < 125) {
				System.out.println("Eres un/a jubilado/a, cuidate.");
				datoEdad = true;
				
			} else {
				System.out.println("Eso es mentira, no mientas");
				datoEdad = false;
			}
		}
		
		
		
	}

}
