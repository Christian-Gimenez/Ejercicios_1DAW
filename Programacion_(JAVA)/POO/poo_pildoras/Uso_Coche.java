package poo_pildoras;

public class Uso_Coche {

	public static void main(String[] args) {
		//Instanciar una clase
		Coche Renault = new Coche(); //Ejemplar de clase
		
		//Tras encapsular "private int ruedas" aseguramos su integridad, y esta linea daria error
		//Renault.ruedas = 3;  ->  NO se debe poder hacer, para ello se usa un setter
		//Y para mostrarlo, debemos usar un getter
		//Syso(Renault.ruedas); -> NO se debe hacer, para ello usamos un getter
		

	}

}
