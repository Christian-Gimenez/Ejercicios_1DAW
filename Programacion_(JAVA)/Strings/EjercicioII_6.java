import org.madrid.educa.io.Teclado;

public class EjercicioII_6 {
	
	public static int mayorEdad(int edad1, int edad2) {
		int mayor = 0;
		if (edad1 > edad2) {
			mayor = edad1;
		} else {
			mayor = edad2;
		}
		return mayor;
	}

	public static void main(String[] args) {
		/*Solicitar el ingreso del nombre y edad de dos personas.
		 * Mostrar el nombre de la persona con mayor edad.
		 * */
		String nombre1, nombre2, mayor="";
		int edad1, edad2;
		boolean unoMasMayor = true;
		System.out.print("Introduce el nombre de la primera persona: ");
		nombre1 = Teclado.leerLinea();
		
		System.out.print("Introduce su edad: ");
		edad1 = Teclado.leerEntero();
		
		System.out.print("Introduce el nombre de la segunda persona: ");
		nombre2 = Teclado.leerLinea();
		
		System.out.print("Introduce su edad: ");
		edad2 = Teclado.leerEntero();
		
		if (mayorEdad(edad1, edad2) == edad1) {
			mayor = nombre1;
		} else if (mayorEdad(edad1, edad2) == edad2){
			mayor = nombre2;
		} else {
			System.out.println("Ambos tienen la misma edad");
			unoMasMayor = false;
		}
		if (unoMasMayor) {
			System.out.println(mayor + " es la persona con más edad.");
		}
		
	}

}
