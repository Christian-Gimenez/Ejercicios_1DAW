package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche BMW = new Coche();
		System.out.println(BMW.dime_color());
		BMW.establece_color("Rojo");
		System.out.println(BMW.dime_color());
		
		
		
		
		//System.out.println(BMW.dime_largo());
		
		//System.out.println(BMW.dime_color());
		
		//INSTANCIAR UNA CLASE, EJEMPLAR DE CLASE
		//Coche Renault = new Coche();
			
		//Acceder al valor de la propiedad del objeto
		//NombreObj.propiedad;
		//Una vez esté encapsulada la propiedad en la Clase principal (private) NO podremos acceder a ella
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

		//System.out.println(Renault.dime_largo());
	}

}
